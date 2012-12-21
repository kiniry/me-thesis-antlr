// $ANTLR 3.4 JVM.g 2012-12-21 11:16:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AND", "ASSIGN", "AnnotationAssign", "AnnotationDefault", "BOOLEAN", "BOOLEANLITERAL", "BYTE", "BaseType", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONSTANT_TYPE_ASSIGNABLE", "CPINDEX", "Code", "Constant", "Constant_type", "DATE", "DEFAULT", "DOT", "DOUBLE", "DOUBLELITERAL", "DefaultValue", "Deprecated", "DoubleSuffix", "EXTENDS", "EnclosingMethod", "EscapeSequence", "ExceptionTable", "Exceptions", "Exponent", "FALSE", "FINAL", "FLOAT", "FLOATLITERAL", "Flag", "FloatSuffix", "HASH", "HexDigit", "HexDigits", "HexPrefix", "IDENTIFIER", "IMPLEMENTS", "INT", "INTERFACE", "INTERNALTYPE", "INTLITERAL", "InnerClasses", "IntDigit", "IntegerNumber", "LARGET", "LBRACE", "LBRACK", "LESST", "LONG", "LONGLITERAL", "LPAREN", "Letter", "LineNumberTable", "LocalVariableTable", "LocalVariableTypeTable", "LongSuffix", "MAJOR_VERSION", "MINOR_VERSION", "MINUS", "NATIVE", "NL", "NORMALTYPE", "NonIntegerNumber", "Octal", "OctalEscape", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "QUESTION", "QUOTE", "RBRACE", "RBRACK", "RPAREN", "RuntimeVisibleAnnotations", "SEMI", "SHORT", "SLASH", "STAR", "STATIC", "STRINGLITERAL", "SUPER", "SYNCHRONIZED", "Scala", "ScalaSig", "Signature", "SourceFile", "StackMap", "StackMapTable", "Synthetic", "THROWS", "TRANSIENT", "TRUE", "Throws", "UNDERSCORE", "UnicodeEscapeSequence", "VOID", "VOLATILE", "VersionedInternalType", "VoidType", "WINDOWSPATH", "WS"
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
    public static final int NATIVE=72;
    public static final int NL=73;
    public static final int NORMALTYPE=74;
    public static final int NonIntegerNumber=75;
    public static final int Octal=76;
    public static final int OctalEscape=77;
    public static final int PLUS=78;
    public static final int PRIVATE=79;
    public static final int PROTECTED=80;
    public static final int PUBLIC=81;
    public static final int QUESTION=82;
    public static final int QUOTE=83;
    public static final int RBRACE=84;
    public static final int RBRACK=85;
    public static final int RPAREN=86;
    public static final int RuntimeVisibleAnnotations=87;
    public static final int SEMI=88;
    public static final int SHORT=89;
    public static final int SLASH=90;
    public static final int STAR=91;
    public static final int STATIC=92;
    public static final int STRINGLITERAL=93;
    public static final int SUPER=94;
    public static final int SYNCHRONIZED=95;
    public static final int Scala=96;
    public static final int ScalaSig=97;
    public static final int Signature=98;
    public static final int SourceFile=99;
    public static final int StackMap=100;
    public static final int StackMapTable=101;
    public static final int Synthetic=102;
    public static final int THROWS=103;
    public static final int TRANSIENT=104;
    public static final int TRUE=105;
    public static final int Throws=106;
    public static final int UNDERSCORE=107;
    public static final int UnicodeEscapeSequence=108;
    public static final int VOID=109;
    public static final int VOLATILE=110;
    public static final int VersionedInternalType=111;
    public static final int VoidType=112;
    public static final int WINDOWSPATH=113;
    public static final int WS=114;

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
    // JVM.g:129:1: flags : Flag accessFlagList ;
    public final JVMParser.flags_return flags() throws RecognitionException {
        JVMParser.flags_return retval = new JVMParser.flags_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Flag87=null;
        JVMParser.accessFlagList_return accessFlagList88 =null;


        Object Flag87_tree=null;

        try {
            // JVM.g:130:2: ( Flag accessFlagList )
            // JVM.g:130:4: Flag accessFlagList
            {
            root_0 = (Object)adaptor.nil();


            Flag87=(Token)match(input,Flag,FOLLOW_Flag_in_flags577); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Flag87_tree = 
            (Object)adaptor.create(Flag87)
            ;
            adaptor.addChild(root_0, Flag87_tree);
            }

            pushFollow(FOLLOW_accessFlagList_in_flags579);
            accessFlagList88=accessFlagList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, accessFlagList88.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token COMMA90=null;
        JVMParser.flagType_return flagType89 =null;

        JVMParser.flagType_return flagType91 =null;


        Object COMMA90_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_flagType=new RewriteRuleSubtreeStream(adaptor,"rule flagType");
        try {
            // JVM.g:134:2: ( flagType ( COMMA flagType )* -> ( flagType )+ )
            // JVM.g:134:4: flagType ( COMMA flagType )*
            {
            pushFollow(FOLLOW_flagType_in_accessFlagList592);
            flagType89=flagType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_flagType.add(flagType89.getTree());

            // JVM.g:134:13: ( COMMA flagType )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // JVM.g:134:14: COMMA flagType
            	    {
            	    COMMA90=(Token)match(input,COMMA,FOLLOW_COMMA_in_accessFlagList595); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA90);


            	    pushFollow(FOLLOW_flagType_in_accessFlagList597);
            	    flagType91=flagType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_flagType.add(flagType91.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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

        Token set92=null;

        Object set92_tree=null;

        try {
            // JVM.g:138:2: ( IDENTIFIER | INTLITERAL )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set92=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set92)
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

        Token IDENTIFIER93=null;
        Token IDENTIFIER94=null;
        Token COLON95=null;
        JVMParser.contant_pool_line_return contant_pool_line96 =null;


        Object IDENTIFIER93_tree=null;
        Object IDENTIFIER94_tree=null;
        Object COLON95_tree=null;

        try {
            // JVM.g:146:2: ( IDENTIFIER IDENTIFIER COLON ( contant_pool_line )* )
            // JVM.g:146:4: IDENTIFIER IDENTIFIER COLON ( contant_pool_line )*
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool634); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER93_tree = 
            (Object)adaptor.create(IDENTIFIER93)
            ;
            adaptor.addChild(root_0, IDENTIFIER93_tree);
            }

            IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER94_tree = 
            (Object)adaptor.create(IDENTIFIER94)
            ;
            adaptor.addChild(root_0, IDENTIFIER94_tree);
            }

            COLON95=(Token)match(input,COLON,FOLLOW_COLON_in_constant_pool638); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON95_tree = 
            (Object)adaptor.create(COLON95)
            ;
            adaptor.addChild(root_0, COLON95_tree);
            }

            // JVM.g:147:3: ( contant_pool_line )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CPINDEX) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // JVM.g:147:3: contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool643);
            	    contant_pool_line96=contant_pool_line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, contant_pool_line96.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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

        Token CPINDEX97=null;
        Token ASSIGN98=null;
        Token CONSTANT_TYPE_ASSIGNABLE99=null;

        Object CPINDEX97_tree=null;
        Object ASSIGN98_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE99_tree=null;

        try {
            // JVM.g:151:2: ( CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE )
            // JVM.g:151:4: CPINDEX ASSIGN CONSTANT_TYPE_ASSIGNABLE
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX97=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line656); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX97_tree = 
            (Object)adaptor.create(CPINDEX97)
            ;
            adaptor.addChild(root_0, CPINDEX97_tree);
            }

            ASSIGN98=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN98_tree = 
            (Object)adaptor.create(ASSIGN98)
            ;
            adaptor.addChild(root_0, ASSIGN98_tree);
            }

            CONSTANT_TYPE_ASSIGNABLE99=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT_TYPE_ASSIGNABLE99_tree = 
            (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE99)
            ;
            adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE99_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token LBRACE107=null;
        Token RBRACE109=null;
        JVMParser.class_visual_modifier_return class_visual_modifier100 =null;

        JVMParser.class_modifier_return class_modifier101 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier102 =null;

        JVMParser.superClass_return superClass103 =null;

        JVMParser.superInterface_return superInterface104 =null;

        JVMParser.type_info_return type_info105 =null;

        JVMParser.constant_pool_return constant_pool106 =null;

        JVMParser.classBody_return classBody108 =null;


        Object LBRACE107_tree=null;
        Object RBRACE109_tree=null;

        try {
            // JVM.g:159:2: ( ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE )
            // JVM.g:159:4: ( class_visual_modifier )? ( class_modifier )* javaTypeIdentifier ( superClass )? ( superInterface )? type_info constant_pool LBRACE ( classBody )? RBRACE
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:159:4: ( class_visual_modifier )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==PUBLIC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // JVM.g:159:4: class_visual_modifier
                    {
                    pushFollow(FOLLOW_class_visual_modifier_in_classDefinition675);
                    class_visual_modifier100=class_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_visual_modifier100.getTree());

                    }
                    break;

            }


            // JVM.g:159:27: ( class_modifier )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ABSTRACT||LA20_0==CLASS||LA20_0==FINAL||LA20_0==INTERFACE) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // JVM.g:159:27: class_modifier
            	    {
            	    pushFollow(FOLLOW_class_modifier_in_classDefinition678);
            	    class_modifier101=class_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_modifier101.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_javaTypeIdentifier_in_classDefinition681);
            javaTypeIdentifier102=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier102.getTree());

            // JVM.g:159:62: ( superClass )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EXTENDS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JVM.g:159:62: superClass
                    {
                    pushFollow(FOLLOW_superClass_in_classDefinition683);
                    superClass103=superClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superClass103.getTree());

                    }
                    break;

            }


            // JVM.g:159:74: ( superInterface )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IMPLEMENTS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // JVM.g:159:74: superInterface
                    {
                    pushFollow(FOLLOW_superInterface_in_classDefinition686);
                    superInterface104=superInterface();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superInterface104.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_type_info_in_classDefinition692);
            type_info105=type_info();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_info105.getTree());

            pushFollow(FOLLOW_constant_pool_in_classDefinition696);
            constant_pool106=constant_pool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_pool106.getTree());

            LBRACE107=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDefinition700); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE107_tree = 
            (Object)adaptor.create(LBRACE107)
            ;
            adaptor.addChild(root_0, LBRACE107_tree);
            }

            // JVM.g:163:3: ( classBody )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ABSTRACT||LA23_0==BOOLEAN||(LA23_0 >= BYTE && LA23_0 <= CHAR)||LA23_0==DEFAULT||LA23_0==DOUBLE||(LA23_0 >= FINAL && LA23_0 <= FLOAT)||LA23_0==IDENTIFIER||LA23_0==INT||(LA23_0 >= LESST && LA23_0 <= LONG)||LA23_0==NATIVE||LA23_0==NORMALTYPE||(LA23_0 >= PRIVATE && LA23_0 <= PUBLIC)||LA23_0==SHORT||LA23_0==STATIC||LA23_0==SYNCHRONIZED||LA23_0==TRANSIENT||(LA23_0 >= VOID && LA23_0 <= VOLATILE)||LA23_0==VoidType) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // JVM.g:163:3: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_classDefinition705);
                    classBody108=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody108.getTree());

                    }
                    break;

            }


            RBRACE109=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDefinition710); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE109_tree = 
            (Object)adaptor.create(RBRACE109)
            ;
            adaptor.addChild(root_0, RBRACE109_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token EXTENDS110=null;
        JVMParser.typeList_return typeList111 =null;


        Object EXTENDS110_tree=null;

        try {
            // JVM.g:168:2: ( EXTENDS typeList )
            // JVM.g:168:4: EXTENDS typeList
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS110=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_superClass723); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS110_tree = 
            (Object)adaptor.create(EXTENDS110)
            ;
            adaptor.addChild(root_0, EXTENDS110_tree);
            }

            pushFollow(FOLLOW_typeList_in_superClass725);
            typeList111=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList111.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IMPLEMENTS112=null;
        JVMParser.typeList_return typeList113 =null;


        Object IMPLEMENTS112_tree=null;

        try {
            // JVM.g:172:2: ( IMPLEMENTS typeList )
            // JVM.g:172:4: IMPLEMENTS typeList
            {
            root_0 = (Object)adaptor.nil();


            IMPLEMENTS112=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_superInterface737); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPLEMENTS112_tree = 
            (Object)adaptor.create(IMPLEMENTS112)
            ;
            adaptor.addChild(root_0, IMPLEMENTS112_tree);
            }

            pushFollow(FOLLOW_typeList_in_superInterface739);
            typeList113=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList113.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token PUBLIC114=null;

        Object PUBLIC114_tree=null;

        try {
            // JVM.g:176:2: ( PUBLIC )
            // JVM.g:176:4: PUBLIC
            {
            root_0 = (Object)adaptor.nil();


            PUBLIC114=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier752); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PUBLIC114_tree = 
            (Object)adaptor.create(PUBLIC114)
            ;
            adaptor.addChild(root_0, PUBLIC114_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token set115=null;

        Object set115_tree=null;

        try {
            // JVM.g:180:2: ( ABSTRACT | FINAL | INTERFACE | CLASS )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set115=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==CLASS||input.LA(1)==FINAL||input.LA(1)==INTERFACE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set115)
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

        JVMParser.methodDefinition_return methodDefinition116 =null;

        JVMParser.ctorDefinition_return ctorDefinition117 =null;

        JVMParser.fieldDefinition_return fieldDefinition118 =null;

        JVMParser.staticCtorDefinition_return staticCtorDefinition119 =null;



        try {
            // JVM.g:188:2: ( ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+ )
            // JVM.g:189:2: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:189:2: ( ( methodDefinition )=> methodDefinition | ( ctorDefinition )=> ctorDefinition | ( fieldDefinition )=> fieldDefinition | staticCtorDefinition )+
            int cnt24=0;
            loop24:
            do {
                int alt24=5;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= PRIVATE && LA24_0 <= PUBLIC)) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt24=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }
                    else if ( (true) ) {
                        alt24=4;
                    }


                }
                else if ( (LA24_0==LESST) && (synpred1_JVM())) {
                    alt24=1;
                }
                else if ( (LA24_0==BOOLEAN) ) {
                    int LA24_4 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==DOUBLE||LA24_0==FLOAT) ) {
                    int LA24_5 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==BYTE||LA24_0==CHAR||LA24_0==INT||LA24_0==LONG||LA24_0==SHORT) ) {
                    int LA24_6 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==VOID) ) {
                    int LA24_7 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==NORMALTYPE) ) {
                    int LA24_8 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt24=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==BaseType||LA24_0==DEFAULT||LA24_0==IDENTIFIER||LA24_0==VoidType) ) {
                    int LA24_9 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred2_JVM()) ) {
                        alt24=2;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }
                else if ( (LA24_0==STATIC) ) {
                    int LA24_10 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }
                    else if ( (true) ) {
                        alt24=4;
                    }


                }
                else if ( (LA24_0==ABSTRACT||LA24_0==NATIVE||LA24_0==SYNCHRONIZED) && (synpred1_JVM())) {
                    alt24=1;
                }
                else if ( (LA24_0==TRANSIENT||LA24_0==VOLATILE) && (synpred3_JVM())) {
                    alt24=3;
                }
                else if ( (LA24_0==FINAL) ) {
                    int LA24_13 = input.LA(2);

                    if ( (synpred1_JVM()) ) {
                        alt24=1;
                    }
                    else if ( (synpred3_JVM()) ) {
                        alt24=3;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // JVM.g:190:3: ( methodDefinition )=> methodDefinition
            	    {
            	    pushFollow(FOLLOW_methodDefinition_in_classBody805);
            	    methodDefinition116=methodDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition116.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:191:4: ( ctorDefinition )=> ctorDefinition
            	    {
            	    pushFollow(FOLLOW_ctorDefinition_in_classBody816);
            	    ctorDefinition117=ctorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ctorDefinition117.getTree());

            	    }
            	    break;
            	case 3 :
            	    // JVM.g:192:4: ( fieldDefinition )=> fieldDefinition
            	    {
            	    pushFollow(FOLLOW_fieldDefinition_in_classBody827);
            	    fieldDefinition118=fieldDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldDefinition118.getTree());

            	    }
            	    break;
            	case 4 :
            	    // JVM.g:193:4: staticCtorDefinition
            	    {
            	    pushFollow(FOLLOW_staticCtorDefinition_in_classBody832);
            	    staticCtorDefinition119=staticCtorDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticCtorDefinition119.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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

        Token ASSIGN124=null;
        Token SEMI126=null;
        JVMParser.field_visual_modifier_return field_visual_modifier120 =null;

        JVMParser.field_modifier_return field_modifier121 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType122 =null;

        JVMParser.identifier_return identifier123 =null;

        JVMParser.literals_return literals125 =null;

        JVMParser.fieldInfo_return fieldInfo127 =null;

        JVMParser.fieldAdditionalInfo_return fieldAdditionalInfo128 =null;


        Object ASSIGN124_tree=null;
        Object SEMI126_tree=null;

        try {
            // JVM.g:202:2: ( ( field_visual_modifier )? ( field_modifier )* aggregatedJavaType identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )* )
            // JVM.g:202:4: ( field_visual_modifier )? ( field_modifier )* aggregatedJavaType identifier ( ASSIGN literals )? SEMI fieldInfo ( fieldAdditionalInfo )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:202:4: ( field_visual_modifier )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0 >= PRIVATE && LA25_0 <= PUBLIC)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // JVM.g:202:4: field_visual_modifier
                    {
                    pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition851);
                    field_visual_modifier120=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier120.getTree());

                    }
                    break;

            }


            // JVM.g:202:27: ( field_modifier )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==FINAL||LA26_0==STATIC||LA26_0==TRANSIENT||LA26_0==VOLATILE) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // JVM.g:202:27: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition854);
            	    field_modifier121=field_modifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_modifier121.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            pushFollow(FOLLOW_aggregatedJavaType_in_fieldDefinition857);
            aggregatedJavaType122=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType122.getTree());

            pushFollow(FOLLOW_identifier_in_fieldDefinition859);
            identifier123=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier123.getTree());

            // JVM.g:202:73: ( ASSIGN literals )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ASSIGN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // JVM.g:202:74: ASSIGN literals
                    {
                    ASSIGN124=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_fieldDefinition862); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN124_tree = 
                    (Object)adaptor.create(ASSIGN124)
                    ;
                    adaptor.addChild(root_0, ASSIGN124_tree);
                    }

                    pushFollow(FOLLOW_literals_in_fieldDefinition864);
                    literals125=literals();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literals125.getTree());

                    }
                    break;

            }


            SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_fieldDefinition868); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI126_tree = 
            (Object)adaptor.create(SEMI126)
            ;
            adaptor.addChild(root_0, SEMI126_tree);
            }

            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition873);
            fieldInfo127=fieldInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfo127.getTree());

            // JVM.g:204:3: ( fieldAdditionalInfo )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Constant||LA28_0==Deprecated||LA28_0==RuntimeVisibleAnnotations||LA28_0==Signature||LA28_0==Synthetic) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // JVM.g:204:3: fieldAdditionalInfo
            	    {
            	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition877);
            	    fieldAdditionalInfo128=fieldAdditionalInfo();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldAdditionalInfo128.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // JVM.g:207:1: fieldInfo : Signature fieldInfoOption1 Flag ( accessFlagList )? ;
    public final JVMParser.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMParser.fieldInfo_return retval = new JVMParser.fieldInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature129=null;
        Token Flag131=null;
        JVMParser.fieldInfoOption1_return fieldInfoOption1130 =null;

        JVMParser.accessFlagList_return accessFlagList132 =null;


        Object Signature129_tree=null;
        Object Flag131_tree=null;

        try {
            // JVM.g:208:2: ( Signature fieldInfoOption1 Flag ( accessFlagList )? )
            // JVM.g:208:4: Signature fieldInfoOption1 Flag ( accessFlagList )?
            {
            root_0 = (Object)adaptor.nil();


            Signature129=(Token)match(input,Signature,FOLLOW_Signature_in_fieldInfo889); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Signature129_tree = 
            (Object)adaptor.create(Signature129)
            ;
            adaptor.addChild(root_0, Signature129_tree);
            }

            pushFollow(FOLLOW_fieldInfoOption1_in_fieldInfo891);
            fieldInfoOption1130=fieldInfoOption1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption1130.getTree());

            Flag131=(Token)match(input,Flag,FOLLOW_Flag_in_fieldInfo896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Flag131_tree = 
            (Object)adaptor.create(Flag131)
            ;
            adaptor.addChild(root_0, Flag131_tree);
            }

            // JVM.g:209:8: ( accessFlagList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENTIFIER) ) {
                alt29=1;
            }
            else if ( (LA29_0==INTLITERAL) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // JVM.g:209:8: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_fieldInfo898);
                    accessFlagList132=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, accessFlagList132.getTree());

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
                    Constant133=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constant133_tree = 
                    (Object)adaptor.create(Constant133)
                    ;
                    adaptor.addChild(root_0, Constant133_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo914);
                    fieldInfoOption3134=fieldInfoOption3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption3134.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:214:4: Constant fieldInfoOption4
                    {
                    Constant135=(Token)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo919); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constant135_tree = 
                    (Object)adaptor.create(Constant135)
                    ;
                    adaptor.addChild(root_0, Constant135_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo921);
                    fieldInfoOption4136=fieldInfoOption4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption4136.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:215:4: Signature fieldInfoOption5
                    {
                    Signature137=(Token)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo926); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Signature137_tree = 
                    (Object)adaptor.create(Signature137)
                    ;
                    adaptor.addChild(root_0, Signature137_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo928);
                    fieldInfoOption5138=fieldInfoOption5();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption5138.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:216:4: Deprecated fieldInfoOption6
                    {
                    Deprecated139=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Deprecated139_tree = 
                    (Object)adaptor.create(Deprecated139)
                    ;
                    adaptor.addChild(root_0, Deprecated139_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo935);
                    fieldInfoOption6140=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption6140.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:217:4: Synthetic fieldInfoOption6
                    {
                    Synthetic141=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Synthetic141_tree = 
                    (Object)adaptor.create(Synthetic141)
                    ;
                    adaptor.addChild(root_0, Synthetic141_tree);
                    }

                    pushFollow(FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo942);
                    fieldInfoOption6142=fieldInfoOption6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldInfoOption6142.getTree());

                    }
                    break;
                case 6 :
                    // JVM.g:218:4: runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo947);
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


            pushFollow(FOLLOW_bytecodeType_in_fieldInfoOption1961);
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
            IDENTIFIER145=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption2974); if (state.failed) return retval; 
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
            	    COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_fieldInfoOption2977); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA146);


            	    IDENTIFIER147=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fieldInfoOption2979); if (state.failed) return retval; 
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


            pushFollow(FOLLOW_primitiveType_in_fieldInfoOption3998);
            primitiveType148=primitiveType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType148.getTree());

            pushFollow(FOLLOW_literals_in_fieldInfoOption31000);
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


            CONSTANT_TYPE_ASSIGNABLE150=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption41012); if (state.failed) return retval;
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


            CPINDEX151=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldInfoOption51025); if (state.failed) return retval;
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


            BOOLEANLITERAL152=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldInfoOption61038); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition1098);
                    field_visual_modifier155=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier155.getTree());

                    }
                    break;

            }


            STATIC156=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticCtorDefinition1101); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STATIC156_tree = 
            (Object)adaptor.create(STATIC156)
            ;
            adaptor.addChild(root_0, STATIC156_tree);
            }

            LBRACE157=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_staticCtorDefinition1103); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE157_tree = 
            (Object)adaptor.create(LBRACE157)
            ;
            adaptor.addChild(root_0, LBRACE157_tree);
            }

            RBRACE158=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_staticCtorDefinition1105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE158_tree = 
            (Object)adaptor.create(RBRACE158)
            ;
            adaptor.addChild(root_0, RBRACE158_tree);
            }

            SEMI159=(Token)match(input,SEMI,FOLLOW_SEMI_in_staticCtorDefinition1107); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI159_tree = 
            (Object)adaptor.create(SEMI159)
            ;
            adaptor.addChild(root_0, SEMI159_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition1112);
            methodInfo160=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodInfo160.getTree());

            pushFollow(FOLLOW_body_in_staticCtorDefinition1116);
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
                    pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition1132);
                    field_visual_modifier162=field_visual_modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, field_visual_modifier162.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_javaType_in_ctorDefinition1135);
            javaType163=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType163.getTree());

            pushFollow(FOLLOW_arguments_in_ctorDefinition1137);
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
                    pushFollow(FOLLOW_throwClause_in_ctorDefinition1139);
                    throwClause165=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause165.getTree());

                    }
                    break;

            }


            SEMI166=(Token)match(input,SEMI,FOLLOW_SEMI_in_ctorDefinition1142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI166_tree = 
            (Object)adaptor.create(SEMI166)
            ;
            adaptor.addChild(root_0, SEMI166_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_ctorDefinition1147);
            methodInfo167=methodInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodInfo167.getTree());

            pushFollow(FOLLOW_body_in_ctorDefinition1151);
            body168=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body168.getTree());

            pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition1155);
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
            	    pushFollow(FOLLOW_method_modifier_in_methodDefinition1170);
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
                    pushFollow(FOLLOW_genericReturn_in_methodDefinition1173);
                    genericReturn171=genericReturn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericReturn171.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_aggregatedJavaType_in_methodDefinition1176);
            aggregatedJavaType172=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType172.getTree());

            pushFollow(FOLLOW_javaTypeIdentifier_in_methodDefinition1178);
            javaTypeIdentifier173=javaTypeIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier173.getTree());

            pushFollow(FOLLOW_arguments_in_methodDefinition1180);
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
                    pushFollow(FOLLOW_throwClause_in_methodDefinition1182);
                    throwClause175=throwClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause175.getTree());

                    }
                    break;

            }


            SEMI176=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDefinition1185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SEMI176_tree = 
            (Object)adaptor.create(SEMI176)
            ;
            adaptor.addChild(root_0, SEMI176_tree);
            }

            pushFollow(FOLLOW_methodInfo_in_methodDefinition1190);
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
                    pushFollow(FOLLOW_body_in_methodDefinition1194);
                    body178=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body178.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition1199);
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
    // JVM.g:285:1: methodInfo : Signature methodSignatureInfo Flag ( accessFlagList )? ;
    public final JVMParser.methodInfo_return methodInfo() throws RecognitionException {
        JVMParser.methodInfo_return retval = new JVMParser.methodInfo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Signature180=null;
        Token Flag182=null;
        JVMParser.methodSignatureInfo_return methodSignatureInfo181 =null;

        JVMParser.accessFlagList_return accessFlagList183 =null;


        Object Signature180_tree=null;
        Object Flag182_tree=null;

        try {
            // JVM.g:286:2: ( Signature methodSignatureInfo Flag ( accessFlagList )? )
            // JVM.g:286:4: Signature methodSignatureInfo Flag ( accessFlagList )?
            {
            root_0 = (Object)adaptor.nil();


            Signature180=(Token)match(input,Signature,FOLLOW_Signature_in_methodInfo1210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Signature180_tree = 
            (Object)adaptor.create(Signature180)
            ;
            adaptor.addChild(root_0, Signature180_tree);
            }

            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo1212);
            methodSignatureInfo181=methodSignatureInfo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodSignatureInfo181.getTree());

            Flag182=(Token)match(input,Flag,FOLLOW_Flag_in_methodInfo1217); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Flag182_tree = 
            (Object)adaptor.create(Flag182)
            ;
            adaptor.addChild(root_0, Flag182_tree);
            }

            // JVM.g:287:8: ( accessFlagList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IDENTIFIER) ) {
                alt39=1;
            }
            else if ( (LA39_0==INTLITERAL) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // JVM.g:287:8: accessFlagList
                    {
                    pushFollow(FOLLOW_accessFlagList_in_methodInfo1219);
                    accessFlagList183=accessFlagList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, accessFlagList183.getTree());

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

        Token Deprecated184=null;
        Token Signature186=null;
        Token CPINDEX187=null;
        Token Exceptions189=null;
        Token Synthetic191=null;
        Token BOOLEANLITERAL192=null;
        JVMParser.methodDeprecatedInfo_return methodDeprecatedInfo185 =null;

        JVMParser.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info188 =null;

        JVMParser.throwClause_return throwClause190 =null;

        JVMParser.annotationDefault_return annotationDefault193 =null;


        Object Deprecated184_tree=null;
        Object Signature186_tree=null;
        Object CPINDEX187_tree=null;
        Object Exceptions189_tree=null;
        Object Synthetic191_tree=null;
        Object BOOLEANLITERAL192_tree=null;

        try {
            // JVM.g:291:2: ( ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )* )
            // JVM.g:291:4: ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:291:4: ( ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==AnnotationDefault||LA41_0==Deprecated||LA41_0==Exceptions||LA41_0==RuntimeVisibleAnnotations||LA41_0==Signature||LA41_0==Synthetic) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // JVM.g:291:5: ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault )
            	    {
            	    // JVM.g:291:5: ( Deprecated methodDeprecatedInfo | Signature CPINDEX | runtimeVisibleAnnotations_info | Exceptions throwClause | Synthetic BOOLEANLITERAL | annotationDefault )
            	    int alt40=6;
            	    switch ( input.LA(1) ) {
            	    case Deprecated:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case Signature:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case RuntimeVisibleAnnotations:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    case Exceptions:
            	        {
            	        alt40=4;
            	        }
            	        break;
            	    case Synthetic:
            	        {
            	        alt40=5;
            	        }
            	        break;
            	    case AnnotationDefault:
            	        {
            	        alt40=6;
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
            	            // JVM.g:291:6: Deprecated methodDeprecatedInfo
            	            {
            	            Deprecated184=(Token)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfo1234); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Deprecated184_tree = 
            	            (Object)adaptor.create(Deprecated184)
            	            ;
            	            adaptor.addChild(root_0, Deprecated184_tree);
            	            }

            	            pushFollow(FOLLOW_methodDeprecatedInfo_in_afterMethodInfo1236);
            	            methodDeprecatedInfo185=methodDeprecatedInfo();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeprecatedInfo185.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:292:4: Signature CPINDEX
            	            {
            	            Signature186=(Token)match(input,Signature,FOLLOW_Signature_in_afterMethodInfo1241); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Signature186_tree = 
            	            (Object)adaptor.create(Signature186)
            	            ;
            	            adaptor.addChild(root_0, Signature186_tree);
            	            }

            	            CPINDEX187=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfo1243); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CPINDEX187_tree = 
            	            (Object)adaptor.create(CPINDEX187)
            	            ;
            	            adaptor.addChild(root_0, CPINDEX187_tree);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // JVM.g:293:4: runtimeVisibleAnnotations_info
            	            {
            	            pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1248);
            	            runtimeVisibleAnnotations_info188=runtimeVisibleAnnotations_info();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, runtimeVisibleAnnotations_info188.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // JVM.g:294:4: Exceptions throwClause
            	            {
            	            Exceptions189=(Token)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfo1253); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Exceptions189_tree = 
            	            (Object)adaptor.create(Exceptions189)
            	            ;
            	            adaptor.addChild(root_0, Exceptions189_tree);
            	            }

            	            pushFollow(FOLLOW_throwClause_in_afterMethodInfo1256);
            	            throwClause190=throwClause();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, throwClause190.getTree());

            	            }
            	            break;
            	        case 5 :
            	            // JVM.g:295:4: Synthetic BOOLEANLITERAL
            	            {
            	            Synthetic191=(Token)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfo1261); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            Synthetic191_tree = 
            	            (Object)adaptor.create(Synthetic191)
            	            ;
            	            adaptor.addChild(root_0, Synthetic191_tree);
            	            }

            	            BOOLEANLITERAL192=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1263); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BOOLEANLITERAL192_tree = 
            	            (Object)adaptor.create(BOOLEANLITERAL192)
            	            ;
            	            adaptor.addChild(root_0, BOOLEANLITERAL192_tree);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // JVM.g:296:4: annotationDefault
            	            {
            	            pushFollow(FOLLOW_annotationDefault_in_afterMethodInfo1268);
            	            annotationDefault193=annotationDefault();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, annotationDefault193.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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

        Token AnnotationDefault194=null;
        Token DefaultValue195=null;
        Token AnnotationAssign196=null;
        Token LBRACK197=null;
        Token RBRACK198=null;

        Object AnnotationDefault194_tree=null;
        Object DefaultValue195_tree=null;
        Object AnnotationAssign196_tree=null;
        Object LBRACK197_tree=null;
        Object RBRACK198_tree=null;

        try {
            // JVM.g:300:2: ( AnnotationDefault DefaultValue ( AnnotationAssign | LBRACK RBRACK ) )
            // JVM.g:300:4: AnnotationDefault DefaultValue ( AnnotationAssign | LBRACK RBRACK )
            {
            root_0 = (Object)adaptor.nil();


            AnnotationDefault194=(Token)match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault1283); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AnnotationDefault194_tree = 
            (Object)adaptor.create(AnnotationDefault194)
            ;
            adaptor.addChild(root_0, AnnotationDefault194_tree);
            }

            DefaultValue195=(Token)match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault1286); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DefaultValue195_tree = 
            (Object)adaptor.create(DefaultValue195)
            ;
            adaptor.addChild(root_0, DefaultValue195_tree);
            }

            // JVM.g:300:36: ( AnnotationAssign | LBRACK RBRACK )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==AnnotationAssign) ) {
                alt42=1;
            }
            else if ( (LA42_0==LBRACK) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // JVM.g:300:37: AnnotationAssign
                    {
                    AnnotationAssign196=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationDefault1289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AnnotationAssign196_tree = 
                    (Object)adaptor.create(AnnotationAssign196)
                    ;
                    adaptor.addChild(root_0, AnnotationAssign196_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:300:56: LBRACK RBRACK
                    {
                    LBRACK197=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_annotationDefault1293); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACK197_tree = 
                    (Object)adaptor.create(LBRACK197)
                    ;
                    adaptor.addChild(root_0, LBRACK197_tree);
                    }

                    RBRACK198=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_annotationDefault1295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACK198_tree = 
                    (Object)adaptor.create(RBRACK198)
                    ;
                    adaptor.addChild(root_0, RBRACK198_tree);
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

        Token LPAREN199=null;
        Token RPAREN201=null;
        JVMParser.bytecodeType_return bytecodeType200 =null;

        JVMParser.returnDescriptor_return returnDescriptor202 =null;


        Object LPAREN199_tree=null;
        Object RPAREN201_tree=null;

        try {
            // JVM.g:304:2: ( LPAREN ( bytecodeType )* RPAREN returnDescriptor )
            // JVM.g:304:4: LPAREN ( bytecodeType )* RPAREN returnDescriptor
            {
            root_0 = (Object)adaptor.nil();


            LPAREN199=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodSignatureInfo1308); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN199_tree = 
            (Object)adaptor.create(LPAREN199)
            ;
            adaptor.addChild(root_0, LPAREN199_tree);
            }

            // JVM.g:304:11: ( bytecodeType )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BaseType||LA43_0==IDENTIFIER||LA43_0==INTERNALTYPE||LA43_0==LBRACK||LA43_0==VersionedInternalType) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // JVM.g:304:11: bytecodeType
            	    {
            	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo1310);
            	    bytecodeType200=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType200.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            RPAREN201=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodSignatureInfo1313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN201_tree = 
            (Object)adaptor.create(RPAREN201)
            ;
            adaptor.addChild(root_0, RPAREN201_tree);
            }

            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo1315);
            returnDescriptor202=returnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, returnDescriptor202.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token VoidType204=null;
        JVMParser.bytecodeType_return bytecodeType203 =null;


        Object VoidType204_tree=null;

        try {
            // JVM.g:308:2: ( bytecodeType | VoidType )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==BaseType||LA44_0==IDENTIFIER||LA44_0==INTERNALTYPE||LA44_0==LBRACK||LA44_0==VersionedInternalType) ) {
                alt44=1;
            }
            else if ( (LA44_0==VoidType) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // JVM.g:308:4: bytecodeType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor1326);
                    bytecodeType203=bytecodeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType203.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:308:19: VoidType
                    {
                    root_0 = (Object)adaptor.nil();


                    VoidType204=(Token)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor1330); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VoidType204_tree = 
                    (Object)adaptor.create(VoidType204)
                    ;
                    adaptor.addChild(root_0, VoidType204_tree);
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

        Token BOOLEANLITERAL205=null;

        Object BOOLEANLITERAL205_tree=null;

        try {
            // JVM.g:312:2: ( BOOLEANLITERAL )
            // JVM.g:312:4: BOOLEANLITERAL
            {
            root_0 = (Object)adaptor.nil();


            BOOLEANLITERAL205=(Token)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo1342); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEANLITERAL205_tree = 
            (Object)adaptor.create(BOOLEANLITERAL205)
            ;
            adaptor.addChild(root_0, BOOLEANLITERAL205_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token set206=null;

        Object set206_tree=null;

        try {
            // JVM.g:316:2: ( ABSTRACT | FINAL | STATIC | SYNCHRONIZED | NATIVE | PUBLIC | PRIVATE | PROTECTED )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set206=(Token)input.LT(1);

            if ( input.LA(1)==ABSTRACT||input.LA(1)==FINAL||input.LA(1)==NATIVE||(input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC)||input.LA(1)==STATIC||input.LA(1)==SYNCHRONIZED ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set206)
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

        Token LPAREN207=null;
        Token DOT209=null;
        Token DOT210=null;
        Token DOT211=null;
        Token RPAREN212=null;
        JVMParser.typeList_return typeList208 =null;


        Object LPAREN207_tree=null;
        Object DOT209_tree=null;
        Object DOT210_tree=null;
        Object DOT211_tree=null;
        Object RPAREN212_tree=null;

        try {
            // JVM.g:320:2: ( LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN )
            // JVM.g:320:4: LPAREN ( typeList )? ( DOT DOT DOT )? RPAREN
            {
            root_0 = (Object)adaptor.nil();


            LPAREN207=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments1394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN207_tree = 
            (Object)adaptor.create(LPAREN207)
            ;
            adaptor.addChild(root_0, LPAREN207_tree);
            }

            // JVM.g:320:11: ( typeList )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==BOOLEAN||(LA45_0 >= BYTE && LA45_0 <= CHAR)||LA45_0==DEFAULT||LA45_0==DOUBLE||LA45_0==FLOAT||LA45_0==IDENTIFIER||LA45_0==INT||LA45_0==LONG||LA45_0==NORMALTYPE||LA45_0==SHORT||LA45_0==VOID||LA45_0==VoidType) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // JVM.g:320:11: typeList
                    {
                    pushFollow(FOLLOW_typeList_in_arguments1396);
                    typeList208=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList208.getTree());

                    }
                    break;

            }


            // JVM.g:320:21: ( DOT DOT DOT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==DOT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // JVM.g:320:22: DOT DOT DOT
                    {
                    DOT209=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT209_tree = 
                    (Object)adaptor.create(DOT209)
                    ;
                    adaptor.addChild(root_0, DOT209_tree);
                    }

                    DOT210=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT210_tree = 
                    (Object)adaptor.create(DOT210)
                    ;
                    adaptor.addChild(root_0, DOT210_tree);
                    }

                    DOT211=(Token)match(input,DOT,FOLLOW_DOT_in_arguments1404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT211_tree = 
                    (Object)adaptor.create(DOT211)
                    ;
                    adaptor.addChild(root_0, DOT211_tree);
                    }

                    }
                    break;

            }


            RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments1408); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN212_tree = 
            (Object)adaptor.create(RPAREN212)
            ;
            adaptor.addChild(root_0, RPAREN212_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token Code213=null;
        JVMParser.codeBlock_return codeBlock214 =null;

        JVMParser.bodyExtension_return bodyExtension215 =null;


        Object Code213_tree=null;

        try {
            // JVM.g:328:2: ( Code codeBlock ( bodyExtension )* )
            // JVM.g:329:3: Code codeBlock ( bodyExtension )*
            {
            root_0 = (Object)adaptor.nil();


            Code213=(Token)match(input,Code,FOLLOW_Code_in_body1429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Code213_tree = 
            (Object)adaptor.create(Code213)
            ;
            adaptor.addChild(root_0, Code213_tree);
            }

            pushFollow(FOLLOW_codeBlock_in_body1434);
            codeBlock214=codeBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, codeBlock214.getTree());

            // JVM.g:331:3: ( bodyExtension )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==ExceptionTable||(LA47_0 >= LineNumberTable && LA47_0 <= LocalVariableTypeTable)||(LA47_0 >= StackMap && LA47_0 <= StackMapTable)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // JVM.g:331:4: bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body1439);
            	    bodyExtension215=bodyExtension();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bodyExtension215.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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

        Token ExceptionTable216=null;
        Token LineNumberTable218=null;
        Token LocalVariableTable220=null;
        Token LocalVariableTypeTable222=null;
        Token StackMapTable224=null;
        Token StackMap226=null;
        JVMParser.exceptionTable_return exceptionTable217 =null;

        JVMParser.lineNumberTable_return lineNumberTable219 =null;

        JVMParser.localVariableTable_return localVariableTable221 =null;

        JVMParser.localVariableTable_return localVariableTable223 =null;

        JVMParser.stackMapTable_return stackMapTable225 =null;

        JVMParser.stackMapTypeTable_return stackMapTypeTable227 =null;


        Object ExceptionTable216_tree=null;
        Object LineNumberTable218_tree=null;
        Object LocalVariableTable220_tree=null;
        Object LocalVariableTypeTable222_tree=null;
        Object StackMapTable224_tree=null;
        Object StackMap226_tree=null;

        try {
            // JVM.g:335:2: ( ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable ) )
            // JVM.g:336:2: ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:336:2: ( ExceptionTable exceptionTable | LineNumberTable lineNumberTable | LocalVariableTable localVariableTable | LocalVariableTypeTable localVariableTable | StackMapTable stackMapTable | StackMap stackMapTypeTable )
            int alt48=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt48=1;
                }
                break;
            case LineNumberTable:
                {
                alt48=2;
                }
                break;
            case LocalVariableTable:
                {
                alt48=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt48=4;
                }
                break;
            case StackMapTable:
                {
                alt48=5;
                }
                break;
            case StackMap:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // JVM.g:336:4: ExceptionTable exceptionTable
                    {
                    ExceptionTable216=(Token)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension1457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ExceptionTable216_tree = 
                    (Object)adaptor.create(ExceptionTable216)
                    ;
                    adaptor.addChild(root_0, ExceptionTable216_tree);
                    }

                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension1460);
                    exceptionTable217=exceptionTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionTable217.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:337:4: LineNumberTable lineNumberTable
                    {
                    LineNumberTable218=(Token)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension1465); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LineNumberTable218_tree = 
                    (Object)adaptor.create(LineNumberTable218)
                    ;
                    adaptor.addChild(root_0, LineNumberTable218_tree);
                    }

                    pushFollow(FOLLOW_lineNumberTable_in_bodyExtension1468);
                    lineNumberTable219=lineNumberTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTable219.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:338:4: LocalVariableTable localVariableTable
                    {
                    LocalVariableTable220=(Token)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension1473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LocalVariableTable220_tree = 
                    (Object)adaptor.create(LocalVariableTable220)
                    ;
                    adaptor.addChild(root_0, LocalVariableTable220_tree);
                    }

                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension1476);
                    localVariableTable221=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTable221.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:339:4: LocalVariableTypeTable localVariableTable
                    {
                    LocalVariableTypeTable222=(Token)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LocalVariableTypeTable222_tree = 
                    (Object)adaptor.create(LocalVariableTypeTable222)
                    ;
                    adaptor.addChild(root_0, LocalVariableTypeTable222_tree);
                    }

                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension1485);
                    localVariableTable223=localVariableTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTable223.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:340:4: StackMapTable stackMapTable
                    {
                    StackMapTable224=(Token)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension1491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StackMapTable224_tree = 
                    (Object)adaptor.create(StackMapTable224)
                    ;
                    adaptor.addChild(root_0, StackMapTable224_tree);
                    }

                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension1493);
                    stackMapTable225=stackMapTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTable225.getTree());

                    }
                    break;
                case 6 :
                    // JVM.g:341:4: StackMap stackMapTypeTable
                    {
                    StackMap226=(Token)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension1498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StackMap226_tree = 
                    (Object)adaptor.create(StackMap226)
                    ;
                    adaptor.addChild(root_0, StackMap226_tree);
                    }

                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension1500);
                    stackMapTypeTable227=stackMapTypeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTypeTable227.getTree());

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

        JVMParser.variables_return variables228 =null;

        JVMParser.codeLine_return codeLine229 =null;

        JVMParser.javaSwitch_return javaSwitch230 =null;

        JVMParser.codeBlockEnd_return codeBlockEnd231 =null;



        try {
            // JVM.g:345:2: ( variables ( codeLine | javaSwitch )* codeBlockEnd )
            // JVM.g:345:4: variables ( codeLine | javaSwitch )* codeBlockEnd
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variables_in_codeBlock1512);
            variables228=variables();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variables228.getTree());

            // JVM.g:346:3: ( codeLine | javaSwitch )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==INTLITERAL) ) {
                    int LA49_1 = input.LA(2);

                    if ( (LA49_1==COLON) ) {
                        int LA49_2 = input.LA(3);

                        if ( (LA49_2==IDENTIFIER) ) {
                            switch ( input.LA(4) ) {
                            case LBRACE:
                                {
                                alt49=2;
                                }
                                break;
                            case INTLITERAL:
                                {
                                int LA49_5 = input.LA(5);

                                if ( ((LA49_5 >= COLON && LA49_5 <= COMMA)||LA49_5==INTLITERAL) ) {
                                    alt49=1;
                                }


                                }
                                break;
                            case BOOLEAN:
                                {
                                int LA49_7 = input.LA(5);

                                if ( (LA49_7==INTLITERAL) ) {
                                    alt49=1;
                                }


                                }
                                break;
                            case DOUBLE:
                            case FLOAT:
                                {
                                int LA49_8 = input.LA(5);

                                if ( (LA49_8==INTLITERAL) ) {
                                    alt49=1;
                                }


                                }
                                break;
                            case BYTE:
                            case CHAR:
                            case INT:
                            case LONG:
                            case SHORT:
                                {
                                int LA49_9 = input.LA(5);

                                if ( (LA49_9==INTLITERAL) ) {
                                    alt49=1;
                                }


                                }
                                break;
                            case VOID:
                                {
                                int LA49_10 = input.LA(5);

                                if ( (LA49_10==INTLITERAL) ) {
                                    alt49=1;
                                }


                                }
                                break;
                            case CPINDEX:
                                {
                                alt49=1;
                                }
                                break;

                            }

                        }


                    }


                }


                switch (alt49) {
            	case 1 :
            	    // JVM.g:346:4: codeLine
            	    {
            	    pushFollow(FOLLOW_codeLine_in_codeBlock1518);
            	    codeLine229=codeLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeLine229.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:346:15: javaSwitch
            	    {
            	    pushFollow(FOLLOW_javaSwitch_in_codeBlock1522);
            	    javaSwitch230=javaSwitch();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaSwitch230.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock1528);
            codeBlockEnd231=codeBlockEnd();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, codeBlockEnd231.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER233=null;
        JVMParser.pc_return pc232 =null;

        JVMParser.codeValues_return codeValues234 =null;


        Object IDENTIFIER233_tree=null;

        try {
            // JVM.g:351:2: ( pc IDENTIFIER ( codeValues )? )
            // JVM.g:351:4: pc IDENTIFIER ( codeValues )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_codeLine1539);
            pc232=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc232.getTree());

            IDENTIFIER233=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine1541); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER233_tree = 
            (Object)adaptor.create(IDENTIFIER233)
            ;
            adaptor.addChild(root_0, IDENTIFIER233_tree);
            }

            // JVM.g:351:18: ( codeValues )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==BOOLEAN||LA50_0==BYTE||LA50_0==CHAR||LA50_0==CPINDEX||LA50_0==DOUBLE||LA50_0==FLOAT||LA50_0==INT||LA50_0==LONG||LA50_0==SHORT||LA50_0==VOID) ) {
                alt50=1;
            }
            else if ( (LA50_0==INTLITERAL) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==COMMA||LA50_2==INTLITERAL) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // JVM.g:351:18: codeValues
                    {
                    pushFollow(FOLLOW_codeValues_in_codeLine1543);
                    codeValues234=codeValues();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, codeValues234.getTree());

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

        Token IDENTIFIER236=null;
        JVMParser.pc_return pc235 =null;

        JVMParser.logic3_return logic3237 =null;


        Object IDENTIFIER236_tree=null;

        try {
            // JVM.g:355:2: ( pc IDENTIFIER ( logic3 )? )
            // JVM.g:355:4: pc IDENTIFIER ( logic3 )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_codeBlockEnd1555);
            pc235=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc235.getTree());

            IDENTIFIER236=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd1557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER236_tree = 
            (Object)adaptor.create(IDENTIFIER236)
            ;
            adaptor.addChild(root_0, IDENTIFIER236_tree);
            }

            // JVM.g:355:18: ( logic3 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==INTLITERAL) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // JVM.g:355:18: logic3
                    {
                    pushFollow(FOLLOW_logic3_in_codeBlockEnd1559);
                    logic3237=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic3237.getTree());

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

        JVMParser.logic_return logic238 =null;

        JVMParser.logic2_return logic2239 =null;

        JVMParser.logic3_return logic3240 =null;

        JVMParser.logic4_return logic4241 =null;

        JVMParser.primitiveType_return primitiveType242 =null;



        try {
            // JVM.g:359:2: ( logic | logic2 | logic3 | logic4 | primitiveType )
            int alt52=5;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==COMMA) ) {
                    alt52=1;
                }
                else if ( (LA52_1==INTLITERAL) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==COMMA) ) {
                    alt52=4;
                }
                else if ( (LA52_2==INTLITERAL) ) {
                    alt52=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

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
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // JVM.g:359:4: logic
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic_in_codeValues1573);
                    logic238=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic238.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:360:4: logic2
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic2_in_codeValues1579);
                    logic2239=logic2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic2239.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:361:4: logic3
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic3_in_codeValues1585);
                    logic3240=logic3();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic3240.getTree());

                    }
                    break;
                case 4 :
                    // JVM.g:362:4: logic4
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_logic4_in_codeValues1590);
                    logic4241=logic4();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logic4241.getTree());

                    }
                    break;
                case 5 :
                    // JVM.g:363:4: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_codeValues1595);
                    primitiveType242=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType242.getTree());

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

        Token CPINDEX243=null;
        Token COMMA244=null;
        Token INTLITERAL245=null;

        Object CPINDEX243_tree=null;
        Object COMMA244_tree=null;
        Object INTLITERAL245_tree=null;

        try {
            // JVM.g:367:2: ( CPINDEX COMMA INTLITERAL )
            // JVM.g:367:4: CPINDEX COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX243=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic1607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX243_tree = 
            (Object)adaptor.create(CPINDEX243)
            ;
            adaptor.addChild(root_0, CPINDEX243_tree);
            }

            COMMA244=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic1609); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA244_tree = 
            (Object)adaptor.create(COMMA244)
            ;
            adaptor.addChild(root_0, COMMA244_tree);
            }

            INTLITERAL245=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic1611); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL245_tree = 
            (Object)adaptor.create(INTLITERAL245)
            ;
            adaptor.addChild(root_0, INTLITERAL245_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token CPINDEX246=null;

        Object CPINDEX246_tree=null;

        try {
            // JVM.g:371:2: ( CPINDEX )
            // JVM.g:371:4: CPINDEX
            {
            root_0 = (Object)adaptor.nil();


            CPINDEX246=(Token)match(input,CPINDEX,FOLLOW_CPINDEX_in_logic21623); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CPINDEX246_tree = 
            (Object)adaptor.create(CPINDEX246)
            ;
            adaptor.addChild(root_0, CPINDEX246_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token INTLITERAL247=null;

        Object INTLITERAL247_tree=null;

        try {
            // JVM.g:375:2: ( INTLITERAL )
            // JVM.g:375:4: INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL247=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic31635); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL247_tree = 
            (Object)adaptor.create(INTLITERAL247)
            ;
            adaptor.addChild(root_0, INTLITERAL247_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token INTLITERAL248=null;
        Token COMMA249=null;
        Token INTLITERAL250=null;

        Object INTLITERAL248_tree=null;
        Object COMMA249_tree=null;
        Object INTLITERAL250_tree=null;

        try {
            // JVM.g:379:2: ( INTLITERAL COMMA INTLITERAL )
            // JVM.g:379:4: INTLITERAL COMMA INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL248=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic41647); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL248_tree = 
            (Object)adaptor.create(INTLITERAL248)
            ;
            adaptor.addChild(root_0, INTLITERAL248_tree);
            }

            COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_logic41649); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA249_tree = 
            (Object)adaptor.create(COMMA249)
            ;
            adaptor.addChild(root_0, COMMA249_tree);
            }

            INTLITERAL250=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_logic41651); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL250_tree = 
            (Object)adaptor.create(INTLITERAL250)
            ;
            adaptor.addChild(root_0, INTLITERAL250_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token COMMA252=null;
        Token COMMA254=null;
        JVMParser.variable_return variable251 =null;

        JVMParser.variable_return variable253 =null;

        JVMParser.variable_return variable255 =null;


        Object COMMA252_tree=null;
        Object COMMA254_tree=null;

        try {
            // JVM.g:383:2: ( variable COMMA variable COMMA variable )
            // JVM.g:383:4: variable COMMA variable COMMA variable
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variable_in_variables1662);
            variable251=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable251.getTree());

            COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables1664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA252_tree = 
            (Object)adaptor.create(COMMA252)
            ;
            adaptor.addChild(root_0, COMMA252_tree);
            }

            pushFollow(FOLLOW_variable_in_variables1666);
            variable253=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable253.getTree());

            COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_variables1668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA254_tree = 
            (Object)adaptor.create(COMMA254)
            ;
            adaptor.addChild(root_0, COMMA254_tree);
            }

            pushFollow(FOLLOW_variable_in_variables1670);
            variable255=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable255.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER256=null;
        Token ASSIGN257=null;
        Token INTLITERAL258=null;

        Object IDENTIFIER256_tree=null;
        Object ASSIGN257_tree=null;
        Object INTLITERAL258_tree=null;

        try {
            // JVM.g:387:2: ( IDENTIFIER ASSIGN INTLITERAL )
            // JVM.g:387:4: IDENTIFIER ASSIGN INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER256=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable1681); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER256_tree = 
            (Object)adaptor.create(IDENTIFIER256)
            ;
            adaptor.addChild(root_0, IDENTIFIER256_tree);
            }

            ASSIGN257=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variable1683); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN257_tree = 
            (Object)adaptor.create(ASSIGN257)
            ;
            adaptor.addChild(root_0, ASSIGN257_tree);
            }

            INTLITERAL258=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable1685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL258_tree = 
            (Object)adaptor.create(INTLITERAL258)
            ;
            adaptor.addChild(root_0, INTLITERAL258_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER260=null;
        Token LBRACE261=null;
        Token RBRACE264=null;
        JVMParser.pc_return pc259 =null;

        JVMParser.switchLine_return switchLine262 =null;

        JVMParser.switchDefaultLine_return switchDefaultLine263 =null;


        Object IDENTIFIER260_tree=null;
        Object LBRACE261_tree=null;
        Object RBRACE264_tree=null;

        try {
            // JVM.g:391:2: ( pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE )
            // JVM.g:391:4: pc IDENTIFIER LBRACE ( switchLine )* switchDefaultLine RBRACE
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_javaSwitch1697);
            pc259=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc259.getTree());

            IDENTIFIER260=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch1699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER260_tree = 
            (Object)adaptor.create(IDENTIFIER260)
            ;
            adaptor.addChild(root_0, IDENTIFIER260_tree);
            }

            LBRACE261=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_javaSwitch1703); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE261_tree = 
            (Object)adaptor.create(LBRACE261)
            ;
            adaptor.addChild(root_0, LBRACE261_tree);
            }

            // JVM.g:393:3: ( switchLine )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==INTLITERAL) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // JVM.g:393:3: switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch1708);
            	    switchLine262=switchLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchLine262.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch1713);
            switchDefaultLine263=switchDefaultLine();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, switchDefaultLine263.getTree());

            RBRACE264=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_javaSwitch1717); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE264_tree = 
            (Object)adaptor.create(RBRACE264)
            ;
            adaptor.addChild(root_0, RBRACE264_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token INTLITERAL266=null;
        JVMParser.pc_return pc265 =null;


        Object INTLITERAL266_tree=null;

        try {
            // JVM.g:399:2: ( pc INTLITERAL )
            // JVM.g:399:4: pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_pc_in_switchLine1730);
            pc265=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc265.getTree());

            INTLITERAL266=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine1732); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL266_tree = 
            (Object)adaptor.create(INTLITERAL266)
            ;
            adaptor.addChild(root_0, INTLITERAL266_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token DEFAULT267=null;
        Token COLON268=null;
        Token INTLITERAL269=null;

        Object DEFAULT267_tree=null;
        Object COLON268_tree=null;
        Object INTLITERAL269_tree=null;

        try {
            // JVM.g:403:2: ( DEFAULT COLON INTLITERAL )
            // JVM.g:403:4: DEFAULT COLON INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            DEFAULT267=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine1744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT267_tree = 
            (Object)adaptor.create(DEFAULT267)
            ;
            adaptor.addChild(root_0, DEFAULT267_tree);
            }

            COLON268=(Token)match(input,COLON,FOLLOW_COLON_in_switchDefaultLine1746); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON268_tree = 
            (Object)adaptor.create(COLON268)
            ;
            adaptor.addChild(root_0, COLON268_tree);
            }

            INTLITERAL269=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine1748); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL269_tree = 
            (Object)adaptor.create(INTLITERAL269)
            ;
            adaptor.addChild(root_0, INTLITERAL269_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token THROWS270=null;
        JVMParser.javaTypeList_return javaTypeList271 =null;


        Object THROWS270_tree=null;

        try {
            // JVM.g:411:2: ( THROWS javaTypeList )
            // JVM.g:411:4: THROWS javaTypeList
            {
            root_0 = (Object)adaptor.nil();


            THROWS270=(Token)match(input,THROWS,FOLLOW_THROWS_in_throwClause1764); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THROWS270_tree = 
            (Object)adaptor.create(THROWS270)
            ;
            adaptor.addChild(root_0, THROWS270_tree);
            }

            pushFollow(FOLLOW_javaTypeList_in_throwClause1766);
            javaTypeList271=javaTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeList271.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER272=null;
        Token IDENTIFIER273=null;
        Token IDENTIFIER274=null;
        Token IDENTIFIER275=null;
        JVMParser.exceptionTableEntry_return exceptionTableEntry276 =null;


        Object IDENTIFIER272_tree=null;
        Object IDENTIFIER273_tree=null;
        Object IDENTIFIER274_tree=null;
        Object IDENTIFIER275_tree=null;

        try {
            // JVM.g:415:2: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+ )
            // JVM.g:415:4: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( exceptionTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER272=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1777); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER272_tree = 
            (Object)adaptor.create(IDENTIFIER272)
            ;
            adaptor.addChild(root_0, IDENTIFIER272_tree);
            }

            IDENTIFIER273=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER273_tree = 
            (Object)adaptor.create(IDENTIFIER273)
            ;
            adaptor.addChild(root_0, IDENTIFIER273_tree);
            }

            IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER274_tree = 
            (Object)adaptor.create(IDENTIFIER274)
            ;
            adaptor.addChild(root_0, IDENTIFIER274_tree);
            }

            IDENTIFIER275=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable1783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER275_tree = 
            (Object)adaptor.create(IDENTIFIER275)
            ;
            adaptor.addChild(root_0, IDENTIFIER275_tree);
            }

            // JVM.g:416:3: ( exceptionTableEntry )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==INTLITERAL) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // JVM.g:416:3: exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable1788);
            	    exceptionTableEntry276=exceptionTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionTableEntry276.getTree());

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

        Token INTLITERAL277=null;
        Token INTLITERAL278=null;
        Token INTLITERAL279=null;
        Token IDENTIFIER281=null;
        Token CONSTANT_TYPE_ASSIGNABLE282=null;
        JVMParser.primitiveType_return primitiveType280 =null;


        Object INTLITERAL277_tree=null;
        Object INTLITERAL278_tree=null;
        Object INTLITERAL279_tree=null;
        Object IDENTIFIER281_tree=null;
        Object CONSTANT_TYPE_ASSIGNABLE282_tree=null;

        try {
            // JVM.g:420:2: ( INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE ) )
            // JVM.g:420:4: INTLITERAL INTLITERAL INTLITERAL ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL277=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL277_tree = 
            (Object)adaptor.create(INTLITERAL277)
            ;
            adaptor.addChild(root_0, INTLITERAL277_tree);
            }

            INTLITERAL278=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1802); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL278_tree = 
            (Object)adaptor.create(INTLITERAL278)
            ;
            adaptor.addChild(root_0, INTLITERAL278_tree);
            }

            INTLITERAL279=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry1804); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL279_tree = 
            (Object)adaptor.create(INTLITERAL279)
            ;
            adaptor.addChild(root_0, INTLITERAL279_tree);
            }

            // JVM.g:420:37: ( primitiveType | IDENTIFIER | CONSTANT_TYPE_ASSIGNABLE )
            int alt55=3;
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
                alt55=1;
                }
                break;
            case IDENTIFIER:
                {
                alt55=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt55=3;
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
                    // JVM.g:420:38: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntry1807);
                    primitiveType280=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType280.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:420:55: IDENTIFIER
                    {
                    IDENTIFIER281=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntry1812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER281_tree = 
                    (Object)adaptor.create(IDENTIFIER281)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER281_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:420:69: CONSTANT_TYPE_ASSIGNABLE
                    {
                    CONSTANT_TYPE_ASSIGNABLE282=(Token)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry1817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT_TYPE_ASSIGNABLE282_tree = 
                    (Object)adaptor.create(CONSTANT_TYPE_ASSIGNABLE282)
                    ;
                    adaptor.addChild(root_0, CONSTANT_TYPE_ASSIGNABLE282_tree);
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

        JVMParser.lineNumberTableLine_return lineNumberTableLine283 =null;



        try {
            // JVM.g:428:2: ( ( lineNumberTableLine )* )
            // JVM.g:428:4: ( lineNumberTableLine )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:428:4: ( lineNumberTableLine )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==IDENTIFIER) ) {
                    int LA56_2 = input.LA(2);

                    if ( (LA56_2==INTLITERAL) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // JVM.g:428:4: lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable1835);
            	    lineNumberTableLine283=lineNumberTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, lineNumberTableLine283.getTree());

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

        Token IDENTIFIER284=null;
        Token INTLITERAL286=null;
        JVMParser.pc_return pc285 =null;


        Object IDENTIFIER284_tree=null;
        Object INTLITERAL286_tree=null;

        try {
            // JVM.g:432:2: ( IDENTIFIER pc INTLITERAL )
            // JVM.g:432:4: IDENTIFIER pc INTLITERAL
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER284=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine1847); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER284_tree = 
            (Object)adaptor.create(IDENTIFIER284)
            ;
            adaptor.addChild(root_0, IDENTIFIER284_tree);
            }

            pushFollow(FOLLOW_pc_in_lineNumberTableLine1849);
            pc285=pc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pc285.getTree());

            INTLITERAL286=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine1851); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL286_tree = 
            (Object)adaptor.create(INTLITERAL286)
            ;
            adaptor.addChild(root_0, INTLITERAL286_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER287=null;
        Token IDENTIFIER288=null;
        Token IDENTIFIER289=null;
        Token IDENTIFIER290=null;
        Token IDENTIFIER291=null;
        JVMParser.localVariableTableLine_return localVariableTableLine292 =null;


        Object IDENTIFIER287_tree=null;
        Object IDENTIFIER288_tree=null;
        Object IDENTIFIER289_tree=null;
        Object IDENTIFIER290_tree=null;
        Object IDENTIFIER291_tree=null;

        try {
            // JVM.g:440:2: ( IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )* )
            // JVM.g:440:4: IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER IDENTIFIER ( localVariableTableLine )*
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1869); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER287_tree = 
            (Object)adaptor.create(IDENTIFIER287)
            ;
            adaptor.addChild(root_0, IDENTIFIER287_tree);
            }

            IDENTIFIER288=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER288_tree = 
            (Object)adaptor.create(IDENTIFIER288)
            ;
            adaptor.addChild(root_0, IDENTIFIER288_tree);
            }

            IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1873); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER289_tree = 
            (Object)adaptor.create(IDENTIFIER289)
            ;
            adaptor.addChild(root_0, IDENTIFIER289_tree);
            }

            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1875); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER290_tree = 
            (Object)adaptor.create(IDENTIFIER290)
            ;
            adaptor.addChild(root_0, IDENTIFIER290_tree);
            }

            IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable1877); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER291_tree = 
            (Object)adaptor.create(IDENTIFIER291)
            ;
            adaptor.addChild(root_0, IDENTIFIER291_tree);
            }

            // JVM.g:441:3: ( localVariableTableLine )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==INTLITERAL) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // JVM.g:441:3: localVariableTableLine
            	    {
            	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable1882);
            	    localVariableTableLine292=localVariableTableLine();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, localVariableTableLine292.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
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

        Token INTLITERAL293=null;
        Token INTLITERAL294=null;
        Token INTLITERAL295=null;
        Token IDENTIFIER296=null;
        Token DEFAULT298=null;
        JVMParser.primitiveType_return primitiveType297 =null;

        JVMParser.bytecodeType_return bytecodeType299 =null;


        Object INTLITERAL293_tree=null;
        Object INTLITERAL294_tree=null;
        Object INTLITERAL295_tree=null;
        Object IDENTIFIER296_tree=null;
        Object DEFAULT298_tree=null;

        try {
            // JVM.g:445:2: ( INTLITERAL INTLITERAL INTLITERAL ( IDENTIFIER | primitiveType | DEFAULT ) bytecodeType )
            // JVM.g:445:4: INTLITERAL INTLITERAL INTLITERAL ( IDENTIFIER | primitiveType | DEFAULT ) bytecodeType
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL293=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL293_tree = 
            (Object)adaptor.create(INTLITERAL293)
            ;
            adaptor.addChild(root_0, INTLITERAL293_tree);
            }

            INTLITERAL294=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL294_tree = 
            (Object)adaptor.create(INTLITERAL294)
            ;
            adaptor.addChild(root_0, INTLITERAL294_tree);
            }

            INTLITERAL295=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine1899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL295_tree = 
            (Object)adaptor.create(INTLITERAL295)
            ;
            adaptor.addChild(root_0, INTLITERAL295_tree);
            }

            // JVM.g:445:37: ( IDENTIFIER | primitiveType | DEFAULT )
            int alt58=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt58=1;
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
                alt58=2;
                }
                break;
            case DEFAULT:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // JVM.g:445:38: IDENTIFIER
                    {
                    IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLine1902); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER296_tree = 
                    (Object)adaptor.create(IDENTIFIER296)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER296_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:445:51: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_localVariableTableLine1906);
                    primitiveType297=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType297.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:445:67: DEFAULT
                    {
                    DEFAULT298=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_localVariableTableLine1910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT298_tree = 
                    (Object)adaptor.create(DEFAULT298)
                    ;
                    adaptor.addChild(root_0, DEFAULT298_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine1913);
            bytecodeType299=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType299.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER300=null;
        Token ASSIGN301=null;
        Token INTLITERAL302=null;
        JVMParser.stackMapTypeTableEntry_return stackMapTypeTableEntry303 =null;


        Object IDENTIFIER300_tree=null;
        Object ASSIGN301_tree=null;
        Object INTLITERAL302_tree=null;

        try {
            // JVM.g:452:2: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+ )
            // JVM.g:452:4: IDENTIFIER ASSIGN INTLITERAL ( stackMapTypeTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable1928); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER300_tree = 
            (Object)adaptor.create(IDENTIFIER300)
            ;
            adaptor.addChild(root_0, IDENTIFIER300_tree);
            }

            ASSIGN301=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable1930); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN301_tree = 
            (Object)adaptor.create(ASSIGN301)
            ;
            adaptor.addChild(root_0, ASSIGN301_tree);
            }

            INTLITERAL302=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable1932); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL302_tree = 
            (Object)adaptor.create(INTLITERAL302)
            ;
            adaptor.addChild(root_0, INTLITERAL302_tree);
            }

            // JVM.g:453:3: ( stackMapTypeTableEntry )+
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
            	    // JVM.g:453:3: stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable1937);
            	    stackMapTypeTableEntry303=stackMapTypeTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTypeTableEntry303.getTree());

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

        Token IDENTIFIER304=null;
        Token ASSIGN305=null;
        Token INTLITERAL306=null;
        Token IDENTIFIER307=null;
        Token ASSIGN308=null;
        Token INTLITERAL309=null;
        Token IDENTIFIER310=null;
        Token ASSIGN311=null;
        Token IDENTIFIER313=null;
        Token ASSIGN314=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer312 =null;

        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer315 =null;


        Object IDENTIFIER304_tree=null;
        Object ASSIGN305_tree=null;
        Object INTLITERAL306_tree=null;
        Object IDENTIFIER307_tree=null;
        Object ASSIGN308_tree=null;
        Object INTLITERAL309_tree=null;
        Object IDENTIFIER310_tree=null;
        Object ASSIGN311_tree=null;
        Object IDENTIFIER313_tree=null;
        Object ASSIGN314_tree=null;

        try {
            // JVM.g:457:2: ( IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer )
            // JVM.g:457:4: IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN INTLITERAL IDENTIFIER ASSIGN stackMapTableTypesContainer IDENTIFIER ASSIGN stackMapTableTypesContainer
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER304=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1949); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER304_tree = 
            (Object)adaptor.create(IDENTIFIER304)
            ;
            adaptor.addChild(root_0, IDENTIFIER304_tree);
            }

            ASSIGN305=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1951); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN305_tree = 
            (Object)adaptor.create(ASSIGN305)
            ;
            adaptor.addChild(root_0, ASSIGN305_tree);
            }

            INTLITERAL306=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL306_tree = 
            (Object)adaptor.create(INTLITERAL306)
            ;
            adaptor.addChild(root_0, INTLITERAL306_tree);
            }

            IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1955); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER307_tree = 
            (Object)adaptor.create(IDENTIFIER307)
            ;
            adaptor.addChild(root_0, IDENTIFIER307_tree);
            }

            ASSIGN308=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1957); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN308_tree = 
            (Object)adaptor.create(ASSIGN308)
            ;
            adaptor.addChild(root_0, ASSIGN308_tree);
            }

            INTLITERAL309=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1959); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL309_tree = 
            (Object)adaptor.create(INTLITERAL309)
            ;
            adaptor.addChild(root_0, INTLITERAL309_tree);
            }

            IDENTIFIER310=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1964); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER310_tree = 
            (Object)adaptor.create(IDENTIFIER310)
            ;
            adaptor.addChild(root_0, IDENTIFIER310_tree);
            }

            ASSIGN311=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN311_tree = 
            (Object)adaptor.create(ASSIGN311)
            ;
            adaptor.addChild(root_0, ASSIGN311_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1968);
            stackMapTableTypesContainer312=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer312.getTree());

            IDENTIFIER313=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER313_tree = 
            (Object)adaptor.create(IDENTIFIER313)
            ;
            adaptor.addChild(root_0, IDENTIFIER313_tree);
            }

            ASSIGN314=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry1975); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN314_tree = 
            (Object)adaptor.create(ASSIGN314)
            ;
            adaptor.addChild(root_0, ASSIGN314_tree);
            }

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1977);
            stackMapTableTypesContainer315=stackMapTableTypesContainer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer315.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token IDENTIFIER316=null;
        Token ASSIGN317=null;
        Token INTLITERAL318=null;
        JVMParser.stackMapTableEntry_return stackMapTableEntry319 =null;


        Object IDENTIFIER316_tree=null;
        Object ASSIGN317_tree=null;
        Object INTLITERAL318_tree=null;

        try {
            // JVM.g:467:2: ( IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+ )
            // JVM.g:467:4: IDENTIFIER ASSIGN INTLITERAL ( stackMapTableEntry )+
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER316=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable1993); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER316_tree = 
            (Object)adaptor.create(IDENTIFIER316)
            ;
            adaptor.addChild(root_0, IDENTIFIER316_tree);
            }

            ASSIGN317=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable1995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN317_tree = 
            (Object)adaptor.create(ASSIGN317)
            ;
            adaptor.addChild(root_0, ASSIGN317_tree);
            }

            INTLITERAL318=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable1997); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL318_tree = 
            (Object)adaptor.create(INTLITERAL318)
            ;
            adaptor.addChild(root_0, INTLITERAL318_tree);
            }

            // JVM.g:468:3: ( stackMapTableEntry )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==IDENTIFIER) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==ASSIGN) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // JVM.g:468:3: stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable2002);
            	    stackMapTableEntry319=stackMapTableEntry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableEntry319.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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

        Token IDENTIFIER320=null;
        Token ASSIGN321=null;
        Token INTLITERAL322=null;
        JVMParser.stackMapTableTypesContainer_return stackMapTableTypesContainer323 =null;


        Object IDENTIFIER320_tree=null;
        Object ASSIGN321_tree=null;
        Object INTLITERAL322_tree=null;

        try {
            // JVM.g:471:2: ( IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer ) )
            // JVM.g:471:4: IDENTIFIER ASSIGN ( INTLITERAL | stackMapTableTypesContainer )
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER320=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry2013); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER320_tree = 
            (Object)adaptor.create(IDENTIFIER320)
            ;
            adaptor.addChild(root_0, IDENTIFIER320_tree);
            }

            ASSIGN321=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry2015); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN321_tree = 
            (Object)adaptor.create(ASSIGN321)
            ;
            adaptor.addChild(root_0, ASSIGN321_tree);
            }

            // JVM.g:471:22: ( INTLITERAL | stackMapTableTypesContainer )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==INTLITERAL) ) {
                alt61=1;
            }
            else if ( (LA61_0==LBRACK) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // JVM.g:471:23: INTLITERAL
                    {
                    INTLITERAL322=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntry2018); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL322_tree = 
                    (Object)adaptor.create(INTLITERAL322)
                    ;
                    adaptor.addChild(root_0, INTLITERAL322_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:471:36: stackMapTableTypesContainer
                    {
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry2022);
                    stackMapTableTypesContainer323=stackMapTableTypesContainer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypesContainer323.getTree());

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

        Token LBRACK324=null;
        Token RBRACK326=null;
        JVMParser.stackMapTableTypes_return stackMapTableTypes325 =null;


        Object LBRACK324_tree=null;
        Object RBRACK326_tree=null;

        try {
            // JVM.g:475:2: ( LBRACK ( stackMapTableTypes )? RBRACK )
            // JVM.g:475:4: LBRACK ( stackMapTableTypes )? RBRACK
            {
            root_0 = (Object)adaptor.nil();


            LBRACK324=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_stackMapTableTypesContainer2035); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK324_tree = 
            (Object)adaptor.create(LBRACK324)
            ;
            adaptor.addChild(root_0, LBRACK324_tree);
            }

            // JVM.g:475:11: ( stackMapTableTypes )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==BOOLEAN||LA62_0==BYTE||LA62_0==CHAR||LA62_0==CLASS||LA62_0==DOUBLE||LA62_0==FLOAT||LA62_0==INT||LA62_0==LONG||LA62_0==SHORT||LA62_0==VOID) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // JVM.g:475:11: stackMapTableTypes
                    {
                    pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2037);
                    stackMapTableTypes325=stackMapTableTypes();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypes325.getTree());

                    }
                    break;

            }


            RBRACK326=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_stackMapTableTypesContainer2040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK326_tree = 
            (Object)adaptor.create(RBRACK326)
            ;
            adaptor.addChild(root_0, RBRACK326_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token COMMA328=null;
        JVMParser.stackMapTableType_return stackMapTableType327 =null;

        JVMParser.stackMapTableType_return stackMapTableType329 =null;


        Object COMMA328_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stackMapTableType=new RewriteRuleSubtreeStream(adaptor,"rule stackMapTableType");
        try {
            // JVM.g:479:2: ( stackMapTableType ( COMMA stackMapTableType )* -> ( stackMapTableType )+ )
            // JVM.g:479:4: stackMapTableType ( COMMA stackMapTableType )*
            {
            pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2052);
            stackMapTableType327=stackMapTableType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType327.getTree());

            // JVM.g:479:22: ( COMMA stackMapTableType )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // JVM.g:479:23: COMMA stackMapTableType
            	    {
            	    COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_stackMapTableTypes2055); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA328);


            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes2057);
            	    stackMapTableType329=stackMapTableType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stackMapTableType.add(stackMapTableType329.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
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

        JVMParser.stackMapTableTypeObject_return stackMapTableTypeObject330 =null;

        JVMParser.stackMapTableTypePlainObject_return stackMapTableTypePlainObject331 =null;

        JVMParser.primitiveType_return primitiveType332 =null;



        try {
            // JVM.g:483:2: ( ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType ) )
            // JVM.g:483:4: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType )
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:483:4: ( stackMapTableTypeObject | stackMapTableTypePlainObject | primitiveType )
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==CLASS) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==STRINGLITERAL) ) {
                    alt64=1;
                }
                else if ( (LA64_1==IDENTIFIER||LA64_1==INTERNALTYPE) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||LA64_0==DOUBLE||LA64_0==FLOAT||LA64_0==INT||LA64_0==LONG||LA64_0==SHORT||LA64_0==VOID) ) {
                alt64=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // JVM.g:483:5: stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType2076);
                    stackMapTableTypeObject330=stackMapTableTypeObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypeObject330.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:483:29: stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2078);
                    stackMapTableTypePlainObject331=stackMapTableTypePlainObject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stackMapTableTypePlainObject331.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:483:58: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType2080);
                    primitiveType332=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType332.getTree());

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

        Token CLASS333=null;
        Token set334=null;

        Object CLASS333_tree=null;
        Object set334_tree=null;

        try {
            // JVM.g:486:2: ( CLASS ( INTERNALTYPE | IDENTIFIER ) )
            // JVM.g:486:4: CLASS ( INTERNALTYPE | IDENTIFIER )
            {
            root_0 = (Object)adaptor.nil();


            CLASS333=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject2091); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS333_tree = 
            (Object)adaptor.create(CLASS333)
            ;
            adaptor.addChild(root_0, CLASS333_tree);
            }

            set334=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set334)
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

        Token CLASS335=null;
        Token STRINGLITERAL336=null;

        Object CLASS335_tree=null;
        Object STRINGLITERAL336_tree=null;

        try {
            // JVM.g:489:2: ( CLASS STRINGLITERAL )
            // JVM.g:489:4: CLASS STRINGLITERAL
            {
            root_0 = (Object)adaptor.nil();


            CLASS335=(Token)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject2109); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS335_tree = 
            (Object)adaptor.create(CLASS335)
            ;
            adaptor.addChild(root_0, CLASS335_tree);
            }

            STRINGLITERAL336=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL336_tree = 
            (Object)adaptor.create(STRINGLITERAL336)
            ;
            adaptor.addChild(root_0, STRINGLITERAL336_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        JVMParser.javaType_return javaType337 =null;

        JVMParser.genericConstraintList_return genericConstraintList338 =null;



        try {
            // JVM.g:501:2: ( javaType genericConstraintList )
            // JVM.g:501:4: javaType genericConstraintList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericConstraintType2130);
            javaType337=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType337.getTree());

            pushFollow(FOLLOW_genericConstraintList_in_genericConstraintType2132);
            genericConstraintList338=genericConstraintList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraintList338.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token LESST339=null;
        Token COMMA341=null;
        Token LARGET343=null;
        JVMParser.genericConstraints_return genericConstraints340 =null;

        JVMParser.genericConstraints_return genericConstraints342 =null;


        Object LESST339_tree=null;
        Object COMMA341_tree=null;
        Object LARGET343_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericConstraints=new RewriteRuleSubtreeStream(adaptor,"rule genericConstraints");
        try {
            // JVM.g:505:2: ( LESST genericConstraints ( COMMA genericConstraints )* LARGET -> ( genericConstraints )+ )
            // JVM.g:505:4: LESST genericConstraints ( COMMA genericConstraints )* LARGET
            {
            LESST339=(Token)match(input,LESST,FOLLOW_LESST_in_genericConstraintList2144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST339);


            pushFollow(FOLLOW_genericConstraints_in_genericConstraintList2146);
            genericConstraints340=genericConstraints();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints340.getTree());

            // JVM.g:505:29: ( COMMA genericConstraints )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==COMMA) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // JVM.g:505:30: COMMA genericConstraints
            	    {
            	    COMMA341=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericConstraintList2149); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA341);


            	    pushFollow(FOLLOW_genericConstraints_in_genericConstraintList2151);
            	    genericConstraints342=genericConstraints();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericConstraints.add(genericConstraints342.getTree());

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            LARGET343=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericConstraintList2155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET343);


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

        Token EXTENDS345=null;
        Token AND348=null;
        JVMParser.identifier_return identifier344 =null;

        JVMParser.genericType_return genericType346 =null;

        JVMParser.javaType_return javaType347 =null;

        JVMParser.genericType_return genericType349 =null;

        JVMParser.javaType_return javaType350 =null;


        Object EXTENDS345_tree=null;
        Object AND348_tree=null;

        try {
            // JVM.g:509:2: ( identifier EXTENDS ( genericType | javaType ) ( AND ( genericType | javaType ) )* )
            // JVM.g:509:4: identifier EXTENDS ( genericType | javaType ) ( AND ( genericType | javaType ) )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_genericConstraints2171);
            identifier344=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier344.getTree());

            EXTENDS345=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericConstraints2173); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS345_tree = 
            (Object)adaptor.create(EXTENDS345)
            ;
            adaptor.addChild(root_0, EXTENDS345_tree);
            }

            // JVM.g:509:23: ( genericType | javaType )
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
                    // JVM.g:509:24: genericType
                    {
                    pushFollow(FOLLOW_genericType_in_genericConstraints2176);
                    genericType346=genericType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType346.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:509:38: javaType
                    {
                    pushFollow(FOLLOW_javaType_in_genericConstraints2180);
                    javaType347=javaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType347.getTree());

                    }
                    break;

            }


            // JVM.g:509:48: ( AND ( genericType | javaType ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==AND) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // JVM.g:509:49: AND ( genericType | javaType )
            	    {
            	    AND348=(Token)match(input,AND,FOLLOW_AND_in_genericConstraints2184); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND348_tree = 
            	    (Object)adaptor.create(AND348)
            	    ;
            	    adaptor.addChild(root_0, AND348_tree);
            	    }

            	    // JVM.g:509:53: ( genericType | javaType )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==NORMALTYPE) ) {
            	        int LA67_1 = input.LA(2);

            	        if ( (LA67_1==LESST) ) {
            	            alt67=1;
            	        }
            	        else if ( (LA67_1==AND||LA67_1==COMMA||LA67_1==LARGET) ) {
            	            alt67=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 67, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA67_0==BaseType||LA67_0==DEFAULT||LA67_0==IDENTIFIER||LA67_0==VoidType) ) {
            	        int LA67_2 = input.LA(2);

            	        if ( (LA67_2==LESST) ) {
            	            alt67=1;
            	        }
            	        else if ( (LA67_2==AND||LA67_2==COMMA||LA67_2==LARGET) ) {
            	            alt67=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 67, 2, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // JVM.g:509:54: genericType
            	            {
            	            pushFollow(FOLLOW_genericType_in_genericConstraints2187);
            	            genericType349=genericType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType349.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:509:68: javaType
            	            {
            	            pushFollow(FOLLOW_javaType_in_genericConstraints2191);
            	            javaType350=javaType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType350.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
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

        Token COMMA352=null;
        JVMParser.aggregatedJavaType_return aggregatedJavaType351 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType353 =null;


        Object COMMA352_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_aggregatedJavaType=new RewriteRuleSubtreeStream(adaptor,"rule aggregatedJavaType");
        try {
            // JVM.g:513:3: ( aggregatedJavaType ( COMMA aggregatedJavaType )* -> ( aggregatedJavaType )+ )
            // JVM.g:513:5: aggregatedJavaType ( COMMA aggregatedJavaType )*
            {
            pushFollow(FOLLOW_aggregatedJavaType_in_typeList2206);
            aggregatedJavaType351=aggregatedJavaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType351.getTree());

            // JVM.g:513:24: ( COMMA aggregatedJavaType )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==COMMA) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // JVM.g:513:25: COMMA aggregatedJavaType
            	    {
            	    COMMA352=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList2209); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA352);


            	    pushFollow(FOLLOW_aggregatedJavaType_in_typeList2211);
            	    aggregatedJavaType353=aggregatedJavaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_aggregatedJavaType.add(aggregatedJavaType353.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
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

        Token DOT356=null;
        Token LBRACK358=null;
        Token RBRACK359=null;
        JVMParser.primitiveType_return primitiveType354 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier355 =null;

        JVMParser.javaTypeIdentifier_return javaTypeIdentifier357 =null;


        Object DOT356_tree=null;
        Object LBRACK358_tree=null;
        Object RBRACK359_tree=null;

        try {
            // JVM.g:517:2: ( ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? ) ( LBRACK RBRACK )* )
            // JVM.g:517:4: ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? ) ( LBRACK RBRACK )*
            {
            root_0 = (Object)adaptor.nil();


            // JVM.g:517:4: ( primitiveType | javaTypeIdentifier ( DOT javaTypeIdentifier )? )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BOOLEAN||LA71_0==BYTE||LA71_0==CHAR||LA71_0==DOUBLE||LA71_0==FLOAT||LA71_0==INT||LA71_0==LONG||LA71_0==SHORT||LA71_0==VOID) ) {
                alt71=1;
            }
            else if ( (LA71_0==BaseType||LA71_0==DEFAULT||LA71_0==IDENTIFIER||LA71_0==NORMALTYPE||LA71_0==VoidType) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // JVM.g:517:5: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_aggregatedJavaType2234);
                    primitiveType354=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType354.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:517:21: javaTypeIdentifier ( DOT javaTypeIdentifier )?
                    {
                    pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2238);
                    javaTypeIdentifier355=javaTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier355.getTree());

                    // JVM.g:517:40: ( DOT javaTypeIdentifier )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DOT) ) {
                        int LA70_1 = input.LA(2);

                        if ( (LA70_1==BaseType||LA70_1==DEFAULT||LA70_1==IDENTIFIER||LA70_1==NORMALTYPE||LA70_1==VoidType) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // JVM.g:517:41: DOT javaTypeIdentifier
                            {
                            DOT356=(Token)match(input,DOT,FOLLOW_DOT_in_aggregatedJavaType2241); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT356_tree = 
                            (Object)adaptor.create(DOT356)
                            ;
                            adaptor.addChild(root_0, DOT356_tree);
                            }

                            pushFollow(FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2243);
                            javaTypeIdentifier357=javaTypeIdentifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaTypeIdentifier357.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // JVM.g:517:67: ( LBRACK RBRACK )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==LBRACK) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // JVM.g:517:68: LBRACK RBRACK
            	    {
            	    LBRACK358=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_aggregatedJavaType2249); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LBRACK358_tree = 
            	    (Object)adaptor.create(LBRACK358)
            	    ;
            	    adaptor.addChild(root_0, LBRACK358_tree);
            	    }

            	    RBRACK359=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_aggregatedJavaType2251); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RBRACK359_tree = 
            	    (Object)adaptor.create(RBRACK359)
            	    ;
            	    adaptor.addChild(root_0, RBRACK359_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop72;
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

        JVMParser.javaType_return javaType360 =null;

        JVMParser.genericConstraintType_return genericConstraintType361 =null;

        JVMParser.genericType_return genericType362 =null;



        try {
            // JVM.g:521:2: ( javaType | genericConstraintType | genericType )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==NORMALTYPE) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==BaseType||LA73_1==COMMA||(LA73_1 >= DEFAULT && LA73_1 <= DOT)||LA73_1==Deprecated||(LA73_1 >= EXTENDS && LA73_1 <= EnclosingMethod)||LA73_1==Flag||(LA73_1 >= IDENTIFIER && LA73_1 <= IMPLEMENTS)||LA73_1==InnerClasses||LA73_1==LARGET||LA73_1==LBRACK||LA73_1==LPAREN||(LA73_1 >= MAJOR_VERSION && LA73_1 <= MINOR_VERSION)||LA73_1==NORMALTYPE||(LA73_1 >= RPAREN && LA73_1 <= RuntimeVisibleAnnotations)||(LA73_1 >= Scala && LA73_1 <= SourceFile)||LA73_1==Synthetic||LA73_1==VoidType) ) {
                    alt73=1;
                }
                else if ( (LA73_1==LESST) ) {
                    int LA73_4 = input.LA(3);

                    if ( (LA73_4==BaseType||LA73_4==DEFAULT||LA73_4==IDENTIFIER||LA73_4==VoidType) ) {
                        int LA73_5 = input.LA(4);

                        if ( (LA73_5==EXTENDS) ) {
                            alt73=2;
                        }
                        else if ( (LA73_5==COMMA||LA73_5==DOT||LA73_5==LARGET||(LA73_5 >= LBRACK && LA73_5 <= LESST)) ) {
                            alt73=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA73_4==BOOLEAN||LA73_4==BYTE||LA73_4==CHAR||LA73_4==DOUBLE||LA73_4==FLOAT||LA73_4==INT||LA73_4==LONG||LA73_4==NORMALTYPE||LA73_4==QUESTION||LA73_4==SHORT||LA73_4==VOID) ) {
                        alt73=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA73_0==BaseType||LA73_0==DEFAULT||LA73_0==IDENTIFIER||LA73_0==VoidType) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==BaseType||LA73_2==COMMA||(LA73_2 >= DEFAULT && LA73_2 <= DOT)||LA73_2==Deprecated||(LA73_2 >= EXTENDS && LA73_2 <= EnclosingMethod)||LA73_2==Flag||(LA73_2 >= IDENTIFIER && LA73_2 <= IMPLEMENTS)||LA73_2==InnerClasses||LA73_2==LARGET||LA73_2==LBRACK||LA73_2==LPAREN||(LA73_2 >= MAJOR_VERSION && LA73_2 <= MINOR_VERSION)||LA73_2==NORMALTYPE||(LA73_2 >= RPAREN && LA73_2 <= RuntimeVisibleAnnotations)||(LA73_2 >= Scala && LA73_2 <= SourceFile)||LA73_2==Synthetic||LA73_2==VoidType) ) {
                    alt73=1;
                }
                else if ( (LA73_2==LESST) ) {
                    int LA73_4 = input.LA(3);

                    if ( (LA73_4==BaseType||LA73_4==DEFAULT||LA73_4==IDENTIFIER||LA73_4==VoidType) ) {
                        int LA73_5 = input.LA(4);

                        if ( (LA73_5==EXTENDS) ) {
                            alt73=2;
                        }
                        else if ( (LA73_5==COMMA||LA73_5==DOT||LA73_5==LARGET||(LA73_5 >= LBRACK && LA73_5 <= LESST)) ) {
                            alt73=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 73, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA73_4==BOOLEAN||LA73_4==BYTE||LA73_4==CHAR||LA73_4==DOUBLE||LA73_4==FLOAT||LA73_4==INT||LA73_4==LONG||LA73_4==NORMALTYPE||LA73_4==QUESTION||LA73_4==SHORT||LA73_4==VOID) ) {
                        alt73=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // JVM.g:521:4: javaType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_javaType_in_javaTypeIdentifier2265);
                    javaType360=javaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType360.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:521:15: genericConstraintType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericConstraintType_in_javaTypeIdentifier2269);
                    genericConstraintType361=genericConstraintType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraintType361.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:521:39: genericType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericType_in_javaTypeIdentifier2273);
                    genericType362=genericType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType362.getTree());

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

        JVMParser.javaType_return javaType363 =null;

        JVMParser.genericList_return genericList364 =null;



        try {
            // JVM.g:525:2: ( javaType genericList )
            // JVM.g:525:4: javaType genericList
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericType2285);
            javaType363=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType363.getTree());

            pushFollow(FOLLOW_genericList_in_genericType2287);
            genericList364=genericList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericList364.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token LESST365=null;
        Token COMMA368=null;
        Token LARGET371=null;
        JVMParser.genericConstraint_return genericConstraint366 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType367 =null;

        JVMParser.genericConstraint_return genericConstraint369 =null;

        JVMParser.aggregatedJavaType_return aggregatedJavaType370 =null;


        Object LESST365_tree=null;
        Object COMMA368_tree=null;
        Object LARGET371_tree=null;

        try {
            // JVM.g:529:2: ( LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET )
            // JVM.g:529:4: LESST ( genericConstraint | aggregatedJavaType ) ( COMMA ( genericConstraint | aggregatedJavaType ) )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            LESST365=(Token)match(input,LESST,FOLLOW_LESST_in_genericList2299); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST365_tree = 
            (Object)adaptor.create(LESST365)
            ;
            adaptor.addChild(root_0, LESST365_tree);
            }

            // JVM.g:529:10: ( genericConstraint | aggregatedJavaType )
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
                    // JVM.g:529:11: genericConstraint
                    {
                    pushFollow(FOLLOW_genericConstraint_in_genericList2302);
                    genericConstraint366=genericConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint366.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:529:29: aggregatedJavaType
                    {
                    pushFollow(FOLLOW_aggregatedJavaType_in_genericList2304);
                    aggregatedJavaType367=aggregatedJavaType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType367.getTree());

                    }
                    break;

            }


            // JVM.g:529:49: ( COMMA ( genericConstraint | aggregatedJavaType ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // JVM.g:529:50: COMMA ( genericConstraint | aggregatedJavaType )
            	    {
            	    COMMA368=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericList2308); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA368_tree = 
            	    (Object)adaptor.create(COMMA368)
            	    ;
            	    adaptor.addChild(root_0, COMMA368_tree);
            	    }

            	    // JVM.g:529:56: ( genericConstraint | aggregatedJavaType )
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==QUESTION) ) {
            	        alt75=1;
            	    }
            	    else if ( (LA75_0==BOOLEAN||(LA75_0 >= BYTE && LA75_0 <= CHAR)||LA75_0==DEFAULT||LA75_0==DOUBLE||LA75_0==FLOAT||LA75_0==IDENTIFIER||LA75_0==INT||LA75_0==LONG||LA75_0==NORMALTYPE||LA75_0==SHORT||LA75_0==VOID||LA75_0==VoidType) ) {
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
            	            // JVM.g:529:57: genericConstraint
            	            {
            	            pushFollow(FOLLOW_genericConstraint_in_genericList2311);
            	            genericConstraint369=genericConstraint();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericConstraint369.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // JVM.g:529:75: aggregatedJavaType
            	            {
            	            pushFollow(FOLLOW_aggregatedJavaType_in_genericList2313);
            	            aggregatedJavaType370=aggregatedJavaType();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, aggregatedJavaType370.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            LARGET371=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericList2318); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET371_tree = 
            (Object)adaptor.create(LARGET371)
            ;
            adaptor.addChild(root_0, LARGET371_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token QUESTION372=null;
        Token set373=null;
        JVMParser.genericType_return genericType374 =null;

        JVMParser.javaType_return javaType375 =null;


        Object QUESTION372_tree=null;
        Object set373_tree=null;

        try {
            // JVM.g:533:2: ( QUESTION ( ( SUPER | EXTENDS ) ( genericType | javaType ) )? )
            // JVM.g:533:4: QUESTION ( ( SUPER | EXTENDS ) ( genericType | javaType ) )?
            {
            root_0 = (Object)adaptor.nil();


            QUESTION372=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_genericConstraint2330); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUESTION372_tree = 
            (Object)adaptor.create(QUESTION372)
            ;
            adaptor.addChild(root_0, QUESTION372_tree);
            }

            // JVM.g:533:13: ( ( SUPER | EXTENDS ) ( genericType | javaType ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==EXTENDS||LA78_0==SUPER) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // JVM.g:533:14: ( SUPER | EXTENDS ) ( genericType | javaType )
                    {
                    set373=(Token)input.LT(1);

                    if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set373)
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
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==NORMALTYPE) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==LESST) ) {
                            alt77=1;
                        }
                        else if ( (LA77_1==COMMA||LA77_1==LARGET) ) {
                            alt77=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA77_0==BaseType||LA77_0==DEFAULT||LA77_0==IDENTIFIER||LA77_0==VoidType) ) {
                        int LA77_2 = input.LA(2);

                        if ( (LA77_2==LESST) ) {
                            alt77=1;
                        }
                        else if ( (LA77_2==COMMA||LA77_2==LARGET) ) {
                            alt77=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 77, 2, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;

                    }
                    switch (alt77) {
                        case 1 :
                            // JVM.g:533:34: genericType
                            {
                            pushFollow(FOLLOW_genericType_in_genericConstraint2343);
                            genericType374=genericType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, genericType374.getTree());

                            }
                            break;
                        case 2 :
                            // JVM.g:533:48: javaType
                            {
                            pushFollow(FOLLOW_javaType_in_genericConstraint2347);
                            javaType375=javaType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType375.getTree());

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

        Token LESST377=null;
        Token COMMA379=null;
        Token LARGET381=null;
        JVMParser.javaType_return javaType376 =null;

        JVMParser.javaType_return javaType378 =null;

        JVMParser.javaType_return javaType380 =null;


        Object LESST377_tree=null;
        Object COMMA379_tree=null;
        Object LARGET381_tree=null;

        try {
            // JVM.g:537:2: ( javaType LESST ( javaType ) ( COMMA ( javaType ) )* LARGET )
            // JVM.g:537:4: javaType LESST ( javaType ) ( COMMA ( javaType ) )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_javaType_in_genericGeneric2361);
            javaType376=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType376.getTree());

            LESST377=(Token)match(input,LESST,FOLLOW_LESST_in_genericGeneric2363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST377_tree = 
            (Object)adaptor.create(LESST377)
            ;
            adaptor.addChild(root_0, LESST377_tree);
            }

            // JVM.g:537:19: ( javaType )
            // JVM.g:537:20: javaType
            {
            pushFollow(FOLLOW_javaType_in_genericGeneric2366);
            javaType378=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType378.getTree());

            }


            // JVM.g:537:30: ( COMMA ( javaType ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // JVM.g:537:31: COMMA ( javaType )
            	    {
            	    COMMA379=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericGeneric2370); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA379_tree = 
            	    (Object)adaptor.create(COMMA379)
            	    ;
            	    adaptor.addChild(root_0, COMMA379_tree);
            	    }

            	    // JVM.g:537:37: ( javaType )
            	    // JVM.g:537:38: javaType
            	    {
            	    pushFollow(FOLLOW_javaType_in_genericGeneric2373);
            	    javaType380=javaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaType380.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            LARGET381=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericGeneric2378); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET381_tree = 
            (Object)adaptor.create(LARGET381)
            ;
            adaptor.addChild(root_0, LARGET381_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token COMMA383=null;
        JVMParser.javaType_return javaType382 =null;

        JVMParser.javaType_return javaType384 =null;


        Object COMMA383_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_javaType=new RewriteRuleSubtreeStream(adaptor,"rule javaType");
        try {
            // JVM.g:541:2: ( javaType ( COMMA javaType )* -> ( javaType )+ )
            // JVM.g:541:4: javaType ( COMMA javaType )*
            {
            pushFollow(FOLLOW_javaType_in_javaTypeList2389);
            javaType382=javaType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_javaType.add(javaType382.getTree());

            // JVM.g:541:13: ( COMMA javaType )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==COMMA) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // JVM.g:541:14: COMMA javaType
            	    {
            	    COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_javaTypeList2392); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA383);


            	    pushFollow(FOLLOW_javaType_in_javaTypeList2394);
            	    javaType384=javaType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_javaType.add(javaType384.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
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

        Token NORMALTYPE385=null;
        JVMParser.identifier_return identifier386 =null;


        Object NORMALTYPE385_tree=null;

        try {
            // JVM.g:545:2: ( NORMALTYPE | identifier )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==NORMALTYPE) ) {
                alt81=1;
            }
            else if ( (LA81_0==BaseType||LA81_0==DEFAULT||LA81_0==IDENTIFIER||LA81_0==VoidType) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // JVM.g:545:4: NORMALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    NORMALTYPE385=(Token)match(input,NORMALTYPE,FOLLOW_NORMALTYPE_in_javaType2412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NORMALTYPE385_tree = 
                    (Object)adaptor.create(NORMALTYPE385)
                    ;
                    adaptor.addChild(root_0, NORMALTYPE385_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:545:17: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_javaType2416);
                    identifier386=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier386.getTree());

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

        Token LESST387=null;
        Token COMMA389=null;
        Token LARGET391=null;
        JVMParser.genericReturnDescriptor_return genericReturnDescriptor388 =null;

        JVMParser.genericReturnDescriptor_return genericReturnDescriptor390 =null;


        Object LESST387_tree=null;
        Object COMMA389_tree=null;
        Object LARGET391_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LESST=new RewriteRuleTokenStream(adaptor,"token LESST");
        RewriteRuleTokenStream stream_LARGET=new RewriteRuleTokenStream(adaptor,"token LARGET");
        RewriteRuleSubtreeStream stream_genericReturnDescriptor=new RewriteRuleSubtreeStream(adaptor,"rule genericReturnDescriptor");
        try {
            // JVM.g:553:2: ( LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET -> ( genericReturnDescriptor )+ )
            // JVM.g:553:4: LESST genericReturnDescriptor ( COMMA genericReturnDescriptor )* LARGET
            {
            LESST387=(Token)match(input,LESST,FOLLOW_LESST_in_genericReturn2432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LESST.add(LESST387);


            pushFollow(FOLLOW_genericReturnDescriptor_in_genericReturn2434);
            genericReturnDescriptor388=genericReturnDescriptor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor388.getTree());

            // JVM.g:553:34: ( COMMA genericReturnDescriptor )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==COMMA) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // JVM.g:553:35: COMMA genericReturnDescriptor
            	    {
            	    COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericReturn2437); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA389);


            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericReturn2439);
            	    genericReturnDescriptor390=genericReturnDescriptor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_genericReturnDescriptor.add(genericReturnDescriptor390.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            LARGET391=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericReturn2443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LARGET.add(LARGET391);


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

        Token EXTENDS393=null;
        Token BaseType395=null;
        JVMParser.identifier_return identifier392 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType394 =null;


        Object EXTENDS393_tree=null;
        Object BaseType395_tree=null;

        try {
            // JVM.g:557:2: ( identifier EXTENDS ( bytecodeObjectType | BaseType ) )
            // JVM.g:557:4: identifier EXTENDS ( bytecodeObjectType | BaseType )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor2459);
            identifier392=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier392.getTree());

            EXTENDS393=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor2461); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS393_tree = 
            (Object)adaptor.create(EXTENDS393)
            ;
            adaptor.addChild(root_0, EXTENDS393_tree);
            }

            // JVM.g:557:23: ( bytecodeObjectType | BaseType )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==IDENTIFIER||LA83_0==INTERNALTYPE) ) {
                alt83=1;
            }
            else if ( (LA83_0==BaseType) ) {
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
                    // JVM.g:557:24: bytecodeObjectType
                    {
                    pushFollow(FOLLOW_bytecodeObjectType_in_genericReturnDescriptor2464);
                    bytecodeObjectType394=bytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType394.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:557:45: BaseType
                    {
                    BaseType395=(Token)match(input,BaseType,FOLLOW_BaseType_in_genericReturnDescriptor2468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BaseType395_tree = 
                    (Object)adaptor.create(BaseType395)
                    ;
                    adaptor.addChild(root_0, BaseType395_tree);
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

        Token INTERNALTYPE396=null;
        Token IDENTIFIER397=null;
        JVMParser.genericBydecodeObjectType_return genericBydecodeObjectType398 =null;


        Object INTERNALTYPE396_tree=null;
        Object IDENTIFIER397_tree=null;

        try {
            // JVM.g:561:3: ( INTERNALTYPE | IDENTIFIER | genericBydecodeObjectType )
            int alt84=3;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==INTERNALTYPE) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==LESST) ) {
                    alt84=3;
                }
                else if ( (LA84_1==COMMA||LA84_1==LARGET) ) {
                    alt84=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA84_0==IDENTIFIER) ) {
                int LA84_2 = input.LA(2);

                if ( (LA84_2==LESST) ) {
                    alt84=3;
                }
                else if ( (LA84_2==COMMA||LA84_2==LARGET) ) {
                    alt84=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // JVM.g:561:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE396=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeObjectType2482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE396_tree = 
                    (Object)adaptor.create(INTERNALTYPE396)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE396_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:562:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER397=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeObjectType2488); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER397_tree = 
                    (Object)adaptor.create(IDENTIFIER397)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER397_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:563:5: genericBydecodeObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType2494);
                    genericBydecodeObjectType398=genericBydecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericBydecodeObjectType398.getTree());

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

        Token set399=null;
        Token LESST400=null;
        Token COMMA402=null;
        Token LARGET404=null;
        JVMParser.bytecodeObjectType_return bytecodeObjectType401 =null;

        JVMParser.bytecodeObjectType_return bytecodeObjectType403 =null;


        Object set399_tree=null;
        Object LESST400_tree=null;
        Object COMMA402_tree=null;
        Object LARGET404_tree=null;

        try {
            // JVM.g:567:2: ( ( INTERNALTYPE | IDENTIFIER ) LESST bytecodeObjectType ( COMMA bytecodeObjectType )* LARGET )
            // JVM.g:567:4: ( INTERNALTYPE | IDENTIFIER ) LESST bytecodeObjectType ( COMMA bytecodeObjectType )* LARGET
            {
            root_0 = (Object)adaptor.nil();


            set399=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
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


            LESST400=(Token)match(input,LESST,FOLLOW_LESST_in_genericBydecodeObjectType2514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST400_tree = 
            (Object)adaptor.create(LESST400)
            ;
            adaptor.addChild(root_0, LESST400_tree);
            }

            pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2516);
            bytecodeObjectType401=bytecodeObjectType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType401.getTree());

            // JVM.g:567:57: ( COMMA bytecodeObjectType )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==COMMA) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // JVM.g:567:58: COMMA bytecodeObjectType
            	    {
            	    COMMA402=(Token)match(input,COMMA,FOLLOW_COMMA_in_genericBydecodeObjectType2519); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA402_tree = 
            	    (Object)adaptor.create(COMMA402)
            	    ;
            	    adaptor.addChild(root_0, COMMA402_tree);
            	    }

            	    pushFollow(FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2521);
            	    bytecodeObjectType403=bytecodeObjectType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeObjectType403.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            LARGET404=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericBydecodeObjectType2525); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET404_tree = 
            (Object)adaptor.create(LARGET404)
            ;
            adaptor.addChild(root_0, LARGET404_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token SEMI408=null;
        Token IDENTIFIER409=null;
        JVMParser.bytecodeArrayType_return bytecodeArrayType405 =null;

        JVMParser.bytecodeBaseType_return bytecodeBaseType406 =null;

        JVMParser.combinedBytecodeObjectType_return combinedBytecodeObjectType407 =null;


        Object SEMI408_tree=null;
        Object IDENTIFIER409_tree=null;

        try {
            // JVM.g:575:2: ( bytecodeArrayType | bytecodeBaseType | combinedBytecodeObjectType SEMI | IDENTIFIER )
            int alt86=4;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                alt86=1;
                }
                break;
            case BaseType:
                {
                alt86=2;
                }
                break;
            case INTERNALTYPE:
            case VersionedInternalType:
                {
                alt86=3;
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
                        alt86=3;
                        }
                        break;
                    case BaseType:
                        {
                        int LA86_7 = input.LA(4);

                        if ( (LA86_7==BaseType||LA86_7==IDENTIFIER||LA86_7==INTERNALTYPE||LA86_7==LARGET||LA86_7==LBRACK||LA86_7==MINUS||LA86_7==PLUS||LA86_7==STAR||LA86_7==VersionedInternalType) ) {
                            alt86=3;
                        }
                        else if ( (LA86_7==EXTENDS) ) {
                            alt86=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 7, input);

                            throw nvae;

                        }
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA86_8 = input.LA(4);

                        if ( (LA86_8==BaseType||LA86_8==IDENTIFIER||LA86_8==INTERNALTYPE||LA86_8==LARGET||(LA86_8 >= LBRACK && LA86_8 <= LESST)||LA86_8==MINUS||LA86_8==PLUS||LA86_8==SEMI||LA86_8==STAR||LA86_8==VersionedInternalType) ) {
                            alt86=3;
                        }
                        else if ( (LA86_8==EXTENDS) ) {
                            alt86=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 86, 8, input);

                            throw nvae;

                        }
                        }
                        break;
                    case DEFAULT:
                    case VoidType:
                        {
                        alt86=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                case SEMI:
                    {
                    alt86=3;
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
                    alt86=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }

            switch (alt86) {
                case 1 :
                    // JVM.g:575:4: bytecodeArrayType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType2541);
                    bytecodeArrayType405=bytecodeArrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeArrayType405.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:575:24: bytecodeBaseType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bytecodeBaseType_in_bytecodeType2545);
                    bytecodeBaseType406=bytecodeBaseType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeBaseType406.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:575:43: combinedBytecodeObjectType SEMI
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_combinedBytecodeObjectType_in_bytecodeType2549);
                    combinedBytecodeObjectType407=combinedBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, combinedBytecodeObjectType407.getTree());

                    SEMI408=(Token)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType2551); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI408_tree = 
                    (Object)adaptor.create(SEMI408)
                    ;
                    adaptor.addChild(root_0, SEMI408_tree);
                    }

                    }
                    break;
                case 4 :
                    // JVM.g:575:77: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER409=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType2555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER409_tree = 
                    (Object)adaptor.create(IDENTIFIER409)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER409_tree);
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

        Token LBRACK410=null;
        JVMParser.bytecodeType_return bytecodeType411 =null;


        Object LBRACK410_tree=null;

        try {
            // JVM.g:579:2: ( LBRACK ( bytecodeType ) )
            // JVM.g:579:4: LBRACK ( bytecodeType )
            {
            root_0 = (Object)adaptor.nil();


            LBRACK410=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType2567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK410_tree = 
            (Object)adaptor.create(LBRACK410)
            ;
            adaptor.addChild(root_0, LBRACK410_tree);
            }

            // JVM.g:579:11: ( bytecodeType )
            // JVM.g:579:12: bytecodeType
            {
            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType2570);
            bytecodeType411=bytecodeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType411.getTree());

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token BaseType412=null;

        Object BaseType412_tree=null;

        try {
            // JVM.g:583:3: ( BaseType )
            // JVM.g:583:5: BaseType
            {
            root_0 = (Object)adaptor.nil();


            BaseType412=(Token)match(input,BaseType,FOLLOW_BaseType_in_bytecodeBaseType2586); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BaseType412_tree = 
            (Object)adaptor.create(BaseType412)
            ;
            adaptor.addChild(root_0, BaseType412_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token INTERNALTYPE413=null;
        Token IDENTIFIER414=null;
        JVMParser.genericObjectType_return genericObjectType415 =null;


        Object INTERNALTYPE413_tree=null;
        Object IDENTIFIER414_tree=null;

        try {
            // JVM.g:587:3: ( INTERNALTYPE | IDENTIFIER | genericObjectType )
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==INTERNALTYPE) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==LESST) ) {
                    alt87=3;
                }
                else if ( (LA87_1==SEMI) ) {
                    alt87=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA87_0==IDENTIFIER) ) {
                int LA87_2 = input.LA(2);

                if ( (LA87_2==LESST) ) {
                    alt87=3;
                }
                else if ( (LA87_2==SEMI) ) {
                    alt87=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // JVM.g:587:5: INTERNALTYPE
                    {
                    root_0 = (Object)adaptor.nil();


                    INTERNALTYPE413=(Token)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType2601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERNALTYPE413_tree = 
                    (Object)adaptor.create(INTERNALTYPE413)
                    ;
                    adaptor.addChild(root_0, INTERNALTYPE413_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:588:5: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER414=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType2607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER414_tree = 
                    (Object)adaptor.create(IDENTIFIER414)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER414_tree);
                    }

                    }
                    break;
                case 3 :
                    // JVM.g:589:5: genericObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_genericObjectType_in_simpleBytecodeObjectType2613);
                    genericObjectType415=genericObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, genericObjectType415.getTree());

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

        Token VersionedInternalType416=null;
        JVMParser.simpleBytecodeObjectType_return simpleBytecodeObjectType417 =null;


        Object VersionedInternalType416_tree=null;

        try {
            // JVM.g:593:3: ( VersionedInternalType | simpleBytecodeObjectType )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==VersionedInternalType) ) {
                alt88=1;
            }
            else if ( (LA88_0==IDENTIFIER||LA88_0==INTERNALTYPE) ) {
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
                    // JVM.g:593:5: VersionedInternalType
                    {
                    root_0 = (Object)adaptor.nil();


                    VersionedInternalType416=(Token)match(input,VersionedInternalType,FOLLOW_VersionedInternalType_in_combinedBytecodeObjectType2627); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VersionedInternalType416_tree = 
                    (Object)adaptor.create(VersionedInternalType416)
                    ;
                    adaptor.addChild(root_0, VersionedInternalType416_tree);
                    }

                    }
                    break;
                case 2 :
                    // JVM.g:594:5: simpleBytecodeObjectType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_combinedBytecodeObjectType2633);
                    simpleBytecodeObjectType417=simpleBytecodeObjectType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleBytecodeObjectType417.getTree());

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

        Token set418=null;
        Token LESST419=null;
        Token set420=null;
        Token STAR422=null;
        Token LARGET423=null;
        JVMParser.bytecodeType_return bytecodeType421 =null;


        Object set418_tree=null;
        Object LESST419_tree=null;
        Object set420_tree=null;
        Object STAR422_tree=null;
        Object LARGET423_tree=null;

        try {
            // JVM.g:597:18: ( ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET )
            // JVM.g:597:20: ( INTERNALTYPE | IDENTIFIER ) LESST ( ( MINUS | PLUS )? bytecodeType | STAR )+ LARGET
            {
            root_0 = (Object)adaptor.nil();


            set418=(Token)input.LT(1);

            if ( input.LA(1)==IDENTIFIER||input.LA(1)==INTERNALTYPE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set418)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            LESST419=(Token)match(input,LESST,FOLLOW_LESST_in_genericObjectType2651); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LESST419_tree = 
            (Object)adaptor.create(LESST419)
            ;
            adaptor.addChild(root_0, LESST419_tree);
            }

            // JVM.g:597:54: ( ( MINUS | PLUS )? bytecodeType | STAR )+
            int cnt90=0;
            loop90:
            do {
                int alt90=3;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==BaseType||LA90_0==IDENTIFIER||LA90_0==INTERNALTYPE||LA90_0==LBRACK||LA90_0==MINUS||LA90_0==PLUS||LA90_0==VersionedInternalType) ) {
                    alt90=1;
                }
                else if ( (LA90_0==STAR) ) {
                    alt90=2;
                }


                switch (alt90) {
            	case 1 :
            	    // JVM.g:597:55: ( MINUS | PLUS )? bytecodeType
            	    {
            	    // JVM.g:597:55: ( MINUS | PLUS )?
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==MINUS||LA89_0==PLUS) ) {
            	        alt89=1;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // JVM.g:
            	            {
            	            set420=(Token)input.LT(1);

            	            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	                input.consume();
            	                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	                (Object)adaptor.create(set420)
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


            	    pushFollow(FOLLOW_bytecodeType_in_genericObjectType2661);
            	    bytecodeType421=bytecodeType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bytecodeType421.getTree());

            	    }
            	    break;
            	case 2 :
            	    // JVM.g:597:84: STAR
            	    {
            	    STAR422=(Token)match(input,STAR,FOLLOW_STAR_in_genericObjectType2665); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    STAR422_tree = 
            	    (Object)adaptor.create(STAR422)
            	    ;
            	    adaptor.addChild(root_0, STAR422_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);


            LARGET423=(Token)match(input,LARGET,FOLLOW_LARGET_in_genericObjectType2669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LARGET423_tree = 
            (Object)adaptor.create(LARGET423)
            ;
            adaptor.addChild(root_0, LARGET423_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        Token set424=null;

        Object set424_tree=null;

        try {
            // JVM.g:603:11: ( IDENTIFIER | BaseType | VoidType | DEFAULT )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set424=(Token)input.LT(1);

            if ( input.LA(1)==BaseType||input.LA(1)==DEFAULT||input.LA(1)==IDENTIFIER||input.LA(1)==VoidType ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set424)
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

        Token VOID427=null;
        JVMParser.boolean_type_return boolean_type425 =null;

        JVMParser.numeric_type_return numeric_type426 =null;


        Object VOID427_tree=null;

        try {
            // JVM.g:606:2: ( boolean_type | numeric_type | VOID )
            int alt91=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt91=1;
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
                alt91=2;
                }
                break;
            case VOID:
                {
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;

            }

            switch (alt91) {
                case 1 :
                    // JVM.g:606:4: boolean_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_type_in_primitiveType2701);
                    boolean_type425=boolean_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_type425.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:607:4: numeric_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_type_in_primitiveType2706);
                    numeric_type426=numeric_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_type426.getTree());

                    }
                    break;
                case 3 :
                    // JVM.g:608:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();


                    VOID427=(Token)match(input,VOID,FOLLOW_VOID_in_primitiveType2711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID427_tree = 
                    (Object)adaptor.create(VOID427)
                    ;
                    adaptor.addChild(root_0, VOID427_tree);
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

        Token BOOLEAN428=null;

        Object BOOLEAN428_tree=null;

        try {
            // JVM.g:612:2: ( BOOLEAN )
            // JVM.g:612:4: BOOLEAN
            {
            root_0 = (Object)adaptor.nil();


            BOOLEAN428=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type2722); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BOOLEAN428_tree = 
            (Object)adaptor.create(BOOLEAN428)
            ;
            adaptor.addChild(root_0, BOOLEAN428_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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

        JVMParser.floating_point_type_return floating_point_type429 =null;

        JVMParser.integral_type_return integral_type430 =null;



        try {
            // JVM.g:616:2: ( floating_point_type | integral_type )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==DOUBLE||LA92_0==FLOAT) ) {
                alt92=1;
            }
            else if ( (LA92_0==BYTE||LA92_0==CHAR||LA92_0==INT||LA92_0==LONG||LA92_0==SHORT) ) {
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
                    // JVM.g:616:4: floating_point_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_floating_point_type_in_numeric_type2733);
                    floating_point_type429=floating_point_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, floating_point_type429.getTree());

                    }
                    break;
                case 2 :
                    // JVM.g:617:4: integral_type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integral_type_in_numeric_type2738);
                    integral_type430=integral_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integral_type430.getTree());

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

        Token set431=null;

        Object set431_tree=null;

        try {
            // JVM.g:621:2: ( BYTE | SHORT | INT | LONG | CHAR )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set431=(Token)input.LT(1);

            if ( input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==SHORT ) {
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

        Token set432=null;

        Object set432_tree=null;

        try {
            // JVM.g:629:2: ( FLOAT | DOUBLE )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set432=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==FLOAT ) {
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

        Token set433=null;

        Object set433_tree=null;

        try {
            // JVM.g:634:2: ( LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | BOOLEANLITERAL )
            // JVM.g:
            {
            root_0 = (Object)adaptor.nil();


            set433=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEANLITERAL||input.LA(1)==CHARLITERAL||input.LA(1)==DOUBLELITERAL||input.LA(1)==FLOATLITERAL||input.LA(1)==INTLITERAL||input.LA(1)==LONGLITERAL||input.LA(1)==STRINGLITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set433)
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

        Token INTLITERAL434=null;
        Token COLON435=null;

        Object INTLITERAL434_tree=null;
        Object COLON435_tree=null;

        try {
            // JVM.g:644:2: ( INTLITERAL COLON )
            // JVM.g:644:4: INTLITERAL COLON
            {
            root_0 = (Object)adaptor.nil();


            INTLITERAL434=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc2837); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTLITERAL434_tree = 
            (Object)adaptor.create(INTLITERAL434)
            ;
            adaptor.addChild(root_0, INTLITERAL434_tree);
            }

            COLON435=(Token)match(input,COLON,FOLLOW_COLON_in_pc2839); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON435_tree = 
            (Object)adaptor.create(COLON435)
            ;
            adaptor.addChild(root_0, COLON435_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
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
        pushFollow(FOLLOW_methodDefinition_in_synpred1_JVM800);
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
        pushFollow(FOLLOW_ctorDefinition_in_synpred2_JVM811);
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
        pushFollow(FOLLOW_fieldDefinition_in_synpred3_JVM822);
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


 

    public static final BitSet FOLLOW_class_file_in_program51 = new BitSet(new long[]{0x0009008002009012L,0x0001000000020400L});
    public static final BitSet FOLLOW_class_file_header_in_class_file61 = new BitSet(new long[]{0x0009008002009010L,0x0001000000020400L});
    public static final BitSet FOLLOW_classDefinition_in_class_file63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header74 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header79 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header84 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header89 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info102 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info117 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info121 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_modified_file_info123 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info125 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info127 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info142 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info144 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_set_in_checksum_file_info146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info166 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info168 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info189 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_major_version_info_in_type_info194 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_minor_version_info_in_type_info199 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_flags_in_type_info204 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info209 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info215 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info220 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info225 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info230 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_deprecated_in_type_info235 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_synthetic_in_type_info240 = new BitSet(new long[]{0x0040040240000002L,0x0000004F00800060L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic253 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated267 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod281 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod283 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod285 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info300 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
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
    public static final BitSet FOLLOW_LPAREN_in_runtimeVisibleAnnotationsItem375 = new BitSet(new long[]{0x0000000000100000L,0x0000000000400000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_runtimeVisibleAnnotationsItem380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList392 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_runtimeVisibleAnnotationAssignList395 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList397 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign415 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign417 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationAssign420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationAssign424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_brackedAnnotationAssign436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssign438 = new BitSet(new long[]{0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_brackedAnnotationAssign441 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssign443 = new BitSet(new long[]{0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_brackedAnnotationAssign447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition465 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info480 = new BitSet(new long[]{0x0000008000100010L,0x0000000090038100L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info486 = new BitSet(new long[]{0x0000008000100012L,0x0000000090038100L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line500 = new BitSet(new long[]{0x0000008000100010L,0x0000000090038100L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line503 = new BitSet(new long[]{0x0001000000000042L,0x0000000001000000L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_line507 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line509 = new BitSet(new long[]{0x0001000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_line512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line514 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_line522 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_line524 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_innerclass_info_line529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAJOR_VERSION_in_major_version_info544 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_major_version_info546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINOR_VERSION_in_minor_version_info560 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_version_info562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Flag_in_flags577 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_accessFlagList_in_flags579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList592 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_accessFlagList595 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList597 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool634 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool636 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_constant_pool638 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool643 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition675 = new BitSet(new long[]{0x0009008002009010L,0x0001000000000400L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition678 = new BitSet(new long[]{0x0009008002009010L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_classDefinition681 = new BitSet(new long[]{0x0042040340000000L,0x0000004F00800060L});
    public static final BitSet FOLLOW_superClass_in_classDefinition683 = new BitSet(new long[]{0x0042040240000000L,0x0000004F00800060L});
    public static final BitSet FOLLOW_superInterface_in_classDefinition686 = new BitSet(new long[]{0x0040040240000000L,0x0000004F00800060L});
    public static final BitSet FOLLOW_type_info_in_classDefinition692 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition696 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDefinition700 = new BitSet(new long[]{0x300501800A003A10L,0x0001610092138500L});
    public static final BitSet FOLLOW_classBody_in_classDefinition705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACE_in_classDefinition710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_superClass723 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002000400L});
    public static final BitSet FOLLOW_typeList_in_superClass725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_superInterface737 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002000400L});
    public static final BitSet FOLLOW_typeList_in_superInterface739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_classBody805 = new BitSet(new long[]{0x300501800A003A12L,0x0001610092038500L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBody816 = new BitSet(new long[]{0x300501800A003A12L,0x0001610092038500L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBody827 = new BitSet(new long[]{0x300501800A003A12L,0x0001610092038500L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBody832 = new BitSet(new long[]{0x300501800A003A12L,0x0001610092038500L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition851 = new BitSet(new long[]{0x200501800A003A00L,0x0001610012000400L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition854 = new BitSet(new long[]{0x200501800A003A00L,0x0001610012000400L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_fieldDefinition857 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_identifier_in_fieldDefinition859 = new BitSet(new long[]{0x0000000000000040L,0x0000000001000000L});
    public static final BitSet FOLLOW_ASSIGN_in_fieldDefinition862 = new BitSet(new long[]{0x4020020010004400L,0x0000000020000000L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition864 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_fieldDefinition868 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition873 = new BitSet(new long[]{0x0000000040400002L,0x0000004400800000L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition877 = new BitSet(new long[]{0x0000000040400002L,0x0000004400800000L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo889 = new BitSet(new long[]{0x0811000000001000L,0x0000800000000000L});
    public static final BitSet FOLLOW_fieldInfoOption1_in_fieldInfo891 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_Flag_in_fieldInfo896 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_accessFlagList_in_fieldInfo898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo912 = new BitSet(new long[]{0x2004010008002A00L,0x0000200002000000L});
    public static final BitSet FOLLOW_fieldInfoOption3_in_fieldAdditionalInfo914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo919 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_fieldInfoOption4_in_fieldAdditionalInfo921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo926 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_fieldInfoOption5_in_fieldAdditionalInfo928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo933 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo940 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fieldInfoOption6_in_fieldAdditionalInfo942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfoOption1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption2974 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_fieldInfoOption2977 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fieldInfoOption2979 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_primitiveType_in_fieldInfoOption3998 = new BitSet(new long[]{0x4020020010004400L,0x0000000020000000L});
    public static final BitSet FOLLOW_literals_in_fieldInfoOption31000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldInfoOption41012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldInfoOption51025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldInfoOption61038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition1098 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_STATIC_in_staticCtorDefinition1101 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_staticCtorDefinition1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACE_in_staticCtorDefinition1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_staticCtorDefinition1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition1112 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition1132 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaType_in_ctorDefinition1135 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition1137 = new BitSet(new long[]{0x0000000000000000L,0x0000008001000000L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_ctorDefinition1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition1147 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_body_in_ctorDefinition1151 = new BitSet(new long[]{0x0000001040000100L,0x0000004400800000L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition1170 = new BitSet(new long[]{0x300501800A003A10L,0x0001200092038500L});
    public static final BitSet FOLLOW_genericReturn_in_methodDefinition1173 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002000400L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_methodDefinition1176 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_methodDefinition1178 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition1180 = new BitSet(new long[]{0x0000000000000000L,0x0000008001000000L});
    public static final BitSet FOLLOW_throwClause_in_methodDefinition1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_methodDefinition1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition1190 = new BitSet(new long[]{0x0000001040200100L,0x0000004400800000L});
    public static final BitSet FOLLOW_body_in_methodDefinition1194 = new BitSet(new long[]{0x0000001040000100L,0x0000004400800000L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_methodInfo1210 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo1212 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_Flag_in_methodInfo1217 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_accessFlagList_in_methodInfo1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfo1234 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_methodDeprecatedInfo_in_afterMethodInfo1236 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfo1241 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfo1243 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfo1248 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfo1253 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfo1256 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfo1261 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfo1263 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfo1268 = new BitSet(new long[]{0x0000001040000102L,0x0000004400800000L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault1283 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault1286 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationDefault1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_annotationDefault1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_annotationDefault1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_methodSignatureInfo1308 = new BitSet(new long[]{0x0811000000001000L,0x0000800000400000L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo1310 = new BitSet(new long[]{0x0811000000001000L,0x0000800000400000L});
    public static final BitSet FOLLOW_RPAREN_in_methodSignatureInfo1313 = new BitSet(new long[]{0x0811000000001000L,0x0001800000000000L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_methodDeprecatedInfo1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments1394 = new BitSet(new long[]{0x200501000E003A00L,0x0001200002400400L});
    public static final BitSet FOLLOW_typeList_in_arguments1396 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DOT_in_arguments1400 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_arguments1402 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DOT_in_arguments1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RPAREN_in_arguments1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Code_in_body1429 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_codeBlock_in_body1434 = new BitSet(new long[]{0x0000000800000002L,0x000000300000000EL});
    public static final BitSet FOLLOW_bodyExtension_in_body1439 = new BitSet(new long[]{0x0000000800000002L,0x000000300000000EL});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension1457 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension1465 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension1473 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension1482 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension1491 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension1498 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_codeBlock1512 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_codeLine_in_codeBlock1518 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_javaSwitch_in_codeBlock1522 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeLine1539 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine1541 = new BitSet(new long[]{0x2024010008102A02L,0x0000200002000000L});
    public static final BitSet FOLLOW_codeValues_in_codeLine1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd1555 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd1557 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_logic3_in_codeBlockEnd1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_codeValues1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic2_in_codeValues1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic3_in_codeValues1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic4_in_codeValues1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_codeValues1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic1607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_logic1609 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_logic21623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic31635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic41647 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_logic41649 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_logic41651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables1662 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_variables1664 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_variable_in_variables1666 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_variables1668 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_variable_in_variables1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable1681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_variable1683 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_javaSwitch1697 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch1699 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_javaSwitch1703 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch1708 = new BitSet(new long[]{0x0020000002000000L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch1713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RBRACE_in_javaSwitch1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pc_in_switchLine1730 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine1744 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_switchDefaultLine1746 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROWS_in_throwClause1764 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaTypeList_in_throwClause1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1777 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1779 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1781 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable1783 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable1788 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1800 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1802 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry1804 = new BitSet(new long[]{0x2005010008082A00L,0x0000200002000000L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntry1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntry1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntry1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable1835 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine1847 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine1849 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1869 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1871 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1873 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1875 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable1877 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable1882 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1895 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1897 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine1899 = new BitSet(new long[]{0x200501000A002A00L,0x0000200002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLine1902 = new BitSet(new long[]{0x0811000000001000L,0x0000800000000000L});
    public static final BitSet FOLLOW_primitiveType_in_localVariableTableLine1906 = new BitSet(new long[]{0x0811000000001000L,0x0000800000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_localVariableTableLine1910 = new BitSet(new long[]{0x0811000000001000L,0x0000800000000000L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable1928 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable1930 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable1932 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable1937 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1949 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1951 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1953 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1955 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1957 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry1959 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1966 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1968 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry1973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry1975 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable1993 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable1995 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable1997 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable2002 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry2013 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry2015 = new BitSet(new long[]{0x0820000000000000L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntry2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntry2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_stackMapTableTypesContainer2035 = new BitSet(new long[]{0x200401000800AA00L,0x0000200002200000L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_stackMapTableTypesContainer2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2052 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_stackMapTableTypes2055 = new BitSet(new long[]{0x200401000800AA00L,0x0000200002000000L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes2057 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject2091 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_set_in_stackMapTableTypePlainObject2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericConstraintType2130 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_genericConstraintList_in_genericConstraintType2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericConstraintList2144 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList2146 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericConstraintList2149 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_genericConstraints_in_genericConstraintList2151 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericConstraintList2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericConstraints2171 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericConstraints2173 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_genericType_in_genericConstraints2176 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_javaType_in_genericConstraints2180 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_genericConstraints2184 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_genericType_in_genericConstraints2187 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_javaType_in_genericConstraints2191 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList2206 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_typeList2209 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002000400L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_typeList2211 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_primitiveType_in_aggregatedJavaType2234 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2238 = new BitSet(new long[]{0x0800000004000002L});
    public static final BitSet FOLLOW_DOT_in_aggregatedJavaType2241 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaTypeIdentifier_in_aggregatedJavaType2243 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_aggregatedJavaType2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RBRACK_in_aggregatedJavaType2251 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_javaType_in_javaTypeIdentifier2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericConstraintType_in_javaTypeIdentifier2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericType_in_javaTypeIdentifier2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericType2285 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_genericList_in_genericType2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericList2299 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002040400L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList2302 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList2304 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericList2308 = new BitSet(new long[]{0x200501000A003A00L,0x0001200002040400L});
    public static final BitSet FOLLOW_genericConstraint_in_genericList2311 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_aggregatedJavaType_in_genericList2313 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericList2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericConstraint2330 = new BitSet(new long[]{0x0000000100000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_set_in_genericConstraint2333 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_genericType_in_genericConstraint2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericConstraint2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2361 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericGeneric2363 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2366 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericGeneric2370 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaType_in_genericGeneric2373 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericGeneric2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList2389 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_COMMA_in_javaTypeList2392 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000400L});
    public static final BitSet FOLLOW_javaType_in_javaTypeList2394 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_NORMALTYPE_in_javaType2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_javaType2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESST_in_genericReturn2432 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericReturn2434 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericReturn2437 = new BitSet(new long[]{0x0001000002001000L,0x0001000000000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericReturn2439 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericReturn2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor2459 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor2461 = new BitSet(new long[]{0x0011000000001000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericReturnDescriptor2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_genericReturnDescriptor2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeObjectType2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeObjectType2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericBydecodeObjectType_in_bytecodeObjectType2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericBydecodeObjectType2506 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericBydecodeObjectType2514 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2516 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_COMMA_in_genericBydecodeObjectType2519 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_bytecodeObjectType_in_genericBydecodeObjectType2521 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_LARGET_in_genericBydecodeObjectType2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeBaseType_in_bytecodeType2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_combinedBytecodeObjectType_in_bytecodeType2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType2567 = new BitSet(new long[]{0x0811000000001000L,0x0000800000000000L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeBaseType2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeObjectType2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_simpleBytecodeObjectType2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericObjectType_in_simpleBytecodeObjectType2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VersionedInternalType_in_combinedBytecodeObjectType2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_combinedBytecodeObjectType2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_genericObjectType2643 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LESST_in_genericObjectType2651 = new BitSet(new long[]{0x0811000000001000L,0x0000800008004080L});
    public static final BitSet FOLLOW_bytecodeType_in_genericObjectType2661 = new BitSet(new long[]{0x0A11000000001000L,0x0000800008004080L});
    public static final BitSet FOLLOW_STAR_in_genericObjectType2665 = new BitSet(new long[]{0x0A11000000001000L,0x0000800008004080L});
    public static final BitSet FOLLOW_LARGET_in_genericObjectType2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc2837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_COLON_in_pc2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_synpred1_JVM800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_synpred2_JVM811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_synpred3_JVM822 = new BitSet(new long[]{0x0000000000000002L});

}