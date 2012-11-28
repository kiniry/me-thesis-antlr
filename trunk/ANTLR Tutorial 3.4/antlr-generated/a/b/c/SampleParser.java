// $ANTLR 3.4 C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g 2012-11-20 12:43:37

	package a.b.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SampleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ACCESS_FLAGS", "ARGS", "ASSIGN", "BYTES", "Boolean_type", "CHAR", "CHECKSUM", "CLASS", "CLASSFILE", "CODE", "COLON", "COMMA", "COMMENT", "COMPILED", "CONSTANTPOOL", "CTOR", "Constant_pool_index", "Constant_type_UTF8", "DATE", "DCTOR", "DEFAULT", "DIGIT", "DOT", "ESC_SEQ", "EXCEPTIONS", "EXPONENT", "EXTENDS", "FINAL", "FLAGS", "FLOAT", "Floating_point_type", "HASH", "HEX_DIGIT", "HEX_DIGITS", "IDENTIFIER", "IMPLEMENTS", "INT", "INTERFACE", "Integral_type", "JAVABYTECODEFILE", "JAVAFILETYPE", "LBRACE", "LBRACK", "LETTER", "LOCALS", "LOOKUPSWITCH", "LPAREN", "MAJORVERSION", "MINORVERSION", "MINUS", "MODIFIED", "NATIVE", "NL", "Numeric_type", "OCTAL_ESC", "PATH", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "PrimitiveType", "QUOTE", "QUOTED_STRING", "QuotedTypeIdentifier", "RBRACE", "RBRACK", "REGULAR_STRING_LITERAL_CHARACTER", "RETURN", "RPAREN", "SEMI", "SIGNATURE", "SIMPLE_ESCAPE_SEQUENCE", "SINGLE_REGULAR_STRING_LITERAL_CHARACTER", "SIZE", "SLASH", "SOURCEFILE", "STACK", "STATIC", "STRING", "SYNCHRONIZED", "TABLESWITCH", "THROWS", "TRANSIENT", "TypeIdentifier", "UNDERSCORE", "UNICODE_ESCAPE_SEQUENCE", "UTF8TYPE", "VOLATILE", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SampleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SampleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SampleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g"; }



    // $ANTLR start "checksum_file_info"
    // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:11:1: checksum_file_info : CHECKSUM HEX_DIGITS ;
    public final void checksum_file_info() throws RecognitionException {
        try {
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:12:2: ( CHECKSUM HEX_DIGITS )
            // C:\\Users\\Zeor\\workspace\\ANTLR Tutorial 3.4\\src\\a\\b\\c\\Sample.g:12:4: CHECKSUM HEX_DIGITS
            {
            match(input,CHECKSUM,FOLLOW_CHECKSUM_in_checksum_file_info31); 

            match(input,HEX_DIGITS,FOLLOW_HEX_DIGITS_in_checksum_file_info33); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "checksum_file_info"

    // Delegated rules


 

    public static final BitSet FOLLOW_CHECKSUM_in_checksum_file_info31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HEX_DIGITS_in_checksum_file_info33 = new BitSet(new long[]{0x0000000000000002L});

}