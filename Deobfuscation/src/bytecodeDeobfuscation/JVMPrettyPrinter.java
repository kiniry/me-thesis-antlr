// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g 2013-01-18 12:17:26

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class JVMPrettyPrinter extends TreeParser {
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


    public JVMPrettyPrinter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public JVMPrettyPrinter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("JVMPrettyPrinterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return JVMPrettyPrinter.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g"; }


    public static class program_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "program"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:18:1: program : (s+= class_file )* -> prog(cs=$s);
    public final JVMPrettyPrinter.program_return program() throws RecognitionException {
        JVMPrettyPrinter.program_return retval = new JVMPrettyPrinter.program_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:18:9: ( (s+= class_file )* -> prog(cs=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:18:11: (s+= class_file )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:18:11: (s+= class_file )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CLASSFILE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:18:12: s+= class_file
            	    {
            	    pushFollow(FOLLOW_class_file_in_program58);
            	    s=class_file();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 18:29: -> prog(cs=$s)
            {
                retval.st = templateLib.getInstanceOf("prog",new STAttrMap().put("cs", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_file"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:21:1: class_file : ^( CLASSFILE ^( CFHEADER ch= class_file_header ) cd= classDefinition ) -> classFile(header=$ch.stbody=$cd.st);
    public final JVMPrettyPrinter.class_file_return class_file() throws RecognitionException {
        JVMPrettyPrinter.class_file_return retval = new JVMPrettyPrinter.class_file_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.class_file_header_return ch =null;

        JVMPrettyPrinter.classDefinition_return cd =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:22:3: ( ^( CLASSFILE ^( CFHEADER ch= class_file_header ) cd= classDefinition ) -> classFile(header=$ch.stbody=$cd.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:22:5: ^( CLASSFILE ^( CFHEADER ch= class_file_header ) cd= classDefinition )
            {
            match(input,CLASSFILE,FOLLOW_CLASSFILE_in_class_file85); 

            match(input, Token.DOWN, null); 
            match(input,CFHEADER,FOLLOW_CFHEADER_in_class_file88); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_class_file_header_in_class_file92);
            ch=class_file_header();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_classDefinition_in_class_file97);
            cd=classDefinition();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 23:11: -> classFile(header=$ch.stbody=$cd.st)
            {
                retval.st = templateLib.getInstanceOf("classFile",new STAttrMap().put("header", (ch!=null?ch.st:null)).put("body", (cd!=null?cd.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_file_header"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:26:1: class_file_header : a= class_file_info b= modified_file_info c= checksum_file_info (d= compiled_file_info )? -> classFileHeader(f=$a.sts=$b.stt=$c.stq=$d.st);
    public final JVMPrettyPrinter.class_file_header_return class_file_header() throws RecognitionException {
        JVMPrettyPrinter.class_file_header_return retval = new JVMPrettyPrinter.class_file_header_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.class_file_info_return a =null;

        JVMPrettyPrinter.modified_file_info_return b =null;

        JVMPrettyPrinter.checksum_file_info_return c =null;

        JVMPrettyPrinter.compiled_file_info_return d =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:27:3: (a= class_file_info b= modified_file_info c= checksum_file_info (d= compiled_file_info )? -> classFileHeader(f=$a.sts=$b.stt=$c.stq=$d.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:27:5: a= class_file_info b= modified_file_info c= checksum_file_info (d= compiled_file_info )?
            {
            pushFollow(FOLLOW_class_file_info_in_class_file_header139);
            a=class_file_info();

            state._fsp--;


            pushFollow(FOLLOW_modified_file_info_in_class_file_header145);
            b=modified_file_info();

            state._fsp--;


            pushFollow(FOLLOW_checksum_file_info_in_class_file_header153);
            c=checksum_file_info();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:30:6: (d= compiled_file_info )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:30:6: d= compiled_file_info
                    {
                    pushFollow(FOLLOW_compiled_file_info_in_class_file_header161);
                    d=compiled_file_info();

                    state._fsp--;


                    }
                    break;

            }


            // TEMPLATE REWRITE
            // 30:28: -> classFileHeader(f=$a.sts=$b.stt=$c.stq=$d.st)
            {
                retval.st = templateLib.getInstanceOf("classFileHeader",new STAttrMap().put("f", (a!=null?a.st:null)).put("s", (b!=null?b.st:null)).put("t", (c!=null?c.st:null)).put("q", (d!=null?d.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:33:1: class_file_info : ^( IDENTIFIER WINDOWSPATH ) -> classFileInfo(desc=$IDENTIFIER.textpath=$WINDOWSPATH.text);
    public final JVMPrettyPrinter.class_file_info_return class_file_info() throws RecognitionException {
        JVMPrettyPrinter.class_file_info_return retval = new JVMPrettyPrinter.class_file_info_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER1=null;
        CommonTree WINDOWSPATH2=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:34:3: ( ^( IDENTIFIER WINDOWSPATH ) -> classFileInfo(desc=$IDENTIFIER.textpath=$WINDOWSPATH.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:34:5: ^( IDENTIFIER WINDOWSPATH )
            {
            IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_file_info201); 

            match(input, Token.DOWN, null); 
            WINDOWSPATH2=(CommonTree)match(input,WINDOWSPATH,FOLLOW_WINDOWSPATH_in_class_file_info203); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 34:33: -> classFileInfo(desc=$IDENTIFIER.textpath=$WINDOWSPATH.text)
            {
                retval.st = templateLib.getInstanceOf("classFileInfo",new STAttrMap().put("desc", (IDENTIFIER1!=null?IDENTIFIER1.getText():null)).put("path", (WINDOWSPATH2!=null?WINDOWSPATH2.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "modified_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:37:1: modified_file_info : ^(id1= IDENTIFIER id2= IDENTIFIER date= DATE id3= IDENTIFIER int1= INTLITERAL id4= IDENTIFIER ) -> modifiedFileInfo(id1=$id1.textid2=$id2.textdate=$date.textid3=$id3.textint1=$int1.textid4=$id4.text);
    public final JVMPrettyPrinter.modified_file_info_return modified_file_info() throws RecognitionException {
        JVMPrettyPrinter.modified_file_info_return retval = new JVMPrettyPrinter.modified_file_info_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree date=null;
        CommonTree id3=null;
        CommonTree int1=null;
        CommonTree id4=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:38:3: ( ^(id1= IDENTIFIER id2= IDENTIFIER date= DATE id3= IDENTIFIER int1= INTLITERAL id4= IDENTIFIER ) -> modifiedFileInfo(id1=$id1.textid2=$id2.textdate=$date.textid3=$id3.textint1=$int1.textid4=$id4.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:38:5: ^(id1= IDENTIFIER id2= IDENTIFIER date= DATE id3= IDENTIFIER int1= INTLITERAL id4= IDENTIFIER )
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info239); 

            match(input, Token.DOWN, null); 
            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info243); 

            date=(CommonTree)match(input,DATE,FOLLOW_DATE_in_modified_file_info247); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info251); 

            int1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_modified_file_info255); 

            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_modified_file_info259); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 39:11: -> modifiedFileInfo(id1=$id1.textid2=$id2.textdate=$date.textid3=$id3.textint1=$int1.textid4=$id4.text)
            {
                retval.st = templateLib.getInstanceOf("modifiedFileInfo",new STAttrMap().put("id1", (id1!=null?id1.getText():null)).put("id2", (id2!=null?id2.getText():null)).put("date", (date!=null?date.getText():null)).put("id3", (id3!=null?id3.getText():null)).put("int1", (int1!=null?int1.getText():null)).put("id4", (id4!=null?id4.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "checksum_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:42:1: checksum_file_info : ^( IDENTIFIER IDENTIFIER HexDigits ) -> checksumFileInfo(hexNumber=$HexDigits.text);
    public final JVMPrettyPrinter.checksum_file_info_return checksum_file_info() throws RecognitionException {
        JVMPrettyPrinter.checksum_file_info_return retval = new JVMPrettyPrinter.checksum_file_info_return();
        retval.start = input.LT(1);


        CommonTree HexDigits3=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:43:3: ( ^( IDENTIFIER IDENTIFIER HexDigits ) -> checksumFileInfo(hexNumber=$HexDigits.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:43:5: ^( IDENTIFIER IDENTIFIER HexDigits )
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info316); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_checksum_file_info318); 

            HexDigits3=(CommonTree)match(input,HexDigits,FOLLOW_HexDigits_in_checksum_file_info320); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 44:11: -> checksumFileInfo(hexNumber=$HexDigits.text)
            {
                retval.st = templateLib.getInstanceOf("checksumFileInfo",new STAttrMap().put("hexNumber", (HexDigits3!=null?HexDigits3.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "compiled_file_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:47:1: compiled_file_info : ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) -> compiledFileInfo(fileName=$STRINGLITERAL.text);
    public final JVMPrettyPrinter.compiled_file_info_return compiled_file_info() throws RecognitionException {
        JVMPrettyPrinter.compiled_file_info_return retval = new JVMPrettyPrinter.compiled_file_info_return();
        retval.start = input.LT(1);


        CommonTree STRINGLITERAL4=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:48:3: ( ^( IDENTIFIER IDENTIFIER STRINGLITERAL ) -> compiledFileInfo(fileName=$STRINGLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:48:5: ^( IDENTIFIER IDENTIFIER STRINGLITERAL )
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info359); 

            match(input, Token.DOWN, null); 
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compiled_file_info361); 

            STRINGLITERAL4=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_compiled_file_info363); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 49:13: -> compiledFileInfo(fileName=$STRINGLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("compiledFileInfo",new STAttrMap().put("fileName", (STRINGLITERAL4!=null?STRINGLITERAL4.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "classDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:56:1: classDefinition : ^( CLASSDECL ^( VMODIFIER (cvm= class_visual_modifier )? ) ^( MODIFIER (cm+= class_modifier )* ) n= typeName ^( TPARAMETERS (typeParams= typeParameters )? ) ^( CEXTENDS (ex= typeList )? ) ^( CIMPLEMENTS (impl= typeList )? ) ^( UNITHEADER inf= type_info1 ) ^( CPOOL c= constant_pool ) ^( UNITBODY (bodyPrint= classBody )? ) ) -> classDecl(vm=$cvm.stm=$cmcn=$n.sttypeParams=$typeParams.stext=$ex.stimpl=$impl.stinfo=$inf.stcp=$c.stbody=$bodyPrint.st);
    public final JVMPrettyPrinter.classDefinition_return classDefinition() throws RecognitionException {
        JVMPrettyPrinter.classDefinition_return retval = new JVMPrettyPrinter.classDefinition_return();
        retval.start = input.LT(1);


        List list_cm=null;
        JVMPrettyPrinter.class_visual_modifier_return cvm =null;

        JVMPrettyPrinter.typeName_return n =null;

        JVMPrettyPrinter.typeParameters_return typeParams =null;

        JVMPrettyPrinter.typeList_return ex =null;

        JVMPrettyPrinter.typeList_return impl =null;

        JVMPrettyPrinter.type_info1_return inf =null;

        JVMPrettyPrinter.constant_pool_return c =null;

        JVMPrettyPrinter.classBody_return bodyPrint =null;

        RuleReturnScope cm = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:3: ( ^( CLASSDECL ^( VMODIFIER (cvm= class_visual_modifier )? ) ^( MODIFIER (cm+= class_modifier )* ) n= typeName ^( TPARAMETERS (typeParams= typeParameters )? ) ^( CEXTENDS (ex= typeList )? ) ^( CIMPLEMENTS (impl= typeList )? ) ^( UNITHEADER inf= type_info1 ) ^( CPOOL c= constant_pool ) ^( UNITBODY (bodyPrint= classBody )? ) ) -> classDecl(vm=$cvm.stm=$cmcn=$n.sttypeParams=$typeParams.stext=$ex.stimpl=$impl.stinfo=$inf.stcp=$c.stbody=$bodyPrint.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:5: ^( CLASSDECL ^( VMODIFIER (cvm= class_visual_modifier )? ) ^( MODIFIER (cm+= class_modifier )* ) n= typeName ^( TPARAMETERS (typeParams= typeParameters )? ) ^( CEXTENDS (ex= typeList )? ) ^( CIMPLEMENTS (impl= typeList )? ) ^( UNITHEADER inf= type_info1 ) ^( CPOOL c= constant_pool ) ^( UNITBODY (bodyPrint= classBody )? ) )
            {
            match(input,CLASSDECL,FOLLOW_CLASSDECL_in_classDefinition404); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_classDefinition408); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:33: (cvm= class_visual_modifier )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PUBLIC) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:33: cvm= class_visual_modifier
                        {
                        pushFollow(FOLLOW_class_visual_modifier_in_classDefinition412);
                        cvm=class_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_classDefinition417); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:69: (cm+= class_modifier )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ABSTRACT||LA4_0==CLASS||LA4_0==FINAL||LA4_0==INTERFACE) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:70: cm+= class_modifier
                	    {
                	    pushFollow(FOLLOW_class_modifier_in_classDefinition422);
                	    cm=class_modifier();

                	    state._fsp--;

                	    if (list_cm==null) list_cm=new ArrayList();
                	    list_cm.add(cm.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            pushFollow(FOLLOW_typeName_in_classDefinition429);
            n=typeName();

            state._fsp--;


            match(input,TPARAMETERS,FOLLOW_TPARAMETERS_in_classDefinition432); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:127: (typeParams= typeParameters )?
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER) ) {
                    alt5=1;
                }
                switch (alt5) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:127: typeParams= typeParameters
                        {
                        pushFollow(FOLLOW_typeParameters_in_classDefinition436);
                        typeParams=typeParameters();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,CEXTENDS,FOLLOW_CEXTENDS_in_classDefinition441); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:158: (ex= typeList )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==BYTE||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||LA6_0==LONG||LA6_0==SHORT||LA6_0==UNITNAME||LA6_0==VOID) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:158: ex= typeList
                        {
                        pushFollow(FOLLOW_typeList_in_classDefinition445);
                        ex=typeList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,CIMPLEMENTS,FOLLOW_CIMPLEMENTS_in_classDefinition450); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:188: (impl= typeList )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BOOLEAN||LA7_0==BYTE||LA7_0==CHAR||LA7_0==DOUBLE||LA7_0==FLOAT||LA7_0==INT||LA7_0==LONG||LA7_0==SHORT||LA7_0==UNITNAME||LA7_0==VOID) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:57:188: impl= typeList
                        {
                        pushFollow(FOLLOW_typeList_in_classDefinition454);
                        impl=typeList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_classDefinition475); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_info1_in_classDefinition479);
            inf=type_info1();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,CPOOL,FOLLOW_CPOOL_in_classDefinition499); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constant_pool_in_classDefinition503);
            c=constant_pool();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_classDefinition523); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:60:37: (bodyPrint= classBody )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CTORDECL||LA8_0==FIELDDECL||LA8_0==METHODDECL||LA8_0==STATICCTORDECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:60:37: bodyPrint= classBody
                        {
                        pushFollow(FOLLOW_classBody_in_classDefinition527);
                        bodyPrint=classBody();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 61:19: -> classDecl(vm=$cvm.stm=$cmcn=$n.sttypeParams=$typeParams.stext=$ex.stimpl=$impl.stinfo=$inf.stcp=$c.stbody=$bodyPrint.st)
            {
                retval.st = templateLib.getInstanceOf("classDecl",new STAttrMap().put("vm", (cvm!=null?cvm.st:null)).put("m", list_cm).put("cn", (n!=null?n.st:null)).put("typeParams", (typeParams!=null?typeParams.st:null)).put("ext", (ex!=null?ex.st:null)).put("impl", (impl!=null?impl.st:null)).put("info", (inf!=null?inf.st:null)).put("cp", (c!=null?c.st:null)).put("body", (bodyPrint!=null?bodyPrint.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:68:1: class_visual_modifier : PUBLIC -> noformat(f=$PUBLIC.text);
    public final JVMPrettyPrinter.class_visual_modifier_return class_visual_modifier() throws RecognitionException {
        JVMPrettyPrinter.class_visual_modifier_return retval = new JVMPrettyPrinter.class_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree PUBLIC5=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:69:3: ( PUBLIC -> noformat(f=$PUBLIC.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:69:5: PUBLIC
            {
            PUBLIC5=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_class_visual_modifier721); 

            // TEMPLATE REWRITE
            // 69:17: -> noformat(f=$PUBLIC.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PUBLIC5!=null?PUBLIC5.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:72:1: class_modifier : ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| INTERFACE -> noformat(f=$INTERFACE.text)| CLASS -> noformat(f=$CLASS.text));
    public final JVMPrettyPrinter.class_modifier_return class_modifier() throws RecognitionException {
        JVMPrettyPrinter.class_modifier_return retval = new JVMPrettyPrinter.class_modifier_return();
        retval.start = input.LT(1);


        CommonTree ABSTRACT6=null;
        CommonTree FINAL7=null;
        CommonTree INTERFACE8=null;
        CommonTree CLASS9=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:73:3: ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| INTERFACE -> noformat(f=$INTERFACE.text)| CLASS -> noformat(f=$CLASS.text))
            int alt9=4;
            switch ( input.LA(1) ) {
            case ABSTRACT:
                {
                alt9=1;
                }
                break;
            case FINAL:
                {
                alt9=2;
                }
                break;
            case INTERFACE:
                {
                alt9=3;
                }
                break;
            case CLASS:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:73:5: ABSTRACT
                    {
                    ABSTRACT6=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_class_modifier752); 

                    // TEMPLATE REWRITE
                    // 73:19: -> noformat(f=$ABSTRACT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (ABSTRACT6!=null?ABSTRACT6.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:74:5: FINAL
                    {
                    FINAL7=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_class_modifier772); 

                    // TEMPLATE REWRITE
                    // 74:15: -> noformat(f=$FINAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FINAL7!=null?FINAL7.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:75:5: INTERFACE
                    {
                    INTERFACE8=(CommonTree)match(input,INTERFACE,FOLLOW_INTERFACE_in_class_modifier791); 

                    // TEMPLATE REWRITE
                    // 75:19: -> noformat(f=$INTERFACE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERFACE8!=null?INTERFACE8.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:76:5: CLASS
                    {
                    CLASS9=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_class_modifier810); 

                    // TEMPLATE REWRITE
                    // 76:15: -> noformat(f=$CLASS.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CLASS9!=null?CLASS9.getText():null)));
                    }



                    }
                    break;

            }
        }
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


    public static class type_info1_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "type_info1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:82:1: type_info1 : (s+= type_info2 )+ -> nlSeparatedList(ls=$s);
    public final JVMPrettyPrinter.type_info1_return type_info1() throws RecognitionException {
        JVMPrettyPrinter.type_info1_return retval = new JVMPrettyPrinter.type_info1_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:83:3: ( (s+= type_info2 )+ -> nlSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:83:5: (s+= type_info2 )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:83:5: (s+= type_info2 )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Deprecated||LA10_0==EnclosingMethod||LA10_0==Flag||LA10_0==IDENTIFIER||LA10_0==InnerClasses||LA10_0==RuntimeVisibleAnnotations||(LA10_0 >= Scala && LA10_0 <= SourceFile)||LA10_0==Synthetic) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:83:6: s+= type_info2
            	    {
            	    pushFollow(FOLLOW_type_info2_in_type_info1842);
            	    s=type_info2();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // TEMPLATE REWRITE
            // 83:25: -> nlSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("nlSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_info1"


    public static class type_info2_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "type_info2"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:86:1: type_info2 : (s1= sourcefile_info -> noformat(f=$s1.st)|s2= minor_major_version_info -> noformat(f=$s2.st)|s3= flags -> noformat(f=$s3.st)|s4= scalaSig_info -> noformat(f=$s4.st)|s5= runtimeVisibleAnnotations_info -> noformat(f=$s5.st)|s6= innerclass_info -> noformat(f=$s6.st)|s7= enclosingMethod -> noformat(f=$s7.st)|s8= signature_info_addition -> noformat(f=$s8.st)|s9= deprecated -> noformat(f=$s9.st)|s10= synthetic -> noformat(f=$s10.st)|s11= scala_info -> noformat(f=$s11.st));
    public final JVMPrettyPrinter.type_info2_return type_info2() throws RecognitionException {
        JVMPrettyPrinter.type_info2_return retval = new JVMPrettyPrinter.type_info2_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.sourcefile_info_return s1 =null;

        JVMPrettyPrinter.minor_major_version_info_return s2 =null;

        JVMPrettyPrinter.flags_return s3 =null;

        JVMPrettyPrinter.scalaSig_info_return s4 =null;

        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return s5 =null;

        JVMPrettyPrinter.innerclass_info_return s6 =null;

        JVMPrettyPrinter.enclosingMethod_return s7 =null;

        JVMPrettyPrinter.signature_info_addition_return s8 =null;

        JVMPrettyPrinter.deprecated_return s9 =null;

        JVMPrettyPrinter.synthetic_return s10 =null;

        JVMPrettyPrinter.scala_info_return s11 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:87:3: (s1= sourcefile_info -> noformat(f=$s1.st)|s2= minor_major_version_info -> noformat(f=$s2.st)|s3= flags -> noformat(f=$s3.st)|s4= scalaSig_info -> noformat(f=$s4.st)|s5= runtimeVisibleAnnotations_info -> noformat(f=$s5.st)|s6= innerclass_info -> noformat(f=$s6.st)|s7= enclosingMethod -> noformat(f=$s7.st)|s8= signature_info_addition -> noformat(f=$s8.st)|s9= deprecated -> noformat(f=$s9.st)|s10= synthetic -> noformat(f=$s10.st)|s11= scala_info -> noformat(f=$s11.st))
            int alt11=11;
            switch ( input.LA(1) ) {
            case SourceFile:
                {
                alt11=1;
                }
                break;
            case IDENTIFIER:
                {
                alt11=2;
                }
                break;
            case Flag:
                {
                alt11=3;
                }
                break;
            case ScalaSig:
                {
                alt11=4;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt11=5;
                }
                break;
            case InnerClasses:
                {
                alt11=6;
                }
                break;
            case EnclosingMethod:
                {
                alt11=7;
                }
                break;
            case Signature:
                {
                alt11=8;
                }
                break;
            case Deprecated:
                {
                alt11=9;
                }
                break;
            case Synthetic:
                {
                alt11=10;
                }
                break;
            case Scala:
                {
                alt11=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:87:5: s1= sourcefile_info
                    {
                    pushFollow(FOLLOW_sourcefile_info_in_type_info2871);
                    s1=sourcefile_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 87:29: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:88:5: s2= minor_major_version_info
                    {
                    pushFollow(FOLLOW_minor_major_version_info_in_type_info2893);
                    s2=minor_major_version_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 88:35: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:89:5: s3= flags
                    {
                    pushFollow(FOLLOW_flags_in_type_info2912);
                    s3=flags();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 89:21: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:90:5: s4= scalaSig_info
                    {
                    pushFollow(FOLLOW_scalaSig_info_in_type_info2936);
                    s4=scalaSig_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 90:27: -> noformat(f=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s4!=null?s4.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:91:5: s5= runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_type_info2958);
                    s5=runtimeVisibleAnnotations_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 91:39: -> noformat(f=$s5.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s5!=null?s5.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:92:5: s6= innerclass_info
                    {
                    pushFollow(FOLLOW_innerclass_info_in_type_info2975);
                    s6=innerclass_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 92:29: -> noformat(f=$s6.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s6!=null?s6.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:93:5: s7= enclosingMethod
                    {
                    pushFollow(FOLLOW_enclosingMethod_in_type_info2997);
                    s7=enclosingMethod();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 93:29: -> noformat(f=$s7.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s7!=null?s7.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:94:5: s8= signature_info_addition
                    {
                    pushFollow(FOLLOW_signature_info_addition_in_type_info21019);
                    s8=signature_info_addition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 94:35: -> noformat(f=$s8.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s8!=null?s8.st:null)));
                    }



                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:95:5: s9= deprecated
                    {
                    pushFollow(FOLLOW_deprecated_in_type_info21039);
                    s9=deprecated();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 95:23: -> noformat(f=$s9.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s9!=null?s9.st:null)));
                    }



                    }
                    break;
                case 10 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:96:5: s10= synthetic
                    {
                    pushFollow(FOLLOW_synthetic_in_type_info21060);
                    s10=synthetic();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 96:23: -> noformat(f=$s10.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s10!=null?s10.st:null)));
                    }



                    }
                    break;
                case 11 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:97:5: s11= scala_info
                    {
                    pushFollow(FOLLOW_scala_info_in_type_info21081);
                    s11=scala_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 97:25: -> noformat(f=$s11.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s11!=null?s11.st:null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_info2"


    public static class synthetic_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "synthetic"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:100:1: synthetic : ^( Synthetic BOOLEANLITERAL ) -> synt(b=$BOOLEANLITERAL.text);
    public final JVMPrettyPrinter.synthetic_return synthetic() throws RecognitionException {
        JVMPrettyPrinter.synthetic_return retval = new JVMPrettyPrinter.synthetic_return();
        retval.start = input.LT(1);


        CommonTree BOOLEANLITERAL10=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:101:3: ( ^( Synthetic BOOLEANLITERAL ) -> synt(b=$BOOLEANLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:101:5: ^( Synthetic BOOLEANLITERAL )
            {
            match(input,Synthetic,FOLLOW_Synthetic_in_synthetic1109); 

            match(input, Token.DOWN, null); 
            BOOLEANLITERAL10=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_synthetic1111); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 101:33: -> synt(b=$BOOLEANLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("synt",new STAttrMap().put("b", (BOOLEANLITERAL10!=null?BOOLEANLITERAL10.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "deprecated"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:104:1: deprecated : ^( Deprecated BOOLEANLITERAL ) -> depr(b=$BOOLEANLITERAL.text);
    public final JVMPrettyPrinter.deprecated_return deprecated() throws RecognitionException {
        JVMPrettyPrinter.deprecated_return retval = new JVMPrettyPrinter.deprecated_return();
        retval.start = input.LT(1);


        CommonTree BOOLEANLITERAL11=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:105:3: ( ^( Deprecated BOOLEANLITERAL ) -> depr(b=$BOOLEANLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:105:5: ^( Deprecated BOOLEANLITERAL )
            {
            match(input,Deprecated,FOLLOW_Deprecated_in_deprecated1135); 

            match(input, Token.DOWN, null); 
            BOOLEANLITERAL11=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_deprecated1137); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 105:33: -> depr(b=$BOOLEANLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("depr",new STAttrMap().put("b", (BOOLEANLITERAL11!=null?BOOLEANLITERAL11.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "enclosingMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:108:1: enclosingMethod : ^( EnclosingMethod c1= CPINDEX DOT c2= CPINDEX ) -> encl(cpin1=$c1.textcpin2=$c2.text);
    public final JVMPrettyPrinter.enclosingMethod_return enclosingMethod() throws RecognitionException {
        JVMPrettyPrinter.enclosingMethod_return retval = new JVMPrettyPrinter.enclosingMethod_return();
        retval.start = input.LT(1);


        CommonTree c1=null;
        CommonTree c2=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:109:3: ( ^( EnclosingMethod c1= CPINDEX DOT c2= CPINDEX ) -> encl(cpin1=$c1.textcpin2=$c2.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:109:5: ^( EnclosingMethod c1= CPINDEX DOT c2= CPINDEX )
            {
            match(input,EnclosingMethod,FOLLOW_EnclosingMethod_in_enclosingMethod1160); 

            match(input, Token.DOWN, null); 
            c1=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod1164); 

            match(input,DOT,FOLLOW_DOT_in_enclosingMethod1166); 

            c2=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_enclosingMethod1170); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 110:11: -> encl(cpin1=$c1.textcpin2=$c2.text)
            {
                retval.st = templateLib.getInstanceOf("encl",new STAttrMap().put("cpin1", (c1!=null?c1.getText():null)).put("cpin2", (c2!=null?c2.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "sourcefile_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:113:1: sourcefile_info : ^( SourceFile STRINGLITERAL ) -> srcFile(file=$STRINGLITERAL.text);
    public final JVMPrettyPrinter.sourcefile_info_return sourcefile_info() throws RecognitionException {
        JVMPrettyPrinter.sourcefile_info_return retval = new JVMPrettyPrinter.sourcefile_info_return();
        retval.start = input.LT(1);


        CommonTree STRINGLITERAL12=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:114:3: ( ^( SourceFile STRINGLITERAL ) -> srcFile(file=$STRINGLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:114:5: ^( SourceFile STRINGLITERAL )
            {
            match(input,SourceFile,FOLLOW_SourceFile_in_sourcefile_info1209); 

            match(input, Token.DOWN, null); 
            STRINGLITERAL12=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_sourcefile_info1211); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 115:13: -> srcFile(file=$STRINGLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("srcFile",new STAttrMap().put("file", (STRINGLITERAL12!=null?STRINGLITERAL12.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "scalaSig_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:118:1: scalaSig_info : ^( ScalaSig IDENTIFIER ASSIGN i1= INTLITERAL i2= INTLITERAL i3= INTLITERAL i4= INTLITERAL ) -> scalaSig(id1=$IDENTIFIER.textint1=$i1.textint2=$i2.textint3=$i3.textint4=$i4.text);
    public final JVMPrettyPrinter.scalaSig_info_return scalaSig_info() throws RecognitionException {
        JVMPrettyPrinter.scalaSig_info_return retval = new JVMPrettyPrinter.scalaSig_info_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree i3=null;
        CommonTree i4=null;
        CommonTree IDENTIFIER13=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:119:3: ( ^( ScalaSig IDENTIFIER ASSIGN i1= INTLITERAL i2= INTLITERAL i3= INTLITERAL i4= INTLITERAL ) -> scalaSig(id1=$IDENTIFIER.textint1=$i1.textint2=$i2.textint3=$i3.textint4=$i4.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:119:5: ^( ScalaSig IDENTIFIER ASSIGN i1= INTLITERAL i2= INTLITERAL i3= INTLITERAL i4= INTLITERAL )
            {
            match(input,ScalaSig,FOLLOW_ScalaSig_in_scalaSig_info1247); 

            match(input, Token.DOWN, null); 
            IDENTIFIER13=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scalaSig_info1261); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_scalaSig_info1263); 

            i1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info1267); 

            i2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info1285); 

            i3=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info1289); 

            i4=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scalaSig_info1293); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 122:21: -> scalaSig(id1=$IDENTIFIER.textint1=$i1.textint2=$i2.textint3=$i3.textint4=$i4.text)
            {
                retval.st = templateLib.getInstanceOf("scalaSig",new STAttrMap().put("id1", (IDENTIFIER13!=null?IDENTIFIER13.getText():null)).put("int1", (i1!=null?i1.getText():null)).put("int2", (i2!=null?i2.getText():null)).put("int3", (i3!=null?i3.getText():null)).put("int4", (i4!=null?i4.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "scala_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:125:1: scala_info : ^( Scala IDENTIFIER ASSIGN INTLITERAL ) -> scala(id1=$IDENTIFIER.textint1=$INTLITERAL.text);
    public final JVMPrettyPrinter.scala_info_return scala_info() throws RecognitionException {
        JVMPrettyPrinter.scala_info_return retval = new JVMPrettyPrinter.scala_info_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER14=null;
        CommonTree INTLITERAL15=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:126:3: ( ^( Scala IDENTIFIER ASSIGN INTLITERAL ) -> scala(id1=$IDENTIFIER.textint1=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:126:5: ^( Scala IDENTIFIER ASSIGN INTLITERAL )
            {
            match(input,Scala,FOLLOW_Scala_in_scala_info1357); 

            match(input, Token.DOWN, null); 
            IDENTIFIER14=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_scala_info1359); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_scala_info1361); 

            INTLITERAL15=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_scala_info1363); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 127:23: -> scala(id1=$IDENTIFIER.textint1=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("scala",new STAttrMap().put("id1", (IDENTIFIER14!=null?IDENTIFIER14.getText():null)).put("int1", (INTLITERAL15!=null?INTLITERAL15.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "signature_info_addition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:130:1: signature_info_addition : ^( Signature ( CPINDEX )? ) -> sign(v=$CPINDEX.text);
    public final JVMPrettyPrinter.signature_info_addition_return signature_info_addition() throws RecognitionException {
        JVMPrettyPrinter.signature_info_addition_return retval = new JVMPrettyPrinter.signature_info_addition_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX16=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:131:3: ( ^( Signature ( CPINDEX )? ) -> sign(v=$CPINDEX.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:131:5: ^( Signature ( CPINDEX )? )
            {
            match(input,Signature,FOLLOW_Signature_in_signature_info_addition1417); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:131:17: ( CPINDEX )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==CPINDEX) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:131:17: CPINDEX
                        {
                        CPINDEX16=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_signature_info_addition1419); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 131:27: -> sign(v=$CPINDEX.text)
            {
                retval.st = templateLib.getInstanceOf("sign",new STAttrMap().put("v", (CPINDEX16!=null?CPINDEX16.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "innerclass_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:134:1: innerclass_info : ^( InnerClasses (s+= innerclass_info_line )+ ) -> innerC(l=$s);
    public final JVMPrettyPrinter.innerclass_info_return innerclass_info() throws RecognitionException {
        JVMPrettyPrinter.innerclass_info_return retval = new JVMPrettyPrinter.innerclass_info_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:135:3: ( ^( InnerClasses (s+= innerclass_info_line )+ ) -> innerC(l=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:135:5: ^( InnerClasses (s+= innerclass_info_line )+ )
            {
            match(input,InnerClasses,FOLLOW_InnerClasses_in_innerclass_info1444); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:135:20: (s+= innerclass_info_line )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==VMODIFIER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:135:21: s+= innerclass_info_line
            	    {
            	    pushFollow(FOLLOW_innerclass_info_line_in_innerclass_info1449);
            	    s=innerclass_info_line();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 136:25: -> innerC(l=$s)
            {
                retval.st = templateLib.getInstanceOf("innerC",new STAttrMap().put("l", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "innerclass_info_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:139:1: innerclass_info_line : ^( VMODIFIER (s= method_visual_modifier )? ) ^( MODIFIER (m+= method_modifier )* ) i= innerclass_info_data -> innerCIL(vm=$s.stm=$miid=$i.st);
    public final JVMPrettyPrinter.innerclass_info_line_return innerclass_info_line() throws RecognitionException {
        JVMPrettyPrinter.innerclass_info_line_return retval = new JVMPrettyPrinter.innerclass_info_line_return();
        retval.start = input.LT(1);


        List list_m=null;
        JVMPrettyPrinter.method_visual_modifier_return s =null;

        JVMPrettyPrinter.innerclass_info_data_return i =null;

        RuleReturnScope m = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:3: ( ^( VMODIFIER (s= method_visual_modifier )? ) ^( MODIFIER (m+= method_modifier )* ) i= innerclass_info_data -> innerCIL(vm=$s.stm=$miid=$i.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:6: ^( VMODIFIER (s= method_visual_modifier )? ) ^( MODIFIER (m+= method_modifier )* ) i= innerclass_info_data
            {
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_innerclass_info_line1502); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:19: (s= method_visual_modifier )?
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0 >= PRIVATE && LA14_0 <= PUBLIC)) ) {
                    alt14=1;
                }
                switch (alt14) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:19: s= method_visual_modifier
                        {
                        pushFollow(FOLLOW_method_visual_modifier_in_innerclass_info_line1506);
                        s=method_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_innerclass_info_line1511); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:56: (m+= method_modifier )*
                loop15:
                do {
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ABSTRACT||LA15_0==FINAL||LA15_0==NATIVE||LA15_0==STATIC||LA15_0==STRICTFP||LA15_0==SYNCHRONIZED) ) {
                        alt15=1;
                    }


                    switch (alt15) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:140:57: m+= method_modifier
                	    {
                	    pushFollow(FOLLOW_method_modifier_in_innerclass_info_line1516);
                	    m=method_modifier();

                	    state._fsp--;

                	    if (list_m==null) list_m=new ArrayList();
                	    list_m.add(m.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop15;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            pushFollow(FOLLOW_innerclass_info_data_in_innerclass_info_line1523);
            i=innerclass_info_data();

            state._fsp--;


            // TEMPLATE REWRITE
            // 141:11: -> innerCIL(vm=$s.stm=$miid=$i.st)
            {
                retval.st = templateLib.getInstanceOf("innerCIL",new STAttrMap().put("vm", (s!=null?s.st:null)).put("m", list_m).put("iid", (i!=null?i.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "innerclass_info_data"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:144:1: innerclass_info_data : ^(cp1= CPINDEX ^( INFODATA1 ( ASSIGN cp2= CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER cp3= CPINDEX )? ) ) -> innerCID(f=$cp1.texts=$cp2.textt=$cp3.text);
    public final JVMPrettyPrinter.innerclass_info_data_return innerclass_info_data() throws RecognitionException {
        JVMPrettyPrinter.innerclass_info_data_return retval = new JVMPrettyPrinter.innerclass_info_data_return();
        retval.start = input.LT(1);


        CommonTree cp1=null;
        CommonTree cp2=null;
        CommonTree cp3=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:3: ( ^(cp1= CPINDEX ^( INFODATA1 ( ASSIGN cp2= CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER cp3= CPINDEX )? ) ) -> innerCID(f=$cp1.texts=$cp2.textt=$cp3.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:5: ^(cp1= CPINDEX ^( INFODATA1 ( ASSIGN cp2= CPINDEX )? ) ^( INFODATA2 ( IDENTIFIER cp3= CPINDEX )? ) )
            {
            cp1=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1566); 

            match(input, Token.DOWN, null); 
            match(input,INFODATA1,FOLLOW_INFODATA1_in_innerclass_info_data1569); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:31: ( ASSIGN cp2= CPINDEX )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ASSIGN) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:32: ASSIGN cp2= CPINDEX
                        {
                        match(input,ASSIGN,FOLLOW_ASSIGN_in_innerclass_info_data1572); 

                        cp2=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1576); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,INFODATA2,FOLLOW_INFODATA2_in_innerclass_info_data1582); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:66: ( IDENTIFIER cp3= CPINDEX )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:145:67: IDENTIFIER cp3= CPINDEX
                        {
                        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_innerclass_info_data1585); 

                        cp3=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_innerclass_info_data1589); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 146:11: -> innerCID(f=$cp1.texts=$cp2.textt=$cp3.text)
            {
                retval.st = templateLib.getInstanceOf("innerCID",new STAttrMap().put("f", (cp1!=null?cp1.getText():null)).put("s", (cp2!=null?cp2.getText():null)).put("t", (cp3!=null?cp3.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "minor_major_version_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:149:1: minor_major_version_info : ^(id1= IDENTIFIER id2= IDENTIFIER COLON INTLITERAL ) -> version(f=$id1.texts=$id2.textt=$INTLITERAL.text);
    public final JVMPrettyPrinter.minor_major_version_info_return minor_major_version_info() throws RecognitionException {
        JVMPrettyPrinter.minor_major_version_info_return retval = new JVMPrettyPrinter.minor_major_version_info_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree INTLITERAL17=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:150:3: ( ^(id1= IDENTIFIER id2= IDENTIFIER COLON INTLITERAL ) -> version(f=$id1.texts=$id2.textt=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:150:5: ^(id1= IDENTIFIER id2= IDENTIFIER COLON INTLITERAL )
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1640); 

            match(input, Token.DOWN, null); 
            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_minor_major_version_info1644); 

            match(input,COLON,FOLLOW_COLON_in_minor_major_version_info1646); 

            INTLITERAL17=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_minor_major_version_info1648); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 151:11: -> version(f=$id1.texts=$id2.textt=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("version",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", (INTLITERAL17!=null?INTLITERAL17.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "flags"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:154:1: flags : ^( Flag l= accessFlagList ) -> noformatWithspace2(f=$Flag.texts=$l.st);
    public final JVMPrettyPrinter.flags_return flags() throws RecognitionException {
        JVMPrettyPrinter.flags_return retval = new JVMPrettyPrinter.flags_return();
        retval.start = input.LT(1);


        CommonTree Flag18=null;
        JVMPrettyPrinter.accessFlagList_return l =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:155:3: ( ^( Flag l= accessFlagList ) -> noformatWithspace2(f=$Flag.texts=$l.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:155:5: ^( Flag l= accessFlagList )
            {
            Flag18=(CommonTree)match(input,Flag,FOLLOW_Flag_in_flags1696); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_accessFlagList_in_flags1700);
                l=accessFlagList();

                state._fsp--;


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 155:31: -> noformatWithspace2(f=$Flag.texts=$l.st)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Flag18!=null?Flag18.getText():null)).put("s", (l!=null?l.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "accessFlagList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:158:1: accessFlagList : (s+= flagType )* -> flags(ls=$s);
    public final JVMPrettyPrinter.accessFlagList_return accessFlagList() throws RecognitionException {
        JVMPrettyPrinter.accessFlagList_return retval = new JVMPrettyPrinter.accessFlagList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:159:3: ( (s+= flagType )* -> flags(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:159:5: (s+= flagType )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:159:5: (s+= flagType )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENTIFIER||LA18_0==INTLITERAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:159:6: s+= flagType
            	    {
            	    pushFollow(FOLLOW_flagType_in_accessFlagList1733);
            	    s=flagType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 159:23: -> flags(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("flags",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "flagType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:162:1: flagType : ( IDENTIFIER -> noformat(f=$IDENTIFIER.text)| INTLITERAL -> noformat(f=$INTLITERAL.text));
    public final JVMPrettyPrinter.flagType_return flagType() throws RecognitionException {
        JVMPrettyPrinter.flagType_return retval = new JVMPrettyPrinter.flagType_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER19=null;
        CommonTree INTLITERAL20=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:163:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text)| INTLITERAL -> noformat(f=$INTLITERAL.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:163:5: IDENTIFIER
                    {
                    IDENTIFIER19=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_flagType1760); 

                    // TEMPLATE REWRITE
                    // 163:21: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER19!=null?IDENTIFIER19.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:164:5: INTLITERAL
                    {
                    INTLITERAL20=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_flagType1780); 

                    // TEMPLATE REWRITE
                    // 164:21: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL20!=null?INTLITERAL20.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleAnnotations_info"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:172:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) ;
    public final JVMPrettyPrinter.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:3: ( ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:5: ^( RuntimeVisibleAnnotations ( runtimeVisibleAnnotationsItem )+ )
            {
            match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1817); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:33: ( runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:33: runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1819);
            	    runtimeVisibleAnnotationsItem();

            	    state._fsp--;


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


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:175:1: runtimeVisibleAnnotationsItem : ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:176:3: ( ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:176:5: ^( CPINDEX pc ( runtimeVisibleAnnotationAssignList )? )
            {
            match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1834); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem1836);
            pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:176:18: ( runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:176:18: runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1838);
                    runtimeVisibleAnnotationAssignList();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:178:1: runtimeVisibleAnnotationAssignList : ( annotationAssign )+ ;
    public final JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:179:3: ( ( annotationAssign )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:179:5: ( annotationAssign )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:179:5: ( annotationAssign )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:179:5: annotationAssign
            	    {
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1852);
            	    annotationAssign();

            	    state._fsp--;


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

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "annotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:181:1: annotationAssign : ^( ASSIGN CPINDEX annotationValue ) ;
    public final JVMPrettyPrinter.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMPrettyPrinter.annotationAssign_return retval = new JVMPrettyPrinter.annotationAssign_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:182:3: ( ^( ASSIGN CPINDEX annotationValue ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:182:5: ^( ASSIGN CPINDEX annotationValue )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign1866); 

            match(input, Token.DOWN, null); 
            match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign1868); 

            pushFollow(FOLLOW_annotationValue_in_annotationAssign1870);
            annotationValue();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "annotationValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:184:1: annotationValue : ( brackedAnnotationAssign | AnnotationAssign );
    public final JVMPrettyPrinter.annotationValue_return annotationValue() throws RecognitionException {
        JVMPrettyPrinter.annotationValue_return retval = new JVMPrettyPrinter.annotationValue_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:185:3: ( brackedAnnotationAssign | AnnotationAssign )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:185:5: brackedAnnotationAssign
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue1883);
                    brackedAnnotationAssign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:186:5: AnnotationAssign
                    {
                    match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue1890); 

                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackedAnnotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:188:1: brackedAnnotationAssign : ( brackedAnnotationAssignList )? ;
    public final JVMPrettyPrinter.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssign_return retval = new JVMPrettyPrinter.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:189:3: ( ( brackedAnnotationAssignList )? )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:189:5: ( brackedAnnotationAssignList )?
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:189:5: ( brackedAnnotationAssignList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==AnnotationAssign) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:189:5: brackedAnnotationAssignList
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1902);
                    brackedAnnotationAssignList();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackedAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:191:1: brackedAnnotationAssignList : ( brackedAnnotationAssignValue )+ ;
    public final JVMPrettyPrinter.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssignList_return retval = new JVMPrettyPrinter.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:3: ( ( brackedAnnotationAssignValue )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:5: ( brackedAnnotationAssignValue )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:5: ( brackedAnnotationAssignValue )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:5: brackedAnnotationAssignValue
            	    {
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1915);
            	    brackedAnnotationAssignValue();

            	    state._fsp--;


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

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackedAnnotationAssignValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:194:1: brackedAnnotationAssignValue : ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) ;
    public final JVMPrettyPrinter.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssignValue_return retval = new JVMPrettyPrinter.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:195:3: ( ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:195:5: ^( AnnotationAssign ( runtimeVisibleAnnotationAssignList )? )
            {
            match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1929); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:195:24: ( runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:195:24: runtimeVisibleAnnotationAssignList
                        {
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1931);
                        runtimeVisibleAnnotationAssignList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:197:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return retval = new JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:198:3: ( ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:198:5: ^( RuntimeVisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1946); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:198:42: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:198:42: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1948);
            	    parameterVisibilityInfo();

            	    state._fsp--;


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


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeInvisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:200:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) ;
    public final JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return retval = new JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:201:3: ( ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:201:5: ^( RuntimeInvisibleParameterAnnotations ( parameterVisibilityInfo )+ )
            {
            match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1963); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:201:44: ( parameterVisibilityInfo )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:201:44: parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1965);
            	    parameterVisibilityInfo();

            	    state._fsp--;


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


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeInvisibleAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:203:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) ;
    public final JVMPrettyPrinter.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleAnnotations_return retval = new JVMPrettyPrinter.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:3: ( ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:5: ^( RuntimeInvisibleAnnotations ( runtimeInvisibleAnnotationsItem )+ )
            {
            match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1980); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:35: ( runtimeInvisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:35: runtimeInvisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1982);
            	    runtimeInvisibleAnnotationsItem();

            	    state._fsp--;


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


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "parameterVisibilityInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:206:1: parameterVisibilityInfo : ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) ;
    public final JVMPrettyPrinter.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMPrettyPrinter.parameterVisibilityInfo_return retval = new JVMPrettyPrinter.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:3: ( ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:5: ^( pc ( IDENTIFIER )? ( runtimeVisibleAnnotationsItem )* )
            {
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo1997);
            pc();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:10: ( IDENTIFIER )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IDENTIFIER) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:10: IDENTIFIER
                        {
                        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1999); 

                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:22: ( runtimeVisibleAnnotationsItem )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CPINDEX) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:22: runtimeVisibleAnnotationsItem
                	    {
                	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo2002);
                	    runtimeVisibleAnnotationsItem();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop31;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeInvisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:209:1: runtimeInvisibleAnnotationsItem : ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) ;
    public final JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return retval = new JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:3: ( ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:5: ^( pc ( pc )? ^( CPINDEX ( runtimeVisibleAnnotationAssignList )? ) )
            {
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2017);
            pc();

            state._fsp--;


            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:10: ( pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:10: pc
                    {
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2019);
                    pc();

                    state._fsp--;


                    }
                    break;

            }


            match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem2023); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:24: ( runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:210:24: runtimeVisibleAnnotationAssignList
                        {
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem2025);
                        runtimeVisibleAnnotationAssignList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constant_pool"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:217:1: constant_pool : ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* ) -> cpool(f=$id1.texts=$id2.textt=$s);
    public final JVMPrettyPrinter.constant_pool_return constant_pool() throws RecognitionException {
        JVMPrettyPrinter.constant_pool_return retval = new JVMPrettyPrinter.constant_pool_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:218:3: ( ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* ) -> cpool(f=$id1.texts=$id2.textt=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:218:5: ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* )
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool2048); 

            match(input, Token.DOWN, null); 
            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool2052); 

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:218:37: (s+= contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:218:38: s+= contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool2057);
            	    s=contant_pool_line();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 219:11: -> cpool(f=$id1.texts=$id2.textt=$s)
            {
                retval.st = templateLib.getInstanceOf("cpool",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "contant_pool_line"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:222:1: contant_pool_line : ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> cpoolline(f=$cp1.texts=$cta.text);
    public final JVMPrettyPrinter.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMPrettyPrinter.contant_pool_line_return retval = new JVMPrettyPrinter.contant_pool_line_return();
        retval.start = input.LT(1);


        CommonTree cp1=null;
        CommonTree cta=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:223:3: ( ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> cpoolline(f=$cp1.texts=$cta.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:223:5: ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line2103); 

            match(input, Token.DOWN, null); 
            cp1=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line2107); 

            cta=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line2111); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 224:13: -> cpoolline(f=$cp1.texts=$cta.text)
            {
                retval.st = templateLib.getInstanceOf("cpoolline",new STAttrMap().put("f", (cp1!=null?cp1.getText():null)).put("s", (cta!=null?cta.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "classBody"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:231:1: classBody : (s+= classBodyEntryDecl )+ -> nlSeparatedList(ls=$s);
    public final JVMPrettyPrinter.classBody_return classBody() throws RecognitionException {
        JVMPrettyPrinter.classBody_return retval = new JVMPrettyPrinter.classBody_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:232:3: ( (s+= classBodyEntryDecl )+ -> nlSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:232:5: (s+= classBodyEntryDecl )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:232:5: (s+= classBodyEntryDecl )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:232:6: s+= classBodyEntryDecl
            	    {
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody2159);
            	    s=classBodyEntryDecl();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 232:31: -> nlSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("nlSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "classBodyEntryDecl"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:235:1: classBodyEntryDecl : (s1= methodDefinition -> noformat(f=$s1.st)|s2= ctorDefinition -> noformat(f=$s2.st)|s3= fieldDefinition -> noformat(f=$s3.st)|s4= staticCtorDefinition -> noformat(f=$s4.st));
    public final JVMPrettyPrinter.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMPrettyPrinter.classBodyEntryDecl_return retval = new JVMPrettyPrinter.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.methodDefinition_return s1 =null;

        JVMPrettyPrinter.ctorDefinition_return s2 =null;

        JVMPrettyPrinter.fieldDefinition_return s3 =null;

        JVMPrettyPrinter.staticCtorDefinition_return s4 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:236:3: (s1= methodDefinition -> noformat(f=$s1.st)|s2= ctorDefinition -> noformat(f=$s2.st)|s3= fieldDefinition -> noformat(f=$s3.st)|s4= staticCtorDefinition -> noformat(f=$s4.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:236:5: s1= methodDefinition
                    {
                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl2188);
                    s1=methodDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 236:27: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:237:5: s2= ctorDefinition
                    {
                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl2207);
                    s2=ctorDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 237:25: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:238:5: s3= fieldDefinition
                    {
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl2226);
                    s3=fieldDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 238:27: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:239:5: s4= staticCtorDefinition
                    {
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl2246);
                    s4=staticCtorDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 239:29: -> noformat(f=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s4!=null?s4.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "fieldDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:246:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo= fieldAdditionalInfo )* ) ) -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo.st);
    public final JVMPrettyPrinter.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMPrettyPrinter.fieldDefinition_return retval = new JVMPrettyPrinter.fieldDefinition_return();
        retval.start = input.LT(1);


        List list_fm=null;
        JVMPrettyPrinter.field_visual_modifier_return fvm =null;

        JVMPrettyPrinter.type_return ft =null;

        JVMPrettyPrinter.keywordAggregate_return fn =null;

        JVMPrettyPrinter.literals_return lit =null;

        JVMPrettyPrinter.fieldInfo_return inf =null;

        JVMPrettyPrinter.fieldAdditionalInfo_return ainfo =null;

        RuleReturnScope fm = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:3: ( ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo= fieldAdditionalInfo )* ) ) -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:5: ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo= fieldAdditionalInfo )* ) )
            {
            match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition2273); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition2276); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:32: (fvm= field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:32: fvm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition2280);
                        fvm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition2285); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:68: (fm+= field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:69: fm+= field_modifier
                	    {
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition2290);
                	    fm=field_modifier();

                	    state._fsp--;

                	    if (list_fm==null) list_fm=new ArrayList();
                	    list_fm.add(fm.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop38;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition2296); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_fieldDefinition2300);
            ft=type();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition2304); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition2308);
            fn=keywordAggregate();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition2312); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:159: (lit= literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:159: lit= literals
                        {
                        pushFollow(FOLLOW_literals_in_fieldDefinition2316);
                        lit=literals();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition2333); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition2337);
            inf=fieldInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition2353); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:249:29: (ainfo= fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:249:29: ainfo= fieldAdditionalInfo
                	    {
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition2357);
                	    ainfo=fieldAdditionalInfo();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop40;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 251:13: -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo.st)
            {
                retval.st = templateLib.getInstanceOf("fieldDecl",new STAttrMap().put("vm", (fvm!=null?fvm.st:null)).put("m", list_fm).put("t", (ft!=null?ft.st:null)).put("n", (fn!=null?fn.st:null)).put("v", (lit!=null?lit.st:null)).put("info", (inf!=null?inf.st:null)).put("xinf", (ainfo!=null?ainfo.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "fieldInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:257:1: fieldInfo : ^(sig= Signature s1= bytecodeType ) s2= flags -> fieldInf(f=$sig.texts=$s1.stt=$s2.st);
    public final JVMPrettyPrinter.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMPrettyPrinter.fieldInfo_return retval = new JVMPrettyPrinter.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree sig=null;
        JVMPrettyPrinter.bytecodeType_return s1 =null;

        JVMPrettyPrinter.flags_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:3: ( ^(sig= Signature s1= bytecodeType ) s2= flags -> fieldInf(f=$sig.texts=$s1.stt=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:5: ^(sig= Signature s1= bytecodeType ) s2= flags
            {
            sig=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo2522); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo2526);
            s1=bytecodeType();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_flags_in_fieldInfo2531);
            s2=flags();

            state._fsp--;


            // TEMPLATE REWRITE
            // 258:47: -> fieldInf(f=$sig.texts=$s1.stt=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("fieldInf",new STAttrMap().put("f", (sig!=null?sig.getText():null)).put("s", (s1!=null?s1.st:null)).put("t", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "fieldAdditionalInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:261:1: fieldAdditionalInfo : ( ^( Constant pt= primitiveType l= literals ) -> noformat3(f=$Constant.texts=$pt.stt=$l.st)| ^( Constant CONSTANT_TYPE_ASSIGNABLE ) -> noformat2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)| ^( Signature CPINDEX ) -> noformat2(f=$Signature.texts=$CPINDEX.text)| ^( Deprecated BOOLEANLITERAL ) -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Synthetic BOOLEANLITERAL ) -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s1= runtimeVisibleAnnotations_info -> noformat(f=$s1.st)|s2= runtimeInvisibleAnnotations -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMPrettyPrinter.fieldAdditionalInfo_return retval = new JVMPrettyPrinter.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree Constant21=null;
        CommonTree Constant22=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE23=null;
        CommonTree Signature24=null;
        CommonTree CPINDEX25=null;
        CommonTree Deprecated26=null;
        CommonTree BOOLEANLITERAL27=null;
        CommonTree Synthetic28=null;
        CommonTree BOOLEANLITERAL29=null;
        JVMPrettyPrinter.primitiveType_return pt =null;

        JVMPrettyPrinter.literals_return l =null;

        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return s1 =null;

        JVMPrettyPrinter.runtimeInvisibleAnnotations_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:262:3: ( ^( Constant pt= primitiveType l= literals ) -> noformat3(f=$Constant.texts=$pt.stt=$l.st)| ^( Constant CONSTANT_TYPE_ASSIGNABLE ) -> noformat2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)| ^( Signature CPINDEX ) -> noformat2(f=$Signature.texts=$CPINDEX.text)| ^( Deprecated BOOLEANLITERAL ) -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Synthetic BOOLEANLITERAL ) -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s1= runtimeVisibleAnnotations_info -> noformat(f=$s1.st)|s2= runtimeInvisibleAnnotations -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:262:5: ^( Constant pt= primitiveType l= literals )
                    {
                    Constant21=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2564); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo2568);
                    pt=primitiveType();

                    state._fsp--;


                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo2572);
                    l=literals();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 262:45: -> noformat3(f=$Constant.texts=$pt.stt=$l.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat3",new STAttrMap().put("f", (Constant21!=null?Constant21.getText():null)).put("s", (pt!=null?pt.st:null)).put("t", (l!=null?l.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:263:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    Constant22=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2597); 

                    match(input, Token.DOWN, null); 
                    CONSTANT_TYPE_ASSIGNABLE23=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2599); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 263:43: -> noformat2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Constant22!=null?Constant22.getText():null)).put("s", (CONSTANT_TYPE_ASSIGNABLE23!=null?CONSTANT_TYPE_ASSIGNABLE23.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:264:5: ^( Signature CPINDEX )
                    {
                    Signature24=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo2621); 

                    match(input, Token.DOWN, null); 
                    CPINDEX25=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo2623); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 264:31: -> noformat2(f=$Signature.texts=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Signature24!=null?Signature24.getText():null)).put("s", (CPINDEX25!=null?CPINDEX25.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:265:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    Deprecated26=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo2649); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL27=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2651); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 265:37: -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Deprecated26!=null?Deprecated26.getText():null)).put("s", (BOOLEANLITERAL27!=null?BOOLEANLITERAL27.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:266:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    Synthetic28=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo2675); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL29=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2677); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 266:37: -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Synthetic28!=null?Synthetic28.getText():null)).put("s", (BOOLEANLITERAL29!=null?BOOLEANLITERAL29.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:267:5: s1= runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2703);
                    s1=runtimeVisibleAnnotations_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 267:41: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:268:5: s2= runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2722);
                    s2=runtimeInvisibleAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 268:39: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "field_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:271:1: field_visual_modifier : ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text));
    public final JVMPrettyPrinter.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMPrettyPrinter.field_visual_modifier_return retval = new JVMPrettyPrinter.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree PUBLIC30=null;
        CommonTree PRIVATE31=null;
        CommonTree PROTECTED32=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:272:3: ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text))
            int alt42=3;
            switch ( input.LA(1) ) {
            case PUBLIC:
                {
                alt42=1;
                }
                break;
            case PRIVATE:
                {
                alt42=2;
                }
                break;
            case PROTECTED:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:272:5: PUBLIC
                    {
                    PUBLIC30=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_field_visual_modifier2747); 

                    // TEMPLATE REWRITE
                    // 272:19: -> noformat(f=$PUBLIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PUBLIC30!=null?PUBLIC30.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:273:5: PRIVATE
                    {
                    PRIVATE31=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_field_visual_modifier2769); 

                    // TEMPLATE REWRITE
                    // 273:19: -> noformat(f=$PRIVATE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PRIVATE31!=null?PRIVATE31.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:274:5: PROTECTED
                    {
                    PROTECTED32=(CommonTree)match(input,PROTECTED,FOLLOW_PROTECTED_in_field_visual_modifier2790); 

                    // TEMPLATE REWRITE
                    // 274:19: -> noformat(f=$PROTECTED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PROTECTED32!=null?PROTECTED32.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "field_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:277:1: field_modifier : ( FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| TRANSIENT -> noformat(f=$TRANSIENT.text)| VOLATILE -> noformat(f=$VOLATILE.text));
    public final JVMPrettyPrinter.field_modifier_return field_modifier() throws RecognitionException {
        JVMPrettyPrinter.field_modifier_return retval = new JVMPrettyPrinter.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree FINAL33=null;
        CommonTree STATIC34=null;
        CommonTree TRANSIENT35=null;
        CommonTree VOLATILE36=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:278:3: ( FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| TRANSIENT -> noformat(f=$TRANSIENT.text)| VOLATILE -> noformat(f=$VOLATILE.text))
            int alt43=4;
            switch ( input.LA(1) ) {
            case FINAL:
                {
                alt43=1;
                }
                break;
            case STATIC:
                {
                alt43=2;
                }
                break;
            case TRANSIENT:
                {
                alt43=3;
                }
                break;
            case VOLATILE:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:278:5: FINAL
                    {
                    FINAL33=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_field_modifier2820); 

                    // TEMPLATE REWRITE
                    // 278:17: -> noformat(f=$FINAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FINAL33!=null?FINAL33.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:279:5: STATIC
                    {
                    STATIC34=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_modifier2841); 

                    // TEMPLATE REWRITE
                    // 279:19: -> noformat(f=$STATIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STATIC34!=null?STATIC34.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:280:5: TRANSIENT
                    {
                    TRANSIENT35=(CommonTree)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_field_modifier2863); 

                    // TEMPLATE REWRITE
                    // 280:21: -> noformat(f=$TRANSIENT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (TRANSIENT35!=null?TRANSIENT35.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:281:5: VOLATILE
                    {
                    VOLATILE36=(CommonTree)match(input,VOLATILE,FOLLOW_VOLATILE_in_field_modifier2884); 

                    // TEMPLATE REWRITE
                    // 281:19: -> noformat(f=$VOLATILE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VOLATILE36!=null?VOLATILE36.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "staticCtorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:288:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ) -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st);
    public final JVMPrettyPrinter.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMPrettyPrinter.staticCtorDefinition_return retval = new JVMPrettyPrinter.staticCtorDefinition_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.field_visual_modifier_return svm =null;

        JVMPrettyPrinter.methodInfo_return inf =null;

        JVMPrettyPrinter.body_return b =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:3: ( ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ) -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:5: ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) )
            {
            match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition2918); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition2921); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:37: (svm= field_visual_modifier )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0 >= PRIVATE && LA44_0 <= PUBLIC)) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:37: svm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition2925);
                        svm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition2935); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition2939);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition2948); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_staticCtorDefinition2952);
            b=body();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 293:27: -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st)
            {
                retval.st = templateLib.getInstanceOf("statCtorDecl",new STAttrMap().put("vm", (svm!=null?svm.st:null)).put("info", (inf!=null?inf.st:null)).put("body", (b!=null?b.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "ctorDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:303:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st);
    public final JVMPrettyPrinter.ctorDefinition_return ctorDefinition() throws RecognitionException {
        JVMPrettyPrinter.ctorDefinition_return retval = new JVMPrettyPrinter.ctorDefinition_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.field_visual_modifier_return cvm =null;

        JVMPrettyPrinter.genericDescriptor_return g =null;

        JVMPrettyPrinter.typeName_return name =null;

        JVMPrettyPrinter.arguments_return a =null;

        JVMPrettyPrinter.throwClause_return t =null;

        JVMPrettyPrinter.methodInfo_return inf =null;

        JVMPrettyPrinter.body_return b =null;

        JVMPrettyPrinter.afterMethodInfo_return ainfo =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:3: ( ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:5: ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) )
            {
            match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition3104); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition3107); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:31: (cvm= field_visual_modifier )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0 >= PRIVATE && LA45_0 <= PUBLIC)) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:31: cvm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition3111);
                        cvm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition3116); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:71: (g= genericDescriptor )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==EXTENDS) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:71: g= genericDescriptor
                        {
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition3120);
                        g=genericDescriptor();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition3125); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_typeName_in_ctorDefinition3129);
            name=typeName();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_arguments_in_ctorDefinition3134);
            a=arguments();

            state._fsp--;


            match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition3137); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:145: (t= throwClause )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==THROWS) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:304:145: t= throwClause
                        {
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition3141);
                        t=throwClause();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition3170); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition3174);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition3202); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_ctorDefinition3206);
            b=body();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition3234); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:307:41: (ainfo= afterMethodInfo )?
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AnnotationDefault||LA48_0==Deprecated||LA48_0==Exceptions||(LA48_0 >= RuntimeInvisibleAnnotations && LA48_0 <= RuntimeVisibleParameterAnnotations)||LA48_0==Signature||LA48_0==Synthetic) ) {
                    alt48=1;
                }
                switch (alt48) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:307:41: ainfo= afterMethodInfo
                        {
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition3238);
                        ainfo=afterMethodInfo();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 309:25: -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st)
            {
                retval.st = templateLib.getInstanceOf("ctorDecl",new STAttrMap().put("vm", (cvm!=null?cvm.st:null)).put("gd", (g!=null?g.st:null)).put("n", (name!=null?name.st:null)).put("args", (a!=null?a.st:null)).put("thr", (t!=null?t.st:null)).put("info", (inf!=null?inf.st:null)).put("body", (b!=null?b.st:null)).put("xinf", (ainfo!=null?ainfo.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "methodDefinition"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:320:1: methodDefinition : ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> methDecl(vm=$mvm.stm=$mm.stgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st);
    public final JVMPrettyPrinter.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMPrettyPrinter.methodDefinition_return retval = new JVMPrettyPrinter.methodDefinition_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.method_visual_modifier_return mvm =null;

        JVMPrettyPrinter.method_modifier_return mm =null;

        JVMPrettyPrinter.genericDescriptor_return g =null;

        JVMPrettyPrinter.type_return mt =null;

        JVMPrettyPrinter.keywordAggregate_return mn =null;

        JVMPrettyPrinter.arguments_return a =null;

        JVMPrettyPrinter.throwClauseMethod_return t =null;

        JVMPrettyPrinter.methodInfo_return inf =null;

        JVMPrettyPrinter.body_return b =null;

        JVMPrettyPrinter.afterMethodInfo_return ainfo =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:3: ( ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> methDecl(vm=$mvm.stm=$mm.stgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:5: ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) )
            {
            match(input,METHODDECL,FOLLOW_METHODDECL_in_methodDefinition3460); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition3463); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:33: (mvm= method_visual_modifier )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0 >= PRIVATE && LA49_0 <= PUBLIC)) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:33: mvm= method_visual_modifier
                        {
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition3467);
                        mvm=method_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition3472); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:72: (mm= method_modifier )*
                loop50:
                do {
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ABSTRACT||LA50_0==FINAL||LA50_0==NATIVE||LA50_0==STATIC||LA50_0==STRICTFP||LA50_0==SYNCHRONIZED) ) {
                        alt50=1;
                    }


                    switch (alt50) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:72: mm= method_modifier
                	    {
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition3476);
                	    mm=method_modifier();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop50;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition3481); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:106: (g= genericDescriptor )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==EXTENDS) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:106: g= genericDescriptor
                        {
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition3485);
                        g=genericDescriptor();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition3490); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_methodDefinition3494);
            mt=type();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition3498); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition3502);
            mn=keywordAggregate();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_arguments_in_methodDefinition3507);
            a=arguments();

            state._fsp--;


            match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition3510); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:206: (t= throwClauseMethod )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==THROWS) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:321:206: t= throwClauseMethod
                        {
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition3514);
                        t=throwClauseMethod();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition3543); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_methodDefinition3547);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition3575); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:323:37: (b= body )?
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Code||LA53_0==Synthetic) ) {
                    alt53=1;
                }
                switch (alt53) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:323:37: b= body
                        {
                        pushFollow(FOLLOW_body_in_methodDefinition3579);
                        b=body();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition3608); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:324:41: (ainfo= afterMethodInfo )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AnnotationDefault||LA54_0==Deprecated||LA54_0==Exceptions||(LA54_0 >= RuntimeInvisibleAnnotations && LA54_0 <= RuntimeVisibleParameterAnnotations)||LA54_0==Signature||LA54_0==Synthetic) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:324:41: ainfo= afterMethodInfo
                        {
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition3612);
                        ainfo=afterMethodInfo();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 326:25: -> methDecl(vm=$mvm.stm=$mm.stgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st)
            {
                retval.st = templateLib.getInstanceOf("methDecl",new STAttrMap().put("vm", (mvm!=null?mvm.st:null)).put("m", (mm!=null?mm.st:null)).put("gd", (g!=null?g.st:null)).put("t", (mt!=null?mt.st:null)).put("n", (mn!=null?mn.st:null)).put("args", (a!=null?a.st:null)).put("thr", (t!=null?t.st:null)).put("info", (inf!=null?inf.st:null)).put("body", (b!=null?b.st:null)).put("xinf", (ainfo!=null?ainfo.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "methodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:333:1: methodInfo : ^( STANDINTOKEN ms= methodSignatureInfo fl= flags ) -> methodInfo(f=$ms.sts=$fl.st);
    public final JVMPrettyPrinter.methodInfo_return methodInfo() throws RecognitionException {
        JVMPrettyPrinter.methodInfo_return retval = new JVMPrettyPrinter.methodInfo_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.methodSignatureInfo_return ms =null;

        JVMPrettyPrinter.flags_return fl =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:334:3: ( ^( STANDINTOKEN ms= methodSignatureInfo fl= flags ) -> methodInfo(f=$ms.sts=$fl.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:334:5: ^( STANDINTOKEN ms= methodSignatureInfo fl= flags )
            {
            match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo3840); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo3844);
            ms=methodSignatureInfo();

            state._fsp--;


            pushFollow(FOLLOW_flags_in_methodInfo3848);
            fl=flags();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 335:15: -> methodInfo(f=$ms.sts=$fl.st)
            {
                retval.st = templateLib.getInstanceOf("methodInfo",new STAttrMap().put("f", (ms!=null?ms.st:null)).put("s", (fl!=null?fl.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "afterMethodInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:338:1: afterMethodInfo : (s+= afterMethodInfoEntry )+ -> nlSeparatedList(ls=$s);
    public final JVMPrettyPrinter.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMPrettyPrinter.afterMethodInfo_return retval = new JVMPrettyPrinter.afterMethodInfo_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:339:3: ( (s+= afterMethodInfoEntry )+ -> nlSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:339:5: (s+= afterMethodInfoEntry )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:339:5: (s+= afterMethodInfoEntry )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AnnotationDefault||LA55_0==Deprecated||LA55_0==Exceptions||(LA55_0 >= RuntimeInvisibleAnnotations && LA55_0 <= RuntimeVisibleParameterAnnotations)||LA55_0==Signature||LA55_0==Synthetic) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:339:6: s+= afterMethodInfoEntry
            	    {
            	    pushFollow(FOLLOW_afterMethodInfoEntry_in_afterMethodInfo3893);
            	    s=afterMethodInfoEntry();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            // TEMPLATE REWRITE
            // 339:37: -> nlSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("nlSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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


    public static class afterMethodInfoEntry_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "afterMethodInfoEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:342:1: afterMethodInfoEntry : ( ^( Deprecated BOOLEANLITERAL ) -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Signature CPINDEX ) -> noformat2(f=$Signature.texts=$CPINDEX.text)|s1= runtimeInvisibleParameterAnnotations -> noformat(f=$s1.st)|s2= runtimeVisibleAnnotations_info -> noformat(f=$s2.st)|s3= runtimeInvisibleAnnotations -> noformat(f=$s3.st)|s4= runtimeVisibleParameterAnnotations -> noformat(f=$s4.st)| ^( Exceptions t= throwClause ) -> noformat2(f=$Exceptions.texts=$t.st)| ^( Synthetic BOOLEANLITERAL ) -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s5= annotationDefault -> noformat(f=$s5.st));
    public final JVMPrettyPrinter.afterMethodInfoEntry_return afterMethodInfoEntry() throws RecognitionException {
        JVMPrettyPrinter.afterMethodInfoEntry_return retval = new JVMPrettyPrinter.afterMethodInfoEntry_return();
        retval.start = input.LT(1);


        CommonTree Deprecated37=null;
        CommonTree BOOLEANLITERAL38=null;
        CommonTree Signature39=null;
        CommonTree CPINDEX40=null;
        CommonTree Exceptions41=null;
        CommonTree Synthetic42=null;
        CommonTree BOOLEANLITERAL43=null;
        JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return s1 =null;

        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return s2 =null;

        JVMPrettyPrinter.runtimeInvisibleAnnotations_return s3 =null;

        JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return s4 =null;

        JVMPrettyPrinter.throwClause_return t =null;

        JVMPrettyPrinter.annotationDefault_return s5 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:343:3: ( ^( Deprecated BOOLEANLITERAL ) -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Signature CPINDEX ) -> noformat2(f=$Signature.texts=$CPINDEX.text)|s1= runtimeInvisibleParameterAnnotations -> noformat(f=$s1.st)|s2= runtimeVisibleAnnotations_info -> noformat(f=$s2.st)|s3= runtimeInvisibleAnnotations -> noformat(f=$s3.st)|s4= runtimeVisibleParameterAnnotations -> noformat(f=$s4.st)| ^( Exceptions t= throwClause ) -> noformat2(f=$Exceptions.texts=$t.st)| ^( Synthetic BOOLEANLITERAL ) -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s5= annotationDefault -> noformat(f=$s5.st))
            int alt56=9;
            switch ( input.LA(1) ) {
            case Deprecated:
                {
                alt56=1;
                }
                break;
            case Signature:
                {
                alt56=2;
                }
                break;
            case RuntimeInvisibleParameterAnnotations:
                {
                alt56=3;
                }
                break;
            case RuntimeVisibleAnnotations:
                {
                alt56=4;
                }
                break;
            case RuntimeInvisibleAnnotations:
                {
                alt56=5;
                }
                break;
            case RuntimeVisibleParameterAnnotations:
                {
                alt56=6;
                }
                break;
            case Exceptions:
                {
                alt56=7;
                }
                break;
            case Synthetic:
                {
                alt56=8;
                }
                break;
            case AnnotationDefault:
                {
                alt56=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:343:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    Deprecated37=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfoEntry3923); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL38=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry3926); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 343:37: -> noformat2(f=$Deprecated.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Deprecated37!=null?Deprecated37.getText():null)).put("s", (BOOLEANLITERAL38!=null?BOOLEANLITERAL38.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:344:5: ^( Signature CPINDEX )
                    {
                    Signature39=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfoEntry3949); 

                    match(input, Token.DOWN, null); 
                    CPINDEX40=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfoEntry3951); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 344:31: -> noformat2(f=$Signature.texts=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Signature39!=null?Signature39.getText():null)).put("s", (CPINDEX40!=null?CPINDEX40.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:345:5: s1= runtimeInvisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry3978);
                    s1=runtimeInvisibleParameterAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 345:45: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:346:5: s2= runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry3995);
                    s2=runtimeVisibleAnnotations_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 346:41: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:347:5: s3= runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry4014);
                    s3=runtimeInvisibleAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 347:39: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:348:5: s4= runtimeVisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry4034);
                    s4=runtimeVisibleParameterAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 348:43: -> noformat(f=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s4!=null?s4.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:349:5: ^( Exceptions t= throwClause )
                    {
                    Exceptions41=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfoEntry4050); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_throwClause_in_afterMethodInfoEntry4055);
                    t=throwClause();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 349:37: -> noformat2(f=$Exceptions.texts=$t.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Exceptions41!=null?Exceptions41.getText():null)).put("s", (t!=null?t.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:350:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    Synthetic42=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfoEntry4079); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL43=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4081); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 350:37: -> noformat2(f=$Synthetic.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (Synthetic42!=null?Synthetic42.getText():null)).put("s", (BOOLEANLITERAL43!=null?BOOLEANLITERAL43.getText():null)));
                    }



                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:351:5: s5= annotationDefault
                    {
                    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfoEntry4107);
                    s5=annotationDefault();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 351:31: -> noformat(f=$s5.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s5!=null?s5.st:null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "afterMethodInfoEntry"


    public static class annotationDefault_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "annotationDefault"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:354:1: annotationDefault : ^( AnnotationDefault DefaultValue v= annotationValue ) -> noformat(f=$v.st);
    public final JVMPrettyPrinter.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMPrettyPrinter.annotationDefault_return retval = new JVMPrettyPrinter.annotationDefault_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.annotationValue_return v =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:355:3: ( ^( AnnotationDefault DefaultValue v= annotationValue ) -> noformat(f=$v.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:355:5: ^( AnnotationDefault DefaultValue v= annotationValue )
            {
            match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault4135); 

            match(input, Token.DOWN, null); 
            match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault4138); 

            pushFollow(FOLLOW_annotationValue_in_annotationDefault4142);
            v=annotationValue();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 356:9: -> noformat(f=$v.st)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (v!=null?v.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "methodSignatureInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:359:1: methodSignatureInfo : ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) ) -> methodSign(in=$sout=$r.st);
    public final JVMPrettyPrinter.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMPrettyPrinter.methodSignatureInfo_return retval = new JVMPrettyPrinter.methodSignatureInfo_return();
        retval.start = input.LT(1);


        List list_s=null;
        JVMPrettyPrinter.returnDescriptor_return r =null;

        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:360:3: ( ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) ) -> methodSign(in=$sout=$r.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:360:5: ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) )
            {
            match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo4176); 

            match(input, Token.DOWN, null); 
            match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo4179); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:360:29: (s+= bytecodeType )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==BaseType||LA57_0==IDENTIFIER||LA57_0==INTERNALTYPE||LA57_0==LBRACK) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:360:30: s+= bytecodeType
                	    {
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo4184);
                	    s=bytecodeType();

                	    state._fsp--;

                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop57;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo4190); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo4194);
            r=returnDescriptor();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 361:9: -> methodSign(in=$sout=$r.st)
            {
                retval.st = templateLib.getInstanceOf("methodSign",new STAttrMap().put("in", list_s).put("out", (r!=null?r.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "returnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:364:1: returnDescriptor : (s= bytecodeType -> noformat(f=$s.st)| VoidType -> noformat(f=$VoidType.text));
    public final JVMPrettyPrinter.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMPrettyPrinter.returnDescriptor_return retval = new JVMPrettyPrinter.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree VoidType44=null;
        JVMPrettyPrinter.bytecodeType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:365:3: (s= bytecodeType -> noformat(f=$s.st)| VoidType -> noformat(f=$VoidType.text))
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==BaseType||LA58_0==IDENTIFIER||LA58_0==INTERNALTYPE||LA58_0==LBRACK) ) {
                alt58=1;
            }
            else if ( (LA58_0==VoidType) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:365:5: s= bytecodeType
                    {
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor4232);
                    s=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 365:21: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:366:5: VoidType
                    {
                    VoidType44=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor4248); 

                    // TEMPLATE REWRITE
                    // 366:17: -> noformat(f=$VoidType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VoidType44!=null?VoidType44.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "method_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:369:1: method_modifier : ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| SYNCHRONIZED -> noformat(f=$SYNCHRONIZED.text)| NATIVE -> noformat(f=$NATIVE.text)| STRICTFP -> noformat(f=$STRICTFP.text));
    public final JVMPrettyPrinter.method_modifier_return method_modifier() throws RecognitionException {
        JVMPrettyPrinter.method_modifier_return retval = new JVMPrettyPrinter.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree ABSTRACT45=null;
        CommonTree FINAL46=null;
        CommonTree STATIC47=null;
        CommonTree SYNCHRONIZED48=null;
        CommonTree NATIVE49=null;
        CommonTree STRICTFP50=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:370:3: ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| SYNCHRONIZED -> noformat(f=$SYNCHRONIZED.text)| NATIVE -> noformat(f=$NATIVE.text)| STRICTFP -> noformat(f=$STRICTFP.text))
            int alt59=6;
            switch ( input.LA(1) ) {
            case ABSTRACT:
                {
                alt59=1;
                }
                break;
            case FINAL:
                {
                alt59=2;
                }
                break;
            case STATIC:
                {
                alt59=3;
                }
                break;
            case SYNCHRONIZED:
                {
                alt59=4;
                }
                break;
            case NATIVE:
                {
                alt59=5;
                }
                break;
            case STRICTFP:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:370:5: ABSTRACT
                    {
                    ABSTRACT45=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_modifier4273); 

                    // TEMPLATE REWRITE
                    // 370:17: -> noformat(f=$ABSTRACT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (ABSTRACT45!=null?ABSTRACT45.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:371:5: FINAL
                    {
                    FINAL46=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_method_modifier4291); 

                    // TEMPLATE REWRITE
                    // 371:15: -> noformat(f=$FINAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FINAL46!=null?FINAL46.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:372:5: STATIC
                    {
                    STATIC47=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_method_modifier4310); 

                    // TEMPLATE REWRITE
                    // 372:17: -> noformat(f=$STATIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STATIC47!=null?STATIC47.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:373:5: SYNCHRONIZED
                    {
                    SYNCHRONIZED48=(CommonTree)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_method_modifier4330); 

                    // TEMPLATE REWRITE
                    // 373:21: -> noformat(f=$SYNCHRONIZED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (SYNCHRONIZED48!=null?SYNCHRONIZED48.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:374:5: NATIVE
                    {
                    NATIVE49=(CommonTree)match(input,NATIVE,FOLLOW_NATIVE_in_method_modifier4348); 

                    // TEMPLATE REWRITE
                    // 374:15: -> noformat(f=$NATIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (NATIVE49!=null?NATIVE49.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:375:5: STRICTFP
                    {
                    STRICTFP50=(CommonTree)match(input,STRICTFP,FOLLOW_STRICTFP_in_method_modifier4366); 

                    // TEMPLATE REWRITE
                    // 375:17: -> noformat(f=$STRICTFP.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STRICTFP50!=null?STRICTFP50.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "method_visual_modifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:378:1: method_visual_modifier : ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text));
    public final JVMPrettyPrinter.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMPrettyPrinter.method_visual_modifier_return retval = new JVMPrettyPrinter.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree PUBLIC51=null;
        CommonTree PRIVATE52=null;
        CommonTree PROTECTED53=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:379:3: ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text))
            int alt60=3;
            switch ( input.LA(1) ) {
            case PUBLIC:
                {
                alt60=1;
                }
                break;
            case PRIVATE:
                {
                alt60=2;
                }
                break;
            case PROTECTED:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:379:5: PUBLIC
                    {
                    PUBLIC51=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_method_visual_modifier4392); 

                    // TEMPLATE REWRITE
                    // 379:15: -> noformat(f=$PUBLIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PUBLIC51!=null?PUBLIC51.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:380:5: PRIVATE
                    {
                    PRIVATE52=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_method_visual_modifier4410); 

                    // TEMPLATE REWRITE
                    // 380:17: -> noformat(f=$PRIVATE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PRIVATE52!=null?PRIVATE52.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:381:5: PROTECTED
                    {
                    PROTECTED53=(CommonTree)match(input,PROTECTED,FOLLOW_PROTECTED_in_method_visual_modifier4429); 

                    // TEMPLATE REWRITE
                    // 381:17: -> noformat(f=$PROTECTED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PROTECTED53!=null?PROTECTED53.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "arguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:384:1: arguments : ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? ) -> args(f=$tl.sts=$d.text);
    public final JVMPrettyPrinter.arguments_return arguments() throws RecognitionException {
        JVMPrettyPrinter.arguments_return retval = new JVMPrettyPrinter.arguments_return();
        retval.start = input.LT(1);


        CommonTree d=null;
        JVMPrettyPrinter.typeList_return tl =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:3: ( ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? ) -> args(f=$tl.sts=$d.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:5: ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? )
            {
            match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments4454); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:23: (tl= typeList )?
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT||LA61_0==UNITNAME||LA61_0==VOID) ) {
                    alt61=1;
                }
                switch (alt61) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:23: tl= typeList
                        {
                        pushFollow(FOLLOW_typeList_in_arguments4458);
                        tl=typeList();

                        state._fsp--;


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:34: (d= DOT DOT DOT )?
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==DOT) ) {
                    alt62=1;
                }
                switch (alt62) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:35: d= DOT DOT DOT
                        {
                        d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments4464); 

                        match(input,DOT,FOLLOW_DOT_in_arguments4466); 

                        match(input,DOT,FOLLOW_DOT_in_arguments4468); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 386:9: -> args(f=$tl.sts=$d.text)
            {
                retval.st = templateLib.getInstanceOf("args",new STAttrMap().put("f", (tl!=null?tl.st:null)).put("s", (d!=null?d.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "body"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:393:1: body : ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )* -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e);
    public final JVMPrettyPrinter.body_return body() throws RecognitionException {
        JVMPrettyPrinter.body_return retval = new JVMPrettyPrinter.body_return();
        retval.start = input.LT(1);


        CommonTree BOOLEANLITERAL54=null;
        List list_e=null;
        JVMPrettyPrinter.codeBlock_return c =null;

        RuleReturnScope e = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:3: ( ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )* -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:5: ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:5: ( Synthetic BOOLEANLITERAL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Synthetic) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:6: Synthetic BOOLEANLITERAL
                    {
                    match(input,Synthetic,FOLLOW_Synthetic_in_body4514); 

                    BOOLEANLITERAL54=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body4516); 

                    }
                    break;

            }


            match(input,Code,FOLLOW_Code_in_body4521); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_codeBlock_in_body4525);
            c=codeBlock();

            state._fsp--;


            match(input, Token.UP, null); 


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:53: (e+= bodyExtension )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==ExceptionTable||(LA64_0 >= LineNumberTable && LA64_0 <= LocalVariableTypeTable)||(LA64_0 >= StackMap && LA64_0 <= StackMapTable)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:394:54: e+= bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body4531);
            	    e=bodyExtension();

            	    state._fsp--;

            	    if (list_e==null) list_e=new ArrayList();
            	    list_e.add(e.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 395:11: -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e)
            {
                retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("f", (BOOLEANLITERAL54!=null?BOOLEANLITERAL54.getText():null)).put("s", (c!=null?c.st:null)).put("t", list_e));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bodyExtension"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:398:1: bodyExtension : ( ^( ExceptionTable s1= exceptionTable ) -> bodyExt(f=$ExceptionTable.texts=$s1.st)| ^( LineNumberTable (s2= lineNumberTable )? ) -> bodyExt(f=$LineNumberTable.texts=$s2.st)| ^( LocalVariableTable s3= localVariableTable ) -> bodyExt(f=$LocalVariableTable.texts=$s3.st)| ^( LocalVariableTypeTable s4= localVariableTable ) -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)| ^( StackMapTable s5= stackMapTable ) -> bodyExt(f=$StackMapTable.texts=$s5.st)| ^( StackMap s6= stackMapTypeTable ) -> bodyExt(f=$StackMap.texts=$s6.st));
    public final JVMPrettyPrinter.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMPrettyPrinter.bodyExtension_return retval = new JVMPrettyPrinter.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree ExceptionTable55=null;
        CommonTree LineNumberTable56=null;
        CommonTree LocalVariableTable57=null;
        CommonTree LocalVariableTypeTable58=null;
        CommonTree StackMapTable59=null;
        CommonTree StackMap60=null;
        JVMPrettyPrinter.exceptionTable_return s1 =null;

        JVMPrettyPrinter.lineNumberTable_return s2 =null;

        JVMPrettyPrinter.localVariableTable_return s3 =null;

        JVMPrettyPrinter.localVariableTable_return s4 =null;

        JVMPrettyPrinter.stackMapTable_return s5 =null;

        JVMPrettyPrinter.stackMapTypeTable_return s6 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:399:3: ( ^( ExceptionTable s1= exceptionTable ) -> bodyExt(f=$ExceptionTable.texts=$s1.st)| ^( LineNumberTable (s2= lineNumberTable )? ) -> bodyExt(f=$LineNumberTable.texts=$s2.st)| ^( LocalVariableTable s3= localVariableTable ) -> bodyExt(f=$LocalVariableTable.texts=$s3.st)| ^( LocalVariableTypeTable s4= localVariableTable ) -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)| ^( StackMapTable s5= stackMapTable ) -> bodyExt(f=$StackMapTable.texts=$s5.st)| ^( StackMap s6= stackMapTypeTable ) -> bodyExt(f=$StackMap.texts=$s6.st))
            int alt66=6;
            switch ( input.LA(1) ) {
            case ExceptionTable:
                {
                alt66=1;
                }
                break;
            case LineNumberTable:
                {
                alt66=2;
                }
                break;
            case LocalVariableTable:
                {
                alt66=3;
                }
                break;
            case LocalVariableTypeTable:
                {
                alt66=4;
                }
                break;
            case StackMapTable:
                {
                alt66=5;
                }
                break;
            case StackMap:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:399:5: ^( ExceptionTable s1= exceptionTable )
                    {
                    ExceptionTable55=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension4574); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension4579);
                    s1=exceptionTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 399:45: -> bodyExt(f=$ExceptionTable.texts=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (ExceptionTable55!=null?ExceptionTable55.getText():null)).put("s", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:400:5: ^( LineNumberTable (s2= lineNumberTable )? )
                    {
                    LineNumberTable56=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension4603); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:400:26: (s2= lineNumberTable )?
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==IDENTIFIER) ) {
                            alt65=1;
                        }
                        switch (alt65) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:400:26: s2= lineNumberTable
                                {
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension4608);
                                s2=lineNumberTable();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 400:47: -> bodyExt(f=$LineNumberTable.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LineNumberTable56!=null?LineNumberTable56.getText():null)).put("s", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:401:5: ^( LocalVariableTable s3= localVariableTable )
                    {
                    LocalVariableTable57=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension4632); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension4637);
                    s3=localVariableTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 401:51: -> bodyExt(f=$LocalVariableTable.texts=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LocalVariableTable57!=null?LocalVariableTable57.getText():null)).put("s", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:402:5: ^( LocalVariableTypeTable s4= localVariableTable )
                    {
                    LocalVariableTypeTable58=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension4659); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension4663);
                    s4=localVariableTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 402:53: -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LocalVariableTypeTable58!=null?LocalVariableTypeTable58.getText():null)).put("s", (s4!=null?s4.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:403:5: ^( StackMapTable s5= stackMapTable )
                    {
                    StackMapTable59=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension4684); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension4688);
                    s5=stackMapTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 403:43: -> bodyExt(f=$StackMapTable.texts=$s5.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (StackMapTable59!=null?StackMapTable59.getText():null)).put("s", (s5!=null?s5.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:404:5: ^( StackMap s6= stackMapTypeTable )
                    {
                    StackMap60=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension4713); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension4717);
                    s6=stackMapTypeTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 404:43: -> bodyExt(f=$StackMap.texts=$s6.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (StackMap60!=null?StackMap60.getText():null)).put("s", (s6!=null?s6.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "codeBlock"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:407:1: codeBlock : ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd ) -> codeblock(f=$v.sts=$it=$e.st);
    public final JVMPrettyPrinter.codeBlock_return codeBlock() throws RecognitionException {
        JVMPrettyPrinter.codeBlock_return retval = new JVMPrettyPrinter.codeBlock_return();
        retval.start = input.LT(1);


        List list_i=null;
        JVMPrettyPrinter.variables_return v =null;

        JVMPrettyPrinter.codeBlockEnd_return e =null;

        RuleReturnScope i = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:408:3: ( ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd ) -> codeblock(f=$v.sts=$it=$e.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:408:5: ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd )
            {
            match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock4750); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variables_in_codeBlock4754);
            v=variables();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock4758); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:408:42: (i+= instructionSet )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==IDENTIFIER) ) {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==DOWN) ) {
                        int LA67_3 = input.LA(3);

                        if ( (LA67_3==INTLITERAL) ) {
                            int LA67_4 = input.LA(4);

                            if ( (LA67_4==COLON) ) {
                                int LA67_5 = input.LA(5);

                                if ( (LA67_5==OPERAND) ) {
                                    alt67=1;
                                }


                            }


                        }


                    }


                }
                else if ( (LA67_0==SWITCH) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:408:43: i+= instructionSet
            	    {
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock4763);
            	    i=instructionSet();

            	    state._fsp--;

            	    if (list_i==null) list_i=new ArrayList();
            	    list_i.add(i.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock4769);
            e=codeBlockEnd();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 409:11: -> codeblock(f=$v.sts=$it=$e.st)
            {
                retval.st = templateLib.getInstanceOf("codeblock",new STAttrMap().put("f", (v!=null?v.st:null)).put("s", list_i).put("t", (e!=null?e.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "instructionSet"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:412:1: instructionSet : (s1= codeLine -> noformat(f=$s1.st)|s2= javaSwitch -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.instructionSet_return instructionSet() throws RecognitionException {
        JVMPrettyPrinter.instructionSet_return retval = new JVMPrettyPrinter.instructionSet_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.codeLine_return s1 =null;

        JVMPrettyPrinter.javaSwitch_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:413:3: (s1= codeLine -> noformat(f=$s1.st)|s2= javaSwitch -> noformat(f=$s2.st))
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IDENTIFIER) ) {
                alt68=1;
            }
            else if ( (LA68_0==SWITCH) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:413:5: s1= codeLine
                    {
                    pushFollow(FOLLOW_codeLine_in_instructionSet4812);
                    s1=codeLine();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 413:21: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:414:5: s2= javaSwitch
                    {
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet4833);
                    s2=javaSwitch();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 414:21: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "codeLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:417:1: codeLine : ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text);
    public final JVMPrettyPrinter.codeLine_return codeLine() throws RecognitionException {
        JVMPrettyPrinter.codeLine_return retval = new JVMPrettyPrinter.codeLine_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER61=null;
        CommonTree INTLITERAL62=null;
        JVMPrettyPrinter.pc_return p =null;

        JVMPrettyPrinter.operand1_return o =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:3: ( ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:5: ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            IDENTIFIER61=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine4858); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_codeLine4862);
            p=pc();

            state._fsp--;


            match(input,OPERAND,FOLLOW_OPERAND_in_codeLine4865); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:34: (o= operand1 )?
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==BOOLEAN||LA69_0==BYTE||LA69_0==CHAR||LA69_0==CPINDEX||LA69_0==DOUBLE||LA69_0==FLOAT||LA69_0==INT||LA69_0==INTLITERAL||LA69_0==LONG||LA69_0==SHORT||LA69_0==VOID) ) {
                    alt69=1;
                }
                switch (alt69) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:34: o= operand1
                        {
                        pushFollow(FOLLOW_operand1_in_codeLine4869);
                        o=operand1();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,OPERAND,FOLLOW_OPERAND_in_codeLine4874); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:56: ( INTLITERAL )?
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==INTLITERAL) ) {
                    alt70=1;
                }
                switch (alt70) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:56: INTLITERAL
                        {
                        INTLITERAL62=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine4876); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 419:11: -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("codeline",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER61!=null?IDENTIFIER61.getText():null)).put("t", (o!=null?o.st:null)).put("q", (INTLITERAL62!=null?INTLITERAL62.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "codeBlockEnd"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:422:1: codeBlockEnd : ^( IDENTIFIER p= pc ( INTLITERAL )? ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text);
    public final JVMPrettyPrinter.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMPrettyPrinter.codeBlockEnd_return retval = new JVMPrettyPrinter.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER63=null;
        CommonTree INTLITERAL64=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:423:3: ( ^( IDENTIFIER p= pc ( INTLITERAL )? ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:423:5: ^( IDENTIFIER p= pc ( INTLITERAL )? )
            {
            IDENTIFIER63=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd4924); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_codeBlockEnd4928);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:423:23: ( INTLITERAL )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==INTLITERAL) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:423:23: INTLITERAL
                    {
                    INTLITERAL64=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd4930); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 424:11: -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("codeline",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER63!=null?IDENTIFIER63.getText():null)).put("t", (INTLITERAL64!=null?INTLITERAL64.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "operand1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:427:1: operand1 : ( CPINDEX -> noformat(f=$CPINDEX.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)|s= primitiveType -> noformat(f=$s.st));
    public final JVMPrettyPrinter.operand1_return operand1() throws RecognitionException {
        JVMPrettyPrinter.operand1_return retval = new JVMPrettyPrinter.operand1_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX65=null;
        CommonTree INTLITERAL66=null;
        JVMPrettyPrinter.primitiveType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:428:3: ( CPINDEX -> noformat(f=$CPINDEX.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)|s= primitiveType -> noformat(f=$s.st))
            int alt72=3;
            switch ( input.LA(1) ) {
            case CPINDEX:
                {
                alt72=1;
                }
                break;
            case INTLITERAL:
                {
                alt72=2;
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
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }

            switch (alt72) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:428:5: CPINDEX
                    {
                    CPINDEX65=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand14974); 

                    // TEMPLATE REWRITE
                    // 428:19: -> noformat(f=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CPINDEX65!=null?CPINDEX65.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:5: INTLITERAL
                    {
                    INTLITERAL66=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand14995); 

                    // TEMPLATE REWRITE
                    // 429:21: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL66!=null?INTLITERAL66.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:430:5: s= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_operand15017);
                    s=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 430:23: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variables"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:433:1: variables : s1= variable s2= variable s3= variable -> variables(f=$s1.sts=$s2.stt=$s3.st);
    public final JVMPrettyPrinter.variables_return variables() throws RecognitionException {
        JVMPrettyPrinter.variables_return retval = new JVMPrettyPrinter.variables_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.variable_return s1 =null;

        JVMPrettyPrinter.variable_return s2 =null;

        JVMPrettyPrinter.variable_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:3: (s1= variable s2= variable s3= variable -> variables(f=$s1.sts=$s2.stt=$s3.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:5: s1= variable s2= variable s3= variable
            {
            pushFollow(FOLLOW_variable_in_variables5043);
            s1=variable();

            state._fsp--;


            pushFollow(FOLLOW_variable_in_variables5047);
            s2=variable();

            state._fsp--;


            pushFollow(FOLLOW_variable_in_variables5051);
            s3=variable();

            state._fsp--;


            // TEMPLATE REWRITE
            // 435:11: -> variables(f=$s1.sts=$s2.stt=$s3.st)
            {
                retval.st = templateLib.getInstanceOf("variables",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (s2!=null?s2.st:null)).put("t", (s3!=null?s3.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:438:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text);
    public final JVMPrettyPrinter.variable_return variable() throws RecognitionException {
        JVMPrettyPrinter.variable_return retval = new JVMPrettyPrinter.variable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER67=null;
        CommonTree INTLITERAL68=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:439:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:439:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_variable5093); 

            match(input, Token.DOWN, null); 
            IDENTIFIER67=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable5095); 

            INTLITERAL68=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable5097); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 440:9: -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("f", (IDENTIFIER67!=null?IDENTIFIER67.getText():null)).put("s", (INTLITERAL68!=null?INTLITERAL68.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "javaSwitch"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:443:1: javaSwitch : ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) ) -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st);
    public final JVMPrettyPrinter.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMPrettyPrinter.javaSwitch_return retval = new JVMPrettyPrinter.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER69=null;
        List list_s=null;
        JVMPrettyPrinter.pc_return p =null;

        JVMPrettyPrinter.switchDefaultLine_return s1 =null;

        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:444:3: ( ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) ) -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:444:5: ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) )
            {
            match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch5135); 

            match(input, Token.DOWN, null); 
            IDENTIFIER69=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch5138); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_javaSwitch5142);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:444:32: (s+= switchLine )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==INTLITERAL) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:444:33: s+= switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch5147);
            	    s=switchLine();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch5153);
            s1=switchDefaultLine();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 445:11: -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st)
            {
                retval.st = templateLib.getInstanceOf("switch",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER69!=null?IDENTIFIER69.getText():null)).put("t", list_s).put("q", (s1!=null?s1.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "switchLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:448:1: switchLine : p= pc INTLITERAL -> noformatWithspace2(f=$p.sts=$INTLITERAL.text);
    public final JVMPrettyPrinter.switchLine_return switchLine() throws RecognitionException {
        JVMPrettyPrinter.switchLine_return retval = new JVMPrettyPrinter.switchLine_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL70=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:449:3: (p= pc INTLITERAL -> noformatWithspace2(f=$p.sts=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:449:5: p= pc INTLITERAL
            {
            pushFollow(FOLLOW_pc_in_switchLine5203);
            p=pc();

            state._fsp--;


            INTLITERAL70=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine5205); 

            // TEMPLATE REWRITE
            // 449:25: -> noformatWithspace2(f=$p.sts=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (INTLITERAL70!=null?INTLITERAL70.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "switchDefaultLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:452:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) -> noformatWithspace2(f=$DEFAULT.texts=$INTLITERAL.text);
    public final JVMPrettyPrinter.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMPrettyPrinter.switchDefaultLine_return retval = new JVMPrettyPrinter.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree DEFAULT71=null;
        CommonTree INTLITERAL72=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:453:3: ( ^( DEFAULT INTLITERAL ) -> noformatWithspace2(f=$DEFAULT.texts=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:453:5: ^( DEFAULT INTLITERAL )
            {
            DEFAULT71=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine5236); 

            match(input, Token.DOWN, null); 
            INTLITERAL72=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine5238); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 453:29: -> noformatWithspace2(f=$DEFAULT.texts=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (DEFAULT71!=null?DEFAULT71.getText():null)).put("s", (INTLITERAL72!=null?INTLITERAL72.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "throwClause"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:460:1: throwClause : ^( THROWS s= typeList ) -> noformatWithspace2(f=$THROWS.texts=$s.st);
    public final JVMPrettyPrinter.throwClause_return throwClause() throws RecognitionException {
        JVMPrettyPrinter.throwClause_return retval = new JVMPrettyPrinter.throwClause_return();
        retval.start = input.LT(1);


        CommonTree THROWS73=null;
        JVMPrettyPrinter.typeList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:461:3: ( ^( THROWS s= typeList ) -> noformatWithspace2(f=$THROWS.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:461:5: ^( THROWS s= typeList )
            {
            THROWS73=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause5272); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_typeList_in_throwClause5276);
            s=typeList();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 461:27: -> noformatWithspace2(f=$THROWS.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (THROWS73!=null?THROWS73.getText():null)).put("s", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "throwClauseMethod"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:464:1: throwClauseMethod : ^( THROWS (s+= throwType )+ ) -> throwC(f=$THROWS.textls=$s);
    public final JVMPrettyPrinter.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMPrettyPrinter.throwClauseMethod_return retval = new JVMPrettyPrinter.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree THROWS74=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:465:3: ( ^( THROWS (s+= throwType )+ ) -> throwC(f=$THROWS.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:465:5: ^( THROWS (s+= throwType )+ )
            {
            THROWS74=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod5307); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:465:14: (s+= throwType )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==IDENTIFIER||LA74_0==INTERNALTYPE||LA74_0==QualifiedType) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:465:15: s+= throwType
            	    {
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod5312);
            	    s=throwType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 465:31: -> throwC(f=$THROWS.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("throwC",new STAttrMap().put("f", (THROWS74!=null?THROWS74.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "throwType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:468:1: throwType : ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| QualifiedType -> noformat(f=$QualifiedType.text));
    public final JVMPrettyPrinter.throwType_return throwType() throws RecognitionException {
        JVMPrettyPrinter.throwType_return retval = new JVMPrettyPrinter.throwType_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE75=null;
        CommonTree IDENTIFIER76=null;
        CommonTree QualifiedType77=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:469:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| QualifiedType -> noformat(f=$QualifiedType.text))
            int alt75=3;
            switch ( input.LA(1) ) {
            case INTERNALTYPE:
                {
                alt75=1;
                }
                break;
            case IDENTIFIER:
                {
                alt75=2;
                }
                break;
            case QualifiedType:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:469:5: INTERNALTYPE
                    {
                    INTERNALTYPE75=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_throwType5341); 

                    // TEMPLATE REWRITE
                    // 469:23: -> noformat(f=$INTERNALTYPE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE75!=null?INTERNALTYPE75.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:470:5: IDENTIFIER
                    {
                    IDENTIFIER76=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_throwType5361); 

                    // TEMPLATE REWRITE
                    // 470:21: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER76!=null?IDENTIFIER76.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:471:5: QualifiedType
                    {
                    QualifiedType77=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_throwType5381); 

                    // TEMPLATE REWRITE
                    // 471:21: -> noformat(f=$QualifiedType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (QualifiedType77!=null?QualifiedType77.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "exceptionTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:474:1: exceptionTable : ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ ) -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s);
    public final JVMPrettyPrinter.exceptionTable_return exceptionTable() throws RecognitionException {
        JVMPrettyPrinter.exceptionTable_return retval = new JVMPrettyPrinter.exceptionTable_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        CommonTree id4=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:475:3: ( ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ ) -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:475:5: ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ )
            {
            match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable5406); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5410); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5414); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5418); 

            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5422); 

            match(input, Token.UP, null); 


            match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable5426); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:475:87: (s+= exceptionTableEntry )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==INTLITERAL) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:475:88: s+= exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable5431);
            	    s=exceptionTableEntry();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 476:11: -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("excTable",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", (id3!=null?id3.getText():null)).put("q", (id4!=null?id4.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "exceptionTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:479:1: exceptionTableEntry : id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st);
    public final JVMPrettyPrinter.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMPrettyPrinter.exceptionTableEntry_return retval = new JVMPrettyPrinter.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        JVMPrettyPrinter.exceptionTableEntryValue_return s1 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:480:3: (id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:480:5: id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue
            {
            id1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5484); 

            id2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5488); 

            id3=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5492); 

            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry5496);
            s1=exceptionTableEntryValue();

            state._fsp--;


            // TEMPLATE REWRITE
            // 481:11: -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st)
            {
                retval.st = templateLib.getInstanceOf("excTableEntry",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", (id3!=null?id3.getText():null)).put("q", (s1!=null?s1.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "exceptionTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:483:1: exceptionTableEntryValue : (s= primitiveType -> noformat(f=$s.st)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| CONSTANT_TYPE_ASSIGNABLE -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text));
    public final JVMPrettyPrinter.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMPrettyPrinter.exceptionTableEntryValue_return retval = new JVMPrettyPrinter.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER78=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE79=null;
        JVMPrettyPrinter.primitiveType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:484:3: (s= primitiveType -> noformat(f=$s.st)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| CONSTANT_TYPE_ASSIGNABLE -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text))
            int alt77=3;
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
                alt77=1;
                }
                break;
            case IDENTIFIER:
                {
                alt77=2;
                }
                break;
            case CONSTANT_TYPE_ASSIGNABLE:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:484:5: s= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue5541);
                    s=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 484:23: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:485:5: IDENTIFIER
                    {
                    IDENTIFIER78=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue5558); 

                    // TEMPLATE REWRITE
                    // 485:21: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER78!=null?IDENTIFIER78.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:486:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    CONSTANT_TYPE_ASSIGNABLE79=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue5578); 

                    // TEMPLATE REWRITE
                    // 486:31: -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CONSTANT_TYPE_ASSIGNABLE79!=null?CONSTANT_TYPE_ASSIGNABLE79.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "lineNumberTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:493:1: lineNumberTable : (s+= lineNumberTableLine )+ -> lnTable(ls=$s);
    public final JVMPrettyPrinter.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMPrettyPrinter.lineNumberTable_return retval = new JVMPrettyPrinter.lineNumberTable_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:494:3: ( (s+= lineNumberTableLine )+ -> lnTable(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:494:5: (s+= lineNumberTableLine )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:494:5: (s+= lineNumberTableLine )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==IDENTIFIER) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:494:6: s+= lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable5610);
            	    s=lineNumberTableLine();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);


            // TEMPLATE REWRITE
            // 494:33: -> lnTable(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("lnTable",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "lineNumberTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:497:1: lineNumberTableLine : ^( IDENTIFIER p= pc INTLITERAL ) -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text);
    public final JVMPrettyPrinter.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMPrettyPrinter.lineNumberTableLine_return retval = new JVMPrettyPrinter.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER80=null;
        CommonTree INTLITERAL81=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:498:3: ( ^( IDENTIFIER p= pc INTLITERAL ) -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:498:5: ^( IDENTIFIER p= pc INTLITERAL )
            {
            IDENTIFIER80=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine5637); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_lineNumberTableLine5641);
            p=pc();

            state._fsp--;


            INTLITERAL81=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine5643); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 498:35: -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("lnTableEntry",new STAttrMap().put("f", (IDENTIFIER80!=null?IDENTIFIER80.getText():null)).put("s", (p!=null?p.st:null)).put("t", (INTLITERAL81!=null?INTLITERAL81.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "localVariableTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:505:1: localVariableTable : ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* ) -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s);
    public final JVMPrettyPrinter.localVariableTable_return localVariableTable() throws RecognitionException {
        JVMPrettyPrinter.localVariableTable_return retval = new JVMPrettyPrinter.localVariableTable_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        CommonTree id4=null;
        CommonTree id5=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:506:3: ( ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* ) -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:506:5: ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* )
            {
            match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable5683); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable5687); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable5691); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable5695); 

            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable5699); 

            id5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable5703); 

            match(input, Token.UP, null); 


            match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable5707); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:506:102: (s+= localVariableTableLine )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==INTLITERAL) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:506:103: s+= localVariableTableLine
                	    {
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable5712);
                	    s=localVariableTableLine();

                	    state._fsp--;

                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop79;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 507:13: -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("lvTable",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", (id3!=null?id3.getText():null)).put("q", (id4!=null?id4.getText():null)).put("c", (id5!=null?id5.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "localVariableTableLine"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:510:1: localVariableTableLine : id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st);
    public final JVMPrettyPrinter.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMPrettyPrinter.localVariableTableLine_return retval = new JVMPrettyPrinter.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        JVMPrettyPrinter.localVariableTableLineIdentifier_return s1 =null;

        JVMPrettyPrinter.bytecodeType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:511:3: (id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:511:5: id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType
            {
            id1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine5773); 

            id2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine5777); 

            id3=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine5781); 

            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine5785);
            s1=localVariableTableLineIdentifier();

            state._fsp--;


            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine5789);
            s2=bytecodeType();

            state._fsp--;


            // TEMPLATE REWRITE
            // 512:13: -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("lvTableEntry",new STAttrMap().put("f", (id1!=null?id1.getText():null)).put("s", (id2!=null?id2.getText():null)).put("t", (id3!=null?id3.getText():null)).put("q", (s1!=null?s1.st:null)).put("c", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "localVariableTableLineIdentifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:515:1: localVariableTableLineIdentifier : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMPrettyPrinter.localVariableTableLineIdentifier_return retval = new JVMPrettyPrinter.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER82=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:516:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:516:5: IDENTIFIER
            {
            IDENTIFIER82=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier5842); 

            // TEMPLATE REWRITE
            // 516:23: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER82!=null?IDENTIFIER82.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTypeTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:523:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ ) -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s);
    public final JVMPrettyPrinter.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMPrettyPrinter.stackMapTypeTable_return retval = new JVMPrettyPrinter.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER83=null;
        CommonTree INTLITERAL84=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:524:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ ) -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:524:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ )
            {
            match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable5878); 

            match(input, Token.DOWN, null); 
            IDENTIFIER83=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable5880); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable5882); 

            INTLITERAL84=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable5884); 

            match(input, Token.UP, null); 


            match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable5888); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:524:58: (s+= stackMapTypeTableEntry )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==IDENTIFIER) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:524:59: s+= stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable5893);
            	    s=stackMapTypeTableEntry();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 525:13: -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("smtTable",new STAttrMap().put("f", (IDENTIFIER83!=null?IDENTIFIER83.getText():null)).put("s", (INTLITERAL84!=null?INTLITERAL84.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTypeTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:528:1: stackMapTypeTableEntry : id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st);
    public final JVMPrettyPrinter.stackMapTypeTableEntry_return stackMapTypeTableEntry() throws RecognitionException {
        JVMPrettyPrinter.stackMapTypeTableEntry_return retval = new JVMPrettyPrinter.stackMapTypeTableEntry_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree i1=null;
        CommonTree id2=null;
        CommonTree i2=null;
        CommonTree id3=null;
        CommonTree id4=null;
        JVMPrettyPrinter.stackMapTableTypesContainer_return s1 =null;

        JVMPrettyPrinter.stackMapTableTypesContainer_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:529:3: (id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:529:5: id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5940); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry5942); 

            i1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry5946); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5950); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry5952); 

            i2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry5956); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5965); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry5967); 

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry5971);
            s1=stackMapTableTypesContainer();

            state._fsp--;


            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5980); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry5982); 

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry5986);
            s2=stackMapTableTypesContainer();

            state._fsp--;


            // TEMPLATE REWRITE
            // 532:15: -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("smtTableEntry",new STAttrMap().put("a", (id1!=null?id1.getText():null)).put("b", (i1!=null?i1.getText():null)).put("c", (id2!=null?id2.getText():null)).put("d", (i2!=null?i2.getText():null)).put("e", (id3!=null?id3.getText():null)).put("f", (s1!=null?s1.st:null)).put("g", (id4!=null?id4.getText():null)).put("h", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTable"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:539:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ ) -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s);
    public final JVMPrettyPrinter.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMPrettyPrinter.stackMapTable_return retval = new JVMPrettyPrinter.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER85=null;
        CommonTree INTLITERAL86=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ ) -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ )
            {
            match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable6055); 

            match(input, Token.DOWN, null); 
            IDENTIFIER85=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable6057); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable6059); 

            INTLITERAL86=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable6061); 

            match(input, Token.UP, null); 


            match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable6065); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:56: (s+= stackMapTableEntry )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==ASSIGN) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:57: s+= stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable6070);
            	    s=stackMapTableEntry();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 541:13: -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("smTable",new STAttrMap().put("f", (IDENTIFIER85!=null?IDENTIFIER85.getText():null)).put("s", (INTLITERAL86!=null?INTLITERAL86.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableEntry"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:543:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue ) -> smTableEntry(f=$IDENTIFIER.texts=$s.st);
    public final JVMPrettyPrinter.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableEntry_return retval = new JVMPrettyPrinter.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER87=null;
        JVMPrettyPrinter.stackMapTableEntryValue_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:544:3: ( ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue ) -> smTableEntry(f=$IDENTIFIER.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:544:5: ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry6115); 

            match(input, Token.DOWN, null); 
            IDENTIFIER87=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry6117); 

            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry6121);
            s=stackMapTableEntryValue();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 545:13: -> smTableEntry(f=$IDENTIFIER.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("smTableEntry",new STAttrMap().put("f", (IDENTIFIER87!=null?IDENTIFIER87.getText():null)).put("s", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableEntryValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:547:1: stackMapTableEntryValue : ( INTLITERAL -> noformat(f=$INTLITERAL.text)|s= stackMapTableTypesContainer -> noformat(f=$s.st));
    public final JVMPrettyPrinter.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableEntryValue_return retval = new JVMPrettyPrinter.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL88=null;
        JVMPrettyPrinter.stackMapTableTypesContainer_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:548:3: ( INTLITERAL -> noformat(f=$INTLITERAL.text)|s= stackMapTableTypesContainer -> noformat(f=$s.st))
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==INTLITERAL) ) {
                alt82=1;
            }
            else if ( (LA82_0==UP||LA82_0==BOOLEAN||LA82_0==BYTE||LA82_0==CHAR||LA82_0==CLASS||LA82_0==DOUBLE||LA82_0==FLOAT||LA82_0==IDENTIFIER||LA82_0==INT||LA82_0==LONG||LA82_0==SHORT||LA82_0==VOID) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:548:5: INTLITERAL
                    {
                    INTLITERAL88=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue6159); 

                    // TEMPLATE REWRITE
                    // 548:23: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL88!=null?INTLITERAL88.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:549:5: s= stackMapTableTypesContainer
                    {
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue6183);
                    s=stackMapTableTypesContainer();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 549:35: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableTypesContainer"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:551:1: stackMapTableTypesContainer : s= stackMapTableTypes -> smTableContainer(f=$s.st);
    public final JVMPrettyPrinter.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypesContainer_return retval = new JVMPrettyPrinter.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.stackMapTableTypes_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:552:3: (s= stackMapTableTypes -> smTableContainer(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:552:5: s= stackMapTableTypes
            {
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer6206);
            s=stackMapTableTypes();

            state._fsp--;


            // TEMPLATE REWRITE
            // 552:37: -> smTableContainer(f=$s.st)
            {
                retval.st = templateLib.getInstanceOf("smTableContainer",new STAttrMap().put("f", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableTypes"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:554:1: stackMapTableTypes : (s+= stackMapTableType )* -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypes_return retval = new JVMPrettyPrinter.stackMapTableTypes_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:3: ( (s+= stackMapTableType )* -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:5: (s+= stackMapTableType )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:5: (s+= stackMapTableType )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==IDENTIFIER) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==UP||LA83_1==BOOLEAN||LA83_1==BYTE||LA83_1==CHAR||LA83_1==CLASS||LA83_1==DOUBLE||LA83_1==FLOAT||LA83_1==IDENTIFIER||LA83_1==INT||LA83_1==INTLITERAL||LA83_1==LONG||LA83_1==SHORT||LA83_1==VOID) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==BOOLEAN||LA83_0==BYTE||LA83_0==CHAR||LA83_0==CLASS||LA83_0==DOUBLE||LA83_0==FLOAT||LA83_0==INT||LA83_0==LONG||LA83_0==SHORT||LA83_0==VOID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:6: s+= stackMapTableType
            	    {
            	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes6241);
            	    s=stackMapTableType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 555:31: -> commaSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("commaSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:557:1: stackMapTableType : (s1= stackMapTableTypeObject -> noformat(f=$s1.st)|s2= stackMapTableTypePlainObject -> noformat(f=$s2.st)|s3= primitiveType -> noformat(f=$s3.st)| IDENTIFIER ( INTLITERAL )? -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text));
    public final JVMPrettyPrinter.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableType_return retval = new JVMPrettyPrinter.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER89=null;
        CommonTree INTLITERAL90=null;
        JVMPrettyPrinter.stackMapTableTypeObject_return s1 =null;

        JVMPrettyPrinter.stackMapTableTypePlainObject_return s2 =null;

        JVMPrettyPrinter.primitiveType_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:558:3: (s1= stackMapTableTypeObject -> noformat(f=$s1.st)|s2= stackMapTableTypePlainObject -> noformat(f=$s2.st)|s3= primitiveType -> noformat(f=$s3.st)| IDENTIFIER ( INTLITERAL )? -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text))
            int alt85=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==STRINGLITERAL) ) {
                    alt85=1;
                }
                else if ( (LA85_1==INTERNALTYPE) ) {
                    alt85=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

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
                alt85=3;
                }
                break;
            case IDENTIFIER:
                {
                alt85=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;

            }

            switch (alt85) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:558:5: s1= stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType6268);
                    s1=stackMapTableTypeObject();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 558:35: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:559:5: s2= stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType6288);
                    s2=stackMapTableTypePlainObject();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 559:37: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:560:5: s3= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType6305);
                    s3=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 560:27: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:561:5: IDENTIFIER ( INTLITERAL )?
                    {
                    IDENTIFIER89=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType6325); 

                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:561:16: ( INTLITERAL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==INTLITERAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:561:16: INTLITERAL
                            {
                            INTLITERAL90=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType6327); 

                            }
                            break;

                    }


                    // TEMPLATE REWRITE
                    // 561:31: -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (IDENTIFIER89!=null?IDENTIFIER89.getText():null)).put("s", (INTLITERAL90!=null?INTLITERAL90.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableTypePlainObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:563:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypePlainObject_return retval = new JVMPrettyPrinter.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree CLASS91=null;
        CommonTree INTERNALTYPE92=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:564:3: ( CLASS INTERNALTYPE -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:564:5: CLASS INTERNALTYPE
            {
            CLASS91=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject6356); 

            INTERNALTYPE92=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject6358); 

            // TEMPLATE REWRITE
            // 564:29: -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (CLASS91!=null?CLASS91.getText():null)).put("s", (INTERNALTYPE92!=null?INTERNALTYPE92.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "stackMapTableTypeObject"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:566:1: stackMapTableTypeObject : CLASS STRINGLITERAL -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text);
    public final JVMPrettyPrinter.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypeObject_return retval = new JVMPrettyPrinter.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree CLASS93=null;
        CommonTree STRINGLITERAL94=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:567:3: ( CLASS STRINGLITERAL -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:567:5: CLASS STRINGLITERAL
            {
            CLASS93=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject6388); 

            STRINGLITERAL94=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject6390); 

            // TEMPLATE REWRITE
            // 567:29: -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (CLASS93!=null?CLASS93.getText():null)).put("s", (STRINGLITERAL94!=null?STRINGLITERAL94.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:577:1: typeList : (s+= type )+ -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.typeList_return typeList() throws RecognitionException {
        JVMPrettyPrinter.typeList_return retval = new JVMPrettyPrinter.typeList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:3: ( (s+= type )+ -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:5: (s+= type )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:5: (s+= type )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==BOOLEAN||LA86_0==BYTE||LA86_0==CHAR||LA86_0==DOUBLE||LA86_0==FLOAT||LA86_0==INT||LA86_0==LONG||LA86_0==SHORT||LA86_0==UNITNAME||LA86_0==VOID) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:6: s+= type
            	    {
            	    pushFollow(FOLLOW_type_in_typeList6430);
            	    s=type();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);


            // TEMPLATE REWRITE
            // 578:23: -> commaSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("commaSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:580:1: type : s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* ) -> type(f=$s.sts=$b);
    public final JVMPrettyPrinter.type_return type() throws RecognitionException {
        JVMPrettyPrinter.type_return retval = new JVMPrettyPrinter.type_return();
        retval.start = input.LT(1);


        CommonTree b=null;
        List list_b=null;
        JVMPrettyPrinter.combinedJavaType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:581:3: (s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* ) -> type(f=$s.sts=$b))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:581:5: s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* )
            {
            pushFollow(FOLLOW_combinedJavaType_in_type6462);
            s=combinedJavaType();

            state._fsp--;


            match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type6465); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:581:38: (b+= LBRACK RBRACK )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==LBRACK) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:581:39: b+= LBRACK RBRACK
                	    {
                	    b=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type6470); 
                	    if (list_b==null) list_b=new ArrayList();
                	    list_b.add(b);


                	    match(input,RBRACK,FOLLOW_RBRACK_in_type6472); 

                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 582:13: -> type(f=$s.sts=$b)
            {
                retval.st = templateLib.getInstanceOf("type",new STAttrMap().put("f", (s!=null?s.st:null)).put("s", list_b));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "combinedJavaType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:584:1: combinedJavaType : (s1= primitiveType -> noformat(f=$s1.st)|s2= referenceType -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMPrettyPrinter.combinedJavaType_return retval = new JVMPrettyPrinter.combinedJavaType_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.primitiveType_return s1 =null;

        JVMPrettyPrinter.referenceType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:585:3: (s1= primitiveType -> noformat(f=$s1.st)|s2= referenceType -> noformat(f=$s2.st))
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==BOOLEAN||LA88_0==BYTE||LA88_0==CHAR||LA88_0==DOUBLE||LA88_0==FLOAT||LA88_0==INT||LA88_0==LONG||LA88_0==SHORT||LA88_0==VOID) ) {
                alt88=1;
            }
            else if ( (LA88_0==UNITNAME) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:585:5: s1= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType6515);
                    s1=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 585:27: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:586:5: s2= referenceType
                    {
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType6537);
                    s2=referenceType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 586:27: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "referenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:588:1: referenceType : ^( UNITNAME (s+= typeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.referenceType_return referenceType() throws RecognitionException {
        JVMPrettyPrinter.referenceType_return retval = new JVMPrettyPrinter.referenceType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:3: ( ^( UNITNAME (s+= typeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:5: ^( UNITNAME (s+= typeDeclSpecifier )+ )
            {
            match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType6564); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:16: (s+= typeDeclSpecifier )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==QualifiedType) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:17: s+= typeDeclSpecifier
            	    {
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType6569);
            	    s=typeDeclSpecifier();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 589:41: -> dotSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("dotSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:591:1: typeDeclSpecifier : ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMPrettyPrinter.typeDeclSpecifier_return retval = new JVMPrettyPrinter.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.typeName_return s1 =null;

        JVMPrettyPrinter.typeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:3: ( ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:5: ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) )
            {
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier6596);
            s1=typeName();

            state._fsp--;


            match(input, Token.DOWN, null); 
            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier6599); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:32: (s2= typeArguments )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==BOOLEAN||LA90_0==BYTE||LA90_0==CHAR||LA90_0==DOUBLE||LA90_0==FLOAT||LA90_0==INT||LA90_0==LONG||LA90_0==QUESTION||LA90_0==SHORT||LA90_0==UNITNAME||LA90_0==VOID) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:32: s2= typeArguments
                        {
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier6603);
                        s2=typeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 593:13: -> noformat2(f=$s1.sts=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:595:1: typeName : QualifiedType -> noformat(f=$QualifiedType.text);
    public final JVMPrettyPrinter.typeName_return typeName() throws RecognitionException {
        JVMPrettyPrinter.typeName_return retval = new JVMPrettyPrinter.typeName_return();
        retval.start = input.LT(1);


        CommonTree QualifiedType95=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:596:3: ( QualifiedType -> noformat(f=$QualifiedType.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:596:5: QualifiedType
            {
            QualifiedType95=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName6644); 

            // TEMPLATE REWRITE
            // 596:23: -> noformat(f=$QualifiedType.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (QualifiedType95!=null?QualifiedType95.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:598:1: typeArguments : (s+= typeArgument )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.typeArguments_return typeArguments() throws RecognitionException {
        JVMPrettyPrinter.typeArguments_return retval = new JVMPrettyPrinter.typeArguments_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:599:3: ( (s+= typeArgument )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:599:5: (s+= typeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:599:5: (s+= typeArgument )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==BOOLEAN||LA91_0==BYTE||LA91_0==CHAR||LA91_0==DOUBLE||LA91_0==FLOAT||LA91_0==INT||LA91_0==LONG||LA91_0==QUESTION||LA91_0==SHORT||LA91_0==UNITNAME||LA91_0==VOID) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:599:6: s+= typeArgument
            	    {
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments6672);
            	    s=typeArgument();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 599:29: -> genericParam(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("genericParam",new STAttrMap().put("ls", list_s));
            }



            }

        }
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


    public static class typeArgument_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:601:1: typeArgument : (s1= type -> noformat(f=$s1.st)|s2= wildcard -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.typeArgument_return typeArgument() throws RecognitionException {
        JVMPrettyPrinter.typeArgument_return retval = new JVMPrettyPrinter.typeArgument_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.type_return s1 =null;

        JVMPrettyPrinter.wildcard_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:602:3: (s1= type -> noformat(f=$s1.st)|s2= wildcard -> noformat(f=$s2.st))
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==BOOLEAN||LA92_0==BYTE||LA92_0==CHAR||LA92_0==DOUBLE||LA92_0==FLOAT||LA92_0==INT||LA92_0==LONG||LA92_0==SHORT||LA92_0==UNITNAME||LA92_0==VOID) ) {
                alt92=1;
            }
            else if ( (LA92_0==QUESTION) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }
            switch (alt92) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:602:5: s1= type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument6702);
                    s1=type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 602:19: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:603:5: s2= wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_typeArgument6725);
                    s2=wildcard();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 603:23: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "wildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:605:1: wildcard : ^( QUESTION (s1= wildcardBounds )? ) -> wildT(f=$s1.st);
    public final JVMPrettyPrinter.wildcard_return wildcard() throws RecognitionException {
        JVMPrettyPrinter.wildcard_return retval = new JVMPrettyPrinter.wildcard_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.wildcardBounds_return s1 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:606:3: ( ^( QUESTION (s1= wildcardBounds )? ) -> wildT(f=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:606:5: ^( QUESTION (s1= wildcardBounds )? )
            {
            match(input,QUESTION,FOLLOW_QUESTION_in_wildcard6753); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:606:18: (s1= wildcardBounds )?
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==EXTENDS||LA93_0==SUPER) ) {
                    alt93=1;
                }
                switch (alt93) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:606:18: s1= wildcardBounds
                        {
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard6757);
                        s1=wildcardBounds();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 606:37: -> wildT(f=$s1.st)
            {
                retval.st = templateLib.getInstanceOf("wildT",new STAttrMap().put("f", (s1!=null?s1.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "wildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:608:1: wildcardBounds : ( ^( EXTENDS s1= type ) -> wildBoundsT(f=$EXTENDS.textf=$s1.st)| ^( SUPER s2= type ) -> wildBoundsT(f=$SUPER.textf=$s2.st));
    public final JVMPrettyPrinter.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMPrettyPrinter.wildcardBounds_return retval = new JVMPrettyPrinter.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS96=null;
        CommonTree SUPER97=null;
        JVMPrettyPrinter.type_return s1 =null;

        JVMPrettyPrinter.type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:609:3: ( ^( EXTENDS s1= type ) -> wildBoundsT(f=$EXTENDS.textf=$s1.st)| ^( SUPER s2= type ) -> wildBoundsT(f=$SUPER.textf=$s2.st))
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==EXTENDS) ) {
                alt94=1;
            }
            else if ( (LA94_0==SUPER) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }
            switch (alt94) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:609:5: ^( EXTENDS s1= type )
                    {
                    EXTENDS96=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds6782); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_wildcardBounds6786);
                    s1=type();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 609:29: -> wildBoundsT(f=$EXTENDS.textf=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("wildBoundsT",new STAttrMap().put("f", (EXTENDS96!=null?EXTENDS96.getText():null)).put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:610:5: ^( SUPER s2= type )
                    {
                    SUPER97=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds6813); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_wildcardBounds6817);
                    s2=type();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 610:27: -> wildBoundsT(f=$SUPER.textf=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("wildBoundsT",new STAttrMap().put("f", (SUPER97!=null?SUPER97.getText():null)).put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeParameters"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:612:1: typeParameters : (s+= typeParameter )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.typeParameters_return typeParameters() throws RecognitionException {
        JVMPrettyPrinter.typeParameters_return retval = new JVMPrettyPrinter.typeParameters_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:3: ( (s+= typeParameter )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:5: (s+= typeParameter )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:5: (s+= typeParameter )+
            int cnt95=0;
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==IDENTIFIER) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:6: s+= typeParameter
            	    {
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters6852);
            	    s=typeParameter();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
            } while (true);


            // TEMPLATE REWRITE
            // 613:29: -> genericParam(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("genericParam",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeParameter"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:615:1: typeParameter : ^(id= identifier (tb= typeBound )? ) -> noformat2(f=$id.sts=$tb.st);
    public final JVMPrettyPrinter.typeParameter_return typeParameter() throws RecognitionException {
        JVMPrettyPrinter.typeParameter_return retval = new JVMPrettyPrinter.typeParameter_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.identifier_return id =null;

        JVMPrettyPrinter.typeBound_return tb =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:616:3: ( ^(id= identifier (tb= typeBound )? ) -> noformat2(f=$id.sts=$tb.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:616:5: ^(id= identifier (tb= typeBound )? )
            {
            pushFollow(FOLLOW_identifier_in_typeParameter6882);
            id=identifier();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:616:23: (tb= typeBound )?
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==EXTENDS) ) {
                    alt96=1;
                }
                switch (alt96) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:616:23: tb= typeBound
                        {
                        pushFollow(FOLLOW_typeBound_in_typeParameter6886);
                        tb=typeBound();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 616:37: -> noformat2(f=$id.sts=$tb.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (id!=null?id.st:null)).put("s", (tb!=null?tb.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "typeBound"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:618:1: typeBound : ^( EXTENDS (s+= referenceType )+ ) -> tBound(f=$EXTENDS.textls=$s);
    public final JVMPrettyPrinter.typeBound_return typeBound() throws RecognitionException {
        JVMPrettyPrinter.typeBound_return retval = new JVMPrettyPrinter.typeBound_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS98=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:619:3: ( ^( EXTENDS (s+= referenceType )+ ) -> tBound(f=$EXTENDS.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:619:5: ^( EXTENDS (s+= referenceType )+ )
            {
            EXTENDS98=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound6916); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:619:15: (s+= referenceType )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==UNITNAME) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:619:16: s+= referenceType
            	    {
            	    pushFollow(FOLLOW_referenceType_in_typeBound6921);
            	    s=referenceType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 619:37: -> tBound(f=$EXTENDS.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("tBound",new STAttrMap().put("f", (EXTENDS98!=null?EXTENDS98.getText():null)).put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "genericDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:624:1: genericDescriptor : (s+= genericReturnDescriptor )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMPrettyPrinter.genericDescriptor_return retval = new JVMPrettyPrinter.genericDescriptor_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:625:3: ( (s+= genericReturnDescriptor )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:625:5: (s+= genericReturnDescriptor )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:625:5: (s+= genericReturnDescriptor )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==EXTENDS) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:625:6: s+= genericReturnDescriptor
            	    {
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor6957);
            	    s=genericReturnDescriptor();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);


            // TEMPLATE REWRITE
            // 625:37: -> genericParam(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("genericParam",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "genericReturnDescriptor"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:627:1: genericReturnDescriptor : ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList ) -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st);
    public final JVMPrettyPrinter.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMPrettyPrinter.genericReturnDescriptor_return retval = new JVMPrettyPrinter.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS99=null;
        JVMPrettyPrinter.identifier_return s1 =null;

        JVMPrettyPrinter.bytecodeReferenceTypeList_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:628:3: ( ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList ) -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:628:5: ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList )
            {
            EXTENDS99=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor6983); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor6987);
            s1=identifier();

            state._fsp--;


            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor6991);
            s2=bytecodeReferenceTypeList();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 629:15: -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("genRetDesc",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (EXTENDS99!=null?EXTENDS99.getText():null)).put("t", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeReferenceTypeList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:631:1: bytecodeReferenceTypeList : (s+= bytecodeReferenceType )+ -> andSeparatedList(ls=$s);
    public final JVMPrettyPrinter.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMPrettyPrinter.bytecodeReferenceTypeList_return retval = new JVMPrettyPrinter.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:632:3: ( (s+= bytecodeReferenceType )+ -> andSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:632:5: (s+= bytecodeReferenceType )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:632:5: (s+= bytecodeReferenceType )+
            int cnt99=0;
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==UNITNAME) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:632:6: s+= bytecodeReferenceType
            	    {
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList7039);
            	    s=bytecodeReferenceType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt99 >= 1 ) break loop99;
                        EarlyExitException eee =
                            new EarlyExitException(99, input);
                        throw eee;
                }
                cnt99++;
            } while (true);


            // TEMPLATE REWRITE
            // 632:37: -> andSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("andSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:634:1: bytecodeReferenceType : ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeReferenceType_return retval = new JVMPrettyPrinter.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:635:3: ( ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:635:5: ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ )
            {
            match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType7067); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:635:16: (s+= bytecodeTypeDeclSpecifier )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==INTERNALTYPE) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:635:17: s+= bytecodeTypeDeclSpecifier
            	    {
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType7072);
            	    s=bytecodeTypeDeclSpecifier();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 635:49: -> dotSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("dotSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeTypeDeclSpecifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:637:1: bytecodeTypeDeclSpecifier : s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return retval = new JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeTypeName_return s1 =null;

        JVMPrettyPrinter.bytecodeTypeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:638:3: (s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:638:5: s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? )
            {
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier7098);
            s1=bytecodeTypeName();

            state._fsp--;


            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier7101); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:638:38: (s2= bytecodeTypeArguments )?
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==QUESTION||LA101_0==UNITNAME) ) {
                    alt101=1;
                }
                switch (alt101) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:638:38: s2= bytecodeTypeArguments
                        {
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier7105);
                        s2=bytecodeTypeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 639:15: -> noformat2(f=$s1.sts=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:641:1: bytecodeTypeName : INTERNALTYPE -> noformat(f=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeName_return retval = new JVMPrettyPrinter.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE100=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:642:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:642:5: INTERNALTYPE
            {
            INTERNALTYPE100=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName7147); 

            // TEMPLATE REWRITE
            // 642:25: -> noformat(f=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE100!=null?INTERNALTYPE100.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:644:1: bytecodeTypeArguments : s= bytecodeTypeArgumentList -> noformat(f=$s.st);
    public final JVMPrettyPrinter.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArguments_return retval = new JVMPrettyPrinter.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeTypeArgumentList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:645:3: (s= bytecodeTypeArgumentList -> noformat(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:645:5: s= bytecodeTypeArgumentList
            {
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments7177);
            s=bytecodeTypeArgumentList();

            state._fsp--;


            // TEMPLATE REWRITE
            // 645:37: -> noformat(f=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:647:1: bytecodeTypeArgumentList : (s+= bytecodeTypeArgument )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArgumentList_return retval = new JVMPrettyPrinter.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:648:3: ( (s+= bytecodeTypeArgument )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:648:5: (s+= bytecodeTypeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:648:5: (s+= bytecodeTypeArgument )+
            int cnt102=0;
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==QUESTION||LA102_0==UNITNAME) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:648:6: s+= bytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList7207);
            	    s=bytecodeTypeArgument();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt102 >= 1 ) break loop102;
                        EarlyExitException eee =
                            new EarlyExitException(102, input);
                        throw eee;
                }
                cnt102++;
            } while (true);


            // TEMPLATE REWRITE
            // 648:37: -> genericParam(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("genericParam",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:650:1: bytecodeTypeArgument : (s1= bytecodeReferenceType -> noformat(f=$s1.st)|s2= bytecodeWildcard -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArgument_return retval = new JVMPrettyPrinter.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeReferenceType_return s1 =null;

        JVMPrettyPrinter.bytecodeWildcard_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:651:3: (s1= bytecodeReferenceType -> noformat(f=$s1.st)|s2= bytecodeWildcard -> noformat(f=$s2.st))
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==UNITNAME) ) {
                alt103=1;
            }
            else if ( (LA103_0==QUESTION) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:651:5: s1= bytecodeReferenceType
                    {
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument7237);
                    s1=bytecodeReferenceType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 651:33: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:652:5: s2= bytecodeWildcard
                    {
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument7257);
                    s2=bytecodeWildcard();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 652:29: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeWildcard"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:654:1: bytecodeWildcard : ^( QUESTION (s= bytecodeWildcardBounds )? ) -> noformatWithspace2(f=$QUESTION.texts=$s.st);
    public final JVMPrettyPrinter.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMPrettyPrinter.bytecodeWildcard_return retval = new JVMPrettyPrinter.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree QUESTION101=null;
        JVMPrettyPrinter.bytecodeWildcardBounds_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:655:3: ( ^( QUESTION (s= bytecodeWildcardBounds )? ) -> noformatWithspace2(f=$QUESTION.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:655:5: ^( QUESTION (s= bytecodeWildcardBounds )? )
            {
            QUESTION101=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard7283); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:655:17: (s= bytecodeWildcardBounds )?
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==EXTENDS||LA104_0==SUPER) ) {
                    alt104=1;
                }
                switch (alt104) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:655:17: s= bytecodeWildcardBounds
                        {
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard7287);
                        s=bytecodeWildcardBounds();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 655:43: -> noformatWithspace2(f=$QUESTION.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (QUESTION101!=null?QUESTION101.getText():null)).put("s", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeWildcardBounds"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:657:1: bytecodeWildcardBounds : ( ^( EXTENDS s1= bytecodeReferenceType ) -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= bytecodeReferenceType ) -> noformatWithspace2(f=$SUPER.texts=$s2.st));
    public final JVMPrettyPrinter.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMPrettyPrinter.bytecodeWildcardBounds_return retval = new JVMPrettyPrinter.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS102=null;
        CommonTree SUPER103=null;
        JVMPrettyPrinter.bytecodeReferenceType_return s1 =null;

        JVMPrettyPrinter.bytecodeReferenceType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:658:3: ( ^( EXTENDS s1= bytecodeReferenceType ) -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= bytecodeReferenceType ) -> noformatWithspace2(f=$SUPER.texts=$s2.st))
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==EXTENDS) ) {
                alt105=1;
            }
            else if ( (LA105_0==SUPER) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:658:5: ^( EXTENDS s1= bytecodeReferenceType )
                    {
                    EXTENDS102=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds7315); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7319);
                    s1=bytecodeReferenceType();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 658:43: -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (EXTENDS102!=null?EXTENDS102.getText():null)).put("s", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:659:5: ^( SUPER s2= bytecodeReferenceType )
                    {
                    SUPER103=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds7342); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7346);
                    s2=bytecodeReferenceType();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 659:41: -> noformatWithspace2(f=$SUPER.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (SUPER103!=null?SUPER103.getText():null)).put("s", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:666:1: bytecodeType : (s1= bytecodeArrayType -> noformat(f=$s1.st)| BaseType -> noformat(f=$BaseType.text)|s2= simpleBytecodeObjectType SEMI -> noformat2(f=$s2.sts=$SEMI.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text));
    public final JVMPrettyPrinter.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeType_return retval = new JVMPrettyPrinter.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree BaseType104=null;
        CommonTree SEMI105=null;
        CommonTree IDENTIFIER106=null;
        JVMPrettyPrinter.bytecodeArrayType_return s1 =null;

        JVMPrettyPrinter.simpleBytecodeObjectType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:667:3: (s1= bytecodeArrayType -> noformat(f=$s1.st)| BaseType -> noformat(f=$BaseType.text)|s2= simpleBytecodeObjectType SEMI -> noformat2(f=$s2.sts=$SEMI.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text))
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
                alt106=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:667:5: s1= bytecodeArrayType
                    {
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType7381);
                    s1=bytecodeArrayType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 667:29: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:668:5: BaseType
                    {
                    BaseType104=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType7399); 

                    // TEMPLATE REWRITE
                    // 668:21: -> noformat(f=$BaseType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BaseType104!=null?BaseType104.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:669:5: s2= simpleBytecodeObjectType SEMI
                    {
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType7423);
                    s2=simpleBytecodeObjectType();

                    state._fsp--;


                    SEMI105=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType7425); 

                    // TEMPLATE REWRITE
                    // 669:39: -> noformat2(f=$s2.sts=$SEMI.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (s2!=null?s2.st:null)).put("s", (SEMI105!=null?SEMI105.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:670:5: IDENTIFIER
                    {
                    IDENTIFIER106=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType7445); 

                    // TEMPLATE REWRITE
                    // 670:23: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER106!=null?IDENTIFIER106.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bytecodeArrayType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:673:1: bytecodeArrayType : LBRACK s= bytecodeType -> noformat2(f=$LBRACK.texts=$s.st);
    public final JVMPrettyPrinter.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeArrayType_return retval = new JVMPrettyPrinter.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree LBRACK107=null;
        JVMPrettyPrinter.bytecodeType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:674:3: ( LBRACK s= bytecodeType -> noformat2(f=$LBRACK.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:674:5: LBRACK s= bytecodeType
            {
            LBRACK107=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType7476); 

            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType7480);
            s=bytecodeType();

            state._fsp--;


            // TEMPLATE REWRITE
            // 674:29: -> noformat2(f=$LBRACK.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (LBRACK107!=null?LBRACK107.getText():null)).put("s", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeObjectType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:676:1: simpleBytecodeObjectType : (s+= simpleBytecodeReferenceType )+ -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeObjectType_return retval = new JVMPrettyPrinter.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:677:3: ( (s+= simpleBytecodeReferenceType )+ -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:677:5: (s+= simpleBytecodeReferenceType )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:677:5: (s+= simpleBytecodeReferenceType )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==INTERNALTYPE) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:677:6: s+= simpleBytecodeReferenceType
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType7511);
            	    s=simpleBytecodeReferenceType();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
            } while (true);


            // TEMPLATE REWRITE
            // 677:39: -> dotSeparatedList(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("dotSeparatedList",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeReferenceType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:679:1: simpleBytecodeReferenceType : s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeReferenceType_return retval = new JVMPrettyPrinter.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return s1 =null;

        JVMPrettyPrinter.simpleBytecodeTypeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:680:3: (s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:680:5: s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? )
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType7536);
            s1=simpleBytecodeReferenceTypeName();

            state._fsp--;


            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType7539); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:680:53: (s2= simpleBytecodeTypeArguments )?
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==BaseType||LA108_0==IDENTIFIER||LA108_0==INTERNALTYPE||LA108_0==LBRACK||LA108_0==MINUS||LA108_0==PLUS||LA108_0==STAR) ) {
                    alt108=1;
                }
                switch (alt108) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:680:53: s2= simpleBytecodeTypeArguments
                        {
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType7543);
                        s2=simpleBytecodeTypeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 681:13: -> noformat2(f=$s1.sts=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (s2!=null?s2.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeReferenceTypeName"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:683:1: simpleBytecodeReferenceTypeName : INTERNALTYPE -> noformat(f=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return retval = new JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE108=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:684:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:684:5: INTERNALTYPE
            {
            INTERNALTYPE108=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName7582); 

            // TEMPLATE REWRITE
            // 684:23: -> noformat(f=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE108!=null?INTERNALTYPE108.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeTypeArguments"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:686:1: simpleBytecodeTypeArguments : s= simpleBytecodeTypeArgumentList -> noformat(f=$s.st);
    public final JVMPrettyPrinter.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArguments_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:687:3: (s= simpleBytecodeTypeArgumentList -> noformat(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:687:5: s= simpleBytecodeTypeArgumentList
            {
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments7610);
            s=simpleBytecodeTypeArgumentList();

            state._fsp--;


            // TEMPLATE REWRITE
            // 687:39: -> noformat(f=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeTypeArgumentList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:689:1: simpleBytecodeTypeArgumentList : (s+= simpleBytecodeTypeArgument )+ -> bcGenericArgs(ls=$s);
    public final JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:690:3: ( (s+= simpleBytecodeTypeArgument )+ -> bcGenericArgs(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:690:5: (s+= simpleBytecodeTypeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:690:5: (s+= simpleBytecodeTypeArgument )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==BaseType||LA109_0==IDENTIFIER||LA109_0==INTERNALTYPE||LA109_0==LBRACK||LA109_0==MINUS||LA109_0==PLUS||LA109_0==STAR) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:690:6: s+= simpleBytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList7635);
            	    s=simpleBytecodeTypeArgument();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);


            // TEMPLATE REWRITE
            // 690:39: -> bcGenericArgs(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("bcGenericArgs",new STAttrMap().put("ls", list_s));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "simpleBytecodeTypeArgument"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:692:1: simpleBytecodeTypeArgument : (s1= bytecodeType -> noformat(f=$s1.st)| MINUS s2= bytecodeType -> noformat2(f=$MINUS.texts=$s2.st)| PLUS s3= bytecodeType -> noformat2(f=$PLUS.texts=$s3.st)| STAR -> noformat(f=$STAR.text));
    public final JVMPrettyPrinter.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArgument_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree MINUS109=null;
        CommonTree PLUS110=null;
        CommonTree STAR111=null;
        JVMPrettyPrinter.bytecodeType_return s1 =null;

        JVMPrettyPrinter.bytecodeType_return s2 =null;

        JVMPrettyPrinter.bytecodeType_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:693:3: (s1= bytecodeType -> noformat(f=$s1.st)| MINUS s2= bytecodeType -> noformat2(f=$MINUS.texts=$s2.st)| PLUS s3= bytecodeType -> noformat2(f=$PLUS.texts=$s3.st)| STAR -> noformat(f=$STAR.text))
            int alt110=4;
            switch ( input.LA(1) ) {
            case BaseType:
            case IDENTIFIER:
            case INTERNALTYPE:
            case LBRACK:
                {
                alt110=1;
                }
                break;
            case MINUS:
                {
                alt110=2;
                }
                break;
            case PLUS:
                {
                alt110=3;
                }
                break;
            case STAR:
                {
                alt110=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:693:5: s1= bytecodeType
                    {
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7661);
                    s1=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 693:25: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:694:5: MINUS s2= bytecodeType
                    {
                    MINUS109=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument7680); 

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7684);
                    s2=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 694:31: -> noformat2(f=$MINUS.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (MINUS109!=null?MINUS109.getText():null)).put("s", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:695:5: PLUS s3= bytecodeType
                    {
                    PLUS110=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument7707); 

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7711);
                    s3=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 695:31: -> noformat2(f=$PLUS.texts=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (PLUS110!=null?PLUS110.getText():null)).put("s", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:696:5: STAR
                    {
                    STAR111=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument7735); 

                    // TEMPLATE REWRITE
                    // 696:17: -> noformat(f=$STAR.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STAR111!=null?STAR111.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "identifier"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:703:1: identifier : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.identifier_return identifier() throws RecognitionException {
        JVMPrettyPrinter.identifier_return retval = new JVMPrettyPrinter.identifier_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER112=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:704:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:704:5: IDENTIFIER
            {
            IDENTIFIER112=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier7768); 

            // TEMPLATE REWRITE
            // 704:19: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER112!=null?IDENTIFIER112.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "keywordAggregate"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:707:1: keywordAggregate : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMPrettyPrinter.keywordAggregate_return retval = new JVMPrettyPrinter.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER113=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:708:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:708:6: IDENTIFIER
            {
            IDENTIFIER113=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_keywordAggregate7794); 

            // TEMPLATE REWRITE
            // 708:21: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER113!=null?IDENTIFIER113.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "primitiveType"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:711:1: primitiveType : (s1= boolean_type -> noformat(f=$s1.st)|s2= numeric_type -> noformat(f=$s2.st)| VOID -> noformat(f=$VOID.text));
    public final JVMPrettyPrinter.primitiveType_return primitiveType() throws RecognitionException {
        JVMPrettyPrinter.primitiveType_return retval = new JVMPrettyPrinter.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree VOID114=null;
        JVMPrettyPrinter.boolean_type_return s1 =null;

        JVMPrettyPrinter.numeric_type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:712:3: (s1= boolean_type -> noformat(f=$s1.st)|s2= numeric_type -> noformat(f=$s2.st)| VOID -> noformat(f=$VOID.text))
            int alt111=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt111=1;
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
                alt111=2;
                }
                break;
            case VOID:
                {
                alt111=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }

            switch (alt111) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:712:5: s1= boolean_type
                    {
                    pushFollow(FOLLOW_boolean_type_in_primitiveType7822);
                    s1=boolean_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 712:23: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:713:5: s2= numeric_type
                    {
                    pushFollow(FOLLOW_numeric_type_in_primitiveType7841);
                    s2=numeric_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 713:23: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:714:5: VOID
                    {
                    VOID114=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType7858); 

                    // TEMPLATE REWRITE
                    // 714:15: -> noformat(f=$VOID.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VOID114!=null?VOID114.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "boolean_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:717:1: boolean_type : BOOLEAN -> noformat(f=$BOOLEAN.text);
    public final JVMPrettyPrinter.boolean_type_return boolean_type() throws RecognitionException {
        JVMPrettyPrinter.boolean_type_return retval = new JVMPrettyPrinter.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree BOOLEAN115=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:718:3: ( BOOLEAN -> noformat(f=$BOOLEAN.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:718:5: BOOLEAN
            {
            BOOLEAN115=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type7885); 

            // TEMPLATE REWRITE
            // 718:17: -> noformat(f=$BOOLEAN.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BOOLEAN115!=null?BOOLEAN115.getText():null)));
            }



            }

        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "numeric_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:721:1: numeric_type : (s1= floating_point_type -> noformat(f=$s1.st)|s2= integral_type -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.numeric_type_return numeric_type() throws RecognitionException {
        JVMPrettyPrinter.numeric_type_return retval = new JVMPrettyPrinter.numeric_type_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.floating_point_type_return s1 =null;

        JVMPrettyPrinter.integral_type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:722:3: (s1= floating_point_type -> noformat(f=$s1.st)|s2= integral_type -> noformat(f=$s2.st))
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==DOUBLE||LA112_0==FLOAT) ) {
                alt112=1;
            }
            else if ( (LA112_0==BYTE||LA112_0==CHAR||LA112_0==INT||LA112_0==LONG||LA112_0==SHORT) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }
            switch (alt112) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:722:5: s1= floating_point_type
                    {
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type7913);
                    s1=floating_point_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 722:29: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:723:5: s2= integral_type
                    {
                    pushFollow(FOLLOW_integral_type_in_numeric_type7931);
                    s2=integral_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 723:25: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "integral_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:726:1: integral_type : ( BYTE -> noformat(f=$BYTE.text)| SHORT -> noformat(f=$SHORT.text)| INT -> noformat(f=$INT.text)| LONG -> noformat(f=$LONG.text)| CHAR -> noformat(f=$CHAR.text));
    public final JVMPrettyPrinter.integral_type_return integral_type() throws RecognitionException {
        JVMPrettyPrinter.integral_type_return retval = new JVMPrettyPrinter.integral_type_return();
        retval.start = input.LT(1);


        CommonTree BYTE116=null;
        CommonTree SHORT117=null;
        CommonTree INT118=null;
        CommonTree LONG119=null;
        CommonTree CHAR120=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:727:3: ( BYTE -> noformat(f=$BYTE.text)| SHORT -> noformat(f=$SHORT.text)| INT -> noformat(f=$INT.text)| LONG -> noformat(f=$LONG.text)| CHAR -> noformat(f=$CHAR.text))
            int alt113=5;
            switch ( input.LA(1) ) {
            case BYTE:
                {
                alt113=1;
                }
                break;
            case SHORT:
                {
                alt113=2;
                }
                break;
            case INT:
                {
                alt113=3;
                }
                break;
            case LONG:
                {
                alt113=4;
                }
                break;
            case CHAR:
                {
                alt113=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }

            switch (alt113) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:727:5: BYTE
                    {
                    BYTE116=(CommonTree)match(input,BYTE,FOLLOW_BYTE_in_integral_type7956); 

                    // TEMPLATE REWRITE
                    // 727:13: -> noformat(f=$BYTE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BYTE116!=null?BYTE116.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:728:5: SHORT
                    {
                    SHORT117=(CommonTree)match(input,SHORT,FOLLOW_SHORT_in_integral_type7974); 

                    // TEMPLATE REWRITE
                    // 728:13: -> noformat(f=$SHORT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (SHORT117!=null?SHORT117.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:729:5: INT
                    {
                    INT118=(CommonTree)match(input,INT,FOLLOW_INT_in_integral_type7991); 

                    // TEMPLATE REWRITE
                    // 729:13: -> noformat(f=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INT118!=null?INT118.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:730:5: LONG
                    {
                    LONG119=(CommonTree)match(input,LONG,FOLLOW_LONG_in_integral_type8010); 

                    // TEMPLATE REWRITE
                    // 730:13: -> noformat(f=$LONG.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (LONG119!=null?LONG119.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:731:5: CHAR
                    {
                    CHAR120=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_integral_type8028); 

                    // TEMPLATE REWRITE
                    // 731:13: -> noformat(f=$CHAR.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CHAR120!=null?CHAR120.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "floating_point_type"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:734:1: floating_point_type : ( FLOAT -> noformat(f=$FLOAT.text)| DOUBLE -> noformat(f=$DOUBLE.text));
    public final JVMPrettyPrinter.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMPrettyPrinter.floating_point_type_return retval = new JVMPrettyPrinter.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree FLOAT121=null;
        CommonTree DOUBLE122=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:735:3: ( FLOAT -> noformat(f=$FLOAT.text)| DOUBLE -> noformat(f=$DOUBLE.text))
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==FLOAT) ) {
                alt114=1;
            }
            else if ( (LA114_0==DOUBLE) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }
            switch (alt114) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:735:5: FLOAT
                    {
                    FLOAT121=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_floating_point_type8053); 

                    // TEMPLATE REWRITE
                    // 735:13: -> noformat(f=$FLOAT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FLOAT121!=null?FLOAT121.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:736:5: DOUBLE
                    {
                    DOUBLE122=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_floating_point_type8070); 

                    // TEMPLATE REWRITE
                    // 736:15: -> noformat(f=$DOUBLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (DOUBLE122!=null?DOUBLE122.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "literals"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:739:1: literals : ( LONGLITERAL -> noformat(f=$LONGLITERAL.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)| FLOATLITERAL -> noformat(f=$FLOATLITERAL.text)| DOUBLELITERAL -> noformat(f=$DOUBLELITERAL.text)| CHARLITERAL -> noformat(f=$CHARLITERAL.text)| STRINGLITERAL -> noformat(f=$STRINGLITERAL.text)| BOOLEANLITERAL -> noformat(f=$BOOLEANLITERAL.text)| ( MINUS )? IDENTIFIER -> noformat2(f=$MINUS.texts=$IDENTIFIER.text));
    public final JVMPrettyPrinter.literals_return literals() throws RecognitionException {
        JVMPrettyPrinter.literals_return retval = new JVMPrettyPrinter.literals_return();
        retval.start = input.LT(1);


        CommonTree LONGLITERAL123=null;
        CommonTree INTLITERAL124=null;
        CommonTree FLOATLITERAL125=null;
        CommonTree DOUBLELITERAL126=null;
        CommonTree CHARLITERAL127=null;
        CommonTree STRINGLITERAL128=null;
        CommonTree BOOLEANLITERAL129=null;
        CommonTree MINUS130=null;
        CommonTree IDENTIFIER131=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:740:3: ( LONGLITERAL -> noformat(f=$LONGLITERAL.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)| FLOATLITERAL -> noformat(f=$FLOATLITERAL.text)| DOUBLELITERAL -> noformat(f=$DOUBLELITERAL.text)| CHARLITERAL -> noformat(f=$CHARLITERAL.text)| STRINGLITERAL -> noformat(f=$STRINGLITERAL.text)| BOOLEANLITERAL -> noformat(f=$BOOLEANLITERAL.text)| ( MINUS )? IDENTIFIER -> noformat2(f=$MINUS.texts=$IDENTIFIER.text))
            int alt116=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt116=1;
                }
                break;
            case INTLITERAL:
                {
                alt116=2;
                }
                break;
            case FLOATLITERAL:
                {
                alt116=3;
                }
                break;
            case DOUBLELITERAL:
                {
                alt116=4;
                }
                break;
            case CHARLITERAL:
                {
                alt116=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt116=6;
                }
                break;
            case BOOLEANLITERAL:
                {
                alt116=7;
                }
                break;
            case IDENTIFIER:
            case MINUS:
                {
                alt116=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;

            }

            switch (alt116) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:740:5: LONGLITERAL
                    {
                    LONGLITERAL123=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals8095); 

                    // TEMPLATE REWRITE
                    // 740:19: -> noformat(f=$LONGLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (LONGLITERAL123!=null?LONGLITERAL123.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:741:5: INTLITERAL
                    {
                    INTLITERAL124=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals8112); 

                    // TEMPLATE REWRITE
                    // 741:19: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL124!=null?INTLITERAL124.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:742:5: FLOATLITERAL
                    {
                    FLOATLITERAL125=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals8130); 

                    // TEMPLATE REWRITE
                    // 742:19: -> noformat(f=$FLOATLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FLOATLITERAL125!=null?FLOATLITERAL125.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:743:5: DOUBLELITERAL
                    {
                    DOUBLELITERAL126=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals8146); 

                    // TEMPLATE REWRITE
                    // 743:19: -> noformat(f=$DOUBLELITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (DOUBLELITERAL126!=null?DOUBLELITERAL126.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:744:5: CHARLITERAL
                    {
                    CHARLITERAL127=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals8161); 

                    // TEMPLATE REWRITE
                    // 744:19: -> noformat(f=$CHARLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CHARLITERAL127!=null?CHARLITERAL127.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:745:5: STRINGLITERAL
                    {
                    STRINGLITERAL128=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals8178); 

                    // TEMPLATE REWRITE
                    // 745:19: -> noformat(f=$STRINGLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STRINGLITERAL128!=null?STRINGLITERAL128.getText():null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:746:5: BOOLEANLITERAL
                    {
                    BOOLEANLITERAL129=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals8193); 

                    // TEMPLATE REWRITE
                    // 746:21: -> noformat(f=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BOOLEANLITERAL129!=null?BOOLEANLITERAL129.getText():null)));
                    }



                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:747:5: ( MINUS )? IDENTIFIER
                    {
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:747:5: ( MINUS )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==MINUS) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:747:5: MINUS
                            {
                            MINUS130=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals8209); 

                            }
                            break;

                    }


                    IDENTIFIER131=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals8212); 

                    // TEMPLATE REWRITE
                    // 747:23: -> noformat2(f=$MINUS.texts=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (MINUS130!=null?MINUS130.getText():null)).put("s", (IDENTIFIER131!=null?IDENTIFIER131.getText():null)));
                    }



                    }
                    break;

            }
        }
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "pc"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:750:1: pc : INTLITERAL COLON -> noformat2(f=$INTLITERAL.texts=$COLON.text);
    public final JVMPrettyPrinter.pc_return pc() throws RecognitionException {
        JVMPrettyPrinter.pc_return retval = new JVMPrettyPrinter.pc_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL132=null;
        CommonTree COLON133=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:751:3: ( INTLITERAL COLON -> noformat2(f=$INTLITERAL.texts=$COLON.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:751:5: INTLITERAL COLON
            {
            INTLITERAL132=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc8238); 

            COLON133=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc8240); 

            // TEMPLATE REWRITE
            // 751:23: -> noformat2(f=$INTLITERAL.texts=$COLON.text)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (INTLITERAL132!=null?INTLITERAL132.getText():null)).put("s", (COLON133!=null?COLON133.getText():null)));
            }



            }

        }
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


 

    public static final BitSet FOLLOW_class_file_in_program58 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CLASSFILE_in_class_file85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CFHEADER_in_class_file88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_file_header_in_class_file92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDefinition_in_class_file97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_file_info_in_class_file_header139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_modified_file_info_in_class_file_header145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_checksum_file_info_in_class_file_header153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_compiled_file_info_in_class_file_header161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_file_info201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WINDOWSPATH_in_class_file_info203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info243 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DATE_in_modified_file_info247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_modified_file_info255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_modified_file_info259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_checksum_file_info318 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_HexDigits_in_checksum_file_info320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition422 = new BitSet(new long[]{0x0080000000200018L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeName_in_classDefinition429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_TPARAMETERS_in_classDefinition432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeParameters_in_classDefinition436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEXTENDS_in_classDefinition441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CIMPLEMENTS_in_classDefinition450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_classDefinition454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_classDefinition475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_info1_in_classDefinition479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPOOL_in_classDefinition499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_pool_in_classDefinition503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_classDefinition523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classBody_in_classDefinition527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PUBLIC_in_class_visual_modifier721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_class_modifier752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_class_modifier772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_class_modifier791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_modifier810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_info2_in_type_info1842 = new BitSet(new long[]{0x0400840000000002L,0x0010000000000402L,0x0000000000002780L});
    public static final BitSet FOLLOW_sourcefile_info_in_type_info2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minor_major_version_info_in_type_info2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_flags_in_type_info2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalaSig_info_in_type_info2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_type_info2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_innerclass_info_in_type_info2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosingMethod_in_type_info2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signature_info_addition_in_type_info21019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deprecated_in_type_info21039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_synthetic_in_type_info21060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scala_info_in_type_info21081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Synthetic_in_synthetic1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_synthetic1111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_deprecated1135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_deprecated1137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EnclosingMethod_in_enclosingMethod1160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod1164 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_enclosingMethod1166 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_enclosingMethod1170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SourceFile_in_sourcefile_info1209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_sourcefile_info1211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ScalaSig_in_scalaSig_info1247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scalaSig_info1261 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scalaSig_info1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scalaSig_info1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Scala_in_scala_info1357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_scala_info1359 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_scala_info1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_scala_info1363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_signature_info_addition1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_signature_info_addition1419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_InnerClasses_in_innerclass_info1444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info1449 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line1516 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_innerclass_info_data_in_innerclass_info_line1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INFODATA1_in_innerclass_info_data1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_innerclass_info_data1572 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INFODATA2_in_innerclass_info_data1582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_innerclass_info_data1585 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_innerclass_info_data1589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_minor_major_version_info1644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_minor_major_version_info1646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_minor_major_version_info1648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Flag_in_flags1696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessFlagList_in_flags1700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flagType_in_accessFlagList1733 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000202L});
    public static final BitSet FOLLOW_IDENTIFIER_in_flagType1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_flagType1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1819 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem1836 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1852 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign1866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign1868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign1870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList1915 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue1929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue1931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations1946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations1948 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations1963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations1965 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations1980 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations1982 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo1997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo1999 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo2002 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2019 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem2023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem2025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool2048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool2052 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool2057 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line2103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line2107 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line2111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody2159 = new BitSet(new long[]{0x0020000040000002L,0x0000000008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition2273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition2276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition2280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition2285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition2290 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000080020001L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition2296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition2300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition2308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition2312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition2316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition2333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition2337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition2353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition2357 = new BitSet(new long[]{0x0000040400000008L,0x0014000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo2522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo2526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo2568 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000008L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo2572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo2621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo2623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo2649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo2675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_field_visual_modifier2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_field_visual_modifier2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_field_visual_modifier2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_field_modifier2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_field_modifier2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_field_modifier2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_field_modifier2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition2918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition2921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition2925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition2935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition2939 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition2948 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition2952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition3104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition3107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition3111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition3116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition3120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition3125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition3129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition3134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition3137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition3141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition3170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition3174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition3202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition3206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition3234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODDECL_in_methodDefinition3460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition3463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition3467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition3472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition3476 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000045L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition3481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition3485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition3490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition3494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition3498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition3502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition3507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition3510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition3514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition3543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition3547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition3575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition3579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition3608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition3612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo3840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo3844 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo3848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_afterMethodInfoEntry_in_afterMethodInfo3893 = new BitSet(new long[]{0x0004040000000402L,0x003C000000000000L,0x0000000000002200L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfoEntry3923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry3926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfoEntry3949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfoEntry3951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfoEntry4050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfoEntry4055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfoEntry4079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfoEntry4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault4135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault4138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault4142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo4176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo4179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo4184 = new BitSet(new long[]{0x0000000000008008L,0x0000000000008102L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo4190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo4194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_modifier4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_method_modifier4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_method_modifier4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_method_modifier4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_method_modifier4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_method_modifier4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_method_visual_modifier4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_method_visual_modifier4410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_method_visual_modifier4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments4454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments4458 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments4464 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments4466 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments4468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body4514 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body4516 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body4521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body4525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body4531 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension4574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension4579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension4603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension4608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension4632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension4637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension4659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension4663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension4684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension4688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension4713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension4717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock4750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock4754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock4758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock4763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock4769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine4858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine4862 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine4865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine4869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine4874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine4876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd4924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd4928 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd4930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand14974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand14995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand15017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables5043 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables5047 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable5093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable5095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable5097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch5135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch5138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch5142 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch5147 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch5153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine5203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine5236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine5238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause5272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause5276 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod5307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod5312 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000102L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_throwType5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_throwType5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QualifiedType_in_throwType5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable5406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable5426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable5431 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5492 = new BitSet(new long[]{0x0100008008045000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable5610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine5637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine5641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine5643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable5683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable5687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable5691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable5695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable5699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable5703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable5707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable5712 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine5777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine5781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine5785 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable5878 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable5880 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable5882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable5884 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable5888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable5893 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5940 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry5946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry5952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5965 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry5967 = new BitSet(new long[]{0x0100008000245000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry5971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry5980 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry5982 = new BitSet(new long[]{0x0100008000245000L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable6055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable6057 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable6059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable6061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable6065 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable6070 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry6115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry6117 = new BitSet(new long[]{0x0100008000245000L,0x0080000000020242L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry6121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes6241 = new BitSet(new long[]{0x0100008000245002L,0x0080000000020042L,0x0000000040000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType6325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject6356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject6388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList6430 = new BitSet(new long[]{0x0100008000045002L,0x0080000000020040L,0x0000000044000000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type6462 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type6465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type6470 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type6472 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType6564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType6569 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier6596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier6599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier6603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments6672 = new BitSet(new long[]{0x0100008000045002L,0x0080040000020040L,0x0000000044000000L});
    public static final BitSet FOLLOW_type_in_typeArgument6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard6753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard6757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds6782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds6786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds6813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds6817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters6852 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter6882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter6886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound6916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound6921 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor6957 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor6983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor6987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor6991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList7039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType7067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType7072 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier7098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier7101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier7105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments7177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList7207 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument7257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard7283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard7287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds7315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds7342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType7423 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType7476 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType7480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType7511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType7536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType7539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType7543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList7635 = new BitSet(new long[]{0x0000000000008002L,0x8000004010008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument7680 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument7707 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_keywordAggregate7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_integral_type7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_integral_type7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integral_type7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_integral_type8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_integral_type8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floating_point_type8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_floating_point_type8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals8209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc8238 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc8240 = new BitSet(new long[]{0x0000000000000002L});

}