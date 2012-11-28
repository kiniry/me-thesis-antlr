// $ANTLR 3.4 C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g 2012-11-20 12:43:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SampleLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int ACCESS_FLAGS=5;
    public static final int ARGS=6;
    public static final int ASSIGN=7;
    public static final int BYTES=8;
    public static final int Boolean_type=9;
    public static final int CHAR=10;
    public static final int CHECKSUM=11;
    public static final int CLASS=12;
    public static final int CLASSFILE=13;
    public static final int CODE=14;
    public static final int COLON=15;
    public static final int COMMA=16;
    public static final int COMMENT=17;
    public static final int COMPILED=18;
    public static final int CONSTANTPOOL=19;
    public static final int CTOR=20;
    public static final int Constant_pool_index=21;
    public static final int Constant_type_UTF8=22;
    public static final int DATE=23;
    public static final int DCTOR=24;
    public static final int DEFAULT=25;
    public static final int DIGIT=26;
    public static final int DOT=27;
    public static final int ESC_SEQ=28;
    public static final int EXCEPTIONS=29;
    public static final int EXPONENT=30;
    public static final int EXTENDS=31;
    public static final int FINAL=32;
    public static final int FLAGS=33;
    public static final int FLOAT=34;
    public static final int Floating_point_type=35;
    public static final int HASH=36;
    public static final int HEX_DIGIT=37;
    public static final int HEX_DIGITS=38;
    public static final int IDENTIFIER=39;
    public static final int IMPLEMENTS=40;
    public static final int INT=41;
    public static final int INTERFACE=42;
    public static final int Integral_type=43;
    public static final int JAVABYTECODEFILE=44;
    public static final int JAVAFILETYPE=45;
    public static final int LBRACE=46;
    public static final int LBRACK=47;
    public static final int LETTER=48;
    public static final int LOCALS=49;
    public static final int LOOKUPSWITCH=50;
    public static final int LPAREN=51;
    public static final int MAJORVERSION=52;
    public static final int MINORVERSION=53;
    public static final int MINUS=54;
    public static final int MODIFIED=55;
    public static final int NATIVE=56;
    public static final int NL=57;
    public static final int Numeric_type=58;
    public static final int OCTAL_ESC=59;
    public static final int PATH=60;
    public static final int PLUS=61;
    public static final int PRIVATE=62;
    public static final int PROTECTED=63;
    public static final int PUBLIC=64;
    public static final int PrimitiveType=65;
    public static final int QUOTE=66;
    public static final int QUOTED_STRING=67;
    public static final int QuotedTypeIdentifier=68;
    public static final int RBRACE=69;
    public static final int RBRACK=70;
    public static final int REGULAR_STRING_LITERAL_CHARACTER=71;
    public static final int RETURN=72;
    public static final int RPAREN=73;
    public static final int SEMI=74;
    public static final int SIGNATURE=75;
    public static final int SIMPLE_ESCAPE_SEQUENCE=76;
    public static final int SINGLE_REGULAR_STRING_LITERAL_CHARACTER=77;
    public static final int SIZE=78;
    public static final int SLASH=79;
    public static final int SOURCEFILE=80;
    public static final int STACK=81;
    public static final int STATIC=82;
    public static final int STRING=83;
    public static final int SYNCHRONIZED=84;
    public static final int TABLESWITCH=85;
    public static final int THROWS=86;
    public static final int TRANSIENT=87;
    public static final int TypeIdentifier=88;
    public static final int UNDERSCORE=89;
    public static final int UNICODE_ESCAPE_SEQUENCE=90;
    public static final int UTF8TYPE=91;
    public static final int VOLATILE=92;
    public static final int WS=93;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SampleLexer() {} 
    public SampleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SampleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g"; }

    // $ANTLR start "Constant_pool_index"
    public final void mConstant_pool_index() throws RecognitionException {
        try {
            int _type = Constant_pool_index;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:19:2: ( HASH INT )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:19:4: HASH INT
            {
            mHASH(); 


            mINT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Constant_pool_index"

    // $ANTLR start "MODIFIED"
    public final void mMODIFIED() throws RecognitionException {
        try {
            int _type = MODIFIED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:10: ( 'Last modified' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:12: 'Last modified'
            {
            match("Last modified"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODIFIED"

    // $ANTLR start "CHECKSUM"
    public final void mCHECKSUM() throws RecognitionException {
        try {
            int _type = CHECKSUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:10: ( 'MD5 checksum' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:12: 'MD5 checksum'
            {
            match("MD5 checksum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHECKSUM"

    // $ANTLR start "CLASSFILE"
    public final void mCLASSFILE() throws RecognitionException {
        try {
            int _type = CLASSFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:11: ( 'Classfile' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:21:13: 'Classfile'
            {
            match("Classfile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASSFILE"

    // $ANTLR start "SOURCEFILE"
    public final void mSOURCEFILE() throws RecognitionException {
        try {
            int _type = SOURCEFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:12: ( 'SourceFile' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:14: 'SourceFile'
            {
            match("SourceFile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOURCEFILE"

    // $ANTLR start "MINORVERSION"
    public final void mMINORVERSION() throws RecognitionException {
        try {
            int _type = MINORVERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:14: ( 'minor version' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:16: 'minor version'
            {
            match("minor version"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINORVERSION"

    // $ANTLR start "MAJORVERSION"
    public final void mMAJORVERSION() throws RecognitionException {
        try {
            int _type = MAJORVERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:14: ( 'major version' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:22:16: 'major version'
            {
            match("major version"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAJORVERSION"

    // $ANTLR start "FLAGS"
    public final void mFLAGS() throws RecognitionException {
        try {
            int _type = FLAGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:7: ( 'flags' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:9: 'flags'
            {
            match("flags"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLAGS"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:6: ( 'size' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:8: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "BYTES"
    public final void mBYTES() throws RecognitionException {
        try {
            int _type = BYTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:7: ( 'bytes' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:23:9: 'bytes'
            {
            match("bytes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BYTES"

    // $ANTLR start "JAVAFILETYPE"
    public final void mJAVAFILETYPE() throws RecognitionException {
        try {
            int _type = JAVAFILETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:14: ( '.java' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:16: '.java'
            {
            match(".java"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JAVAFILETYPE"

    // $ANTLR start "COMPILED"
    public final void mCOMPILED() throws RecognitionException {
        try {
            int _type = COMPILED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:10: ( 'Compiled from' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:12: 'Compiled from'
            {
            match("Compiled from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPILED"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:7: ( 'class' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:24:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "JAVABYTECODEFILE"
    public final void mJAVABYTECODEFILE() throws RecognitionException {
        try {
            int _type = JAVABYTECODEFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:25:18: ( '.class' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:25:20: '.class'
            {
            match(".class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JAVABYTECODEFILE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:25:9: ( 'default' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:25:11: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:9: ( 'extends' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:11: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:12: ( 'implements' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:14: 'implements'
            {
            match("implements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "SIGNATURE"
    public final void mSIGNATURE() throws RecognitionException {
        try {
            int _type = SIGNATURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:11: ( 'Signature' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:26:13: 'Signature'
            {
            match("Signature"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIGNATURE"

    // $ANTLR start "CONSTANTPOOL"
    public final void mCONSTANTPOOL() throws RecognitionException {
        try {
            int _type = CONSTANTPOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:14: ( 'Constant pool' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:16: 'Constant pool'
            {
            match("Constant pool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANTPOOL"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:8: ( 'throws' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:10: 'throws'
            {
            match("throws"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:6: ( 'Code' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:27:8: 'Code'
            {
            match("Code"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CODE"

    // $ANTLR start "TABLESWITCH"
    public final void mTABLESWITCH() throws RecognitionException {
        try {
            int _type = TABLESWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:13: ( 'tableswitch' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:15: 'tableswitch'
            {
            match("tableswitch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLESWITCH"

    // $ANTLR start "LOOKUPSWITCH"
    public final void mLOOKUPSWITCH() throws RecognitionException {
        try {
            int _type = LOOKUPSWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:14: ( 'lookupswitch' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:16: 'lookupswitch'
            {
            match("lookupswitch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOOKUPSWITCH"

    // $ANTLR start "EXCEPTIONS"
    public final void mEXCEPTIONS() throws RecognitionException {
        try {
            int _type = EXCEPTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:12: ( 'Exceptions' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:28:14: 'Exceptions'
            {
            match("Exceptions"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCEPTIONS"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:10: ( 'abstract' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:12: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:8: ( 'public' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:7: ( 'final' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:30:9: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:8: ( 'static' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:9: ( 'private' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:11: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:11: ( 'protected' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:31:13: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:11: ( 'interface' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:13: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "SYNCHRONIZED"
    public final void mSYNCHRONIZED() throws RecognitionException {
        try {
            int _type = SYNCHRONIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:14: ( 'synchronized' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:16: 'synchronized'
            {
            match("synchronized"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYNCHRONIZED"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:8: ( 'native' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:32:10: 'native'
            {
            match("native"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:10: ( 'volatile' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:12: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "TRANSIENT"
    public final void mTRANSIENT() throws RecognitionException {
        try {
            int _type = TRANSIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:11: ( 'transient' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:13: 'transient'
            {
            match("transient"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSIENT"

    // $ANTLR start "CTOR"
    public final void mCTOR() throws RecognitionException {
        try {
            int _type = CTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:6: ( '<init>' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:33:8: '<init>'
            {
            match("<init>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CTOR"

    // $ANTLR start "DCTOR"
    public final void mDCTOR() throws RecognitionException {
        try {
            int _type = DCTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:34:8: ( '<clinit>' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:34:10: '<clinit>'
            {
            match("<clinit>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DCTOR"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:34:8: ( 'return' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:34:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "STACK"
    public final void mSTACK() throws RecognitionException {
        try {
            int _type = STACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:7: ( 'stack' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:9: 'stack'
            {
            match("stack"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STACK"

    // $ANTLR start "LOCALS"
    public final void mLOCALS() throws RecognitionException {
        try {
            int _type = LOCALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:8: ( 'locals' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:10: 'locals'
            {
            match("locals"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOCALS"

    // $ANTLR start "ARGS"
    public final void mARGS() throws RecognitionException {
        try {
            int _type = ARGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:5: ( 'args_size' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:35:7: 'args_size'
            {
            match("args_size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARGS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:38:7: ( '-' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:38:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:38:7: ( '+' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:38:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:39:7: ( ':' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:39:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:39:7: ( ';' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:39:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:40:16: ( '\\\"' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:40:18: '\\\"'
            {
            match('\"'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:40:8: ( ',' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:40:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:41:5: ( '.' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:41:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:42:17: ( '/' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:42:19: '/'
            {
            match('/'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:43:8: ( '{' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:43:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:43:9: ( '}' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:43:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:44:8: ( '[' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:44:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:44:9: ( ']' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:44:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:45:8: ( '(' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:45:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:45:9: ( ')' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:45:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:46:8: ( '=' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:46:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:46:21: ( '_' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:46:23: '_'
            {
            match('_'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:47:7: ( '#' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:47:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:50:2: ( QUOTE IDENTIFIER JAVAFILETYPE QUOTE )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:51:2: QUOTE IDENTIFIER JAVAFILETYPE QUOTE
            {
            mQUOTE(); 


            mIDENTIFIER(); 


            mJAVAFILETYPE(); 


            mQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "ACCESS_FLAGS"
    public final void mACCESS_FLAGS() throws RecognitionException {
        try {
            int _type = ACCESS_FLAGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:55:2: ( ( 'ACC_PUBLIC' | 'ACC_PRIVATE' | 'ACC_PROTECTED' | 'ACC_STATIC' | 'ACC_FINAL' | 'ACC_SYNCHRONIZED' | 'ACC_VOLATILE' | 'ACC_TRANSIENT' | 'ACC_NATIVE' | 'ACC_INTERFACE' | 'ACC_ABSTRACT' | 'ACC_SUPER' ) )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:55:4: ( 'ACC_PUBLIC' | 'ACC_PRIVATE' | 'ACC_PROTECTED' | 'ACC_STATIC' | 'ACC_FINAL' | 'ACC_SYNCHRONIZED' | 'ACC_VOLATILE' | 'ACC_TRANSIENT' | 'ACC_NATIVE' | 'ACC_INTERFACE' | 'ACC_ABSTRACT' | 'ACC_SUPER' )
            {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:55:4: ( 'ACC_PUBLIC' | 'ACC_PRIVATE' | 'ACC_PROTECTED' | 'ACC_STATIC' | 'ACC_FINAL' | 'ACC_SYNCHRONIZED' | 'ACC_VOLATILE' | 'ACC_TRANSIENT' | 'ACC_NATIVE' | 'ACC_INTERFACE' | 'ACC_ABSTRACT' | 'ACC_SUPER' )
            int alt1=12;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='A') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='C') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='C') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='_') ) {
                            switch ( input.LA(5) ) {
                            case 'P':
                                {
                                int LA1_5 = input.LA(6);

                                if ( (LA1_5=='U') ) {
                                    alt1=1;
                                }
                                else if ( (LA1_5=='R') ) {
                                    int LA1_14 = input.LA(7);

                                    if ( (LA1_14=='I') ) {
                                        alt1=2;
                                    }
                                    else if ( (LA1_14=='O') ) {
                                        alt1=3;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 1, 14, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 5, input);

                                    throw nvae;

                                }
                                }
                                break;
                            case 'S':
                                {
                                switch ( input.LA(6) ) {
                                case 'T':
                                    {
                                    alt1=4;
                                    }
                                    break;
                                case 'Y':
                                    {
                                    alt1=6;
                                    }
                                    break;
                                case 'U':
                                    {
                                    alt1=12;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 6, input);

                                    throw nvae;

                                }

                                }
                                break;
                            case 'F':
                                {
                                alt1=5;
                                }
                                break;
                            case 'V':
                                {
                                alt1=7;
                                }
                                break;
                            case 'T':
                                {
                                alt1=8;
                                }
                                break;
                            case 'N':
                                {
                                alt1=9;
                                }
                                break;
                            case 'I':
                                {
                                alt1=10;
                                }
                                break;
                            case 'A':
                                {
                                alt1=11;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;

                            }

                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:55:5: 'ACC_PUBLIC'
                    {
                    match("ACC_PUBLIC"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:55:20: 'ACC_PRIVATE'
                    {
                    match("ACC_PRIVATE"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:56:4: 'ACC_PROTECTED'
                    {
                    match("ACC_PROTECTED"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:56:22: 'ACC_STATIC'
                    {
                    match("ACC_STATIC"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:57:4: 'ACC_FINAL'
                    {
                    match("ACC_FINAL"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:57:18: 'ACC_SYNCHRONIZED'
                    {
                    match("ACC_SYNCHRONIZED"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:58:4: 'ACC_VOLATILE'
                    {
                    match("ACC_VOLATILE"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:58:21: 'ACC_TRANSIENT'
                    {
                    match("ACC_TRANSIENT"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:59:4: 'ACC_NATIVE'
                    {
                    match("ACC_NATIVE"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:59:19: 'ACC_INTERFACE'
                    {
                    match("ACC_INTERFACE"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:60:4: 'ACC_ABSTRACT'
                    {
                    match("ACC_ABSTRACT"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:60:21: 'ACC_SUPER'
                    {
                    match("ACC_SUPER"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ACCESS_FLAGS"

    // $ANTLR start "Constant_type_UTF8"
    public final void mConstant_type_UTF8() throws RecognitionException {
        try {
            int _type = Constant_type_UTF8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:72:2: ( 'Utf8' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:72:3: 'Utf8'
            {
            match("Utf8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Constant_type_UTF8"

    // $ANTLR start "PrimitiveType"
    public final void mPrimitiveType() throws RecognitionException {
        try {
            int _type = PrimitiveType;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:76:2: ( Numeric_type | Boolean_type )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 'c' && LA2_0 <= 'd')||LA2_0=='f'||LA2_0=='i'||LA2_0=='l'||LA2_0=='s') ) {
                alt2=1;
            }
            else if ( (LA2_0=='b') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='y') ) {
                    alt2=1;
                }
                else if ( (LA2_2=='o') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:76:5: Numeric_type
                    {
                    mNumeric_type(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:77:5: Boolean_type
                    {
                    mBoolean_type(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PrimitiveType"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:81:5: ( ( DIGIT )+ )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:81:7: ( DIGIT )+
            {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:81:7: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "HEX_DIGITS"
    public final void mHEX_DIGITS() throws RecognitionException {
        try {
            int _type = HEX_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:84:2: ( ( HEX_DIGIT )+ )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:84:2: ( HEX_DIGIT )+
            {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:84:2: ( HEX_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGITS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:88:2: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:88:4: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:88:17: ( LETTER | DIGIT | '_' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "PATH"
    public final void mPATH() throws RecognitionException {
        try {
            int _type = PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:6: ( SLASH LETTER COLON ( SLASH ( IDENTIFIER ( WS )* )+ )+ JAVABYTECODEFILE )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:8: SLASH LETTER COLON ( SLASH ( IDENTIFIER ( WS )* )+ )+ JAVABYTECODEFILE
            {
            mSLASH(); 


            mLETTER(); 


            mCOLON(); 


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:27: ( SLASH ( IDENTIFIER ( WS )* )+ )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='/') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:28: SLASH ( IDENTIFIER ( WS )* )+
            	    {
            	    mSLASH(); 


            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:34: ( IDENTIFIER ( WS )* )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:35: IDENTIFIER ( WS )*
            	    	    {
            	    	    mIDENTIFIER(); 


            	    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:46: ( WS )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
            	    	            alt6=1;
            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:91:46: WS
            	    	    	    {
            	    	    	    mWS(); 


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            mJAVABYTECODEFILE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PATH"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:93:6: ( DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:93:8: DIGIT DIGIT MINUS DIGIT DIGIT MINUS INT
            {
            mDIGIT(); 


            mDIGIT(); 


            mMINUS(); 


            mDIGIT(); 


            mDIGIT(); 


            mMINUS(); 


            mINT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "TypeIdentifier"
    public final void mTypeIdentifier() throws RecognitionException {
        try {
            int _type = TypeIdentifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:2: ( ( LBRACK )* IDENTIFIER ( SLASH IDENTIFIER )* ( SEMI )? )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:4: ( LBRACK )* IDENTIFIER ( SLASH IDENTIFIER )* ( SEMI )?
            {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:4: ( LBRACK )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='[') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( input.LA(1)=='[' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            mIDENTIFIER(); 


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:23: ( SLASH IDENTIFIER )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='/') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:24: SLASH IDENTIFIER
            	    {
            	    mSLASH(); 


            	    mIDENTIFIER(); 


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:96:43: ( SEMI )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==';') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    {
                    if ( input.LA(1)==';' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TypeIdentifier"

    // $ANTLR start "QuotedTypeIdentifier"
    public final void mQuotedTypeIdentifier() throws RecognitionException {
        try {
            int _type = QuotedTypeIdentifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:2: ( QUOTE ( LBRACK )* IDENTIFIER ( SLASH IDENTIFIER )* ( SEMI )? QUOTE )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:4: QUOTE ( LBRACK )* IDENTIFIER ( SLASH IDENTIFIER )* ( SEMI )? QUOTE
            {
            mQUOTE(); 


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:10: ( LBRACK )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='[') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( input.LA(1)=='[' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            mIDENTIFIER(); 


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:29: ( SLASH IDENTIFIER )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='/') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:30: SLASH IDENTIFIER
            	    {
            	    mSLASH(); 


            	    mIDENTIFIER(); 


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:100:49: ( SEMI )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==';') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    {
                    if ( input.LA(1)==';' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mQUOTE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QuotedTypeIdentifier"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:5: ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:9: ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )?
                    {
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:9: ( DIGIT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:20: ( DIGIT )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:27: ( EXPONENT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:104:27: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:105:9: '.' ( DIGIT )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:105:13: ( DIGIT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:105:20: ( EXPONENT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:105:20: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:106:9: ( DIGIT )+ EXPONENT
                    {
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:106:9: ( DIGIT )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "UTF8TYPE"
    public final void mUTF8TYPE() throws RecognitionException {
        try {
            int _type = UTF8TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:110:2: ( Constant_type_UTF8 ( REGULAR_STRING_LITERAL_CHARACTER )* )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:110:4: Constant_type_UTF8 ( REGULAR_STRING_LITERAL_CHARACTER )*
            {
            mConstant_type_UTF8(); 


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:110:23: ( REGULAR_STRING_LITERAL_CHARACTER )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '!')||(LA22_0 >= '#' && LA22_0 <= '\u2027')||(LA22_0 >= '\u202A' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:110:23: REGULAR_STRING_LITERAL_CHARACTER
            	    {
            	    mREGULAR_STRING_LITERAL_CHARACTER(); 


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UTF8TYPE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:114:5: ( '//' (~ ( NL | '\\r' ) )* ( '\\r' )? NL | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='/') ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1=='/') ) {
                    alt26=1;
                }
                else if ( (LA26_1=='*') ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:114:9: '//' (~ ( NL | '\\r' ) )* ( '\\r' )? NL
                    {
                    match("//"); 



                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:114:14: (~ ( NL | '\\r' ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:114:26: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:114:26: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    mNL(); 


                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:115:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:115:14: ( options {greedy=false; } : . )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='*') ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1=='/') ) {
                                alt25=2;
                            }
                            else if ( ((LA25_1 >= '\u0000' && LA25_1 <= '.')||(LA25_1 >= '0' && LA25_1 <= '\uFFFF')) ) {
                                alt25=1;
                            }


                        }
                        else if ( ((LA25_0 >= '\u0000' && LA25_0 <= ')')||(LA25_0 >= '+' && LA25_0 <= '\uFFFF')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:115:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:118:5: ( ( ' ' | '\\t' | '\\r' | NL ) )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:118:9: ( ' ' | '\\t' | '\\r' | NL )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:126:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:126:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:126:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\\') ) {
                    alt27=1;
                }
                else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '!')||(LA27_0 >= '#' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:126:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:126:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:129:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:129:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:129:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                alt28=1;
            }
            else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '&')||(LA28_0 >= '(' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:129:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:129:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:133:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:134:13: ( '\\n' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:134:15: '\\n'
            {
            match('\n'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:138:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:141:7: ( '0' .. '9' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:144:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:144:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:144:22: ( '+' | '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='+'||LA29_0=='-') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:144:33: ( '0' .. '9' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:148:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESCAPE_SEQUENCE | OCTAL_ESC )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt31=1;
                    }
                    break;
                case 'U':
                case 'u':
                    {
                    alt31=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt31=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:148:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:149:9: UNICODE_ESCAPE_SEQUENCE
                    {
                    mUNICODE_ESCAPE_SEQUENCE(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:150:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:155:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\\') ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1 >= '0' && LA32_1 <= '3')) ) {
                    int LA32_2 = input.LA(3);

                    if ( ((LA32_2 >= '0' && LA32_2 <= '7')) ) {
                        int LA32_4 = input.LA(4);

                        if ( ((LA32_4 >= '0' && LA32_4 <= '7')) ) {
                            alt32=1;
                        }
                        else {
                            alt32=2;
                        }
                    }
                    else {
                        alt32=3;
                    }
                }
                else if ( ((LA32_1 >= '4' && LA32_1 <= '7')) ) {
                    int LA32_3 = input.LA(3);

                    if ( ((LA32_3 >= '0' && LA32_3 <= '7')) ) {
                        alt32=2;
                    }
                    else {
                        alt32=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:155:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:156:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:157:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "REGULAR_STRING_LITERAL_CHARACTER"
    public final void mREGULAR_STRING_LITERAL_CHARACTER() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:162:2: ( SINGLE_REGULAR_STRING_LITERAL_CHARACTER | SIMPLE_ESCAPE_SEQUENCE | UNICODE_ESCAPE_SEQUENCE )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\t')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '!')||(LA33_0 >= '#' && LA33_0 <= '[')||(LA33_0 >= ']' && LA33_0 <= '\u2027')||(LA33_0 >= '\u202A' && LA33_0 <= '\uFFFF')) ) {
                alt33=1;
            }
            else if ( (LA33_0=='\\') ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2=='\"'||LA33_2=='\''||LA33_2=='0'||LA33_2=='\\'||(LA33_2 >= 'a' && LA33_2 <= 'b')||LA33_2=='f'||LA33_2=='n'||LA33_2=='r'||LA33_2=='t'||LA33_2=='v') ) {
                    alt33=2;
                }
                else if ( (LA33_2=='U'||LA33_2=='u') ) {
                    alt33=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:162:4: SINGLE_REGULAR_STRING_LITERAL_CHARACTER
                    {
                    mSINGLE_REGULAR_STRING_LITERAL_CHARACTER(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:163:4: SIMPLE_ESCAPE_SEQUENCE
                    {
                    mSIMPLE_ESCAPE_SEQUENCE(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:164:4: UNICODE_ESCAPE_SEQUENCE
                    {
                    mUNICODE_ESCAPE_SEQUENCE(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGULAR_STRING_LITERAL_CHARACTER"

    // $ANTLR start "SINGLE_REGULAR_STRING_LITERAL_CHARACTER"
    public final void mSINGLE_REGULAR_STRING_LITERAL_CHARACTER() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:169:2: (~ ( '\\\"' | '\\\\' | '\\u000D' | '\\u000A' | '\\u2028' | '\\u2029' ) )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\u2027')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_REGULAR_STRING_LITERAL_CHARACTER"

    // $ANTLR start "SIMPLE_ESCAPE_SEQUENCE"
    public final void mSIMPLE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:2: ( '\\\\\\'' | '\\\\\\\"' | '\\\\\\\\' | '\\\\0' | '\\\\a' | '\\\\b' | '\\\\f' | '\\\\n' | '\\\\r' | '\\\\t' | '\\\\v' )
            int alt34=11;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\'':
                    {
                    alt34=1;
                    }
                    break;
                case '\"':
                    {
                    alt34=2;
                    }
                    break;
                case '\\':
                    {
                    alt34=3;
                    }
                    break;
                case '0':
                    {
                    alt34=4;
                    }
                    break;
                case 'a':
                    {
                    alt34=5;
                    }
                    break;
                case 'b':
                    {
                    alt34=6;
                    }
                    break;
                case 'f':
                    {
                    alt34=7;
                    }
                    break;
                case 'n':
                    {
                    alt34=8;
                    }
                    break;
                case 'r':
                    {
                    alt34=9;
                    }
                    break;
                case 't':
                    {
                    alt34=10;
                    }
                    break;
                case 'v':
                    {
                    alt34=11;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:4: '\\\\\\''
                    {
                    match("\\'"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:13: '\\\\\\\"'
                    {
                    match("\\\""); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:22: '\\\\\\\\'
                    {
                    match("\\\\"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:31: '\\\\0'
                    {
                    match("\\0"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:174:39: '\\\\a'
                    {
                    match("\\a"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:4: '\\\\b'
                    {
                    match("\\b"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:12: '\\\\f'
                    {
                    match("\\f"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:21: '\\\\n'
                    {
                    match("\\n"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:30: '\\\\r'
                    {
                    match("\\r"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:38: '\\\\t'
                    {
                    match("\\t"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:175:46: '\\\\v'
                    {
                    match("\\v"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMPLE_ESCAPE_SEQUENCE"

    // $ANTLR start "UNICODE_ESCAPE_SEQUENCE"
    public final void mUNICODE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:180:2: ( ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) | ( '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\\') ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1=='u') ) {
                    alt35=1;
                }
                else if ( (LA35_1=='U') ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:180:4: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
                    {
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:180:4: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:180:5: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('\\'); 

                    match('u'); 

                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:181:4: ( '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
                    {
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:181:4: ( '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:181:5: '\\\\' 'U' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('\\'); 

                    match('U'); 

                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    mHEX_DIGIT(); 


                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESCAPE_SEQUENCE"

    // $ANTLR start "Boolean_type"
    public final void mBoolean_type() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:187:2: ( 'boolean' )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:187:4: 'boolean'
            {
            match("boolean"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Boolean_type"

    // $ANTLR start "Numeric_type"
    public final void mNumeric_type() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:192:2: ( Floating_point_type | Integral_type )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='d'||LA36_0=='f') ) {
                alt36=1;
            }
            else if ( ((LA36_0 >= 'b' && LA36_0 <= 'c')||LA36_0=='i'||LA36_0=='l'||LA36_0=='s') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:192:4: Floating_point_type
                    {
                    mFloating_point_type(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:193:4: Integral_type
                    {
                    mIntegral_type(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Numeric_type"

    // $ANTLR start "Integral_type"
    public final void mIntegral_type() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:198:2: ( 'byte' | 'short' | 'int' | 'long' | 'char' )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt37=1;
                }
                break;
            case 's':
                {
                alt37=2;
                }
                break;
            case 'i':
                {
                alt37=3;
                }
                break;
            case 'l':
                {
                alt37=4;
                }
                break;
            case 'c':
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:198:4: 'byte'
                    {
                    match("byte"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:199:4: 'short'
                    {
                    match("short"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:200:4: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:201:4: 'long'
                    {
                    match("long"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:202:4: 'char'
                    {
                    match("char"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Integral_type"

    // $ANTLR start "Floating_point_type"
    public final void mFloating_point_type() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:207:2: ( 'float' | 'double' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='f') ) {
                alt38=1;
            }
            else if ( (LA38_0=='d') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:207:4: 'float'
                    {
                    match("float"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:208:4: 'double'
                    {
                    match("double"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Floating_point_type"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:8: ( Constant_pool_index | MODIFIED | CHECKSUM | CLASSFILE | SOURCEFILE | MINORVERSION | MAJORVERSION | FLAGS | SIZE | BYTES | JAVAFILETYPE | COMPILED | CLASS | JAVABYTECODEFILE | DEFAULT | EXTENDS | IMPLEMENTS | SIGNATURE | CONSTANTPOOL | THROWS | CODE | TABLESWITCH | LOOKUPSWITCH | EXCEPTIONS | ABSTRACT | PUBLIC | FINAL | STATIC | PRIVATE | PROTECTED | INTERFACE | SYNCHRONIZED | NATIVE | VOLATILE | TRANSIENT | CTOR | DCTOR | RETURN | STACK | LOCALS | ARGS | MINUS | PLUS | COLON | SEMI | COMMA | DOT | LBRACE | RBRACE | LBRACK | RBRACK | LPAREN | RPAREN | ASSIGN | HASH | QUOTED_STRING | ACCESS_FLAGS | Constant_type_UTF8 | PrimitiveType | INT | HEX_DIGITS | IDENTIFIER | PATH | DATE | TypeIdentifier | QuotedTypeIdentifier | FLOAT | UTF8TYPE | COMMENT | WS | STRING | CHAR )
        int alt39=72;
        alt39 = dfa39.predict(input);
        switch (alt39) {
            case 1 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:10: Constant_pool_index
                {
                mConstant_pool_index(); 


                }
                break;
            case 2 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:30: MODIFIED
                {
                mMODIFIED(); 


                }
                break;
            case 3 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:39: CHECKSUM
                {
                mCHECKSUM(); 


                }
                break;
            case 4 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:48: CLASSFILE
                {
                mCLASSFILE(); 


                }
                break;
            case 5 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:58: SOURCEFILE
                {
                mSOURCEFILE(); 


                }
                break;
            case 6 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:69: MINORVERSION
                {
                mMINORVERSION(); 


                }
                break;
            case 7 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:82: MAJORVERSION
                {
                mMAJORVERSION(); 


                }
                break;
            case 8 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:95: FLAGS
                {
                mFLAGS(); 


                }
                break;
            case 9 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:101: SIZE
                {
                mSIZE(); 


                }
                break;
            case 10 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:106: BYTES
                {
                mBYTES(); 


                }
                break;
            case 11 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:112: JAVAFILETYPE
                {
                mJAVAFILETYPE(); 


                }
                break;
            case 12 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:125: COMPILED
                {
                mCOMPILED(); 


                }
                break;
            case 13 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:134: CLASS
                {
                mCLASS(); 


                }
                break;
            case 14 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:140: JAVABYTECODEFILE
                {
                mJAVABYTECODEFILE(); 


                }
                break;
            case 15 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:157: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:165: EXTENDS
                {
                mEXTENDS(); 


                }
                break;
            case 17 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:173: IMPLEMENTS
                {
                mIMPLEMENTS(); 


                }
                break;
            case 18 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:184: SIGNATURE
                {
                mSIGNATURE(); 


                }
                break;
            case 19 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:194: CONSTANTPOOL
                {
                mCONSTANTPOOL(); 


                }
                break;
            case 20 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:207: THROWS
                {
                mTHROWS(); 


                }
                break;
            case 21 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:214: CODE
                {
                mCODE(); 


                }
                break;
            case 22 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:219: TABLESWITCH
                {
                mTABLESWITCH(); 


                }
                break;
            case 23 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:231: LOOKUPSWITCH
                {
                mLOOKUPSWITCH(); 


                }
                break;
            case 24 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:244: EXCEPTIONS
                {
                mEXCEPTIONS(); 


                }
                break;
            case 25 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:255: ABSTRACT
                {
                mABSTRACT(); 


                }
                break;
            case 26 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:264: PUBLIC
                {
                mPUBLIC(); 


                }
                break;
            case 27 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:271: FINAL
                {
                mFINAL(); 


                }
                break;
            case 28 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:277: STATIC
                {
                mSTATIC(); 


                }
                break;
            case 29 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:284: PRIVATE
                {
                mPRIVATE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:292: PROTECTED
                {
                mPROTECTED(); 


                }
                break;
            case 31 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:302: INTERFACE
                {
                mINTERFACE(); 


                }
                break;
            case 32 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:312: SYNCHRONIZED
                {
                mSYNCHRONIZED(); 


                }
                break;
            case 33 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:325: NATIVE
                {
                mNATIVE(); 


                }
                break;
            case 34 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:332: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 35 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:341: TRANSIENT
                {
                mTRANSIENT(); 


                }
                break;
            case 36 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:351: CTOR
                {
                mCTOR(); 


                }
                break;
            case 37 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:356: DCTOR
                {
                mDCTOR(); 


                }
                break;
            case 38 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:362: RETURN
                {
                mRETURN(); 


                }
                break;
            case 39 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:369: STACK
                {
                mSTACK(); 


                }
                break;
            case 40 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:375: LOCALS
                {
                mLOCALS(); 


                }
                break;
            case 41 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:382: ARGS
                {
                mARGS(); 


                }
                break;
            case 42 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:387: MINUS
                {
                mMINUS(); 


                }
                break;
            case 43 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:393: PLUS
                {
                mPLUS(); 


                }
                break;
            case 44 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:398: COLON
                {
                mCOLON(); 


                }
                break;
            case 45 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:404: SEMI
                {
                mSEMI(); 


                }
                break;
            case 46 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:409: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 47 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:415: DOT
                {
                mDOT(); 


                }
                break;
            case 48 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:419: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 49 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:426: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 50 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:433: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 51 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:440: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 52 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:447: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 53 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:454: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 54 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:461: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 55 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:468: HASH
                {
                mHASH(); 


                }
                break;
            case 56 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:473: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;
            case 57 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:487: ACCESS_FLAGS
                {
                mACCESS_FLAGS(); 


                }
                break;
            case 58 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:500: Constant_type_UTF8
                {
                mConstant_type_UTF8(); 


                }
                break;
            case 59 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:519: PrimitiveType
                {
                mPrimitiveType(); 


                }
                break;
            case 60 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:533: INT
                {
                mINT(); 


                }
                break;
            case 61 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:537: HEX_DIGITS
                {
                mHEX_DIGITS(); 


                }
                break;
            case 62 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:548: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 63 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:559: PATH
                {
                mPATH(); 


                }
                break;
            case 64 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:564: DATE
                {
                mDATE(); 


                }
                break;
            case 65 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:569: TypeIdentifier
                {
                mTypeIdentifier(); 


                }
                break;
            case 66 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:584: QuotedTypeIdentifier
                {
                mQuotedTypeIdentifier(); 


                }
                break;
            case 67 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:605: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 68 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:611: UTF8TYPE
                {
                mUTF8TYPE(); 


                }
                break;
            case 69 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:620: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 70 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:628: WS
                {
                mWS(); 


                }
                break;
            case 71 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:631: STRING
                {
                mSTRING(); 


                }
                break;
            case 72 :
                // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:1:638: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\5\uffff";
    static final String DFA21_minS =
        "\2\56\3\uffff";
    static final String DFA21_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "103:1: FLOAT : ( ( DIGIT )+ '.' ( DIGIT )* ( EXPONENT )? | '.' ( DIGIT )+ ( EXPONENT )? | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA39_eotS =
        "\1\uffff\1\55\2\61\1\66\2\61\1\66\1\61\1\66\1\106\3\66\3\61\2\66"+
        "\3\61\1\uffff\1\61\7\uffff\1\135\5\uffff\1\66\1\61\1\143\1\66\1"+
        "\61\5\uffff\2\61\2\uffff\3\61\1\uffff\1\66\14\61\4\uffff\2\61\1"+
        "\66\11\61\1\66\5\61\2\uffff\1\61\4\uffff\1\66\1\61\1\uffff\1\143"+
        "\1\66\2\uffff\25\61\1\66\3\61\1\u00b7\17\61\6\uffff\1\66\1\61\1"+
        "\143\1\uffff\1\66\1\61\1\uffff\3\61\1\u00d1\7\61\1\u00d9\4\61\1"+
        "\u00b7\2\61\1\u00b7\1\66\4\61\1\uffff\5\61\1\u00b7\11\61\4\uffff"+
        "\1\61\1\u00fe\1\uffff\3\61\1\uffff\4\61\1\u010a\1\u00b7\1\u010b"+
        "\1\uffff\1\61\1\u010d\1\61\1\u00b7\1\u010f\1\61\1\u0111\23\61\2"+
        "\uffff\10\61\1\uffff\1\61\1\uffff\1\u0100\1\62\5\61\4\uffff\1\u0137"+
        "\1\uffff\1\61\1\uffff\1\61\1\uffff\1\61\1\u00b7\3\61\1\u013e\3\61"+
        "\1\u0142\3\61\1\u0146\2\61\1\u0149\1\61\1\u014b\1\uffff\13\61\1"+
        "\62\5\61\1\uffff\1\61\1\u00b7\1\u0160\1\u0161\2\61\1\uffff\3\61"+
        "\1\uffff\3\61\1\uffff\1\u016a\1\61\1\uffff\1\61\2\uffff\14\61\1"+
        "\62\6\61\2\uffff\6\61\1\u0186\1\61\1\uffff\1\61\1\u0189\1\uffff"+
        "\14\61\1\u0197\2\uffff\1\61\1\u0199\2\61\1\u019c\1\61\1\u019e\2"+
        "\61\1\uffff\1\u01a1\1\u01a2\2\uffff\5\61\2\u01a8\5\61\1\uffff\1"+
        "\u01ae\1\uffff\1\61\1\u01b0\1\uffff\1\61\1\uffff\1\61\1\u01b3\2"+
        "\uffff\1\u01a8\2\61\1\u01a8\1\61\1\uffff\2\61\1\u01a8\2\61\1\uffff"+
        "\1\61\1\uffff\1\u01bc\1\61\1\uffff\1\u01a8\6\61\1\u01c4\1\uffff"+
        "\1\u01c5\2\61\1\u01a8\2\61\1\u01a8\2\uffff\1\u01a8\1\61\2\u01a8"+
        "\2\61\1\u01a8";
    static final String DFA39_eofS =
        "\u01cd\uffff";
    static final String DFA39_minS =
        "\1\11\1\60\10\57\1\60\13\57\1\143\1\57\7\uffff\1\101\4\uffff\1\0"+
        "\2\57\1\56\2\57\1\52\4\uffff\2\57\2\uffff\3\57\1\uffff\15\57\4\uffff"+
        "\22\57\2\uffff\1\57\1\uffff\2\0\1\uffff\2\57\1\uffff\1\55\1\53\2"+
        "\uffff\1\57\1\40\47\57\4\0\1\uffff\1\0\2\57\1\56\1\uffff\1\60\1"+
        "\40\1\uffff\31\57\1\uffff\17\57\2\0\1\uffff\1\0\1\57\1\0\1\uffff"+
        "\3\57\1\uffff\2\57\2\40\3\57\1\uffff\32\57\2\0\10\57\1\uffff\1\0"+
        "\1\uffff\1\101\1\0\5\57\4\uffff\1\57\1\uffff\1\57\1\uffff\1\57\1"+
        "\uffff\23\57\1\0\13\57\1\0\5\57\1\uffff\6\57\1\uffff\3\57\1\uffff"+
        "\3\57\1\uffff\2\57\1\uffff\1\57\1\uffff\1\0\14\57\1\0\1\57\2\40"+
        "\3\57\2\uffff\10\57\1\uffff\2\57\1\uffff\15\57\2\uffff\11\57\1\uffff"+
        "\2\57\2\uffff\14\57\1\uffff\1\57\1\uffff\2\57\1\uffff\1\57\1\uffff"+
        "\2\57\2\uffff\5\57\1\uffff\5\57\1\uffff\1\57\1\uffff\2\57\1\uffff"+
        "\10\57\1\uffff\7\57\2\uffff\7\57";
    static final String DFA39_maxS =
        "\1\175\1\71\10\172\1\152\13\172\1\151\1\172\7\uffff\1\172\4\uffff"+
        "\1\uffff\2\172\1\146\3\172\4\uffff\2\172\2\uffff\3\172\1\uffff\15"+
        "\172\4\uffff\22\172\2\uffff\1\172\1\uffff\2\uffff\1\uffff\2\172"+
        "\1\uffff\1\146\1\71\2\uffff\51\172\4\uffff\1\uffff\1\uffff\2\172"+
        "\1\146\1\uffff\1\71\1\172\1\uffff\31\172\1\uffff\17\172\2\uffff"+
        "\1\uffff\1\uffff\1\172\1\uffff\1\uffff\3\172\1\uffff\7\172\1\uffff"+
        "\32\172\2\uffff\10\172\1\uffff\1\uffff\1\uffff\1\172\1\uffff\5\172"+
        "\4\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\23\172\1\uffff"+
        "\13\172\1\uffff\5\172\1\uffff\6\172\1\uffff\3\172\1\uffff\3\172"+
        "\1\uffff\2\172\1\uffff\1\172\1\uffff\1\uffff\14\172\1\uffff\6\172"+
        "\2\uffff\10\172\1\uffff\2\172\1\uffff\15\172\2\uffff\11\172\1\uffff"+
        "\2\172\2\uffff\14\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\2\172\2\uffff\5\172\1\uffff\5\172\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\10\172\1\uffff\7\172\2\uffff\7\172";
    static final String DFA39_acceptS =
        "\30\uffff\1\52\1\53\1\54\1\55\1\56\1\60\1\61\1\uffff\1\63\1\64\1"+
        "\65\1\66\7\uffff\1\106\1\110\1\67\1\1\2\uffff\1\76\1\101\3\uffff"+
        "\1\75\15\uffff\1\13\1\16\1\57\1\103\22\uffff\1\44\1\45\1\uffff\1"+
        "\62\2\uffff\1\107\2\uffff\1\74\2\uffff\1\105\1\77\55\uffff\1\102"+
        "\4\uffff\1\100\2\uffff\1\3\31\uffff\1\73\21\uffff\1\102\3\uffff"+
        "\1\2\3\uffff\1\25\7\uffff\1\11\44\uffff\1\72\1\uffff\1\104\7\uffff"+
        "\1\6\1\7\1\10\1\33\1\uffff\1\47\1\uffff\1\12\1\uffff\1\15\45\uffff"+
        "\1\34\6\uffff\1\24\3\uffff\1\50\3\uffff\1\32\2\uffff\1\41\1\uffff"+
        "\1\46\24\uffff\1\17\1\20\10\uffff\1\35\2\uffff\1\70\15\uffff\1\14"+
        "\1\23\11\uffff\1\31\2\uffff\1\42\1\70\14\uffff\1\4\1\uffff\1\22"+
        "\2\uffff\1\37\1\uffff\1\43\2\uffff\1\51\1\36\5\uffff\1\71\5\uffff"+
        "\1\5\1\uffff\1\21\2\uffff\1\30\10\uffff\1\26\7\uffff\1\40\1\27\7"+
        "\uffff";
    static final String DFA39_specialS =
        "\44\uffff\1\21\71\uffff\1\20\1\16\61\uffff\1\15\1\3\1\23\1\14\1"+
        "\uffff\1\0\60\uffff\1\1\1\12\1\uffff\1\6\1\uffff\1\17\47\uffff\1"+
        "\2\1\5\11\uffff\1\22\2\uffff\1\7\42\uffff\1\4\13\uffff\1\13\32\uffff"+
        "\1\10\14\uffff\1\11\163\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\44\1\1\3\uffff\1"+
            "\54\1\41\1\42\1\uffff\1\31\1\34\1\30\1\12\1\52\12\47\1\32\1"+
            "\33\1\26\1\43\3\uffff\1\45\1\50\1\4\1\50\1\21\1\50\5\51\1\2"+
            "\1\3\5\51\1\5\1\51\1\46\5\51\1\37\1\uffff\1\40\1\uffff\1\51"+
            "\1\uffff\1\22\1\11\1\13\1\14\1\15\1\7\2\51\1\16\2\51\1\20\1"+
            "\6\1\24\1\51\1\23\1\51\1\27\1\10\1\17\1\51\1\25\4\51\1\35\1"+
            "\uffff\1\36",
            "\12\56",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\57\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\3\60\1\63\26\60\4\uffff\1"+
            "\60\1\uffff\32\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\5\60\1\64\2\60\1\65\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\71\5\60\1\70\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\73\7\60\1\72\21\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\2\60\1\75\2\60\1\74\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\101\1\76\12\60\1\77\4\60\1\100\1\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\10\60\1\103\11\60\1\102\1\60",
            "\12\107\51\uffff\1\105\6\uffff\1\104",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\1\60\1\111\3\60\1\110\16\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\4\67\1\112\1\67\10\60\1\113\13\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\21\60\1\114\2\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\115\1\116\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\120\6\60\1\117\11\60\1\121\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\122\13\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\21\60\1\123\2\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\1\67\1\124\4\67\13\60\1\125\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\127\2\60\1\126\5\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\130\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\131\13\60",
            "\1\133\5\uffff\1\132",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\134\25\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\33\62\3\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\101\140\32\136\1\137\3\140\1\136\1\140\32\136\uff85\140",
            "\1\62\12\67\1\uffff\1\62\5\uffff\2\67\1\141\3\67\24\60\4\uffff"+
            "\1\60\1\uffff\6\67\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\142\6\60",
            "\1\107\1\uffff\12\144\7\uffff\4\66\1\145\1\66\32\uffff\4\66"+
            "\1\145\1\66",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\146\4\uffff\1\146\21\uffff\32\147\6\uffff\32\147",
            "",
            "",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\150\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "",
            "\1\62\5\60\1\151\4\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1"+
            "\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\152\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\155\10\60\1\153\1\154\14\60",
            "",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\156\5\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\157\23\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\160\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\11\60\1\161\20\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\162\15\60\1\163\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\164\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\31\60\1\165",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\166\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\167\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\170\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\171\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\172\13\60",
            "",
            "",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\173\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\174\31\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\5\67\1\175\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\176\5\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\177\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u0080\12\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0081\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u0082\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u0083\30\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u0084\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0086\12\60\1\u0087\1\u0085\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0088\27\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\14\60\1\u0089\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u008a\23\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u008b\30\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u008c\5\60\1\u008d\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u008e\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u008f\16\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0090\6\60",
            "",
            "\42\140\1\u0095\13\140\1\u0092\1\u0093\12\u0091\1\140\1\u0094"+
            "\5\140\32\u0091\4\140\1\u0091\1\140\32\u0091\uff85\140",
            "\101\140\32\u0096\1\137\3\140\1\u0096\1\140\32\u0096\uff85"+
            "\140",
            "",
            "\1\62\12\67\1\uffff\1\62\5\uffff\2\67\1\u0097\3\67\24\60\4"+
            "\uffff\1\60\1\uffff\6\67\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\5\60\1\u0098\24\60",
            "",
            "\1\u009a\1\107\1\uffff\12\u0099\7\uffff\4\66\1\145\1\66\32"+
            "\uffff\4\66\1\145\1\66",
            "\1\107\1\uffff\1\107\2\uffff\12\u009b",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u009c\6\60",
            "\1\u009d\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u009e\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u009f\12\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00a0\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00a1\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00a2\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00a3\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u00a4\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u00a5\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u00a6\23\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00a7\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00a8\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00a9\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00ab\20\60\1\u00aa\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00ac\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00ad\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00ae\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00af\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00b0\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00b1\10\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\1\u00b2\5\67\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\60\1\u00b3\30\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00b4\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00b5\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00b6\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u00b8\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00b9\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00ba\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\12\60\1\u00bb\17\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00bc\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\6\60\1\u00bd\23\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00be\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00bf\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00c0\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00c1\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\25\60\1\u00c2\4\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00c3\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00c4\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00c5\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u00c6\5\60",
            "\42\140\1\u0095\13\140\1\u0092\1\u0093\12\u0091\1\140\1\u0094"+
            "\5\140\32\u0091\4\140\1\u0091\1\140\32\u0091\uff85\140",
            "\152\140\1\u00c7\uff95\140",
            "\101\140\32\u00c8\4\140\1\u00c8\1\140\32\u00c8\uff85\140",
            "\42\140\1\u0095\uffdd\140",
            "",
            "\42\140\1\u0095\14\140\1\u0093\12\u00ca\1\140\1\u0094\5\140"+
            "\32\u00ca\4\140\1\u00ca\1\140\32\u00ca\uff85\140",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\u00cb"+
            "\1\uffff\6\67\24\60",
            "\1\62\10\60\1\u00cc\1\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\107\1\uffff\12\u0099\7\uffff\4\66\1\145\1\66\32\uffff\4"+
            "\66\1\145\1\66",
            "",
            "\12\u009b",
            "\1\u00cd\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00ce\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00cf\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00d0\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u00d2\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00d3\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00d4\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00d5\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00d6\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00d7\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00d8\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00da\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\12\60\1\u00db\17\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u00dc\22\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00dd\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00de\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00df\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00e0\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\67\1\uffff\1\62\5\uffff\6\67\24\60\4\uffff\1\60\1"+
            "\uffff\6\67\16\60\1\u00e1\5\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00e2\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u00e3\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00e4\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00e5\10\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\26\60\1\u00e6\3\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00e7\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u00e8\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u00e9\5\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u00ea\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u00eb\12\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00ec\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\u00ed\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u00ee\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u00ef\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u00f0\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\25\60\1\u00f1\4\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u00f2\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u00f3\10\60",
            "\141\140\1\u00f4\uff9e\140",
            "\42\140\1\u0095\14\140\1\u0093\12\u00f5\1\140\1\u0094\5\140"+
            "\32\u00f5\4\140\1\u00f5\1\140\32\u00f5\uff85\140",
            "",
            "\42\140\1\u0095\14\140\1\u0093\12\u00ca\1\140\1\u0094\5\140"+
            "\32\u00ca\4\140\1\u00ca\1\140\32\u00ca\uff85\140",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u00fd\4\60\1\u00f8\2\60"+
            "\1\u00fc\4\60\1\u00fb\1\60\1\u00f6\2\60\1\u00f7\1\u00fa\1\60"+
            "\1\u00f9\4\60\4\uffff\1\60\1\uffff\32\60",
            "\12\u0100\1\uffff\2\u0100\1\uffff\24\u0100\1\uffff\14\u0100"+
            "\1\u0101\12\u00ff\1\u0100\1\u0102\5\u0100\32\u00ff\4\u0100\1"+
            "\u00ff\1\u0100\32\u00ff\u1fad\u0100\2\uffff\udfd6\u0100",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\5\60\1\u0103\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u0104\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u0105\31\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0106\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0107\6\60",
            "\1\u0108\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\u0109\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u010c\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u010e\10\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u0110\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u0112\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0113\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u0114\26\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\14\60\1\u0115\15\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\5\60\1\u0116\24\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u0117\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u0118\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0119\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\17\60\1\u011a\12\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u011b\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u011c\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u011d\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u011e\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u011f\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0120\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0121\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0122\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0123\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0124\14\60",
            "\166\140\1\u0125\uff89\140",
            "\42\140\1\u0095\14\140\1\u0093\12\u00f5\1\140\1\u0094\5\140"+
            "\32\u00f5\4\140\1\u00f5\1\140\32\u00f5\uff85\140",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u0127\2\60\1\u0126"+
            "\5\60\4\uffff\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0128\1\u012a\3\60"+
            "\1\u0129\1\60\4\uffff\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u012b\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\16\60\1\u012c\13\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u012d\10\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u012e\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u012f\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\60\1\u0130\30\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "",
            "\12\u0100\1\uffff\2\u0100\1\uffff\24\u0100\1\uffff\14\u0100"+
            "\1\u0101\12\u00ff\1\u0100\1\u0102\5\u0100\32\u00ff\4\u0100\1"+
            "\u00ff\1\u0100\32\u00ff\u1fad\u0100\2\uffff\udfd6\u0100",
            "",
            "\32\u0131\4\uffff\1\u0131\1\uffff\32\u0131",
            "\12\u0100\1\uffff\2\u0100\1\uffff\24\u0100\1\uffff\u2005\u0100"+
            "\2\uffff\udfd6\u0100",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0132\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0133\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0134\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\5\60\1\u0135\24\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\24\60\1\u0136\5\60",
            "",
            "",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0138\13\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0139\14\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u013a\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u013b\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u013c\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\1\u013d\31\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\26\60\1\u013f\3\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0140\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u0141\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0143\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0144\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0145\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0147\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0148\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u014a\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\141\140\1\u014c\uff9e\140",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\60\1\u014d\30\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u014e\5\60\1\u014f"+
            "\13\60\4\uffff\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u0150\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u0151\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\17\60\1\u0152\12\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u0153\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\13\60\1\u0154\16\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u0155\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0156\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0157\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\22\60\1\u0158\7\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\12\u0100\1\uffff\2\u0100\1\uffff\24\u0100\1\uffff\14\u0100"+
            "\1\u0101\12\u0159\1\u0100\1\u0102\5\u0100\32\u0159\4\u0100\1"+
            "\u0159\1\u0100\32\u0159\u1fad\u0100\2\uffff\udfd6\u0100",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u015a\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u015b\26\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u015c\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u015d\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\21\60\1\u015e\10\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u015f\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0162\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u0163\27\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0164\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0165\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\26\60\1\u0166\3\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\16\60\1\u0167\13\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0168\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\31\60\1\u0169",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u016b\25\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u016c\25\60",
            "",
            "\42\140\1\u016d\uffdd\140",
            "\1\62\12\60\1\uffff\1\62\5\uffff\13\60\1\u016e\16\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\25\60\1\u016f\4\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0170\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0171\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u0172\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u0173\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u0174\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u0175\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u0176\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u0177\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u0178\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0179\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\12\u0100\1\uffff\2\u0100\1\uffff\24\u0100\1\uffff\14\u0100"+
            "\1\u0101\12\u0159\1\u0100\1\u0102\5\u0100\32\u0159\4\u0100\1"+
            "\u0159\1\u0100\32\u0159\u1fad\u0100\2\uffff\udfd6\u0100",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u017a\25\60",
            "\1\u017b\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\u017c\16\uffff\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\13\60\1\u017d\16\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u017e\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u017f\21\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0180\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0181\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0182\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u0183\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0184\21\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\15\60\1\u0185\14\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0187\25\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u0188\26\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u018b\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u018c\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u018d\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u018e\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\7\60\1\u018f\22\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u0190\10\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\13\60\1\u0191\16\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u0192\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\22\60\1\u0193\7\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\25\60\1\u0194\4\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u0195\10\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u0196\10\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u0198\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\31\60\1\u019a",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u019b\7\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u019d\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\23\60\1\u019f\6\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\22\60\1\u01a0\7\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u01a3\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u01a4\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u01a5\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u01a6\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\21\60\1\u01a7\10\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u01a9\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u01aa\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01ab\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\5\60\1\u01ac\24\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u01ad\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\4\60\1\u01af\25\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u01b1\22\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\2\60\1\u01b2\27\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01b4\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u01b5\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\16\60\1\u01b6\13\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\13\60\1\u01b7\16\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01b8\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\1\u01b9\31\60\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u01ba\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\3\60\1\u01bb\26\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\7\60\1\u01bd\22\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01be\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u01bf\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01c0\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\15\60\1\u01c1\14\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\2\60\1\u01c2\27\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u01c3\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\3\60\1\u01c6\26\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\10\60\1\u01c7\21\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\23\60\1\u01c8\6\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01c9\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "",
            "",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\31\60\1\u01ca\4\uffff\1\60"+
            "\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\4\60\1\u01cb\25\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\3\60\1\u01cc\26\60\4\uffff"+
            "\1\60\1\uffff\32\60",
            "\1\62\12\60\1\uffff\1\62\5\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Constant_pool_index | MODIFIED | CHECKSUM | CLASSFILE | SOURCEFILE | MINORVERSION | MAJORVERSION | FLAGS | SIZE | BYTES | JAVAFILETYPE | COMPILED | CLASS | JAVABYTECODEFILE | DEFAULT | EXTENDS | IMPLEMENTS | SIGNATURE | CONSTANTPOOL | THROWS | CODE | TABLESWITCH | LOOKUPSWITCH | EXCEPTIONS | ABSTRACT | PUBLIC | FINAL | STATIC | PRIVATE | PROTECTED | INTERFACE | SYNCHRONIZED | NATIVE | VOLATILE | TRANSIENT | CTOR | DCTOR | RETURN | STACK | LOCALS | ARGS | MINUS | PLUS | COLON | SEMI | COMMA | DOT | LBRACE | RBRACE | LBRACK | RBRACK | LPAREN | RPAREN | ASSIGN | HASH | QUOTED_STRING | ACCESS_FLAGS | Constant_type_UTF8 | PrimitiveType | INT | HEX_DIGITS | IDENTIFIER | PATH | DATE | TypeIdentifier | QuotedTypeIdentifier | FLOAT | UTF8TYPE | COMMENT | WS | STRING | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_150 = input.LA(1);

                        s = -1;
                        if ( ((LA39_150 >= '0' && LA39_150 <= '9')||(LA39_150 >= 'A' && LA39_150 <= 'Z')||LA39_150=='_'||(LA39_150 >= 'a' && LA39_150 <= 'z')) ) {s = 202;}

                        else if ( (LA39_150=='/') ) {s = 147;}

                        else if ( (LA39_150==';') ) {s = 148;}

                        else if ( (LA39_150=='\"') ) {s = 149;}

                        else if ( ((LA39_150 >= '\u0000' && LA39_150 <= '!')||(LA39_150 >= '#' && LA39_150 <= '.')||LA39_150==':'||(LA39_150 >= '<' && LA39_150 <= '@')||(LA39_150 >= '[' && LA39_150 <= '^')||LA39_150=='`'||(LA39_150 >= '{' && LA39_150 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA39_199 = input.LA(1);

                        s = -1;
                        if ( (LA39_199=='a') ) {s = 244;}

                        else if ( ((LA39_199 >= '\u0000' && LA39_199 <= '`')||(LA39_199 >= 'b' && LA39_199 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA39_244 = input.LA(1);

                        s = -1;
                        if ( (LA39_244=='v') ) {s = 293;}

                        else if ( ((LA39_244 >= '\u0000' && LA39_244 <= 'u')||(LA39_244 >= 'w' && LA39_244 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA39_146 = input.LA(1);

                        s = -1;
                        if ( (LA39_146=='j') ) {s = 199;}

                        else if ( ((LA39_146 >= '\u0000' && LA39_146 <= 'i')||(LA39_146 >= 'k' && LA39_146 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA39_293 = input.LA(1);

                        s = -1;
                        if ( (LA39_293=='a') ) {s = 332;}

                        else if ( ((LA39_293 >= '\u0000' && LA39_293 <= '`')||(LA39_293 >= 'b' && LA39_293 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA39_245 = input.LA(1);

                        s = -1;
                        if ( (LA39_245==';') ) {s = 148;}

                        else if ( (LA39_245=='\"') ) {s = 149;}

                        else if ( (LA39_245=='/') ) {s = 147;}

                        else if ( ((LA39_245 >= '0' && LA39_245 <= '9')||(LA39_245 >= 'A' && LA39_245 <= 'Z')||LA39_245=='_'||(LA39_245 >= 'a' && LA39_245 <= 'z')) ) {s = 245;}

                        else if ( ((LA39_245 >= '\u0000' && LA39_245 <= '!')||(LA39_245 >= '#' && LA39_245 <= '.')||LA39_245==':'||(LA39_245 >= '<' && LA39_245 <= '@')||(LA39_245 >= '[' && LA39_245 <= '^')||LA39_245=='`'||(LA39_245 >= '{' && LA39_245 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA39_202 = input.LA(1);

                        s = -1;
                        if ( (LA39_202=='/') ) {s = 147;}

                        else if ( (LA39_202==';') ) {s = 148;}

                        else if ( (LA39_202=='\"') ) {s = 149;}

                        else if ( ((LA39_202 >= '0' && LA39_202 <= '9')||(LA39_202 >= 'A' && LA39_202 <= 'Z')||LA39_202=='_'||(LA39_202 >= 'a' && LA39_202 <= 'z')) ) {s = 202;}

                        else if ( ((LA39_202 >= '\u0000' && LA39_202 <= '!')||(LA39_202 >= '#' && LA39_202 <= '.')||LA39_202==':'||(LA39_202 >= '<' && LA39_202 <= '@')||(LA39_202 >= '[' && LA39_202 <= '^')||LA39_202=='`'||(LA39_202 >= '{' && LA39_202 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA39_258 = input.LA(1);

                        s = -1;
                        if ( ((LA39_258 >= '\u0000' && LA39_258 <= '\t')||(LA39_258 >= '\u000B' && LA39_258 <= '\f')||(LA39_258 >= '\u000E' && LA39_258 <= '!')||(LA39_258 >= '#' && LA39_258 <= '\u2027')||(LA39_258 >= '\u202A' && LA39_258 <= '\uFFFF')) ) {s = 256;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA39_332 = input.LA(1);

                        s = -1;
                        if ( (LA39_332=='\"') ) {s = 365;}

                        else if ( ((LA39_332 >= '\u0000' && LA39_332 <= '!')||(LA39_332 >= '#' && LA39_332 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA39_345 = input.LA(1);

                        s = -1;
                        if ( (LA39_345==';') ) {s = 258;}

                        else if ( ((LA39_345 >= '\u0000' && LA39_345 <= '\t')||(LA39_345 >= '\u000B' && LA39_345 <= '\f')||(LA39_345 >= '\u000E' && LA39_345 <= '!')||(LA39_345 >= '#' && LA39_345 <= '.')||LA39_345==':'||(LA39_345 >= '<' && LA39_345 <= '@')||(LA39_345 >= '[' && LA39_345 <= '^')||LA39_345=='`'||(LA39_345 >= '{' && LA39_345 <= '\u2027')||(LA39_345 >= '\u202A' && LA39_345 <= '\uFFFF')) ) {s = 256;}

                        else if ( (LA39_345=='/') ) {s = 257;}

                        else if ( ((LA39_345 >= '0' && LA39_345 <= '9')||(LA39_345 >= 'A' && LA39_345 <= 'Z')||LA39_345=='_'||(LA39_345 >= 'a' && LA39_345 <= 'z')) ) {s = 345;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA39_200 = input.LA(1);

                        s = -1;
                        if ( ((LA39_200 >= '0' && LA39_200 <= '9')||(LA39_200 >= 'A' && LA39_200 <= 'Z')||LA39_200=='_'||(LA39_200 >= 'a' && LA39_200 <= 'z')) ) {s = 245;}

                        else if ( (LA39_200==';') ) {s = 148;}

                        else if ( (LA39_200=='\"') ) {s = 149;}

                        else if ( (LA39_200=='/') ) {s = 147;}

                        else if ( ((LA39_200 >= '\u0000' && LA39_200 <= '!')||(LA39_200 >= '#' && LA39_200 <= '.')||LA39_200==':'||(LA39_200 >= '<' && LA39_200 <= '@')||(LA39_200 >= '[' && LA39_200 <= '^')||LA39_200=='`'||(LA39_200 >= '{' && LA39_200 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA39_305 = input.LA(1);

                        s = -1;
                        if ( ((LA39_305 >= '0' && LA39_305 <= '9')||(LA39_305 >= 'A' && LA39_305 <= 'Z')||LA39_305=='_'||(LA39_305 >= 'a' && LA39_305 <= 'z')) ) {s = 345;}

                        else if ( ((LA39_305 >= '\u0000' && LA39_305 <= '\t')||(LA39_305 >= '\u000B' && LA39_305 <= '\f')||(LA39_305 >= '\u000E' && LA39_305 <= '!')||(LA39_305 >= '#' && LA39_305 <= '.')||LA39_305==':'||(LA39_305 >= '<' && LA39_305 <= '@')||(LA39_305 >= '[' && LA39_305 <= '^')||LA39_305=='`'||(LA39_305 >= '{' && LA39_305 <= '\u2027')||(LA39_305 >= '\u202A' && LA39_305 <= '\uFFFF')) ) {s = 256;}

                        else if ( (LA39_305==';') ) {s = 258;}

                        else if ( (LA39_305=='/') ) {s = 257;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA39_148 = input.LA(1);

                        s = -1;
                        if ( (LA39_148=='\"') ) {s = 149;}

                        else if ( ((LA39_148 >= '\u0000' && LA39_148 <= '!')||(LA39_148 >= '#' && LA39_148 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA39_145 = input.LA(1);

                        s = -1;
                        if ( (LA39_145=='.') ) {s = 146;}

                        else if ( ((LA39_145 >= '0' && LA39_145 <= '9')||(LA39_145 >= 'A' && LA39_145 <= 'Z')||LA39_145=='_'||(LA39_145 >= 'a' && LA39_145 <= 'z')) ) {s = 145;}

                        else if ( (LA39_145=='/') ) {s = 147;}

                        else if ( (LA39_145==';') ) {s = 148;}

                        else if ( (LA39_145=='\"') ) {s = 149;}

                        else if ( ((LA39_145 >= '\u0000' && LA39_145 <= '!')||(LA39_145 >= '#' && LA39_145 <= '-')||LA39_145==':'||(LA39_145 >= '<' && LA39_145 <= '@')||(LA39_145 >= '[' && LA39_145 <= '^')||LA39_145=='`'||(LA39_145 >= '{' && LA39_145 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA39_95 = input.LA(1);

                        s = -1;
                        if ( ((LA39_95 >= 'A' && LA39_95 <= 'Z')||LA39_95=='_'||(LA39_95 >= 'a' && LA39_95 <= 'z')) ) {s = 150;}

                        else if ( (LA39_95=='[') ) {s = 95;}

                        else if ( ((LA39_95 >= '\u0000' && LA39_95 <= '@')||(LA39_95 >= '\\' && LA39_95 <= '^')||LA39_95=='`'||(LA39_95 >= '{' && LA39_95 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA39_204 = input.LA(1);

                        s = -1;
                        if ( ((LA39_204 >= '0' && LA39_204 <= '9')||(LA39_204 >= 'A' && LA39_204 <= 'Z')||LA39_204=='_'||(LA39_204 >= 'a' && LA39_204 <= 'z')) ) {s = 255;}

                        else if ( ((LA39_204 >= '\u0000' && LA39_204 <= '\t')||(LA39_204 >= '\u000B' && LA39_204 <= '\f')||(LA39_204 >= '\u000E' && LA39_204 <= '!')||(LA39_204 >= '#' && LA39_204 <= '.')||LA39_204==':'||(LA39_204 >= '<' && LA39_204 <= '@')||(LA39_204 >= '[' && LA39_204 <= '^')||LA39_204=='`'||(LA39_204 >= '{' && LA39_204 <= '\u2027')||(LA39_204 >= '\u202A' && LA39_204 <= '\uFFFF')) ) {s = 256;}

                        else if ( (LA39_204=='/') ) {s = 257;}

                        else if ( (LA39_204==';') ) {s = 258;}

                        else s = 254;

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA39_94 = input.LA(1);

                        s = -1;
                        if ( ((LA39_94 >= '0' && LA39_94 <= '9')||(LA39_94 >= 'A' && LA39_94 <= 'Z')||LA39_94=='_'||(LA39_94 >= 'a' && LA39_94 <= 'z')) ) {s = 145;}

                        else if ( (LA39_94=='.') ) {s = 146;}

                        else if ( (LA39_94=='/') ) {s = 147;}

                        else if ( (LA39_94==';') ) {s = 148;}

                        else if ( (LA39_94=='\"') ) {s = 149;}

                        else if ( ((LA39_94 >= '\u0000' && LA39_94 <= '!')||(LA39_94 >= '#' && LA39_94 <= '-')||LA39_94==':'||(LA39_94 >= '<' && LA39_94 <= '@')||(LA39_94 >= '[' && LA39_94 <= '^')||LA39_94=='`'||(LA39_94 >= '{' && LA39_94 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA39_36 = input.LA(1);

                        s = -1;
                        if ( ((LA39_36 >= 'A' && LA39_36 <= 'Z')||LA39_36=='_'||(LA39_36 >= 'a' && LA39_36 <= 'z')) ) {s = 94;}

                        else if ( (LA39_36=='[') ) {s = 95;}

                        else if ( ((LA39_36 >= '\u0000' && LA39_36 <= '@')||(LA39_36 >= '\\' && LA39_36 <= '^')||LA39_36=='`'||(LA39_36 >= '{' && LA39_36 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA39_255 = input.LA(1);

                        s = -1;
                        if ( ((LA39_255 >= '0' && LA39_255 <= '9')||(LA39_255 >= 'A' && LA39_255 <= 'Z')||LA39_255=='_'||(LA39_255 >= 'a' && LA39_255 <= 'z')) ) {s = 255;}

                        else if ( ((LA39_255 >= '\u0000' && LA39_255 <= '\t')||(LA39_255 >= '\u000B' && LA39_255 <= '\f')||(LA39_255 >= '\u000E' && LA39_255 <= '!')||(LA39_255 >= '#' && LA39_255 <= '.')||LA39_255==':'||(LA39_255 >= '<' && LA39_255 <= '@')||(LA39_255 >= '[' && LA39_255 <= '^')||LA39_255=='`'||(LA39_255 >= '{' && LA39_255 <= '\u2027')||(LA39_255 >= '\u202A' && LA39_255 <= '\uFFFF')) ) {s = 256;}

                        else if ( (LA39_255=='/') ) {s = 257;}

                        else if ( (LA39_255==';') ) {s = 258;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA39_147 = input.LA(1);

                        s = -1;
                        if ( ((LA39_147 >= 'A' && LA39_147 <= 'Z')||LA39_147=='_'||(LA39_147 >= 'a' && LA39_147 <= 'z')) ) {s = 200;}

                        else if ( ((LA39_147 >= '\u0000' && LA39_147 <= '@')||(LA39_147 >= '[' && LA39_147 <= '^')||LA39_147=='`'||(LA39_147 >= '{' && LA39_147 <= '\uFFFF')) ) {s = 96;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}