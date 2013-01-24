// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g 2013-01-23 01:01:35

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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:172:1: runtimeVisibleAnnotations_info : ^( RuntimeVisibleAnnotations (s+= runtimeVisibleAnnotationsItem )+ ) -> runtimeAnnotations(f=$RuntimeVisibleAnnotations.textls=$s);
    public final JVMPrettyPrinter.runtimeVisibleAnnotations_info_return runtimeVisibleAnnotations_info() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotations_info_return();
        retval.start = input.LT(1);


        CommonTree RuntimeVisibleAnnotations21=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:3: ( ^( RuntimeVisibleAnnotations (s+= runtimeVisibleAnnotationsItem )+ ) -> runtimeAnnotations(f=$RuntimeVisibleAnnotations.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:5: ^( RuntimeVisibleAnnotations (s+= runtimeVisibleAnnotationsItem )+ )
            {
            RuntimeVisibleAnnotations21=(CommonTree)match(input,RuntimeVisibleAnnotations,FOLLOW_RuntimeVisibleAnnotations_in_runtimeVisibleAnnotations_info1817); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:33: (s+= runtimeVisibleAnnotationsItem )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:173:34: s+= runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1822);
            	    s=runtimeVisibleAnnotationsItem();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 174:5: -> runtimeAnnotations(f=$RuntimeVisibleAnnotations.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("runtimeAnnotations",new STAttrMap().put("f", (RuntimeVisibleAnnotations21!=null?RuntimeVisibleAnnotations21.getText():null)).put("ls", list_s));
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
    // $ANTLR end "runtimeVisibleAnnotations_info"


    public static class runtimeVisibleAnnotationsItem_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleAnnotationsItem"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:176:1: runtimeVisibleAnnotationsItem : ^( CPINDEX p= pc (r= runtimeVisibleAnnotationAssignList )? ) -> runtimeAnnotationItem(f=$p.sts=$CPINDEX.textt=$r.st);
    public final JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return runtimeVisibleAnnotationsItem() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX22=null;
        JVMPrettyPrinter.pc_return p =null;

        JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return r =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:177:3: ( ^( CPINDEX p= pc (r= runtimeVisibleAnnotationAssignList )? ) -> runtimeAnnotationItem(f=$p.sts=$CPINDEX.textt=$r.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:177:5: ^( CPINDEX p= pc (r= runtimeVisibleAnnotationAssignList )? )
            {
            CPINDEX22=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1855); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_runtimeVisibleAnnotationsItem1859);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:177:21: (r= runtimeVisibleAnnotationAssignList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:177:21: r= runtimeVisibleAnnotationAssignList
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1863);
                    r=runtimeVisibleAnnotationAssignList();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 178:7: -> runtimeAnnotationItem(f=$p.sts=$CPINDEX.textt=$r.st)
            {
                retval.st = templateLib.getInstanceOf("runtimeAnnotationItem",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (CPINDEX22!=null?CPINDEX22.getText():null)).put("t", (r!=null?r.st:null)));
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
    // $ANTLR end "runtimeVisibleAnnotationsItem"


    public static class runtimeVisibleAnnotationAssignList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeVisibleAnnotationAssignList"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:180:1: runtimeVisibleAnnotationAssignList : (s+= annotationAssign )+ -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return runtimeVisibleAnnotationAssignList() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return retval = new JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:181:3: ( (s+= annotationAssign )+ -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:181:5: (s+= annotationAssign )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:181:5: (s+= annotationAssign )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:181:6: s+= annotationAssign
            	    {
            	    pushFollow(FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1903);
            	    s=annotationAssign();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 181:28: -> commaSeparatedList(ls=$s)
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
    // $ANTLR end "runtimeVisibleAnnotationAssignList"


    public static class annotationAssign_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "annotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:183:1: annotationAssign : ^( ASSIGN CPINDEX s= annotationValue ) -> annotationAssign(f=$CPINDEX.texts=$ASSIGN.textt=$s.st);
    public final JVMPrettyPrinter.annotationAssign_return annotationAssign() throws RecognitionException {
        JVMPrettyPrinter.annotationAssign_return retval = new JVMPrettyPrinter.annotationAssign_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX23=null;
        CommonTree ASSIGN24=null;
        JVMPrettyPrinter.annotationValue_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:184:3: ( ^( ASSIGN CPINDEX s= annotationValue ) -> annotationAssign(f=$CPINDEX.texts=$ASSIGN.textt=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:184:5: ^( ASSIGN CPINDEX s= annotationValue )
            {
            ASSIGN24=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_annotationAssign1927); 

            match(input, Token.DOWN, null); 
            CPINDEX23=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_annotationAssign1929); 

            pushFollow(FOLLOW_annotationValue_in_annotationAssign1933);
            s=annotationValue();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 185:7: -> annotationAssign(f=$CPINDEX.texts=$ASSIGN.textt=$s.st)
            {
                retval.st = templateLib.getInstanceOf("annotationAssign",new STAttrMap().put("f", (CPINDEX23!=null?CPINDEX23.getText():null)).put("s", (ASSIGN24!=null?ASSIGN24.getText():null)).put("t", (s!=null?s.st:null)));
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
    // $ANTLR end "annotationAssign"


    public static class annotationValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "annotationValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:187:1: annotationValue : ( brackedAnnotationAssign -> noformat(f=$brackedAnnotationAssign.st)| AnnotationAssign -> noformat(f=$AnnotationAssign.text));
    public final JVMPrettyPrinter.annotationValue_return annotationValue() throws RecognitionException {
        JVMPrettyPrinter.annotationValue_return retval = new JVMPrettyPrinter.annotationValue_return();
        retval.start = input.LT(1);


        CommonTree AnnotationAssign26=null;
        JVMPrettyPrinter.brackedAnnotationAssign_return brackedAnnotationAssign25 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:188:3: ( brackedAnnotationAssign -> noformat(f=$brackedAnnotationAssign.st)| AnnotationAssign -> noformat(f=$AnnotationAssign.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:188:5: brackedAnnotationAssign
                    {
                    pushFollow(FOLLOW_brackedAnnotationAssign_in_annotationValue1969);
                    brackedAnnotationAssign25=brackedAnnotationAssign();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 188:30: -> noformat(f=$brackedAnnotationAssign.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (brackedAnnotationAssign25!=null?brackedAnnotationAssign25.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:189:5: AnnotationAssign
                    {
                    AnnotationAssign26=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_annotationValue1985); 

                    // TEMPLATE REWRITE
                    // 189:23: -> noformat(f=$AnnotationAssign.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (AnnotationAssign26!=null?AnnotationAssign26.getText():null)));
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
    // $ANTLR end "annotationValue"


    public static class brackedAnnotationAssign_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackedAnnotationAssign"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:191:1: brackedAnnotationAssign : ^( ANNOTATIONBRACKETS (s= brackedAnnotationAssignList )? ) -> brackedAnnotationAssign(f=$s.st);
    public final JVMPrettyPrinter.brackedAnnotationAssign_return brackedAnnotationAssign() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssign_return retval = new JVMPrettyPrinter.brackedAnnotationAssign_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.brackedAnnotationAssignList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:3: ( ^( ANNOTATIONBRACKETS (s= brackedAnnotationAssignList )? ) -> brackedAnnotationAssign(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:5: ^( ANNOTATIONBRACKETS (s= brackedAnnotationAssignList )? )
            {
            match(input,ANNOTATIONBRACKETS,FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign2008); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:27: (s= brackedAnnotationAssignList )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AnnotationAssign) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:192:27: s= brackedAnnotationAssignList
                        {
                        pushFollow(FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign2012);
                        s=brackedAnnotationAssignList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 193:7: -> brackedAnnotationAssign(f=$s.st)
            {
                retval.st = templateLib.getInstanceOf("brackedAnnotationAssign",new STAttrMap().put("f", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:195:1: brackedAnnotationAssignList : (s+= brackedAnnotationAssignValue )+ -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.brackedAnnotationAssignList_return brackedAnnotationAssignList() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssignList_return retval = new JVMPrettyPrinter.brackedAnnotationAssignList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:196:3: ( (s+= brackedAnnotationAssignValue )+ -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:196:5: (s+= brackedAnnotationAssignValue )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:196:5: (s+= brackedAnnotationAssignValue )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:196:6: s+= brackedAnnotationAssignValue
            	    {
            	    pushFollow(FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList2044);
            	    s=brackedAnnotationAssignValue();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 197:7: -> commaSeparatedList(ls=$s)
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
    // $ANTLR end "brackedAnnotationAssignList"


    public static class brackedAnnotationAssignValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "brackedAnnotationAssignValue"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:199:1: brackedAnnotationAssignValue : ^( AnnotationAssign (s= runtimeVisibleAnnotationAssignList )? ) -> brackedAnnotationAssignValue(f=$AnnotationAssign.texts=$s.st);
    public final JVMPrettyPrinter.brackedAnnotationAssignValue_return brackedAnnotationAssignValue() throws RecognitionException {
        JVMPrettyPrinter.brackedAnnotationAssignValue_return retval = new JVMPrettyPrinter.brackedAnnotationAssignValue_return();
        retval.start = input.LT(1);


        CommonTree AnnotationAssign27=null;
        JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:200:3: ( ^( AnnotationAssign (s= runtimeVisibleAnnotationAssignList )? ) -> brackedAnnotationAssignValue(f=$AnnotationAssign.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:200:5: ^( AnnotationAssign (s= runtimeVisibleAnnotationAssignList )? )
            {
            AnnotationAssign27=(CommonTree)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue2074); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:200:25: (s= runtimeVisibleAnnotationAssignList )?
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ASSIGN) ) {
                    alt26=1;
                }
                switch (alt26) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:200:25: s= runtimeVisibleAnnotationAssignList
                        {
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue2078);
                        s=runtimeVisibleAnnotationAssignList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 201:7: -> brackedAnnotationAssignValue(f=$AnnotationAssign.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("brackedAnnotationAssignValue",new STAttrMap().put("f", (AnnotationAssign27!=null?AnnotationAssign27.getText():null)).put("s", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:203:1: runtimeVisibleParameterAnnotations : ^( RuntimeVisibleParameterAnnotations (s+= parameterVisibilityInfo )+ ) -> runtimeAnnotations(f=$RuntimeVisibleParameterAnnotations.textls=$s);
    public final JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return runtimeVisibleParameterAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return retval = new JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree RuntimeVisibleParameterAnnotations28=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:3: ( ^( RuntimeVisibleParameterAnnotations (s+= parameterVisibilityInfo )+ ) -> runtimeAnnotations(f=$RuntimeVisibleParameterAnnotations.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:5: ^( RuntimeVisibleParameterAnnotations (s+= parameterVisibilityInfo )+ )
            {
            RuntimeVisibleParameterAnnotations28=(CommonTree)match(input,RuntimeVisibleParameterAnnotations,FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations2112); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:42: (s+= parameterVisibilityInfo )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==PVI) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:204:43: s+= parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations2117);
            	    s=parameterVisibilityInfo();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 205:7: -> runtimeAnnotations(f=$RuntimeVisibleParameterAnnotations.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("runtimeAnnotations",new STAttrMap().put("f", (RuntimeVisibleParameterAnnotations28!=null?RuntimeVisibleParameterAnnotations28.getText():null)).put("ls", list_s));
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
    // $ANTLR end "runtimeVisibleParameterAnnotations"


    public static class runtimeInvisibleParameterAnnotations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeInvisibleParameterAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:207:1: runtimeInvisibleParameterAnnotations : ^( RuntimeInvisibleParameterAnnotations (s+= parameterVisibilityInfo )+ ) -> runtimeAnnotations(f=$RuntimeInvisibleParameterAnnotations.textls=$s);
    public final JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return runtimeInvisibleParameterAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return retval = new JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return();
        retval.start = input.LT(1);


        CommonTree RuntimeInvisibleParameterAnnotations29=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:208:3: ( ^( RuntimeInvisibleParameterAnnotations (s+= parameterVisibilityInfo )+ ) -> runtimeAnnotations(f=$RuntimeInvisibleParameterAnnotations.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:208:5: ^( RuntimeInvisibleParameterAnnotations (s+= parameterVisibilityInfo )+ )
            {
            RuntimeInvisibleParameterAnnotations29=(CommonTree)match(input,RuntimeInvisibleParameterAnnotations,FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations2152); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:208:44: (s+= parameterVisibilityInfo )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==PVI) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:208:45: s+= parameterVisibilityInfo
            	    {
            	    pushFollow(FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations2157);
            	    s=parameterVisibilityInfo();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 209:7: -> runtimeAnnotations(f=$RuntimeInvisibleParameterAnnotations.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("runtimeAnnotations",new STAttrMap().put("f", (RuntimeInvisibleParameterAnnotations29!=null?RuntimeInvisibleParameterAnnotations29.getText():null)).put("ls", list_s));
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
    // $ANTLR end "runtimeInvisibleParameterAnnotations"


    public static class runtimeInvisibleAnnotations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "runtimeInvisibleAnnotations"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:211:1: runtimeInvisibleAnnotations : ^( RuntimeInvisibleAnnotations (s+= runtimeInvisibleAnnotationsItem )+ ) -> runtimeAnnotations(f=$RuntimeInvisibleAnnotations.textls=$s);
    public final JVMPrettyPrinter.runtimeInvisibleAnnotations_return runtimeInvisibleAnnotations() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleAnnotations_return retval = new JVMPrettyPrinter.runtimeInvisibleAnnotations_return();
        retval.start = input.LT(1);


        CommonTree RuntimeInvisibleAnnotations30=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:212:3: ( ^( RuntimeInvisibleAnnotations (s+= runtimeInvisibleAnnotationsItem )+ ) -> runtimeAnnotations(f=$RuntimeInvisibleAnnotations.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:212:5: ^( RuntimeInvisibleAnnotations (s+= runtimeInvisibleAnnotationsItem )+ )
            {
            RuntimeInvisibleAnnotations30=(CommonTree)match(input,RuntimeInvisibleAnnotations,FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations2192); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:212:35: (s+= runtimeInvisibleAnnotationsItem )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RIAI) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:212:36: s+= runtimeInvisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations2197);
            	    s=runtimeInvisibleAnnotationsItem();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


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


            // TEMPLATE REWRITE
            // 213:7: -> runtimeAnnotations(f=$RuntimeInvisibleAnnotations.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("runtimeAnnotations",new STAttrMap().put("f", (RuntimeInvisibleAnnotations30!=null?RuntimeInvisibleAnnotations30.getText():null)).put("ls", list_s));
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
    // $ANTLR end "runtimeInvisibleAnnotations"


    public static class parameterVisibilityInfo_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "parameterVisibilityInfo"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:215:1: parameterVisibilityInfo : ^( PVI p= pc ( IDENTIFIER )? (s+= runtimeVisibleAnnotationsItem )* ) -> parameterVisibilityInfo(f=$p.sts=$IDENTIFIER.textls=$s);
    public final JVMPrettyPrinter.parameterVisibilityInfo_return parameterVisibilityInfo() throws RecognitionException {
        JVMPrettyPrinter.parameterVisibilityInfo_return retval = new JVMPrettyPrinter.parameterVisibilityInfo_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER31=null;
        List list_s=null;
        JVMPrettyPrinter.pc_return p =null;

        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:3: ( ^( PVI p= pc ( IDENTIFIER )? (s+= runtimeVisibleAnnotationsItem )* ) -> parameterVisibilityInfo(f=$p.sts=$IDENTIFIER.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:5: ^( PVI p= pc ( IDENTIFIER )? (s+= runtimeVisibleAnnotationsItem )* )
            {
            match(input,PVI,FOLLOW_PVI_in_parameterVisibilityInfo2232); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_parameterVisibilityInfo2236);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:16: ( IDENTIFIER )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:16: IDENTIFIER
                    {
                    IDENTIFIER31=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parameterVisibilityInfo2238); 

                    }
                    break;

            }


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:28: (s+= runtimeVisibleAnnotationsItem )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==CPINDEX) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:216:29: s+= runtimeVisibleAnnotationsItem
            	    {
            	    pushFollow(FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo2244);
            	    s=runtimeVisibleAnnotationsItem();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 217:5: -> parameterVisibilityInfo(f=$p.sts=$IDENTIFIER.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("parameterVisibilityInfo",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER31!=null?IDENTIFIER31.getText():null)).put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:219:1: runtimeInvisibleAnnotationsItem : ^( RIAI p1= pc (p2= pc )? ^( CPINDEX (s= runtimeVisibleAnnotationAssignList )? ) ) -> runtimeInvisibleAnnotationsItem(f=$p1.sts=$p2.stt=$CPINDEX.textq=$s.st);
    public final JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return runtimeInvisibleAnnotationsItem() throws RecognitionException {
        JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return retval = new JVMPrettyPrinter.runtimeInvisibleAnnotationsItem_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX32=null;
        JVMPrettyPrinter.pc_return p1 =null;

        JVMPrettyPrinter.pc_return p2 =null;

        JVMPrettyPrinter.runtimeVisibleAnnotationAssignList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:3: ( ^( RIAI p1= pc (p2= pc )? ^( CPINDEX (s= runtimeVisibleAnnotationAssignList )? ) ) -> runtimeInvisibleAnnotationsItem(f=$p1.sts=$p2.stt=$CPINDEX.textq=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:5: ^( RIAI p1= pc (p2= pc )? ^( CPINDEX (s= runtimeVisibleAnnotationAssignList )? ) )
            {
            match(input,RIAI,FOLLOW_RIAI_in_runtimeInvisibleAnnotationsItem2281); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2285);
            p1=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:20: (p2= pc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INTLITERAL) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:20: p2= pc
                    {
                    pushFollow(FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2289);
                    p2=pc();

                    state._fsp--;


                    }
                    break;

            }


            CPINDEX32=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem2293); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:36: (s= runtimeVisibleAnnotationAssignList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ASSIGN) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:220:36: s= runtimeVisibleAnnotationAssignList
                        {
                        pushFollow(FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem2297);
                        s=runtimeVisibleAnnotationAssignList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 221:5: -> runtimeInvisibleAnnotationsItem(f=$p1.sts=$p2.stt=$CPINDEX.textq=$s.st)
            {
                retval.st = templateLib.getInstanceOf("runtimeInvisibleAnnotationsItem",new STAttrMap().put("f", (p1!=null?p1.st:null)).put("s", (p2!=null?p2.st:null)).put("t", (CPINDEX32!=null?CPINDEX32.getText():null)).put("q", (s!=null?s.st:null)));
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
    // $ANTLR end "runtimeInvisibleAnnotationsItem"


    public static class constant_pool_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constant_pool"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:228:1: constant_pool : ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* ) -> cpool(f=$id1.texts=$id2.textt=$s);
    public final JVMPrettyPrinter.constant_pool_return constant_pool() throws RecognitionException {
        JVMPrettyPrinter.constant_pool_return retval = new JVMPrettyPrinter.constant_pool_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:229:3: ( ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* ) -> cpool(f=$id1.texts=$id2.textt=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:229:5: ^(id1= IDENTIFIER id2= IDENTIFIER (s+= contant_pool_line )* )
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool2345); 

            match(input, Token.DOWN, null); 
            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant_pool2349); 

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:229:37: (s+= contant_pool_line )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ASSIGN) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:229:38: s+= contant_pool_line
            	    {
            	    pushFollow(FOLLOW_contant_pool_line_in_constant_pool2354);
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
            // 230:11: -> cpool(f=$id1.texts=$id2.textt=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:233:1: contant_pool_line : ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> cpoolline(f=$cp1.texts=$cta.text);
    public final JVMPrettyPrinter.contant_pool_line_return contant_pool_line() throws RecognitionException {
        JVMPrettyPrinter.contant_pool_line_return retval = new JVMPrettyPrinter.contant_pool_line_return();
        retval.start = input.LT(1);


        CommonTree cp1=null;
        CommonTree cta=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:234:3: ( ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE ) -> cpoolline(f=$cp1.texts=$cta.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:234:5: ^( ASSIGN cp1= CPINDEX cta= CONSTANT_TYPE_ASSIGNABLE )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_contant_pool_line2400); 

            match(input, Token.DOWN, null); 
            cp1=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_contant_pool_line2404); 

            cta=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line2408); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 235:13: -> cpoolline(f=$cp1.texts=$cta.text)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:242:1: classBody : (s+= classBodyEntryDecl )+ -> nlSeparatedList(ls=$s);
    public final JVMPrettyPrinter.classBody_return classBody() throws RecognitionException {
        JVMPrettyPrinter.classBody_return retval = new JVMPrettyPrinter.classBody_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:243:3: ( (s+= classBodyEntryDecl )+ -> nlSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:243:5: (s+= classBodyEntryDecl )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:243:5: (s+= classBodyEntryDecl )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:243:6: s+= classBodyEntryDecl
            	    {
            	    pushFollow(FOLLOW_classBodyEntryDecl_in_classBody2456);
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
            // 243:31: -> nlSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:246:1: classBodyEntryDecl : (s1= methodDefinition -> noformat(f=$s1.st)|s2= ctorDefinition -> noformat(f=$s2.st)|s3= fieldDefinition -> noformat(f=$s3.st)|s4= staticCtorDefinition -> noformat(f=$s4.st));
    public final JVMPrettyPrinter.classBodyEntryDecl_return classBodyEntryDecl() throws RecognitionException {
        JVMPrettyPrinter.classBodyEntryDecl_return retval = new JVMPrettyPrinter.classBodyEntryDecl_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.methodDefinition_return s1 =null;

        JVMPrettyPrinter.ctorDefinition_return s2 =null;

        JVMPrettyPrinter.fieldDefinition_return s3 =null;

        JVMPrettyPrinter.staticCtorDefinition_return s4 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:3: (s1= methodDefinition -> noformat(f=$s1.st)|s2= ctorDefinition -> noformat(f=$s2.st)|s3= fieldDefinition -> noformat(f=$s3.st)|s4= staticCtorDefinition -> noformat(f=$s4.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:247:5: s1= methodDefinition
                    {
                    pushFollow(FOLLOW_methodDefinition_in_classBodyEntryDecl2485);
                    s1=methodDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 247:27: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:248:5: s2= ctorDefinition
                    {
                    pushFollow(FOLLOW_ctorDefinition_in_classBodyEntryDecl2504);
                    s2=ctorDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 248:25: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:249:5: s3= fieldDefinition
                    {
                    pushFollow(FOLLOW_fieldDefinition_in_classBodyEntryDecl2523);
                    s3=fieldDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 249:27: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:250:5: s4= staticCtorDefinition
                    {
                    pushFollow(FOLLOW_staticCtorDefinition_in_classBodyEntryDecl2543);
                    s4=staticCtorDefinition();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 250:29: -> noformat(f=$s4.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:257:1: fieldDefinition : ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo+= fieldAdditionalInfo )* ) ) -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo);
    public final JVMPrettyPrinter.fieldDefinition_return fieldDefinition() throws RecognitionException {
        JVMPrettyPrinter.fieldDefinition_return retval = new JVMPrettyPrinter.fieldDefinition_return();
        retval.start = input.LT(1);


        List list_fm=null;
        List list_ainfo=null;
        JVMPrettyPrinter.field_visual_modifier_return fvm =null;

        JVMPrettyPrinter.type_return ft =null;

        JVMPrettyPrinter.keywordAggregate_return fn =null;

        JVMPrettyPrinter.literals_return lit =null;

        JVMPrettyPrinter.fieldInfo_return inf =null;

        RuleReturnScope fm = null;
        RuleReturnScope ainfo = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:3: ( ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo+= fieldAdditionalInfo )* ) ) -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:5: ^( FIELDDECL ^( VMODIFIER (fvm= field_visual_modifier )? ) ^( MODIFIER (fm+= field_modifier )* ) ^( RETVALUE ft= type ) ^( UNITNAME fn= keywordAggregate ) ^( FIELDVALUE (lit= literals )? ) ^( UNITHEADER inf= fieldInfo ) ^( UNITATTR (ainfo+= fieldAdditionalInfo )* ) )
            {
            match(input,FIELDDECL,FOLLOW_FIELDDECL_in_fieldDefinition2570); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_fieldDefinition2573); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:32: (fvm= field_visual_modifier )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= PRIVATE && LA37_0 <= PUBLIC)) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:32: fvm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_fieldDefinition2577);
                        fvm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_fieldDefinition2582); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:68: (fm+= field_modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==FINAL||LA38_0==STATIC||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:69: fm+= field_modifier
                	    {
                	    pushFollow(FOLLOW_field_modifier_in_fieldDefinition2587);
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


            match(input,RETVALUE,FOLLOW_RETVALUE_in_fieldDefinition2593); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_fieldDefinition2597);
            ft=type();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITNAME,FOLLOW_UNITNAME_in_fieldDefinition2601); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keywordAggregate_in_fieldDefinition2605);
            fn=keywordAggregate();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,FIELDVALUE,FOLLOW_FIELDVALUE_in_fieldDefinition2609); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:159: (lit= literals )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BOOLEANLITERAL||LA39_0==CHARLITERAL||LA39_0==DOUBLELITERAL||LA39_0==FLOATLITERAL||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||LA39_0==LONGLITERAL||LA39_0==MINUS||LA39_0==STRINGLITERAL) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:258:159: lit= literals
                        {
                        pushFollow(FOLLOW_literals_in_fieldDefinition2613);
                        lit=literals();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_fieldDefinition2630); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_fieldInfo_in_fieldDefinition2634);
            inf=fieldInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITATTR,FOLLOW_UNITATTR_in_fieldDefinition2650); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:260:24: (ainfo+= fieldAdditionalInfo )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==Constant||LA40_0==Deprecated||LA40_0==RuntimeInvisibleAnnotations||LA40_0==RuntimeVisibleAnnotations||LA40_0==Signature||LA40_0==Synthetic) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:260:25: ainfo+= fieldAdditionalInfo
                	    {
                	    pushFollow(FOLLOW_fieldAdditionalInfo_in_fieldDefinition2655);
                	    ainfo=fieldAdditionalInfo();

                	    state._fsp--;

                	    if (list_ainfo==null) list_ainfo=new ArrayList();
                	    list_ainfo.add(ainfo.getTemplate());


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
            // 262:13: -> fieldDecl(vm=$fvm.stm=$fmt=$ft.stn=$fn.stv=$lit.stinfo=$inf.stxinf=$ainfo)
            {
                retval.st = templateLib.getInstanceOf("fieldDecl",new STAttrMap().put("vm", (fvm!=null?fvm.st:null)).put("m", list_fm).put("t", (ft!=null?ft.st:null)).put("n", (fn!=null?fn.st:null)).put("v", (lit!=null?lit.st:null)).put("info", (inf!=null?inf.st:null)).put("xinf", list_ainfo));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:268:1: fieldInfo : ^(sig= Signature s1= bytecodeType ) s2= flags -> fieldInf(f=$sig.texts=$s1.stt=$s2.st);
    public final JVMPrettyPrinter.fieldInfo_return fieldInfo() throws RecognitionException {
        JVMPrettyPrinter.fieldInfo_return retval = new JVMPrettyPrinter.fieldInfo_return();
        retval.start = input.LT(1);


        CommonTree sig=null;
        JVMPrettyPrinter.bytecodeType_return s1 =null;

        JVMPrettyPrinter.flags_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:269:3: ( ^(sig= Signature s1= bytecodeType ) s2= flags -> fieldInf(f=$sig.texts=$s1.stt=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:269:5: ^(sig= Signature s1= bytecodeType ) s2= flags
            {
            sig=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldInfo2821); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bytecodeType_in_fieldInfo2825);
            s1=bytecodeType();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_flags_in_fieldInfo2830);
            s2=flags();

            state._fsp--;


            // TEMPLATE REWRITE
            // 269:47: -> fieldInf(f=$sig.texts=$s1.stt=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:272:1: fieldAdditionalInfo : ( ^( Constant pt= primitiveType l= literals ) -> noformat3(f=$Constant.texts=$pt.stt=$l.st)| ^( Constant CONSTANT_TYPE_ASSIGNABLE ) -> noformatWithspace2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)| ^( Signature CPINDEX ) -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)| ^( Deprecated BOOLEANLITERAL ) -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Synthetic BOOLEANLITERAL ) -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s1= runtimeVisibleAnnotations_info -> noformat(f=$s1.st)|s2= runtimeInvisibleAnnotations -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.fieldAdditionalInfo_return fieldAdditionalInfo() throws RecognitionException {
        JVMPrettyPrinter.fieldAdditionalInfo_return retval = new JVMPrettyPrinter.fieldAdditionalInfo_return();
        retval.start = input.LT(1);


        CommonTree Constant33=null;
        CommonTree Constant34=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE35=null;
        CommonTree Signature36=null;
        CommonTree CPINDEX37=null;
        CommonTree Deprecated38=null;
        CommonTree BOOLEANLITERAL39=null;
        CommonTree Synthetic40=null;
        CommonTree BOOLEANLITERAL41=null;
        JVMPrettyPrinter.primitiveType_return pt =null;

        JVMPrettyPrinter.literals_return l =null;

        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return s1 =null;

        JVMPrettyPrinter.runtimeInvisibleAnnotations_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:273:3: ( ^( Constant pt= primitiveType l= literals ) -> noformat3(f=$Constant.texts=$pt.stt=$l.st)| ^( Constant CONSTANT_TYPE_ASSIGNABLE ) -> noformatWithspace2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)| ^( Signature CPINDEX ) -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)| ^( Deprecated BOOLEANLITERAL ) -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Synthetic BOOLEANLITERAL ) -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s1= runtimeVisibleAnnotations_info -> noformat(f=$s1.st)|s2= runtimeInvisibleAnnotations -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:273:5: ^( Constant pt= primitiveType l= literals )
                    {
                    Constant33=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2863); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primitiveType_in_fieldAdditionalInfo2867);
                    pt=primitiveType();

                    state._fsp--;


                    pushFollow(FOLLOW_literals_in_fieldAdditionalInfo2871);
                    l=literals();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 273:46: -> noformat3(f=$Constant.texts=$pt.stt=$l.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat3",new STAttrMap().put("f", (Constant33!=null?Constant33.getText():null)).put("s", (pt!=null?pt.st:null)).put("t", (l!=null?l.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:274:5: ^( Constant CONSTANT_TYPE_ASSIGNABLE )
                    {
                    Constant34=(CommonTree)match(input,Constant,FOLLOW_Constant_in_fieldAdditionalInfo2897); 

                    match(input, Token.DOWN, null); 
                    CONSTANT_TYPE_ASSIGNABLE35=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2899); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 274:44: -> noformatWithspace2(f=$Constant.texts=$CONSTANT_TYPE_ASSIGNABLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Constant34!=null?Constant34.getText():null)).put("s", (CONSTANT_TYPE_ASSIGNABLE35!=null?CONSTANT_TYPE_ASSIGNABLE35.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:275:5: ^( Signature CPINDEX )
                    {
                    Signature36=(CommonTree)match(input,Signature,FOLLOW_Signature_in_fieldAdditionalInfo2922); 

                    match(input, Token.DOWN, null); 
                    CPINDEX37=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_fieldAdditionalInfo2924); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 275:34: -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Signature36!=null?Signature36.getText():null)).put("s", (CPINDEX37!=null?CPINDEX37.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:276:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    Deprecated38=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_fieldAdditionalInfo2953); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL39=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2955); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 276:39: -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Deprecated38!=null?Deprecated38.getText():null)).put("s", (BOOLEANLITERAL39!=null?BOOLEANLITERAL39.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:277:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    Synthetic40=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_fieldAdditionalInfo2981); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL41=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2983); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 277:39: -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Synthetic40!=null?Synthetic40.getText():null)).put("s", (BOOLEANLITERAL41!=null?BOOLEANLITERAL41.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:278:5: s1= runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo3011);
                    s1=runtimeVisibleAnnotations_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 278:42: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:279:5: s2= runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo3031);
                    s2=runtimeInvisibleAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 279:41: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:282:1: field_visual_modifier : ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text));
    public final JVMPrettyPrinter.field_visual_modifier_return field_visual_modifier() throws RecognitionException {
        JVMPrettyPrinter.field_visual_modifier_return retval = new JVMPrettyPrinter.field_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree PUBLIC42=null;
        CommonTree PRIVATE43=null;
        CommonTree PROTECTED44=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:283:3: ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:283:5: PUBLIC
                    {
                    PUBLIC42=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_field_visual_modifier3058); 

                    // TEMPLATE REWRITE
                    // 283:19: -> noformat(f=$PUBLIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PUBLIC42!=null?PUBLIC42.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:284:5: PRIVATE
                    {
                    PRIVATE43=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_field_visual_modifier3080); 

                    // TEMPLATE REWRITE
                    // 284:19: -> noformat(f=$PRIVATE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PRIVATE43!=null?PRIVATE43.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:285:5: PROTECTED
                    {
                    PROTECTED44=(CommonTree)match(input,PROTECTED,FOLLOW_PROTECTED_in_field_visual_modifier3101); 

                    // TEMPLATE REWRITE
                    // 285:19: -> noformat(f=$PROTECTED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PROTECTED44!=null?PROTECTED44.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:288:1: field_modifier : ( FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| TRANSIENT -> noformat(f=$TRANSIENT.text)| VOLATILE -> noformat(f=$VOLATILE.text));
    public final JVMPrettyPrinter.field_modifier_return field_modifier() throws RecognitionException {
        JVMPrettyPrinter.field_modifier_return retval = new JVMPrettyPrinter.field_modifier_return();
        retval.start = input.LT(1);


        CommonTree FINAL45=null;
        CommonTree STATIC46=null;
        CommonTree TRANSIENT47=null;
        CommonTree VOLATILE48=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:3: ( FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| TRANSIENT -> noformat(f=$TRANSIENT.text)| VOLATILE -> noformat(f=$VOLATILE.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:289:5: FINAL
                    {
                    FINAL45=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_field_modifier3131); 

                    // TEMPLATE REWRITE
                    // 289:17: -> noformat(f=$FINAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FINAL45!=null?FINAL45.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:290:5: STATIC
                    {
                    STATIC46=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_field_modifier3152); 

                    // TEMPLATE REWRITE
                    // 290:19: -> noformat(f=$STATIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STATIC46!=null?STATIC46.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:291:5: TRANSIENT
                    {
                    TRANSIENT47=(CommonTree)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_field_modifier3174); 

                    // TEMPLATE REWRITE
                    // 291:21: -> noformat(f=$TRANSIENT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (TRANSIENT47!=null?TRANSIENT47.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:292:5: VOLATILE
                    {
                    VOLATILE48=(CommonTree)match(input,VOLATILE,FOLLOW_VOLATILE_in_field_modifier3195); 

                    // TEMPLATE REWRITE
                    // 292:19: -> noformat(f=$VOLATILE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VOLATILE48!=null?VOLATILE48.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:299:1: staticCtorDefinition : ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ) -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st);
    public final JVMPrettyPrinter.staticCtorDefinition_return staticCtorDefinition() throws RecognitionException {
        JVMPrettyPrinter.staticCtorDefinition_return retval = new JVMPrettyPrinter.staticCtorDefinition_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.field_visual_modifier_return svm =null;

        JVMPrettyPrinter.methodInfo_return inf =null;

        JVMPrettyPrinter.body_return b =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:300:3: ( ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ) -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:300:5: ^( STATICCTORDECL ^( VMODIFIER (svm= field_visual_modifier )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) )
            {
            match(input,STATICCTORDECL,FOLLOW_STATICCTORDECL_in_staticCtorDefinition3229); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_staticCtorDefinition3232); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:300:37: (svm= field_visual_modifier )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0 >= PRIVATE && LA44_0 <= PUBLIC)) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:300:37: svm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_staticCtorDefinition3236);
                        svm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_staticCtorDefinition3246); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_staticCtorDefinition3250);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_staticCtorDefinition3259); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_staticCtorDefinition3263);
            b=body();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 304:27: -> statCtorDecl(vm=$svm.stinfo=$inf.stbody=$b.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:314:1: ctorDefinition : ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st);
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:3: ( ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:5: ^( CTORDECL ^( VMODIFIER (cvm= field_visual_modifier )? ) ^( GENERICDESC (g= genericDescriptor )? ) ^( UNITNAME name= typeName ) a= arguments ^( THROWCLAUSE (t= throwClause )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY b= body ) ^( UNITATTR (ainfo= afterMethodInfo )? ) )
            {
            match(input,CTORDECL,FOLLOW_CTORDECL_in_ctorDefinition3415); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_ctorDefinition3418); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:31: (cvm= field_visual_modifier )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0 >= PRIVATE && LA45_0 <= PUBLIC)) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:31: cvm= field_visual_modifier
                        {
                        pushFollow(FOLLOW_field_visual_modifier_in_ctorDefinition3422);
                        cvm=field_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,GENERICDESC,FOLLOW_GENERICDESC_in_ctorDefinition3427); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:71: (g= genericDescriptor )?
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==EXTENDS) ) {
                    alt46=1;
                }
                switch (alt46) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:71: g= genericDescriptor
                        {
                        pushFollow(FOLLOW_genericDescriptor_in_ctorDefinition3431);
                        g=genericDescriptor();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITNAME,FOLLOW_UNITNAME_in_ctorDefinition3436); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_typeName_in_ctorDefinition3440);
            name=typeName();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_arguments_in_ctorDefinition3445);
            a=arguments();

            state._fsp--;


            match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_ctorDefinition3448); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:145: (t= throwClause )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==THROWS) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:315:145: t= throwClause
                        {
                        pushFollow(FOLLOW_throwClause_in_ctorDefinition3452);
                        t=throwClause();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_ctorDefinition3481); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_ctorDefinition3485);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_ctorDefinition3513); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_body_in_ctorDefinition3517);
            b=body();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITATTR,FOLLOW_UNITATTR_in_ctorDefinition3545); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:318:41: (ainfo= afterMethodInfo )?
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AnnotationDefault||LA48_0==Deprecated||LA48_0==Exceptions||(LA48_0 >= RuntimeInvisibleAnnotations && LA48_0 <= RuntimeVisibleParameterAnnotations)||LA48_0==Signature||LA48_0==Synthetic) ) {
                    alt48=1;
                }
                switch (alt48) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:318:41: ainfo= afterMethodInfo
                        {
                        pushFollow(FOLLOW_afterMethodInfo_in_ctorDefinition3549);
                        ainfo=afterMethodInfo();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 320:25: -> ctorDecl(vm=$cvm.stgd=$g.stn=$name.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:331:1: methodDefinition : ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm+= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> methDecl(vm=$mvm.stm=$mmgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st);
    public final JVMPrettyPrinter.methodDefinition_return methodDefinition() throws RecognitionException {
        JVMPrettyPrinter.methodDefinition_return retval = new JVMPrettyPrinter.methodDefinition_return();
        retval.start = input.LT(1);


        List list_mm=null;
        JVMPrettyPrinter.method_visual_modifier_return mvm =null;

        JVMPrettyPrinter.genericDescriptor_return g =null;

        JVMPrettyPrinter.type_return mt =null;

        JVMPrettyPrinter.keywordAggregate_return mn =null;

        JVMPrettyPrinter.arguments_return a =null;

        JVMPrettyPrinter.throwClauseMethod_return t =null;

        JVMPrettyPrinter.methodInfo_return inf =null;

        JVMPrettyPrinter.body_return b =null;

        JVMPrettyPrinter.afterMethodInfo_return ainfo =null;

        RuleReturnScope mm = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:3: ( ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm+= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) ) -> methDecl(vm=$mvm.stm=$mmgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:5: ^( METHODDECL ^( VMODIFIER (mvm= method_visual_modifier )? ) ^( MODIFIER (mm+= method_modifier )* ) ^( GENERICDESC (g= genericDescriptor )? ) ^( RETVALUE mt= type ) ^( UNITNAME mn= keywordAggregate ) a= arguments ^( THROWCLAUSE (t= throwClauseMethod )? ) ^( UNITHEADER inf= methodInfo ) ^( UNITBODY (b= body )? ) ^( UNITATTR (ainfo= afterMethodInfo )? ) )
            {
            match(input,METHODDECL,FOLLOW_METHODDECL_in_methodDefinition3771); 

            match(input, Token.DOWN, null); 
            match(input,VMODIFIER,FOLLOW_VMODIFIER_in_methodDefinition3774); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:33: (mvm= method_visual_modifier )?
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0 >= PRIVATE && LA49_0 <= PUBLIC)) ) {
                    alt49=1;
                }
                switch (alt49) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:33: mvm= method_visual_modifier
                        {
                        pushFollow(FOLLOW_method_visual_modifier_in_methodDefinition3778);
                        mvm=method_visual_modifier();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,MODIFIER,FOLLOW_MODIFIER_in_methodDefinition3783); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:70: (mm+= method_modifier )*
                loop50:
                do {
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ABSTRACT||LA50_0==FINAL||LA50_0==NATIVE||LA50_0==STATIC||LA50_0==STRICTFP||LA50_0==SYNCHRONIZED) ) {
                        alt50=1;
                    }


                    switch (alt50) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:71: mm+= method_modifier
                	    {
                	    pushFollow(FOLLOW_method_modifier_in_methodDefinition3788);
                	    mm=method_modifier();

                	    state._fsp--;

                	    if (list_mm==null) list_mm=new ArrayList();
                	    list_mm.add(mm.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop50;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,GENERICDESC,FOLLOW_GENERICDESC_in_methodDefinition3794); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:109: (g= genericDescriptor )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==EXTENDS) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:109: g= genericDescriptor
                        {
                        pushFollow(FOLLOW_genericDescriptor_in_methodDefinition3798);
                        g=genericDescriptor();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,RETVALUE,FOLLOW_RETVALUE_in_methodDefinition3803); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_methodDefinition3807);
            mt=type();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITNAME,FOLLOW_UNITNAME_in_methodDefinition3811); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keywordAggregate_in_methodDefinition3815);
            mn=keywordAggregate();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_arguments_in_methodDefinition3820);
            a=arguments();

            state._fsp--;


            match(input,THROWCLAUSE,FOLLOW_THROWCLAUSE_in_methodDefinition3823); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:209: (t= throwClauseMethod )?
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==THROWS) ) {
                    alt52=1;
                }
                switch (alt52) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:332:209: t= throwClauseMethod
                        {
                        pushFollow(FOLLOW_throwClauseMethod_in_methodDefinition3827);
                        t=throwClauseMethod();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITHEADER,FOLLOW_UNITHEADER_in_methodDefinition3856); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodInfo_in_methodDefinition3860);
            inf=methodInfo();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,UNITBODY,FOLLOW_UNITBODY_in_methodDefinition3888); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:334:37: (b= body )?
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==Code||LA53_0==Synthetic) ) {
                    alt53=1;
                }
                switch (alt53) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:334:37: b= body
                        {
                        pushFollow(FOLLOW_body_in_methodDefinition3892);
                        b=body();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,UNITATTR,FOLLOW_UNITATTR_in_methodDefinition3921); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:335:41: (ainfo= afterMethodInfo )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AnnotationDefault||LA54_0==Deprecated||LA54_0==Exceptions||(LA54_0 >= RuntimeInvisibleAnnotations && LA54_0 <= RuntimeVisibleParameterAnnotations)||LA54_0==Signature||LA54_0==Synthetic) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:335:41: ainfo= afterMethodInfo
                        {
                        pushFollow(FOLLOW_afterMethodInfo_in_methodDefinition3925);
                        ainfo=afterMethodInfo();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 337:25: -> methDecl(vm=$mvm.stm=$mmgd=$g.stt=$mt.stn=$mn.stargs=$a.stthr=$t.stinfo=$inf.stbody=$b.stxinf=$ainfo.st)
            {
                retval.st = templateLib.getInstanceOf("methDecl",new STAttrMap().put("vm", (mvm!=null?mvm.st:null)).put("m", list_mm).put("gd", (g!=null?g.st:null)).put("t", (mt!=null?mt.st:null)).put("n", (mn!=null?mn.st:null)).put("args", (a!=null?a.st:null)).put("thr", (t!=null?t.st:null)).put("info", (inf!=null?inf.st:null)).put("body", (b!=null?b.st:null)).put("xinf", (ainfo!=null?ainfo.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:344:1: methodInfo : ^( STANDINTOKEN ms= methodSignatureInfo fl= flags ) -> methodInfo(f=$ms.sts=$fl.st);
    public final JVMPrettyPrinter.methodInfo_return methodInfo() throws RecognitionException {
        JVMPrettyPrinter.methodInfo_return retval = new JVMPrettyPrinter.methodInfo_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.methodSignatureInfo_return ms =null;

        JVMPrettyPrinter.flags_return fl =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:345:3: ( ^( STANDINTOKEN ms= methodSignatureInfo fl= flags ) -> methodInfo(f=$ms.sts=$fl.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:345:5: ^( STANDINTOKEN ms= methodSignatureInfo fl= flags )
            {
            match(input,STANDINTOKEN,FOLLOW_STANDINTOKEN_in_methodInfo4153); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_methodSignatureInfo_in_methodInfo4157);
            ms=methodSignatureInfo();

            state._fsp--;


            pushFollow(FOLLOW_flags_in_methodInfo4161);
            fl=flags();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 346:15: -> methodInfo(f=$ms.sts=$fl.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:349:1: afterMethodInfo : (s+= afterMethodInfoEntry )+ -> nlSeparatedList(ls=$s);
    public final JVMPrettyPrinter.afterMethodInfo_return afterMethodInfo() throws RecognitionException {
        JVMPrettyPrinter.afterMethodInfo_return retval = new JVMPrettyPrinter.afterMethodInfo_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:350:3: ( (s+= afterMethodInfoEntry )+ -> nlSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:350:5: (s+= afterMethodInfoEntry )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:350:5: (s+= afterMethodInfoEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:350:6: s+= afterMethodInfoEntry
            	    {
            	    pushFollow(FOLLOW_afterMethodInfoEntry_in_afterMethodInfo4206);
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
            // 350:37: -> nlSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:353:1: afterMethodInfoEntry : ( ^( Deprecated BOOLEANLITERAL ) -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Signature CPINDEX ) -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)|s1= runtimeInvisibleParameterAnnotations -> noformat(f=$s1.st)|s2= runtimeVisibleAnnotations_info -> noformat(f=$s2.st)|s3= runtimeInvisibleAnnotations -> noformat(f=$s3.st)|s4= runtimeVisibleParameterAnnotations -> noformat(f=$s4.st)| ^( Exceptions t= throwClause ) -> noformatWithspace2(f=$Exceptions.texts=$t.st)| ^( Synthetic BOOLEANLITERAL ) -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s5= annotationDefault -> noformat(f=$s5.st));
    public final JVMPrettyPrinter.afterMethodInfoEntry_return afterMethodInfoEntry() throws RecognitionException {
        JVMPrettyPrinter.afterMethodInfoEntry_return retval = new JVMPrettyPrinter.afterMethodInfoEntry_return();
        retval.start = input.LT(1);


        CommonTree Deprecated49=null;
        CommonTree BOOLEANLITERAL50=null;
        CommonTree Signature51=null;
        CommonTree CPINDEX52=null;
        CommonTree Exceptions53=null;
        CommonTree Synthetic54=null;
        CommonTree BOOLEANLITERAL55=null;
        JVMPrettyPrinter.runtimeInvisibleParameterAnnotations_return s1 =null;

        JVMPrettyPrinter.runtimeVisibleAnnotations_info_return s2 =null;

        JVMPrettyPrinter.runtimeInvisibleAnnotations_return s3 =null;

        JVMPrettyPrinter.runtimeVisibleParameterAnnotations_return s4 =null;

        JVMPrettyPrinter.throwClause_return t =null;

        JVMPrettyPrinter.annotationDefault_return s5 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:354:3: ( ^( Deprecated BOOLEANLITERAL ) -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)| ^( Signature CPINDEX ) -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)|s1= runtimeInvisibleParameterAnnotations -> noformat(f=$s1.st)|s2= runtimeVisibleAnnotations_info -> noformat(f=$s2.st)|s3= runtimeInvisibleAnnotations -> noformat(f=$s3.st)|s4= runtimeVisibleParameterAnnotations -> noformat(f=$s4.st)| ^( Exceptions t= throwClause ) -> noformatWithspace2(f=$Exceptions.texts=$t.st)| ^( Synthetic BOOLEANLITERAL ) -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)|s5= annotationDefault -> noformat(f=$s5.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:354:5: ^( Deprecated BOOLEANLITERAL )
                    {
                    Deprecated49=(CommonTree)match(input,Deprecated,FOLLOW_Deprecated_in_afterMethodInfoEntry4236); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL50=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4239); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 354:39: -> noformatWithspace2(f=$Deprecated.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Deprecated49!=null?Deprecated49.getText():null)).put("s", (BOOLEANLITERAL50!=null?BOOLEANLITERAL50.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:355:5: ^( Signature CPINDEX )
                    {
                    Signature51=(CommonTree)match(input,Signature,FOLLOW_Signature_in_afterMethodInfoEntry4264); 

                    match(input, Token.DOWN, null); 
                    CPINDEX52=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_afterMethodInfoEntry4266); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 355:34: -> noformatWithspace2(f=$Signature.texts=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Signature51!=null?Signature51.getText():null)).put("s", (CPINDEX52!=null?CPINDEX52.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:356:5: s1= runtimeInvisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry4296);
                    s1=runtimeInvisibleParameterAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 356:46: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:357:5: s2= runtimeVisibleAnnotations_info
                    {
                    pushFollow(FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry4314);
                    s2=runtimeVisibleAnnotations_info();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 357:42: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:358:5: s3= runtimeInvisibleAnnotations
                    {
                    pushFollow(FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry4334);
                    s3=runtimeInvisibleAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 358:41: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:359:5: s4= runtimeVisibleParameterAnnotations
                    {
                    pushFollow(FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry4356);
                    s4=runtimeVisibleParameterAnnotations();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 359:44: -> noformat(f=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s4!=null?s4.st:null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:360:5: ^( Exceptions t= throwClause )
                    {
                    Exceptions53=(CommonTree)match(input,Exceptions,FOLLOW_Exceptions_in_afterMethodInfoEntry4373); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_throwClause_in_afterMethodInfoEntry4378);
                    t=throwClause();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 360:39: -> noformatWithspace2(f=$Exceptions.texts=$t.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Exceptions53!=null?Exceptions53.getText():null)).put("s", (t!=null?t.st:null)));
                    }



                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:361:5: ^( Synthetic BOOLEANLITERAL )
                    {
                    Synthetic54=(CommonTree)match(input,Synthetic,FOLLOW_Synthetic_in_afterMethodInfoEntry4404); 

                    match(input, Token.DOWN, null); 
                    BOOLEANLITERAL55=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4406); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 361:39: -> noformatWithspace2(f=$Synthetic.texts=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (Synthetic54!=null?Synthetic54.getText():null)).put("s", (BOOLEANLITERAL55!=null?BOOLEANLITERAL55.getText():null)));
                    }



                    }
                    break;
                case 9 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:362:5: s5= annotationDefault
                    {
                    pushFollow(FOLLOW_annotationDefault_in_afterMethodInfoEntry4434);
                    s5=annotationDefault();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 362:34: -> noformat(f=$s5.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:365:1: annotationDefault : ^( AnnotationDefault DefaultValue v= annotationValue ) -> annotationDefault(f=$v.st);
    public final JVMPrettyPrinter.annotationDefault_return annotationDefault() throws RecognitionException {
        JVMPrettyPrinter.annotationDefault_return retval = new JVMPrettyPrinter.annotationDefault_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.annotationValue_return v =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:366:3: ( ^( AnnotationDefault DefaultValue v= annotationValue ) -> annotationDefault(f=$v.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:366:5: ^( AnnotationDefault DefaultValue v= annotationValue )
            {
            match(input,AnnotationDefault,FOLLOW_AnnotationDefault_in_annotationDefault4465); 

            match(input, Token.DOWN, null); 
            match(input,DefaultValue,FOLLOW_DefaultValue_in_annotationDefault4468); 

            pushFollow(FOLLOW_annotationValue_in_annotationDefault4472);
            v=annotationValue();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 367:9: -> annotationDefault(f=$v.st)
            {
                retval.st = templateLib.getInstanceOf("annotationDefault",new STAttrMap().put("f", (v!=null?v.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:370:1: methodSignatureInfo : ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) ) -> methodSign(in=$sout=$r.st);
    public final JVMPrettyPrinter.methodSignatureInfo_return methodSignatureInfo() throws RecognitionException {
        JVMPrettyPrinter.methodSignatureInfo_return retval = new JVMPrettyPrinter.methodSignatureInfo_return();
        retval.start = input.LT(1);


        List list_s=null;
        JVMPrettyPrinter.returnDescriptor_return r =null;

        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:371:3: ( ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) ) -> methodSign(in=$sout=$r.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:371:5: ^( Signature ^( PARAMDESC (s+= bytecodeType )* ) ^( RETDESC r= returnDescriptor ) )
            {
            match(input,Signature,FOLLOW_Signature_in_methodSignatureInfo4506); 

            match(input, Token.DOWN, null); 
            match(input,PARAMDESC,FOLLOW_PARAMDESC_in_methodSignatureInfo4509); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:371:29: (s+= bytecodeType )*
                loop57:
                do {
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==BaseType||LA57_0==IDENTIFIER||LA57_0==INTERNALTYPE||LA57_0==LBRACK) ) {
                        alt57=1;
                    }


                    switch (alt57) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:371:30: s+= bytecodeType
                	    {
                	    pushFollow(FOLLOW_bytecodeType_in_methodSignatureInfo4514);
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


            match(input,RETDESC,FOLLOW_RETDESC_in_methodSignatureInfo4520); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_returnDescriptor_in_methodSignatureInfo4524);
            r=returnDescriptor();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 372:9: -> methodSign(in=$sout=$r.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:375:1: returnDescriptor : (s= bytecodeType -> noformat(f=$s.st)| VoidType -> noformat(f=$VoidType.text));
    public final JVMPrettyPrinter.returnDescriptor_return returnDescriptor() throws RecognitionException {
        JVMPrettyPrinter.returnDescriptor_return retval = new JVMPrettyPrinter.returnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree VoidType56=null;
        JVMPrettyPrinter.bytecodeType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:376:3: (s= bytecodeType -> noformat(f=$s.st)| VoidType -> noformat(f=$VoidType.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:376:5: s= bytecodeType
                    {
                    pushFollow(FOLLOW_bytecodeType_in_returnDescriptor4562);
                    s=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 376:21: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:377:5: VoidType
                    {
                    VoidType56=(CommonTree)match(input,VoidType,FOLLOW_VoidType_in_returnDescriptor4578); 

                    // TEMPLATE REWRITE
                    // 377:17: -> noformat(f=$VoidType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VoidType56!=null?VoidType56.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:380:1: method_modifier : ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| SYNCHRONIZED -> noformat(f=$SYNCHRONIZED.text)| NATIVE -> noformat(f=$NATIVE.text)| STRICTFP -> noformat(f=$STRICTFP.text));
    public final JVMPrettyPrinter.method_modifier_return method_modifier() throws RecognitionException {
        JVMPrettyPrinter.method_modifier_return retval = new JVMPrettyPrinter.method_modifier_return();
        retval.start = input.LT(1);


        CommonTree ABSTRACT57=null;
        CommonTree FINAL58=null;
        CommonTree STATIC59=null;
        CommonTree SYNCHRONIZED60=null;
        CommonTree NATIVE61=null;
        CommonTree STRICTFP62=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:381:3: ( ABSTRACT -> noformat(f=$ABSTRACT.text)| FINAL -> noformat(f=$FINAL.text)| STATIC -> noformat(f=$STATIC.text)| SYNCHRONIZED -> noformat(f=$SYNCHRONIZED.text)| NATIVE -> noformat(f=$NATIVE.text)| STRICTFP -> noformat(f=$STRICTFP.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:381:5: ABSTRACT
                    {
                    ABSTRACT57=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_method_modifier4603); 

                    // TEMPLATE REWRITE
                    // 381:17: -> noformat(f=$ABSTRACT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (ABSTRACT57!=null?ABSTRACT57.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:382:5: FINAL
                    {
                    FINAL58=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_method_modifier4621); 

                    // TEMPLATE REWRITE
                    // 382:15: -> noformat(f=$FINAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FINAL58!=null?FINAL58.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:383:5: STATIC
                    {
                    STATIC59=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_method_modifier4640); 

                    // TEMPLATE REWRITE
                    // 383:17: -> noformat(f=$STATIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STATIC59!=null?STATIC59.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:384:5: SYNCHRONIZED
                    {
                    SYNCHRONIZED60=(CommonTree)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_method_modifier4660); 

                    // TEMPLATE REWRITE
                    // 384:21: -> noformat(f=$SYNCHRONIZED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (SYNCHRONIZED60!=null?SYNCHRONIZED60.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:385:5: NATIVE
                    {
                    NATIVE61=(CommonTree)match(input,NATIVE,FOLLOW_NATIVE_in_method_modifier4678); 

                    // TEMPLATE REWRITE
                    // 385:15: -> noformat(f=$NATIVE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (NATIVE61!=null?NATIVE61.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:386:5: STRICTFP
                    {
                    STRICTFP62=(CommonTree)match(input,STRICTFP,FOLLOW_STRICTFP_in_method_modifier4696); 

                    // TEMPLATE REWRITE
                    // 386:17: -> noformat(f=$STRICTFP.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STRICTFP62!=null?STRICTFP62.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:389:1: method_visual_modifier : ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text));
    public final JVMPrettyPrinter.method_visual_modifier_return method_visual_modifier() throws RecognitionException {
        JVMPrettyPrinter.method_visual_modifier_return retval = new JVMPrettyPrinter.method_visual_modifier_return();
        retval.start = input.LT(1);


        CommonTree PUBLIC63=null;
        CommonTree PRIVATE64=null;
        CommonTree PROTECTED65=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:390:3: ( PUBLIC -> noformat(f=$PUBLIC.text)| PRIVATE -> noformat(f=$PRIVATE.text)| PROTECTED -> noformat(f=$PROTECTED.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:390:5: PUBLIC
                    {
                    PUBLIC63=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_method_visual_modifier4722); 

                    // TEMPLATE REWRITE
                    // 390:15: -> noformat(f=$PUBLIC.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PUBLIC63!=null?PUBLIC63.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:391:5: PRIVATE
                    {
                    PRIVATE64=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_method_visual_modifier4740); 

                    // TEMPLATE REWRITE
                    // 391:17: -> noformat(f=$PRIVATE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PRIVATE64!=null?PRIVATE64.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:392:5: PROTECTED
                    {
                    PROTECTED65=(CommonTree)match(input,PROTECTED,FOLLOW_PROTECTED_in_method_visual_modifier4759); 

                    // TEMPLATE REWRITE
                    // 392:17: -> noformat(f=$PROTECTED.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (PROTECTED65!=null?PROTECTED65.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:395:1: arguments : ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? ) -> args(f=$tl.sts=$d.text);
    public final JVMPrettyPrinter.arguments_return arguments() throws RecognitionException {
        JVMPrettyPrinter.arguments_return retval = new JVMPrettyPrinter.arguments_return();
        retval.start = input.LT(1);


        CommonTree d=null;
        JVMPrettyPrinter.typeList_return tl =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:3: ( ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? ) -> args(f=$tl.sts=$d.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:5: ^( UNITARGUMENTS (tl= typeList )? (d= DOT DOT DOT )? )
            {
            match(input,UNITARGUMENTS,FOLLOW_UNITARGUMENTS_in_arguments4784); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:23: (tl= typeList )?
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==BOOLEAN||LA61_0==BYTE||LA61_0==CHAR||LA61_0==DOUBLE||LA61_0==FLOAT||LA61_0==INT||LA61_0==LONG||LA61_0==SHORT||LA61_0==UNITNAME||LA61_0==VOID) ) {
                    alt61=1;
                }
                switch (alt61) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:23: tl= typeList
                        {
                        pushFollow(FOLLOW_typeList_in_arguments4788);
                        tl=typeList();

                        state._fsp--;


                        }
                        break;

                }


                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:34: (d= DOT DOT DOT )?
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==DOT) ) {
                    alt62=1;
                }
                switch (alt62) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:396:35: d= DOT DOT DOT
                        {
                        d=(CommonTree)match(input,DOT,FOLLOW_DOT_in_arguments4794); 

                        match(input,DOT,FOLLOW_DOT_in_arguments4796); 

                        match(input,DOT,FOLLOW_DOT_in_arguments4798); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 397:9: -> args(f=$tl.sts=$d.text)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:404:1: body : ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )* -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e);
    public final JVMPrettyPrinter.body_return body() throws RecognitionException {
        JVMPrettyPrinter.body_return retval = new JVMPrettyPrinter.body_return();
        retval.start = input.LT(1);


        CommonTree BOOLEANLITERAL66=null;
        List list_e=null;
        JVMPrettyPrinter.codeBlock_return c =null;

        RuleReturnScope e = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:3: ( ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )* -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:5: ( Synthetic BOOLEANLITERAL )? ^( Code c= codeBlock ) (e+= bodyExtension )*
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:5: ( Synthetic BOOLEANLITERAL )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Synthetic) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:6: Synthetic BOOLEANLITERAL
                    {
                    match(input,Synthetic,FOLLOW_Synthetic_in_body4844); 

                    BOOLEANLITERAL66=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_body4846); 

                    }
                    break;

            }


            match(input,Code,FOLLOW_Code_in_body4851); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_codeBlock_in_body4855);
            c=codeBlock();

            state._fsp--;


            match(input, Token.UP, null); 


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:53: (e+= bodyExtension )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==ExceptionTable||(LA64_0 >= LineNumberTable && LA64_0 <= LocalVariableTypeTable)||(LA64_0 >= StackMap && LA64_0 <= StackMapTable)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:405:54: e+= bodyExtension
            	    {
            	    pushFollow(FOLLOW_bodyExtension_in_body4861);
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
            // 406:11: -> body(f=$BOOLEANLITERAL.texts=$c.stt=$e)
            {
                retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("f", (BOOLEANLITERAL66!=null?BOOLEANLITERAL66.getText():null)).put("s", (c!=null?c.st:null)).put("t", list_e));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:409:1: bodyExtension : ( ^( ExceptionTable s1= exceptionTable ) -> bodyExt(f=$ExceptionTable.texts=$s1.st)| ^( LineNumberTable (s2= lineNumberTable )? ) -> bodyExt(f=$LineNumberTable.texts=$s2.st)| ^( LocalVariableTable s3= localVariableTable ) -> bodyExt(f=$LocalVariableTable.texts=$s3.st)| ^( LocalVariableTypeTable s4= localVariableTable ) -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)| ^( StackMapTable s5= stackMapTable ) -> bodyExt(f=$StackMapTable.texts=$s5.st)| ^( StackMap s6= stackMapTypeTable ) -> bodyExt(f=$StackMap.texts=$s6.st));
    public final JVMPrettyPrinter.bodyExtension_return bodyExtension() throws RecognitionException {
        JVMPrettyPrinter.bodyExtension_return retval = new JVMPrettyPrinter.bodyExtension_return();
        retval.start = input.LT(1);


        CommonTree ExceptionTable67=null;
        CommonTree LineNumberTable68=null;
        CommonTree LocalVariableTable69=null;
        CommonTree LocalVariableTypeTable70=null;
        CommonTree StackMapTable71=null;
        CommonTree StackMap72=null;
        JVMPrettyPrinter.exceptionTable_return s1 =null;

        JVMPrettyPrinter.lineNumberTable_return s2 =null;

        JVMPrettyPrinter.localVariableTable_return s3 =null;

        JVMPrettyPrinter.localVariableTable_return s4 =null;

        JVMPrettyPrinter.stackMapTable_return s5 =null;

        JVMPrettyPrinter.stackMapTypeTable_return s6 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:410:3: ( ^( ExceptionTable s1= exceptionTable ) -> bodyExt(f=$ExceptionTable.texts=$s1.st)| ^( LineNumberTable (s2= lineNumberTable )? ) -> bodyExt(f=$LineNumberTable.texts=$s2.st)| ^( LocalVariableTable s3= localVariableTable ) -> bodyExt(f=$LocalVariableTable.texts=$s3.st)| ^( LocalVariableTypeTable s4= localVariableTable ) -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)| ^( StackMapTable s5= stackMapTable ) -> bodyExt(f=$StackMapTable.texts=$s5.st)| ^( StackMap s6= stackMapTypeTable ) -> bodyExt(f=$StackMap.texts=$s6.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:410:5: ^( ExceptionTable s1= exceptionTable )
                    {
                    ExceptionTable67=(CommonTree)match(input,ExceptionTable,FOLLOW_ExceptionTable_in_bodyExtension4904); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exceptionTable_in_bodyExtension4909);
                    s1=exceptionTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 410:45: -> bodyExt(f=$ExceptionTable.texts=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (ExceptionTable67!=null?ExceptionTable67.getText():null)).put("s", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:411:5: ^( LineNumberTable (s2= lineNumberTable )? )
                    {
                    LineNumberTable68=(CommonTree)match(input,LineNumberTable,FOLLOW_LineNumberTable_in_bodyExtension4933); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:411:26: (s2= lineNumberTable )?
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==IDENTIFIER) ) {
                            alt65=1;
                        }
                        switch (alt65) {
                            case 1 :
                                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:411:26: s2= lineNumberTable
                                {
                                pushFollow(FOLLOW_lineNumberTable_in_bodyExtension4938);
                                s2=lineNumberTable();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }


                    // TEMPLATE REWRITE
                    // 411:47: -> bodyExt(f=$LineNumberTable.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LineNumberTable68!=null?LineNumberTable68.getText():null)).put("s", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:412:5: ^( LocalVariableTable s3= localVariableTable )
                    {
                    LocalVariableTable69=(CommonTree)match(input,LocalVariableTable,FOLLOW_LocalVariableTable_in_bodyExtension4962); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension4967);
                    s3=localVariableTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 412:51: -> bodyExt(f=$LocalVariableTable.texts=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LocalVariableTable69!=null?LocalVariableTable69.getText():null)).put("s", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:413:5: ^( LocalVariableTypeTable s4= localVariableTable )
                    {
                    LocalVariableTypeTable70=(CommonTree)match(input,LocalVariableTypeTable,FOLLOW_LocalVariableTypeTable_in_bodyExtension4989); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_localVariableTable_in_bodyExtension4993);
                    s4=localVariableTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 413:53: -> bodyExt(f=$LocalVariableTypeTable.texts=$s4.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (LocalVariableTypeTable70!=null?LocalVariableTypeTable70.getText():null)).put("s", (s4!=null?s4.st:null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:414:5: ^( StackMapTable s5= stackMapTable )
                    {
                    StackMapTable71=(CommonTree)match(input,StackMapTable,FOLLOW_StackMapTable_in_bodyExtension5014); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_stackMapTable_in_bodyExtension5018);
                    s5=stackMapTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 414:43: -> bodyExt(f=$StackMapTable.texts=$s5.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (StackMapTable71!=null?StackMapTable71.getText():null)).put("s", (s5!=null?s5.st:null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:415:5: ^( StackMap s6= stackMapTypeTable )
                    {
                    StackMap72=(CommonTree)match(input,StackMap,FOLLOW_StackMap_in_bodyExtension5043); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_stackMapTypeTable_in_bodyExtension5047);
                    s6=stackMapTypeTable();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 415:43: -> bodyExt(f=$StackMap.texts=$s6.st)
                    {
                        retval.st = templateLib.getInstanceOf("bodyExt",new STAttrMap().put("f", (StackMap72!=null?StackMap72.getText():null)).put("s", (s6!=null?s6.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:418:1: codeBlock : ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd ) -> codeblock(f=$v.sts=$it=$e.st);
    public final JVMPrettyPrinter.codeBlock_return codeBlock() throws RecognitionException {
        JVMPrettyPrinter.codeBlock_return retval = new JVMPrettyPrinter.codeBlock_return();
        retval.start = input.LT(1);


        List list_i=null;
        JVMPrettyPrinter.variables_return v =null;

        JVMPrettyPrinter.codeBlockEnd_return e =null;

        RuleReturnScope i = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:419:3: ( ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd ) -> codeblock(f=$v.sts=$it=$e.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:419:5: ^( VARINFO v= variables ) ^( INSTRUCTION (i+= instructionSet )* e= codeBlockEnd )
            {
            match(input,VARINFO,FOLLOW_VARINFO_in_codeBlock5080); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variables_in_codeBlock5084);
            v=variables();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input,INSTRUCTION,FOLLOW_INSTRUCTION_in_codeBlock5088); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:419:42: (i+= instructionSet )*
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:419:43: i+= instructionSet
            	    {
            	    pushFollow(FOLLOW_instructionSet_in_codeBlock5093);
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


            pushFollow(FOLLOW_codeBlockEnd_in_codeBlock5099);
            e=codeBlockEnd();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 420:11: -> codeblock(f=$v.sts=$it=$e.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:423:1: instructionSet : (s1= codeLine -> noformat(f=$s1.st)|s2= javaSwitch -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.instructionSet_return instructionSet() throws RecognitionException {
        JVMPrettyPrinter.instructionSet_return retval = new JVMPrettyPrinter.instructionSet_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.codeLine_return s1 =null;

        JVMPrettyPrinter.javaSwitch_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:424:3: (s1= codeLine -> noformat(f=$s1.st)|s2= javaSwitch -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:424:5: s1= codeLine
                    {
                    pushFollow(FOLLOW_codeLine_in_instructionSet5142);
                    s1=codeLine();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 424:21: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:425:5: s2= javaSwitch
                    {
                    pushFollow(FOLLOW_javaSwitch_in_instructionSet5163);
                    s2=javaSwitch();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 425:21: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:428:1: codeLine : ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text);
    public final JVMPrettyPrinter.codeLine_return codeLine() throws RecognitionException {
        JVMPrettyPrinter.codeLine_return retval = new JVMPrettyPrinter.codeLine_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER73=null;
        CommonTree INTLITERAL74=null;
        JVMPrettyPrinter.pc_return p =null;

        JVMPrettyPrinter.operand1_return o =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:3: ( ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:5: ^( IDENTIFIER p= pc ^( OPERAND (o= operand1 )? ) ^( OPERAND ( INTLITERAL )? ) )
            {
            IDENTIFIER73=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeLine5188); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_codeLine5192);
            p=pc();

            state._fsp--;


            match(input,OPERAND,FOLLOW_OPERAND_in_codeLine5195); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:34: (o= operand1 )?
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==BOOLEAN||LA69_0==BYTE||LA69_0==CHAR||LA69_0==CPINDEX||LA69_0==DOUBLE||LA69_0==FLOAT||LA69_0==INT||LA69_0==INTLITERAL||LA69_0==LONG||LA69_0==SHORT||LA69_0==VOID) ) {
                    alt69=1;
                }
                switch (alt69) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:34: o= operand1
                        {
                        pushFollow(FOLLOW_operand1_in_codeLine5199);
                        o=operand1();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input,OPERAND,FOLLOW_OPERAND_in_codeLine5204); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:56: ( INTLITERAL )?
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==INTLITERAL) ) {
                    alt70=1;
                }
                switch (alt70) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:429:56: INTLITERAL
                        {
                        INTLITERAL74=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeLine5206); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 430:11: -> codeline(f=$p.sts=$IDENTIFIER.textt=$o.stq=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("codeline",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER73!=null?IDENTIFIER73.getText():null)).put("t", (o!=null?o.st:null)).put("q", (INTLITERAL74!=null?INTLITERAL74.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:433:1: codeBlockEnd : ^( IDENTIFIER p= pc ( INTLITERAL )? ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text);
    public final JVMPrettyPrinter.codeBlockEnd_return codeBlockEnd() throws RecognitionException {
        JVMPrettyPrinter.codeBlockEnd_return retval = new JVMPrettyPrinter.codeBlockEnd_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER75=null;
        CommonTree INTLITERAL76=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:3: ( ^( IDENTIFIER p= pc ( INTLITERAL )? ) -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:5: ^( IDENTIFIER p= pc ( INTLITERAL )? )
            {
            IDENTIFIER75=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_codeBlockEnd5254); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_codeBlockEnd5258);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:23: ( INTLITERAL )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==INTLITERAL) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:434:23: INTLITERAL
                    {
                    INTLITERAL76=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_codeBlockEnd5260); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 435:11: -> codeline(f=$p.sts=$IDENTIFIER.textt=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("codeline",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER75!=null?IDENTIFIER75.getText():null)).put("t", (INTLITERAL76!=null?INTLITERAL76.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:438:1: operand1 : ( CPINDEX -> noformat(f=$CPINDEX.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)|s= primitiveType -> noformat(f=$s.st));
    public final JVMPrettyPrinter.operand1_return operand1() throws RecognitionException {
        JVMPrettyPrinter.operand1_return retval = new JVMPrettyPrinter.operand1_return();
        retval.start = input.LT(1);


        CommonTree CPINDEX77=null;
        CommonTree INTLITERAL78=null;
        JVMPrettyPrinter.primitiveType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:439:3: ( CPINDEX -> noformat(f=$CPINDEX.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)|s= primitiveType -> noformat(f=$s.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:439:5: CPINDEX
                    {
                    CPINDEX77=(CommonTree)match(input,CPINDEX,FOLLOW_CPINDEX_in_operand15304); 

                    // TEMPLATE REWRITE
                    // 439:19: -> noformat(f=$CPINDEX.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CPINDEX77!=null?CPINDEX77.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:440:5: INTLITERAL
                    {
                    INTLITERAL78=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_operand15325); 

                    // TEMPLATE REWRITE
                    // 440:21: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL78!=null?INTLITERAL78.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:441:5: s= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_operand15347);
                    s=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 441:23: -> noformat(f=$s.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:444:1: variables : s1= variable s2= variable s3= variable -> variables(f=$s1.sts=$s2.stt=$s3.st);
    public final JVMPrettyPrinter.variables_return variables() throws RecognitionException {
        JVMPrettyPrinter.variables_return retval = new JVMPrettyPrinter.variables_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.variable_return s1 =null;

        JVMPrettyPrinter.variable_return s2 =null;

        JVMPrettyPrinter.variable_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:445:3: (s1= variable s2= variable s3= variable -> variables(f=$s1.sts=$s2.stt=$s3.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:445:5: s1= variable s2= variable s3= variable
            {
            pushFollow(FOLLOW_variable_in_variables5373);
            s1=variable();

            state._fsp--;


            pushFollow(FOLLOW_variable_in_variables5377);
            s2=variable();

            state._fsp--;


            pushFollow(FOLLOW_variable_in_variables5381);
            s3=variable();

            state._fsp--;


            // TEMPLATE REWRITE
            // 446:11: -> variables(f=$s1.sts=$s2.stt=$s3.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:449:1: variable : ^( ASSIGN IDENTIFIER INTLITERAL ) -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text);
    public final JVMPrettyPrinter.variable_return variable() throws RecognitionException {
        JVMPrettyPrinter.variable_return retval = new JVMPrettyPrinter.variable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER79=null;
        CommonTree INTLITERAL80=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:450:3: ( ^( ASSIGN IDENTIFIER INTLITERAL ) -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:450:5: ^( ASSIGN IDENTIFIER INTLITERAL )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_variable5423); 

            match(input, Token.DOWN, null); 
            IDENTIFIER79=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variable5425); 

            INTLITERAL80=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_variable5427); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 451:9: -> variable(f=$IDENTIFIER.texts=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("f", (IDENTIFIER79!=null?IDENTIFIER79.getText():null)).put("s", (INTLITERAL80!=null?INTLITERAL80.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:454:1: javaSwitch : ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) ) -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st);
    public final JVMPrettyPrinter.javaSwitch_return javaSwitch() throws RecognitionException {
        JVMPrettyPrinter.javaSwitch_return retval = new JVMPrettyPrinter.javaSwitch_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER81=null;
        List list_s=null;
        JVMPrettyPrinter.pc_return p =null;

        JVMPrettyPrinter.switchDefaultLine_return s1 =null;

        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:455:3: ( ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) ) -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:455:5: ^( SWITCH ^( IDENTIFIER p= pc (s+= switchLine )* s1= switchDefaultLine ) )
            {
            match(input,SWITCH,FOLLOW_SWITCH_in_javaSwitch5465); 

            match(input, Token.DOWN, null); 
            IDENTIFIER81=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_javaSwitch5468); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_javaSwitch5472);
            p=pc();

            state._fsp--;


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:455:32: (s+= switchLine )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==INTLITERAL) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:455:33: s+= switchLine
            	    {
            	    pushFollow(FOLLOW_switchLine_in_javaSwitch5477);
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


            pushFollow(FOLLOW_switchDefaultLine_in_javaSwitch5483);
            s1=switchDefaultLine();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 456:11: -> switch(f=$p.sts=$IDENTIFIER.textt=$sq=$s1.st)
            {
                retval.st = templateLib.getInstanceOf("switch",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (IDENTIFIER81!=null?IDENTIFIER81.getText():null)).put("t", list_s).put("q", (s1!=null?s1.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:459:1: switchLine : p= pc INTLITERAL -> noformatWithspace2(f=$p.sts=$INTLITERAL.text);
    public final JVMPrettyPrinter.switchLine_return switchLine() throws RecognitionException {
        JVMPrettyPrinter.switchLine_return retval = new JVMPrettyPrinter.switchLine_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL82=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:460:3: (p= pc INTLITERAL -> noformatWithspace2(f=$p.sts=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:460:5: p= pc INTLITERAL
            {
            pushFollow(FOLLOW_pc_in_switchLine5533);
            p=pc();

            state._fsp--;


            INTLITERAL82=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchLine5535); 

            // TEMPLATE REWRITE
            // 460:25: -> noformatWithspace2(f=$p.sts=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (p!=null?p.st:null)).put("s", (INTLITERAL82!=null?INTLITERAL82.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:463:1: switchDefaultLine : ^( DEFAULT INTLITERAL ) -> switchDefault(f=$INTLITERAL.text);
    public final JVMPrettyPrinter.switchDefaultLine_return switchDefaultLine() throws RecognitionException {
        JVMPrettyPrinter.switchDefaultLine_return retval = new JVMPrettyPrinter.switchDefaultLine_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL83=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:464:3: ( ^( DEFAULT INTLITERAL ) -> switchDefault(f=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:464:5: ^( DEFAULT INTLITERAL )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLine5566); 

            match(input, Token.DOWN, null); 
            INTLITERAL83=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_switchDefaultLine5568); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 464:29: -> switchDefault(f=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("switchDefault",new STAttrMap().put("f", (INTLITERAL83!=null?INTLITERAL83.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:471:1: throwClause : ^( THROWS s= typeList ) -> noformatWithspace2(f=$THROWS.texts=$s.st);
    public final JVMPrettyPrinter.throwClause_return throwClause() throws RecognitionException {
        JVMPrettyPrinter.throwClause_return retval = new JVMPrettyPrinter.throwClause_return();
        retval.start = input.LT(1);


        CommonTree THROWS84=null;
        JVMPrettyPrinter.typeList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:472:3: ( ^( THROWS s= typeList ) -> noformatWithspace2(f=$THROWS.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:472:5: ^( THROWS s= typeList )
            {
            THROWS84=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClause5598); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_typeList_in_throwClause5602);
            s=typeList();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 472:27: -> noformatWithspace2(f=$THROWS.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (THROWS84!=null?THROWS84.getText():null)).put("s", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:475:1: throwClauseMethod : ^( THROWS (s+= throwType )+ ) -> throwC(f=$THROWS.textls=$s);
    public final JVMPrettyPrinter.throwClauseMethod_return throwClauseMethod() throws RecognitionException {
        JVMPrettyPrinter.throwClauseMethod_return retval = new JVMPrettyPrinter.throwClauseMethod_return();
        retval.start = input.LT(1);


        CommonTree THROWS85=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:476:3: ( ^( THROWS (s+= throwType )+ ) -> throwC(f=$THROWS.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:476:5: ^( THROWS (s+= throwType )+ )
            {
            THROWS85=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throwClauseMethod5633); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:476:14: (s+= throwType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:476:15: s+= throwType
            	    {
            	    pushFollow(FOLLOW_throwType_in_throwClauseMethod5638);
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
            // 476:31: -> throwC(f=$THROWS.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("throwC",new STAttrMap().put("f", (THROWS85!=null?THROWS85.getText():null)).put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:479:1: throwType : ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| QualifiedType -> noformat(f=$QualifiedType.text));
    public final JVMPrettyPrinter.throwType_return throwType() throws RecognitionException {
        JVMPrettyPrinter.throwType_return retval = new JVMPrettyPrinter.throwType_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE86=null;
        CommonTree IDENTIFIER87=null;
        CommonTree QualifiedType88=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:480:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| QualifiedType -> noformat(f=$QualifiedType.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:480:5: INTERNALTYPE
                    {
                    INTERNALTYPE86=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_throwType5667); 

                    // TEMPLATE REWRITE
                    // 480:23: -> noformat(f=$INTERNALTYPE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE86!=null?INTERNALTYPE86.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:481:5: IDENTIFIER
                    {
                    IDENTIFIER87=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_throwType5687); 

                    // TEMPLATE REWRITE
                    // 481:21: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER87!=null?IDENTIFIER87.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:482:5: QualifiedType
                    {
                    QualifiedType88=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_throwType5707); 

                    // TEMPLATE REWRITE
                    // 482:21: -> noformat(f=$QualifiedType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (QualifiedType88!=null?QualifiedType88.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:485:1: exceptionTable : ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ ) -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s);
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:486:3: ( ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ ) -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:486:5: ^( ETHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER ) ^( ETENTRY (s+= exceptionTableEntry )+ )
            {
            match(input,ETHEADER,FOLLOW_ETHEADER_in_exceptionTable5732); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5736); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5740); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5744); 

            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTable5748); 

            match(input, Token.UP, null); 


            match(input,ETENTRY,FOLLOW_ETENTRY_in_exceptionTable5752); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:486:87: (s+= exceptionTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:486:88: s+= exceptionTableEntry
            	    {
            	    pushFollow(FOLLOW_exceptionTableEntry_in_exceptionTable5757);
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
            // 487:11: -> excTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:490:1: exceptionTableEntry : id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st);
    public final JVMPrettyPrinter.exceptionTableEntry_return exceptionTableEntry() throws RecognitionException {
        JVMPrettyPrinter.exceptionTableEntry_return retval = new JVMPrettyPrinter.exceptionTableEntry_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        JVMPrettyPrinter.exceptionTableEntryValue_return s1 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:491:3: (id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:491:5: id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= exceptionTableEntryValue
            {
            id1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5810); 

            id2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5814); 

            id3=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_exceptionTableEntry5818); 

            pushFollow(FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry5822);
            s1=exceptionTableEntryValue();

            state._fsp--;


            // TEMPLATE REWRITE
            // 492:11: -> excTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:494:1: exceptionTableEntryValue : (s= primitiveType -> noformat(f=$s.st)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| CONSTANT_TYPE_ASSIGNABLE -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text));
    public final JVMPrettyPrinter.exceptionTableEntryValue_return exceptionTableEntryValue() throws RecognitionException {
        JVMPrettyPrinter.exceptionTableEntryValue_return retval = new JVMPrettyPrinter.exceptionTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER89=null;
        CommonTree CONSTANT_TYPE_ASSIGNABLE90=null;
        JVMPrettyPrinter.primitiveType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:495:3: (s= primitiveType -> noformat(f=$s.st)| IDENTIFIER -> noformat(f=$IDENTIFIER.text)| CONSTANT_TYPE_ASSIGNABLE -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:495:5: s= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_exceptionTableEntryValue5867);
                    s=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 495:23: -> noformat(f=$s.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s!=null?s.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:496:5: IDENTIFIER
                    {
                    IDENTIFIER89=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exceptionTableEntryValue5884); 

                    // TEMPLATE REWRITE
                    // 496:21: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER89!=null?IDENTIFIER89.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:497:5: CONSTANT_TYPE_ASSIGNABLE
                    {
                    CONSTANT_TYPE_ASSIGNABLE90=(CommonTree)match(input,CONSTANT_TYPE_ASSIGNABLE,FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue5904); 

                    // TEMPLATE REWRITE
                    // 497:31: -> noformat(f=$CONSTANT_TYPE_ASSIGNABLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CONSTANT_TYPE_ASSIGNABLE90!=null?CONSTANT_TYPE_ASSIGNABLE90.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:504:1: lineNumberTable : (s+= lineNumberTableLine )+ -> lnTable(ls=$s);
    public final JVMPrettyPrinter.lineNumberTable_return lineNumberTable() throws RecognitionException {
        JVMPrettyPrinter.lineNumberTable_return retval = new JVMPrettyPrinter.lineNumberTable_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:505:3: ( (s+= lineNumberTableLine )+ -> lnTable(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:505:5: (s+= lineNumberTableLine )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:505:5: (s+= lineNumberTableLine )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:505:6: s+= lineNumberTableLine
            	    {
            	    pushFollow(FOLLOW_lineNumberTableLine_in_lineNumberTable5936);
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
            // 505:33: -> lnTable(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:508:1: lineNumberTableLine : ^( IDENTIFIER p= pc INTLITERAL ) -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text);
    public final JVMPrettyPrinter.lineNumberTableLine_return lineNumberTableLine() throws RecognitionException {
        JVMPrettyPrinter.lineNumberTableLine_return retval = new JVMPrettyPrinter.lineNumberTableLine_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER91=null;
        CommonTree INTLITERAL92=null;
        JVMPrettyPrinter.pc_return p =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:509:3: ( ^( IDENTIFIER p= pc INTLITERAL ) -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:509:5: ^( IDENTIFIER p= pc INTLITERAL )
            {
            IDENTIFIER91=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lineNumberTableLine5963); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pc_in_lineNumberTableLine5967);
            p=pc();

            state._fsp--;


            INTLITERAL92=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_lineNumberTableLine5969); 

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 509:35: -> lnTableEntry(f=$IDENTIFIER.texts=$p.stt=$INTLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("lnTableEntry",new STAttrMap().put("f", (IDENTIFIER91!=null?IDENTIFIER91.getText():null)).put("s", (p!=null?p.st:null)).put("t", (INTLITERAL92!=null?INTLITERAL92.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:516:1: localVariableTable : ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* ) -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s);
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:517:3: ( ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* ) -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:517:5: ^( LVHEADER id1= IDENTIFIER id2= IDENTIFIER id3= IDENTIFIER id4= IDENTIFIER id5= IDENTIFIER ) ^( LVENTRY (s+= localVariableTableLine )* )
            {
            match(input,LVHEADER,FOLLOW_LVHEADER_in_localVariableTable6009); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable6013); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable6017); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable6021); 

            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable6025); 

            id5=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTable6029); 

            match(input, Token.UP, null); 


            match(input,LVENTRY,FOLLOW_LVENTRY_in_localVariableTable6033); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:517:102: (s+= localVariableTableLine )*
                loop79:
                do {
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==INTLITERAL) ) {
                        alt79=1;
                    }


                    switch (alt79) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:517:103: s+= localVariableTableLine
                	    {
                	    pushFollow(FOLLOW_localVariableTableLine_in_localVariableTable6038);
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
            // 518:13: -> lvTable(f=$id1.texts=$id2.textt=$id3.textq=$id4.textc=$id5.textls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:521:1: localVariableTableLine : id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st);
    public final JVMPrettyPrinter.localVariableTableLine_return localVariableTableLine() throws RecognitionException {
        JVMPrettyPrinter.localVariableTableLine_return retval = new JVMPrettyPrinter.localVariableTableLine_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        JVMPrettyPrinter.localVariableTableLineIdentifier_return s1 =null;

        JVMPrettyPrinter.bytecodeType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:522:3: (id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:522:5: id1= INTLITERAL id2= INTLITERAL id3= INTLITERAL s1= localVariableTableLineIdentifier s2= bytecodeType
            {
            id1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine6099); 

            id2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine6103); 

            id3=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_localVariableTableLine6107); 

            pushFollow(FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine6111);
            s1=localVariableTableLineIdentifier();

            state._fsp--;


            pushFollow(FOLLOW_bytecodeType_in_localVariableTableLine6115);
            s2=bytecodeType();

            state._fsp--;


            // TEMPLATE REWRITE
            // 523:13: -> lvTableEntry(f=$id1.texts=$id2.textt=$id3.textq=$s1.stc=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:526:1: localVariableTableLineIdentifier : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.localVariableTableLineIdentifier_return localVariableTableLineIdentifier() throws RecognitionException {
        JVMPrettyPrinter.localVariableTableLineIdentifier_return retval = new JVMPrettyPrinter.localVariableTableLineIdentifier_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER93=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:527:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:527:5: IDENTIFIER
            {
            IDENTIFIER93=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier6168); 

            // TEMPLATE REWRITE
            // 527:23: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER93!=null?IDENTIFIER93.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:534:1: stackMapTypeTable : ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ ) -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s);
    public final JVMPrettyPrinter.stackMapTypeTable_return stackMapTypeTable() throws RecognitionException {
        JVMPrettyPrinter.stackMapTypeTable_return retval = new JVMPrettyPrinter.stackMapTypeTable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER94=null;
        CommonTree INTLITERAL95=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:535:3: ( ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ ) -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:535:5: ^( SMTHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMTENTRY (s+= stackMapTypeTableEntry )+ )
            {
            match(input,SMTHEADER,FOLLOW_SMTHEADER_in_stackMapTypeTable6204); 

            match(input, Token.DOWN, null); 
            IDENTIFIER94=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTable6206); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTable6208); 

            INTLITERAL95=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTable6210); 

            match(input, Token.UP, null); 


            match(input,SMTENTRY,FOLLOW_SMTENTRY_in_stackMapTypeTable6214); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:535:58: (s+= stackMapTypeTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:535:59: s+= stackMapTypeTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable6219);
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
            // 536:13: -> smtTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("smtTable",new STAttrMap().put("f", (IDENTIFIER94!=null?IDENTIFIER94.getText():null)).put("s", (INTLITERAL95!=null?INTLITERAL95.getText():null)).put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:539:1: stackMapTypeTableEntry : id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st);
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
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:3: (id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:540:5: id1= IDENTIFIER ASSIGN i1= INTLITERAL id2= IDENTIFIER ASSIGN i2= INTLITERAL id3= IDENTIFIER ASSIGN s1= stackMapTableTypesContainer id4= IDENTIFIER ASSIGN s2= stackMapTableTypesContainer
            {
            id1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6266); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry6268); 

            i1=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry6272); 

            id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6276); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry6278); 

            i2=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTypeTableEntry6282); 

            id3=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6291); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry6293); 

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry6297);
            s1=stackMapTableTypesContainer();

            state._fsp--;


            id4=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6306); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTypeTableEntry6308); 

            pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry6312);
            s2=stackMapTableTypesContainer();

            state._fsp--;


            // TEMPLATE REWRITE
            // 543:15: -> smtTableEntry(a=$id1.textb=$i1.textc=$id2.textd=$i2.texte=$id3.textf=$s1.stg=$id4.texth=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:550:1: stackMapTable : ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ ) -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s);
    public final JVMPrettyPrinter.stackMapTable_return stackMapTable() throws RecognitionException {
        JVMPrettyPrinter.stackMapTable_return retval = new JVMPrettyPrinter.stackMapTable_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER96=null;
        CommonTree INTLITERAL97=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:551:3: ( ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ ) -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:551:5: ^( SMHEADER IDENTIFIER ASSIGN INTLITERAL ) ^( SMENTRY (s+= stackMapTableEntry )+ )
            {
            match(input,SMHEADER,FOLLOW_SMHEADER_in_stackMapTable6381); 

            match(input, Token.DOWN, null); 
            IDENTIFIER96=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTable6383); 

            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTable6385); 

            INTLITERAL97=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTable6387); 

            match(input, Token.UP, null); 


            match(input,SMENTRY,FOLLOW_SMENTRY_in_stackMapTable6391); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:551:56: (s+= stackMapTableEntry )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:551:57: s+= stackMapTableEntry
            	    {
            	    pushFollow(FOLLOW_stackMapTableEntry_in_stackMapTable6396);
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
            // 552:13: -> smTable(f=$IDENTIFIER.texts=$INTLITERAL.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("smTable",new STAttrMap().put("f", (IDENTIFIER96!=null?IDENTIFIER96.getText():null)).put("s", (INTLITERAL97!=null?INTLITERAL97.getText():null)).put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:554:1: stackMapTableEntry : ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue ) -> smTableEntry(f=$IDENTIFIER.texts=$s.st);
    public final JVMPrettyPrinter.stackMapTableEntry_return stackMapTableEntry() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableEntry_return retval = new JVMPrettyPrinter.stackMapTableEntry_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER98=null;
        JVMPrettyPrinter.stackMapTableEntryValue_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:3: ( ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue ) -> smTableEntry(f=$IDENTIFIER.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:555:5: ^( ASSIGN IDENTIFIER s= stackMapTableEntryValue )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_stackMapTableEntry6441); 

            match(input, Token.DOWN, null); 
            IDENTIFIER98=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableEntry6443); 

            pushFollow(FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry6447);
            s=stackMapTableEntryValue();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 556:13: -> smTableEntry(f=$IDENTIFIER.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("smTableEntry",new STAttrMap().put("f", (IDENTIFIER98!=null?IDENTIFIER98.getText():null)).put("s", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:558:1: stackMapTableEntryValue : ( INTLITERAL -> noformat(f=$INTLITERAL.text)|s= stackMapTableTypesContainer -> noformat(f=$s.st));
    public final JVMPrettyPrinter.stackMapTableEntryValue_return stackMapTableEntryValue() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableEntryValue_return retval = new JVMPrettyPrinter.stackMapTableEntryValue_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL99=null;
        JVMPrettyPrinter.stackMapTableTypesContainer_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:559:3: ( INTLITERAL -> noformat(f=$INTLITERAL.text)|s= stackMapTableTypesContainer -> noformat(f=$s.st))
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==INTLITERAL) ) {
                alt82=1;
            }
            else if ( (LA82_0==SMTTYPES) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:559:5: INTLITERAL
                    {
                    INTLITERAL99=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableEntryValue6485); 

                    // TEMPLATE REWRITE
                    // 559:23: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL99!=null?INTLITERAL99.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:560:5: s= stackMapTableTypesContainer
                    {
                    pushFollow(FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue6509);
                    s=stackMapTableTypesContainer();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 560:35: -> noformat(f=$s.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:562:1: stackMapTableTypesContainer : s= stackMapTableTypes -> smTableContainer(f=$s.st);
    public final JVMPrettyPrinter.stackMapTableTypesContainer_return stackMapTableTypesContainer() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypesContainer_return retval = new JVMPrettyPrinter.stackMapTableTypesContainer_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.stackMapTableTypes_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:563:3: (s= stackMapTableTypes -> smTableContainer(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:563:5: s= stackMapTableTypes
            {
            pushFollow(FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer6532);
            s=stackMapTableTypes();

            state._fsp--;


            // TEMPLATE REWRITE
            // 563:37: -> smTableContainer(f=$s.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:565:1: stackMapTableTypes : ^( SMTTYPES (s+= stackMapTableType )* ) -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.stackMapTableTypes_return stackMapTableTypes() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypes_return retval = new JVMPrettyPrinter.stackMapTableTypes_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:566:3: ( ^( SMTTYPES (s+= stackMapTableType )* ) -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:566:5: ^( SMTTYPES (s+= stackMapTableType )* )
            {
            match(input,SMTTYPES,FOLLOW_SMTTYPES_in_stackMapTableTypes6565); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:566:16: (s+= stackMapTableType )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==BOOLEAN||LA83_0==BYTE||LA83_0==CHAR||LA83_0==CLASS||LA83_0==DOUBLE||LA83_0==FLOAT||LA83_0==IDENTIFIER||LA83_0==INT||LA83_0==LONG||LA83_0==SHORT||LA83_0==VOID) ) {
                        alt83=1;
                    }


                    switch (alt83) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:566:17: s+= stackMapTableType
                	    {
                	    pushFollow(FOLLOW_stackMapTableType_in_stackMapTableTypes6570);
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


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 566:43: -> commaSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:568:1: stackMapTableType : (s1= stackMapTableTypeObject -> noformat(f=$s1.st)|s2= stackMapTableTypePlainObject -> noformat(f=$s2.st)|s3= primitiveType -> noformat(f=$s3.st)| IDENTIFIER ( INTLITERAL )? -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text));
    public final JVMPrettyPrinter.stackMapTableType_return stackMapTableType() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableType_return retval = new JVMPrettyPrinter.stackMapTableType_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER100=null;
        CommonTree INTLITERAL101=null;
        JVMPrettyPrinter.stackMapTableTypeObject_return s1 =null;

        JVMPrettyPrinter.stackMapTableTypePlainObject_return s2 =null;

        JVMPrettyPrinter.primitiveType_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:569:3: (s1= stackMapTableTypeObject -> noformat(f=$s1.st)|s2= stackMapTableTypePlainObject -> noformat(f=$s2.st)|s3= primitiveType -> noformat(f=$s3.st)| IDENTIFIER ( INTLITERAL )? -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:569:5: s1= stackMapTableTypeObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypeObject_in_stackMapTableType6598);
                    s1=stackMapTableTypeObject();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 569:35: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:570:5: s2= stackMapTableTypePlainObject
                    {
                    pushFollow(FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType6618);
                    s2=stackMapTableTypePlainObject();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 570:37: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:571:5: s3= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_stackMapTableType6635);
                    s3=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 571:27: -> noformat(f=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:572:5: IDENTIFIER ( INTLITERAL )?
                    {
                    IDENTIFIER100=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_stackMapTableType6655); 

                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:572:16: ( INTLITERAL )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==INTLITERAL) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:572:16: INTLITERAL
                            {
                            INTLITERAL101=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_stackMapTableType6657); 

                            }
                            break;

                    }


                    // TEMPLATE REWRITE
                    // 572:31: -> noformatWithspace2(f=$IDENTIFIER.texts=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (IDENTIFIER100!=null?IDENTIFIER100.getText():null)).put("s", (INTLITERAL101!=null?INTLITERAL101.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:574:1: stackMapTableTypePlainObject : CLASS INTERNALTYPE -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.stackMapTableTypePlainObject_return stackMapTableTypePlainObject() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypePlainObject_return retval = new JVMPrettyPrinter.stackMapTableTypePlainObject_return();
        retval.start = input.LT(1);


        CommonTree CLASS102=null;
        CommonTree INTERNALTYPE103=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:575:3: ( CLASS INTERNALTYPE -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:575:5: CLASS INTERNALTYPE
            {
            CLASS102=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypePlainObject6686); 

            INTERNALTYPE103=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject6688); 

            // TEMPLATE REWRITE
            // 575:29: -> noformatWithspace2(f=$CLASS.texts=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (CLASS102!=null?CLASS102.getText():null)).put("s", (INTERNALTYPE103!=null?INTERNALTYPE103.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:577:1: stackMapTableTypeObject : CLASS STRINGLITERAL -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text);
    public final JVMPrettyPrinter.stackMapTableTypeObject_return stackMapTableTypeObject() throws RecognitionException {
        JVMPrettyPrinter.stackMapTableTypeObject_return retval = new JVMPrettyPrinter.stackMapTableTypeObject_return();
        retval.start = input.LT(1);


        CommonTree CLASS104=null;
        CommonTree STRINGLITERAL105=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:3: ( CLASS STRINGLITERAL -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:578:5: CLASS STRINGLITERAL
            {
            CLASS104=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_stackMapTableTypeObject6718); 

            STRINGLITERAL105=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject6720); 

            // TEMPLATE REWRITE
            // 578:29: -> noformatWithspace2(f=$CLASS.texts=$STRINGLITERAL.text)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (CLASS104!=null?CLASS104.getText():null)).put("s", (STRINGLITERAL105!=null?STRINGLITERAL105.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:588:1: typeList : (s+= type )+ -> commaSeparatedList(ls=$s);
    public final JVMPrettyPrinter.typeList_return typeList() throws RecognitionException {
        JVMPrettyPrinter.typeList_return retval = new JVMPrettyPrinter.typeList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:3: ( (s+= type )+ -> commaSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:5: (s+= type )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:5: (s+= type )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:589:6: s+= type
            	    {
            	    pushFollow(FOLLOW_type_in_typeList6760);
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
            // 589:23: -> commaSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:591:1: type : s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* ) -> type(f=$s.sts=$b);
    public final JVMPrettyPrinter.type_return type() throws RecognitionException {
        JVMPrettyPrinter.type_return retval = new JVMPrettyPrinter.type_return();
        retval.start = input.LT(1);


        CommonTree b=null;
        List list_b=null;
        JVMPrettyPrinter.combinedJavaType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:3: (s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* ) -> type(f=$s.sts=$b))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:5: s= combinedJavaType ^( ARRAYBRACKS (b+= LBRACK RBRACK )* )
            {
            pushFollow(FOLLOW_combinedJavaType_in_type6792);
            s=combinedJavaType();

            state._fsp--;


            match(input,ARRAYBRACKS,FOLLOW_ARRAYBRACKS_in_type6795); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:38: (b+= LBRACK RBRACK )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==LBRACK) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:592:39: b+= LBRACK RBRACK
                	    {
                	    b=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_type6800); 
                	    if (list_b==null) list_b=new ArrayList();
                	    list_b.add(b);


                	    match(input,RBRACK,FOLLOW_RBRACK_in_type6802); 

                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 593:13: -> type(f=$s.sts=$b)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:595:1: combinedJavaType : (s1= primitiveType -> noformat(f=$s1.st)|s2= referenceType -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.combinedJavaType_return combinedJavaType() throws RecognitionException {
        JVMPrettyPrinter.combinedJavaType_return retval = new JVMPrettyPrinter.combinedJavaType_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.primitiveType_return s1 =null;

        JVMPrettyPrinter.referenceType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:596:3: (s1= primitiveType -> noformat(f=$s1.st)|s2= referenceType -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:596:5: s1= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_combinedJavaType6845);
                    s1=primitiveType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 596:27: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:597:5: s2= referenceType
                    {
                    pushFollow(FOLLOW_referenceType_in_combinedJavaType6867);
                    s2=referenceType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 597:27: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:599:1: referenceType : ^( UNITNAME (s+= typeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.referenceType_return referenceType() throws RecognitionException {
        JVMPrettyPrinter.referenceType_return retval = new JVMPrettyPrinter.referenceType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:600:3: ( ^( UNITNAME (s+= typeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:600:5: ^( UNITNAME (s+= typeDeclSpecifier )+ )
            {
            match(input,UNITNAME,FOLLOW_UNITNAME_in_referenceType6894); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:600:16: (s+= typeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:600:17: s+= typeDeclSpecifier
            	    {
            	    pushFollow(FOLLOW_typeDeclSpecifier_in_referenceType6899);
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
            // 600:41: -> dotSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:602:1: typeDeclSpecifier : ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.typeDeclSpecifier_return typeDeclSpecifier() throws RecognitionException {
        JVMPrettyPrinter.typeDeclSpecifier_return retval = new JVMPrettyPrinter.typeDeclSpecifier_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.typeName_return s1 =null;

        JVMPrettyPrinter.typeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:603:3: ( ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:603:5: ^(s1= typeName ^( TYPEARGS (s2= typeArguments )? ) )
            {
            pushFollow(FOLLOW_typeName_in_typeDeclSpecifier6926);
            s1=typeName();

            state._fsp--;


            match(input, Token.DOWN, null); 
            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_typeDeclSpecifier6929); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:603:32: (s2= typeArguments )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==BOOLEAN||LA90_0==BYTE||LA90_0==CHAR||LA90_0==DOUBLE||LA90_0==FLOAT||LA90_0==INT||LA90_0==LONG||LA90_0==QUESTION||LA90_0==SHORT||LA90_0==UNITNAME||LA90_0==VOID) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:603:32: s2= typeArguments
                        {
                        pushFollow(FOLLOW_typeArguments_in_typeDeclSpecifier6933);
                        s2=typeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 604:13: -> noformat2(f=$s1.sts=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:606:1: typeName : QualifiedType -> noformat(f=$QualifiedType.text);
    public final JVMPrettyPrinter.typeName_return typeName() throws RecognitionException {
        JVMPrettyPrinter.typeName_return retval = new JVMPrettyPrinter.typeName_return();
        retval.start = input.LT(1);


        CommonTree QualifiedType106=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:607:3: ( QualifiedType -> noformat(f=$QualifiedType.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:607:5: QualifiedType
            {
            QualifiedType106=(CommonTree)match(input,QualifiedType,FOLLOW_QualifiedType_in_typeName6974); 

            // TEMPLATE REWRITE
            // 607:23: -> noformat(f=$QualifiedType.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (QualifiedType106!=null?QualifiedType106.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:609:1: typeArguments : (s+= typeArgument )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.typeArguments_return typeArguments() throws RecognitionException {
        JVMPrettyPrinter.typeArguments_return retval = new JVMPrettyPrinter.typeArguments_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:610:3: ( (s+= typeArgument )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:610:5: (s+= typeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:610:5: (s+= typeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:610:6: s+= typeArgument
            	    {
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments7002);
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
            // 610:29: -> genericParam(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:612:1: typeArgument : (s1= type -> noformat(f=$s1.st)|s2= wildcard -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.typeArgument_return typeArgument() throws RecognitionException {
        JVMPrettyPrinter.typeArgument_return retval = new JVMPrettyPrinter.typeArgument_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.type_return s1 =null;

        JVMPrettyPrinter.wildcard_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:3: (s1= type -> noformat(f=$s1.st)|s2= wildcard -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:613:5: s1= type
                    {
                    pushFollow(FOLLOW_type_in_typeArgument7032);
                    s1=type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 613:19: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:614:5: s2= wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_typeArgument7055);
                    s2=wildcard();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 614:23: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:616:1: wildcard : ^( QUESTION (s1= wildcardBounds )? ) -> wildT(f=$s1.st);
    public final JVMPrettyPrinter.wildcard_return wildcard() throws RecognitionException {
        JVMPrettyPrinter.wildcard_return retval = new JVMPrettyPrinter.wildcard_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.wildcardBounds_return s1 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:617:3: ( ^( QUESTION (s1= wildcardBounds )? ) -> wildT(f=$s1.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:617:5: ^( QUESTION (s1= wildcardBounds )? )
            {
            match(input,QUESTION,FOLLOW_QUESTION_in_wildcard7083); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:617:18: (s1= wildcardBounds )?
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==EXTENDS||LA93_0==SUPER) ) {
                    alt93=1;
                }
                switch (alt93) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:617:18: s1= wildcardBounds
                        {
                        pushFollow(FOLLOW_wildcardBounds_in_wildcard7087);
                        s1=wildcardBounds();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 617:37: -> wildT(f=$s1.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:619:1: wildcardBounds : ( ^( EXTENDS s1= type ) -> wildBoundsT(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= type ) -> wildBoundsT(f=$SUPER.texts=$s2.st));
    public final JVMPrettyPrinter.wildcardBounds_return wildcardBounds() throws RecognitionException {
        JVMPrettyPrinter.wildcardBounds_return retval = new JVMPrettyPrinter.wildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS107=null;
        CommonTree SUPER108=null;
        JVMPrettyPrinter.type_return s1 =null;

        JVMPrettyPrinter.type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:620:3: ( ^( EXTENDS s1= type ) -> wildBoundsT(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= type ) -> wildBoundsT(f=$SUPER.texts=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:620:5: ^( EXTENDS s1= type )
                    {
                    EXTENDS107=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_wildcardBounds7112); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_wildcardBounds7116);
                    s1=type();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 620:29: -> wildBoundsT(f=$EXTENDS.texts=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("wildBoundsT",new STAttrMap().put("f", (EXTENDS107!=null?EXTENDS107.getText():null)).put("s", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:621:5: ^( SUPER s2= type )
                    {
                    SUPER108=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_wildcardBounds7143); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_wildcardBounds7147);
                    s2=type();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 621:27: -> wildBoundsT(f=$SUPER.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("wildBoundsT",new STAttrMap().put("f", (SUPER108!=null?SUPER108.getText():null)).put("s", (s2!=null?s2.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:623:1: typeParameters : (s+= typeParameter )+ -> typeParameters(ls=$s);
    public final JVMPrettyPrinter.typeParameters_return typeParameters() throws RecognitionException {
        JVMPrettyPrinter.typeParameters_return retval = new JVMPrettyPrinter.typeParameters_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:624:3: ( (s+= typeParameter )+ -> typeParameters(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:624:5: (s+= typeParameter )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:624:5: (s+= typeParameter )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:624:6: s+= typeParameter
            	    {
            	    pushFollow(FOLLOW_typeParameter_in_typeParameters7182);
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
            // 624:29: -> typeParameters(ls=$s)
            {
                retval.st = templateLib.getInstanceOf("typeParameters",new STAttrMap().put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:626:1: typeParameter : ^(id= identifier (tb= typeBound )? ) -> noformatWithspace2(f=$id.sts=($tb.st==null?\"\":$tb.st));
    public final JVMPrettyPrinter.typeParameter_return typeParameter() throws RecognitionException {
        JVMPrettyPrinter.typeParameter_return retval = new JVMPrettyPrinter.typeParameter_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.identifier_return id =null;

        JVMPrettyPrinter.typeBound_return tb =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:627:3: ( ^(id= identifier (tb= typeBound )? ) -> noformatWithspace2(f=$id.sts=($tb.st==null?\"\":$tb.st)))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:627:5: ^(id= identifier (tb= typeBound )? )
            {
            pushFollow(FOLLOW_identifier_in_typeParameter7212);
            id=identifier();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:627:23: (tb= typeBound )?
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==EXTENDS) ) {
                    alt96=1;
                }
                switch (alt96) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:627:23: tb= typeBound
                        {
                        pushFollow(FOLLOW_typeBound_in_typeParameter7216);
                        tb=typeBound();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 627:37: -> noformatWithspace2(f=$id.sts=($tb.st==null?\"\":$tb.st))
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (id!=null?id.st:null)).put("s", ((tb!=null?tb.st:null)==null?"":(tb!=null?tb.st:null))));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:629:1: typeBound : ^( EXTENDS (s+= referenceType )+ ) -> tBound(f=$EXTENDS.textls=$s);
    public final JVMPrettyPrinter.typeBound_return typeBound() throws RecognitionException {
        JVMPrettyPrinter.typeBound_return retval = new JVMPrettyPrinter.typeBound_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS109=null;
        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:630:3: ( ^( EXTENDS (s+= referenceType )+ ) -> tBound(f=$EXTENDS.textls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:630:5: ^( EXTENDS (s+= referenceType )+ )
            {
            EXTENDS109=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeBound7246); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:630:15: (s+= referenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:630:16: s+= referenceType
            	    {
            	    pushFollow(FOLLOW_referenceType_in_typeBound7251);
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
            // 630:37: -> tBound(f=$EXTENDS.textls=$s)
            {
                retval.st = templateLib.getInstanceOf("tBound",new STAttrMap().put("f", (EXTENDS109!=null?EXTENDS109.getText():null)).put("ls", list_s));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:635:1: genericDescriptor : (s+= genericReturnDescriptor )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.genericDescriptor_return genericDescriptor() throws RecognitionException {
        JVMPrettyPrinter.genericDescriptor_return retval = new JVMPrettyPrinter.genericDescriptor_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:636:3: ( (s+= genericReturnDescriptor )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:636:5: (s+= genericReturnDescriptor )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:636:5: (s+= genericReturnDescriptor )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:636:6: s+= genericReturnDescriptor
            	    {
            	    pushFollow(FOLLOW_genericReturnDescriptor_in_genericDescriptor7287);
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
            // 636:37: -> genericParam(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:638:1: genericReturnDescriptor : ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList ) -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st);
    public final JVMPrettyPrinter.genericReturnDescriptor_return genericReturnDescriptor() throws RecognitionException {
        JVMPrettyPrinter.genericReturnDescriptor_return retval = new JVMPrettyPrinter.genericReturnDescriptor_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS110=null;
        JVMPrettyPrinter.identifier_return s1 =null;

        JVMPrettyPrinter.bytecodeReferenceTypeList_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:639:3: ( ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList ) -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:639:5: ^( EXTENDS s1= identifier s2= bytecodeReferenceTypeList )
            {
            EXTENDS110=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericReturnDescriptor7313); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_identifier_in_genericReturnDescriptor7317);
            s1=identifier();

            state._fsp--;


            pushFollow(FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor7321);
            s2=bytecodeReferenceTypeList();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 640:15: -> genRetDesc(f=$s1.sts=$EXTENDS.textt=$s2.st)
            {
                retval.st = templateLib.getInstanceOf("genRetDesc",new STAttrMap().put("f", (s1!=null?s1.st:null)).put("s", (EXTENDS110!=null?EXTENDS110.getText():null)).put("t", (s2!=null?s2.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:642:1: bytecodeReferenceTypeList : (s+= bytecodeReferenceType )+ -> andSeparatedList(ls=$s);
    public final JVMPrettyPrinter.bytecodeReferenceTypeList_return bytecodeReferenceTypeList() throws RecognitionException {
        JVMPrettyPrinter.bytecodeReferenceTypeList_return retval = new JVMPrettyPrinter.bytecodeReferenceTypeList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:643:3: ( (s+= bytecodeReferenceType )+ -> andSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:643:5: (s+= bytecodeReferenceType )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:643:5: (s+= bytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:643:6: s+= bytecodeReferenceType
            	    {
            	    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList7369);
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
            // 643:37: -> andSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:645:1: bytecodeReferenceType : ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.bytecodeReferenceType_return bytecodeReferenceType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeReferenceType_return retval = new JVMPrettyPrinter.bytecodeReferenceType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:646:3: ( ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ ) -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:646:5: ^( UNITNAME (s+= bytecodeTypeDeclSpecifier )+ )
            {
            match(input,UNITNAME,FOLLOW_UNITNAME_in_bytecodeReferenceType7397); 

            match(input, Token.DOWN, null); 
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:646:16: (s+= bytecodeTypeDeclSpecifier )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:646:17: s+= bytecodeTypeDeclSpecifier
            	    {
            	    pushFollow(FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType7402);
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
            // 646:49: -> dotSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:648:1: bytecodeTypeDeclSpecifier : s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return bytecodeTypeDeclSpecifier() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return retval = new JVMPrettyPrinter.bytecodeTypeDeclSpecifier_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeTypeName_return s1 =null;

        JVMPrettyPrinter.bytecodeTypeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:649:3: (s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:649:5: s1= bytecodeTypeName ^( TYPEARGS (s2= bytecodeTypeArguments )? )
            {
            pushFollow(FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier7428);
            s1=bytecodeTypeName();

            state._fsp--;


            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier7431); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:649:38: (s2= bytecodeTypeArguments )?
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==QUESTION||LA101_0==UNITNAME) ) {
                    alt101=1;
                }
                switch (alt101) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:649:38: s2= bytecodeTypeArguments
                        {
                        pushFollow(FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier7435);
                        s2=bytecodeTypeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 650:15: -> noformat2(f=$s1.sts=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:652:1: bytecodeTypeName : INTERNALTYPE -> noformat(f=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.bytecodeTypeName_return bytecodeTypeName() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeName_return retval = new JVMPrettyPrinter.bytecodeTypeName_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE111=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:653:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:653:5: INTERNALTYPE
            {
            INTERNALTYPE111=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_bytecodeTypeName7477); 

            // TEMPLATE REWRITE
            // 653:25: -> noformat(f=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE111!=null?INTERNALTYPE111.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:655:1: bytecodeTypeArguments : s= bytecodeTypeArgumentList -> noformat(f=$s.st);
    public final JVMPrettyPrinter.bytecodeTypeArguments_return bytecodeTypeArguments() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArguments_return retval = new JVMPrettyPrinter.bytecodeTypeArguments_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeTypeArgumentList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:656:3: (s= bytecodeTypeArgumentList -> noformat(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:656:5: s= bytecodeTypeArgumentList
            {
            pushFollow(FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments7507);
            s=bytecodeTypeArgumentList();

            state._fsp--;


            // TEMPLATE REWRITE
            // 656:37: -> noformat(f=$s.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:658:1: bytecodeTypeArgumentList : (s+= bytecodeTypeArgument )+ -> genericParam(ls=$s);
    public final JVMPrettyPrinter.bytecodeTypeArgumentList_return bytecodeTypeArgumentList() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArgumentList_return retval = new JVMPrettyPrinter.bytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:659:3: ( (s+= bytecodeTypeArgument )+ -> genericParam(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:659:5: (s+= bytecodeTypeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:659:5: (s+= bytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:659:6: s+= bytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList7537);
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
            // 659:37: -> genericParam(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:661:1: bytecodeTypeArgument : (s1= bytecodeReferenceType -> noformat(f=$s1.st)|s2= bytecodeWildcard -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.bytecodeTypeArgument_return bytecodeTypeArgument() throws RecognitionException {
        JVMPrettyPrinter.bytecodeTypeArgument_return retval = new JVMPrettyPrinter.bytecodeTypeArgument_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.bytecodeReferenceType_return s1 =null;

        JVMPrettyPrinter.bytecodeWildcard_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:662:3: (s1= bytecodeReferenceType -> noformat(f=$s1.st)|s2= bytecodeWildcard -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:662:5: s1= bytecodeReferenceType
                    {
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument7567);
                    s1=bytecodeReferenceType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 662:33: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:663:5: s2= bytecodeWildcard
                    {
                    pushFollow(FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument7587);
                    s2=bytecodeWildcard();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 663:29: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:665:1: bytecodeWildcard : ^( QUESTION (s= bytecodeWildcardBounds )? ) -> noformatWithspace2(f=$QUESTION.texts=$s.st);
    public final JVMPrettyPrinter.bytecodeWildcard_return bytecodeWildcard() throws RecognitionException {
        JVMPrettyPrinter.bytecodeWildcard_return retval = new JVMPrettyPrinter.bytecodeWildcard_return();
        retval.start = input.LT(1);


        CommonTree QUESTION112=null;
        JVMPrettyPrinter.bytecodeWildcardBounds_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:666:3: ( ^( QUESTION (s= bytecodeWildcardBounds )? ) -> noformatWithspace2(f=$QUESTION.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:666:5: ^( QUESTION (s= bytecodeWildcardBounds )? )
            {
            QUESTION112=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_bytecodeWildcard7613); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:666:17: (s= bytecodeWildcardBounds )?
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==EXTENDS||LA104_0==SUPER) ) {
                    alt104=1;
                }
                switch (alt104) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:666:17: s= bytecodeWildcardBounds
                        {
                        pushFollow(FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard7617);
                        s=bytecodeWildcardBounds();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 666:43: -> noformatWithspace2(f=$QUESTION.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (QUESTION112!=null?QUESTION112.getText():null)).put("s", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:668:1: bytecodeWildcardBounds : ( ^( EXTENDS s1= bytecodeReferenceType ) -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= bytecodeReferenceType ) -> noformatWithspace2(f=$SUPER.texts=$s2.st));
    public final JVMPrettyPrinter.bytecodeWildcardBounds_return bytecodeWildcardBounds() throws RecognitionException {
        JVMPrettyPrinter.bytecodeWildcardBounds_return retval = new JVMPrettyPrinter.bytecodeWildcardBounds_return();
        retval.start = input.LT(1);


        CommonTree EXTENDS113=null;
        CommonTree SUPER114=null;
        JVMPrettyPrinter.bytecodeReferenceType_return s1 =null;

        JVMPrettyPrinter.bytecodeReferenceType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:669:3: ( ^( EXTENDS s1= bytecodeReferenceType ) -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)| ^( SUPER s2= bytecodeReferenceType ) -> noformatWithspace2(f=$SUPER.texts=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:669:5: ^( EXTENDS s1= bytecodeReferenceType )
                    {
                    EXTENDS113=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_bytecodeWildcardBounds7645); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7649);
                    s1=bytecodeReferenceType();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 669:43: -> noformatWithspace2(f=$EXTENDS.texts=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (EXTENDS113!=null?EXTENDS113.getText():null)).put("s", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:670:5: ^( SUPER s2= bytecodeReferenceType )
                    {
                    SUPER114=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_bytecodeWildcardBounds7672); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7676);
                    s2=bytecodeReferenceType();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 670:41: -> noformatWithspace2(f=$SUPER.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformatWithspace2",new STAttrMap().put("f", (SUPER114!=null?SUPER114.getText():null)).put("s", (s2!=null?s2.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:677:1: bytecodeType : (s1= bytecodeArrayType -> noformat(f=$s1.st)| BaseType -> noformat(f=$BaseType.text)|s2= simpleBytecodeObjectType SEMI -> noformat2(f=$s2.sts=$SEMI.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text));
    public final JVMPrettyPrinter.bytecodeType_return bytecodeType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeType_return retval = new JVMPrettyPrinter.bytecodeType_return();
        retval.start = input.LT(1);


        CommonTree BaseType115=null;
        CommonTree SEMI116=null;
        CommonTree IDENTIFIER117=null;
        JVMPrettyPrinter.bytecodeArrayType_return s1 =null;

        JVMPrettyPrinter.simpleBytecodeObjectType_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:678:3: (s1= bytecodeArrayType -> noformat(f=$s1.st)| BaseType -> noformat(f=$BaseType.text)|s2= simpleBytecodeObjectType SEMI -> noformat2(f=$s2.sts=$SEMI.text)| IDENTIFIER -> noformat(f=$IDENTIFIER.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:678:5: s1= bytecodeArrayType
                    {
                    pushFollow(FOLLOW_bytecodeArrayType_in_bytecodeType7711);
                    s1=bytecodeArrayType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 678:29: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:679:5: BaseType
                    {
                    BaseType115=(CommonTree)match(input,BaseType,FOLLOW_BaseType_in_bytecodeType7729); 

                    // TEMPLATE REWRITE
                    // 679:21: -> noformat(f=$BaseType.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BaseType115!=null?BaseType115.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:680:5: s2= simpleBytecodeObjectType SEMI
                    {
                    pushFollow(FOLLOW_simpleBytecodeObjectType_in_bytecodeType7753);
                    s2=simpleBytecodeObjectType();

                    state._fsp--;


                    SEMI116=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_bytecodeType7755); 

                    // TEMPLATE REWRITE
                    // 680:39: -> noformat2(f=$s2.sts=$SEMI.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (s2!=null?s2.st:null)).put("s", (SEMI116!=null?SEMI116.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:681:5: IDENTIFIER
                    {
                    IDENTIFIER117=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_bytecodeType7775); 

                    // TEMPLATE REWRITE
                    // 681:23: -> noformat(f=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER117!=null?IDENTIFIER117.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:684:1: bytecodeArrayType : LBRACK s= bytecodeType -> noformat2(f=$LBRACK.texts=$s.st);
    public final JVMPrettyPrinter.bytecodeArrayType_return bytecodeArrayType() throws RecognitionException {
        JVMPrettyPrinter.bytecodeArrayType_return retval = new JVMPrettyPrinter.bytecodeArrayType_return();
        retval.start = input.LT(1);


        CommonTree LBRACK118=null;
        JVMPrettyPrinter.bytecodeType_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:685:3: ( LBRACK s= bytecodeType -> noformat2(f=$LBRACK.texts=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:685:5: LBRACK s= bytecodeType
            {
            LBRACK118=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_bytecodeArrayType7806); 

            pushFollow(FOLLOW_bytecodeType_in_bytecodeArrayType7810);
            s=bytecodeType();

            state._fsp--;


            // TEMPLATE REWRITE
            // 685:29: -> noformat2(f=$LBRACK.texts=$s.st)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (LBRACK118!=null?LBRACK118.getText():null)).put("s", (s!=null?s.st:null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:687:1: simpleBytecodeObjectType : (s+= simpleBytecodeReferenceType )+ -> dotSeparatedList(ls=$s);
    public final JVMPrettyPrinter.simpleBytecodeObjectType_return simpleBytecodeObjectType() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeObjectType_return retval = new JVMPrettyPrinter.simpleBytecodeObjectType_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:688:3: ( (s+= simpleBytecodeReferenceType )+ -> dotSeparatedList(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:688:5: (s+= simpleBytecodeReferenceType )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:688:5: (s+= simpleBytecodeReferenceType )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:688:6: s+= simpleBytecodeReferenceType
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType7841);
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
            // 688:39: -> dotSeparatedList(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:690:1: simpleBytecodeReferenceType : s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st);
    public final JVMPrettyPrinter.simpleBytecodeReferenceType_return simpleBytecodeReferenceType() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeReferenceType_return retval = new JVMPrettyPrinter.simpleBytecodeReferenceType_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return s1 =null;

        JVMPrettyPrinter.simpleBytecodeTypeArguments_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:691:3: (s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? ) -> noformat2(f=$s1.sts=$s2.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:691:5: s1= simpleBytecodeReferenceTypeName ^( TYPEARGS (s2= simpleBytecodeTypeArguments )? )
            {
            pushFollow(FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType7866);
            s1=simpleBytecodeReferenceTypeName();

            state._fsp--;


            match(input,TYPEARGS,FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType7869); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:691:53: (s2= simpleBytecodeTypeArguments )?
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==BaseType||LA108_0==IDENTIFIER||LA108_0==INTERNALTYPE||LA108_0==LBRACK||LA108_0==MINUS||LA108_0==PLUS||LA108_0==STAR) ) {
                    alt108=1;
                }
                switch (alt108) {
                    case 1 :
                        // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:691:53: s2= simpleBytecodeTypeArguments
                        {
                        pushFollow(FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType7873);
                        s2=simpleBytecodeTypeArguments();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 692:13: -> noformat2(f=$s1.sts=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:694:1: simpleBytecodeReferenceTypeName : INTERNALTYPE -> noformat(f=$INTERNALTYPE.text);
    public final JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return simpleBytecodeReferenceTypeName() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return retval = new JVMPrettyPrinter.simpleBytecodeReferenceTypeName_return();
        retval.start = input.LT(1);


        CommonTree INTERNALTYPE119=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:695:3: ( INTERNALTYPE -> noformat(f=$INTERNALTYPE.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:695:5: INTERNALTYPE
            {
            INTERNALTYPE119=(CommonTree)match(input,INTERNALTYPE,FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName7912); 

            // TEMPLATE REWRITE
            // 695:23: -> noformat(f=$INTERNALTYPE.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTERNALTYPE119!=null?INTERNALTYPE119.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:697:1: simpleBytecodeTypeArguments : s= simpleBytecodeTypeArgumentList -> noformat(f=$s.st);
    public final JVMPrettyPrinter.simpleBytecodeTypeArguments_return simpleBytecodeTypeArguments() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArguments_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArguments_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return s =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:698:3: (s= simpleBytecodeTypeArgumentList -> noformat(f=$s.st))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:698:5: s= simpleBytecodeTypeArgumentList
            {
            pushFollow(FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments7940);
            s=simpleBytecodeTypeArgumentList();

            state._fsp--;


            // TEMPLATE REWRITE
            // 698:39: -> noformat(f=$s.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:700:1: simpleBytecodeTypeArgumentList : (s+= simpleBytecodeTypeArgument )+ -> bcGenericArgs(ls=$s);
    public final JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return simpleBytecodeTypeArgumentList() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArgumentList_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:701:3: ( (s+= simpleBytecodeTypeArgument )+ -> bcGenericArgs(ls=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:701:5: (s+= simpleBytecodeTypeArgument )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:701:5: (s+= simpleBytecodeTypeArgument )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:701:6: s+= simpleBytecodeTypeArgument
            	    {
            	    pushFollow(FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList7965);
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
            // 701:39: -> bcGenericArgs(ls=$s)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:703:1: simpleBytecodeTypeArgument : (s1= bytecodeType -> noformat(f=$s1.st)| MINUS s2= bytecodeType -> noformat2(f=$MINUS.texts=$s2.st)| PLUS s3= bytecodeType -> noformat2(f=$PLUS.texts=$s3.st)| STAR -> noformat(f=$STAR.text));
    public final JVMPrettyPrinter.simpleBytecodeTypeArgument_return simpleBytecodeTypeArgument() throws RecognitionException {
        JVMPrettyPrinter.simpleBytecodeTypeArgument_return retval = new JVMPrettyPrinter.simpleBytecodeTypeArgument_return();
        retval.start = input.LT(1);


        CommonTree MINUS120=null;
        CommonTree PLUS121=null;
        CommonTree STAR122=null;
        JVMPrettyPrinter.bytecodeType_return s1 =null;

        JVMPrettyPrinter.bytecodeType_return s2 =null;

        JVMPrettyPrinter.bytecodeType_return s3 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:704:3: (s1= bytecodeType -> noformat(f=$s1.st)| MINUS s2= bytecodeType -> noformat2(f=$MINUS.texts=$s2.st)| PLUS s3= bytecodeType -> noformat2(f=$PLUS.texts=$s3.st)| STAR -> noformat(f=$STAR.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:704:5: s1= bytecodeType
                    {
                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7991);
                    s1=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 704:25: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:705:5: MINUS s2= bytecodeType
                    {
                    MINUS120=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_simpleBytecodeTypeArgument8010); 

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument8014);
                    s2=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 705:31: -> noformat2(f=$MINUS.texts=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (MINUS120!=null?MINUS120.getText():null)).put("s", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:706:5: PLUS s3= bytecodeType
                    {
                    PLUS121=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_simpleBytecodeTypeArgument8037); 

                    pushFollow(FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument8041);
                    s3=bytecodeType();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 706:31: -> noformat2(f=$PLUS.texts=$s3.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (PLUS121!=null?PLUS121.getText():null)).put("s", (s3!=null?s3.st:null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:707:5: STAR
                    {
                    STAR122=(CommonTree)match(input,STAR,FOLLOW_STAR_in_simpleBytecodeTypeArgument8065); 

                    // TEMPLATE REWRITE
                    // 707:17: -> noformat(f=$STAR.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STAR122!=null?STAR122.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:714:1: identifier : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.identifier_return identifier() throws RecognitionException {
        JVMPrettyPrinter.identifier_return retval = new JVMPrettyPrinter.identifier_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER123=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:715:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:715:5: IDENTIFIER
            {
            IDENTIFIER123=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier8098); 

            // TEMPLATE REWRITE
            // 715:19: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER123!=null?IDENTIFIER123.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:718:1: keywordAggregate : IDENTIFIER -> noformat(f=$IDENTIFIER.text);
    public final JVMPrettyPrinter.keywordAggregate_return keywordAggregate() throws RecognitionException {
        JVMPrettyPrinter.keywordAggregate_return retval = new JVMPrettyPrinter.keywordAggregate_return();
        retval.start = input.LT(1);


        CommonTree IDENTIFIER124=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:719:3: ( IDENTIFIER -> noformat(f=$IDENTIFIER.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:719:6: IDENTIFIER
            {
            IDENTIFIER124=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_keywordAggregate8124); 

            // TEMPLATE REWRITE
            // 719:21: -> noformat(f=$IDENTIFIER.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (IDENTIFIER124!=null?IDENTIFIER124.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:722:1: primitiveType : (s1= boolean_type -> noformat(f=$s1.st)|s2= numeric_type -> noformat(f=$s2.st)| VOID -> noformat(f=$VOID.text));
    public final JVMPrettyPrinter.primitiveType_return primitiveType() throws RecognitionException {
        JVMPrettyPrinter.primitiveType_return retval = new JVMPrettyPrinter.primitiveType_return();
        retval.start = input.LT(1);


        CommonTree VOID125=null;
        JVMPrettyPrinter.boolean_type_return s1 =null;

        JVMPrettyPrinter.numeric_type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:723:3: (s1= boolean_type -> noformat(f=$s1.st)|s2= numeric_type -> noformat(f=$s2.st)| VOID -> noformat(f=$VOID.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:723:5: s1= boolean_type
                    {
                    pushFollow(FOLLOW_boolean_type_in_primitiveType8152);
                    s1=boolean_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 723:23: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:724:5: s2= numeric_type
                    {
                    pushFollow(FOLLOW_numeric_type_in_primitiveType8171);
                    s2=numeric_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 724:23: -> noformat(f=$s2.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s2!=null?s2.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:725:5: VOID
                    {
                    VOID125=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primitiveType8188); 

                    // TEMPLATE REWRITE
                    // 725:15: -> noformat(f=$VOID.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (VOID125!=null?VOID125.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:728:1: boolean_type : BOOLEAN -> noformat(f=$BOOLEAN.text);
    public final JVMPrettyPrinter.boolean_type_return boolean_type() throws RecognitionException {
        JVMPrettyPrinter.boolean_type_return retval = new JVMPrettyPrinter.boolean_type_return();
        retval.start = input.LT(1);


        CommonTree BOOLEAN126=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:729:3: ( BOOLEAN -> noformat(f=$BOOLEAN.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:729:5: BOOLEAN
            {
            BOOLEAN126=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_type8215); 

            // TEMPLATE REWRITE
            // 729:17: -> noformat(f=$BOOLEAN.text)
            {
                retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BOOLEAN126!=null?BOOLEAN126.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:732:1: numeric_type : (s1= floating_point_type -> noformat(f=$s1.st)|s2= integral_type -> noformat(f=$s2.st));
    public final JVMPrettyPrinter.numeric_type_return numeric_type() throws RecognitionException {
        JVMPrettyPrinter.numeric_type_return retval = new JVMPrettyPrinter.numeric_type_return();
        retval.start = input.LT(1);


        JVMPrettyPrinter.floating_point_type_return s1 =null;

        JVMPrettyPrinter.integral_type_return s2 =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:733:3: (s1= floating_point_type -> noformat(f=$s1.st)|s2= integral_type -> noformat(f=$s2.st))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:733:5: s1= floating_point_type
                    {
                    pushFollow(FOLLOW_floating_point_type_in_numeric_type8243);
                    s1=floating_point_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 733:29: -> noformat(f=$s1.st)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (s1!=null?s1.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:734:5: s2= integral_type
                    {
                    pushFollow(FOLLOW_integral_type_in_numeric_type8261);
                    s2=integral_type();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 734:25: -> noformat(f=$s2.st)
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:737:1: integral_type : ( BYTE -> noformat(f=$BYTE.text)| SHORT -> noformat(f=$SHORT.text)| INT -> noformat(f=$INT.text)| LONG -> noformat(f=$LONG.text)| CHAR -> noformat(f=$CHAR.text));
    public final JVMPrettyPrinter.integral_type_return integral_type() throws RecognitionException {
        JVMPrettyPrinter.integral_type_return retval = new JVMPrettyPrinter.integral_type_return();
        retval.start = input.LT(1);


        CommonTree BYTE127=null;
        CommonTree SHORT128=null;
        CommonTree INT129=null;
        CommonTree LONG130=null;
        CommonTree CHAR131=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:738:3: ( BYTE -> noformat(f=$BYTE.text)| SHORT -> noformat(f=$SHORT.text)| INT -> noformat(f=$INT.text)| LONG -> noformat(f=$LONG.text)| CHAR -> noformat(f=$CHAR.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:738:5: BYTE
                    {
                    BYTE127=(CommonTree)match(input,BYTE,FOLLOW_BYTE_in_integral_type8286); 

                    // TEMPLATE REWRITE
                    // 738:13: -> noformat(f=$BYTE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BYTE127!=null?BYTE127.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:739:5: SHORT
                    {
                    SHORT128=(CommonTree)match(input,SHORT,FOLLOW_SHORT_in_integral_type8304); 

                    // TEMPLATE REWRITE
                    // 739:13: -> noformat(f=$SHORT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (SHORT128!=null?SHORT128.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:740:5: INT
                    {
                    INT129=(CommonTree)match(input,INT,FOLLOW_INT_in_integral_type8321); 

                    // TEMPLATE REWRITE
                    // 740:13: -> noformat(f=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INT129!=null?INT129.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:741:5: LONG
                    {
                    LONG130=(CommonTree)match(input,LONG,FOLLOW_LONG_in_integral_type8340); 

                    // TEMPLATE REWRITE
                    // 741:13: -> noformat(f=$LONG.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (LONG130!=null?LONG130.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:742:5: CHAR
                    {
                    CHAR131=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_integral_type8358); 

                    // TEMPLATE REWRITE
                    // 742:13: -> noformat(f=$CHAR.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CHAR131!=null?CHAR131.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:745:1: floating_point_type : ( FLOAT -> noformat(f=$FLOAT.text)| DOUBLE -> noformat(f=$DOUBLE.text));
    public final JVMPrettyPrinter.floating_point_type_return floating_point_type() throws RecognitionException {
        JVMPrettyPrinter.floating_point_type_return retval = new JVMPrettyPrinter.floating_point_type_return();
        retval.start = input.LT(1);


        CommonTree FLOAT132=null;
        CommonTree DOUBLE133=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:746:3: ( FLOAT -> noformat(f=$FLOAT.text)| DOUBLE -> noformat(f=$DOUBLE.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:746:5: FLOAT
                    {
                    FLOAT132=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_floating_point_type8383); 

                    // TEMPLATE REWRITE
                    // 746:13: -> noformat(f=$FLOAT.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FLOAT132!=null?FLOAT132.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:747:5: DOUBLE
                    {
                    DOUBLE133=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_floating_point_type8400); 

                    // TEMPLATE REWRITE
                    // 747:15: -> noformat(f=$DOUBLE.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (DOUBLE133!=null?DOUBLE133.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:750:1: literals : ( LONGLITERAL -> noformat(f=$LONGLITERAL.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)| FLOATLITERAL -> noformat(f=$FLOATLITERAL.text)| DOUBLELITERAL -> noformat(f=$DOUBLELITERAL.text)| CHARLITERAL -> noformat(f=$CHARLITERAL.text)| STRINGLITERAL -> noformat(f=$STRINGLITERAL.text)| BOOLEANLITERAL -> noformat(f=$BOOLEANLITERAL.text)| ( MINUS )? IDENTIFIER -> noformat2(f=$MINUS.texts=$IDENTIFIER.text));
    public final JVMPrettyPrinter.literals_return literals() throws RecognitionException {
        JVMPrettyPrinter.literals_return retval = new JVMPrettyPrinter.literals_return();
        retval.start = input.LT(1);


        CommonTree LONGLITERAL134=null;
        CommonTree INTLITERAL135=null;
        CommonTree FLOATLITERAL136=null;
        CommonTree DOUBLELITERAL137=null;
        CommonTree CHARLITERAL138=null;
        CommonTree STRINGLITERAL139=null;
        CommonTree BOOLEANLITERAL140=null;
        CommonTree MINUS141=null;
        CommonTree IDENTIFIER142=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:751:3: ( LONGLITERAL -> noformat(f=$LONGLITERAL.text)| INTLITERAL -> noformat(f=$INTLITERAL.text)| FLOATLITERAL -> noformat(f=$FLOATLITERAL.text)| DOUBLELITERAL -> noformat(f=$DOUBLELITERAL.text)| CHARLITERAL -> noformat(f=$CHARLITERAL.text)| STRINGLITERAL -> noformat(f=$STRINGLITERAL.text)| BOOLEANLITERAL -> noformat(f=$BOOLEANLITERAL.text)| ( MINUS )? IDENTIFIER -> noformat2(f=$MINUS.texts=$IDENTIFIER.text))
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:751:5: LONGLITERAL
                    {
                    LONGLITERAL134=(CommonTree)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literals8425); 

                    // TEMPLATE REWRITE
                    // 751:19: -> noformat(f=$LONGLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (LONGLITERAL134!=null?LONGLITERAL134.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:752:5: INTLITERAL
                    {
                    INTLITERAL135=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literals8442); 

                    // TEMPLATE REWRITE
                    // 752:19: -> noformat(f=$INTLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (INTLITERAL135!=null?INTLITERAL135.getText():null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:753:5: FLOATLITERAL
                    {
                    FLOATLITERAL136=(CommonTree)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literals8460); 

                    // TEMPLATE REWRITE
                    // 753:19: -> noformat(f=$FLOATLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (FLOATLITERAL136!=null?FLOATLITERAL136.getText():null)));
                    }



                    }
                    break;
                case 4 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:754:5: DOUBLELITERAL
                    {
                    DOUBLELITERAL137=(CommonTree)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literals8476); 

                    // TEMPLATE REWRITE
                    // 754:19: -> noformat(f=$DOUBLELITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (DOUBLELITERAL137!=null?DOUBLELITERAL137.getText():null)));
                    }



                    }
                    break;
                case 5 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:755:5: CHARLITERAL
                    {
                    CHARLITERAL138=(CommonTree)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literals8491); 

                    // TEMPLATE REWRITE
                    // 755:19: -> noformat(f=$CHARLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (CHARLITERAL138!=null?CHARLITERAL138.getText():null)));
                    }



                    }
                    break;
                case 6 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:756:5: STRINGLITERAL
                    {
                    STRINGLITERAL139=(CommonTree)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literals8508); 

                    // TEMPLATE REWRITE
                    // 756:19: -> noformat(f=$STRINGLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (STRINGLITERAL139!=null?STRINGLITERAL139.getText():null)));
                    }



                    }
                    break;
                case 7 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:757:5: BOOLEANLITERAL
                    {
                    BOOLEANLITERAL140=(CommonTree)match(input,BOOLEANLITERAL,FOLLOW_BOOLEANLITERAL_in_literals8523); 

                    // TEMPLATE REWRITE
                    // 757:21: -> noformat(f=$BOOLEANLITERAL.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat",new STAttrMap().put("f", (BOOLEANLITERAL140!=null?BOOLEANLITERAL140.getText():null)));
                    }



                    }
                    break;
                case 8 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:758:5: ( MINUS )? IDENTIFIER
                    {
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:758:5: ( MINUS )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==MINUS) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:758:5: MINUS
                            {
                            MINUS141=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_literals8539); 

                            }
                            break;

                    }


                    IDENTIFIER142=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literals8542); 

                    // TEMPLATE REWRITE
                    // 758:23: -> noformat2(f=$MINUS.texts=$IDENTIFIER.text)
                    {
                        retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (MINUS141!=null?MINUS141.getText():null)).put("s", (IDENTIFIER142!=null?IDENTIFIER142.getText():null)));
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
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:761:1: pc : INTLITERAL COLON -> noformat2(f=$INTLITERAL.texts=$COLON.text);
    public final JVMPrettyPrinter.pc_return pc() throws RecognitionException {
        JVMPrettyPrinter.pc_return retval = new JVMPrettyPrinter.pc_return();
        retval.start = input.LT(1);


        CommonTree INTLITERAL143=null;
        CommonTree COLON144=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:762:3: ( INTLITERAL COLON -> noformat2(f=$INTLITERAL.texts=$COLON.text))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\JVMPrettyPrinter.g:762:5: INTLITERAL COLON
            {
            INTLITERAL143=(CommonTree)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_pc8568); 

            COLON144=(CommonTree)match(input,COLON,FOLLOW_COLON_in_pc8570); 

            // TEMPLATE REWRITE
            // 762:23: -> noformat2(f=$INTLITERAL.texts=$COLON.text)
            {
                retval.st = templateLib.getInstanceOf("noformat2",new STAttrMap().put("f", (INTLITERAL143!=null?INTLITERAL143.getText():null)).put("s", (COLON144!=null?COLON144.getText():null)));
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
    public static final BitSet FOLLOW_IDENTIFIER_in_compiled_file_info361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_compiled_file_info363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASSDECL_in_classDefinition404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_classDefinition408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_visual_modifier_in_classDefinition412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_classDefinition417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_modifier_in_classDefinition422 = new BitSet(new long[]{0x0080000000200018L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeName_in_classDefinition429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
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
    public static final BitSet FOLLOW_type_info2_in_type_info1842 = new BitSet(new long[]{0x0400840000000002L,0x0040000000000402L,0x0000000000009E00L});
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
    public static final BitSet FOLLOW_innerclass_info_line_in_innerclass_info1449 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VMODIFIER_in_innerclass_info_line1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_innerclass_info_line1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_innerclass_info_line1511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_innerclass_info_line1516 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
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
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_runtimeVisibleAnnotations_info1822 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeVisibleAnnotationsItem1855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeVisibleAnnotationsItem1859 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeVisibleAnnotationsItem1863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationAssign_in_runtimeVisibleAnnotationAssignList1903 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ASSIGN_in_annotationAssign1927 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_annotationAssign1929 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationAssign1933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssign_in_annotationValue1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationAssign_in_annotationValue1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATIONBRACKETS_in_brackedAnnotationAssign2008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_brackedAnnotationAssignList_in_brackedAnnotationAssign2012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_brackedAnnotationAssignValue_in_brackedAnnotationAssignList2044 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_AnnotationAssign_in_brackedAnnotationAssignValue2074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_brackedAnnotationAssignValue2078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RuntimeVisibleParameterAnnotations_in_runtimeVisibleParameterAnnotations2112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeVisibleParameterAnnotations2117 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_RuntimeInvisibleParameterAnnotations_in_runtimeInvisibleParameterAnnotations2152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameterVisibilityInfo_in_runtimeInvisibleParameterAnnotations2157 = new BitSet(new long[]{0x0000000000000008L,0x0000040000000000L});
    public static final BitSet FOLLOW_RuntimeInvisibleAnnotations_in_runtimeInvisibleAnnotations2192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotationsItem_in_runtimeInvisibleAnnotations2197 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_PVI_in_parameterVisibilityInfo2232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_parameterVisibilityInfo2236 = new BitSet(new long[]{0x0000000010000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parameterVisibilityInfo2238 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationsItem_in_parameterVisibilityInfo2244 = new BitSet(new long[]{0x0000000010000008L});
    public static final BitSet FOLLOW_RIAI_in_runtimeInvisibleAnnotationsItem2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2285 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_pc_in_runtimeInvisibleAnnotationsItem2289 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CPINDEX_in_runtimeInvisibleAnnotationsItem2293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotationAssignList_in_runtimeInvisibleAnnotationsItem2297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool2345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant_pool2349 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_contant_pool_line_in_constant_pool2354 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_contant_pool_line2400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_contant_pool_line2404 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_contant_pool_line2408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classBodyEntryDecl_in_classBody2456 = new BitSet(new long[]{0x0020000040000002L,0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_methodDefinition_in_classBodyEntryDecl2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ctorDefinition_in_classBodyEntryDecl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDefinition_in_classBodyEntryDecl2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticCtorDefinition_in_classBodyEntryDecl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDDECL_in_fieldDefinition2570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_fieldDefinition2573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_fieldDefinition2577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_fieldDefinition2582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_modifier_in_fieldDefinition2587 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000200080004L});
    public static final BitSet FOLLOW_RETVALUE_in_fieldDefinition2593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_fieldDefinition2597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_fieldDefinition2601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_fieldDefinition2605 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELDVALUE_in_fieldDefinition2609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literals_in_fieldDefinition2613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_fieldDefinition2630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldInfo_in_fieldDefinition2634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_fieldDefinition2650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fieldAdditionalInfo_in_fieldDefinition2655 = new BitSet(new long[]{0x0000040400000008L,0x0050000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Signature_in_fieldInfo2821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_fieldInfo2825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_flags_in_fieldInfo2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_fieldAdditionalInfo2867 = new BitSet(new long[]{0x0200010000082000L,0x0000000010040202L,0x0000000000000020L});
    public static final BitSet FOLLOW_literals_in_fieldAdditionalInfo2871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Constant_in_fieldAdditionalInfo2897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_fieldAdditionalInfo2899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_fieldAdditionalInfo2922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_fieldAdditionalInfo2924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Deprecated_in_fieldAdditionalInfo2953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_fieldAdditionalInfo2981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_fieldAdditionalInfo2983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_fieldAdditionalInfo3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_fieldAdditionalInfo3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_field_visual_modifier3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_field_visual_modifier3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_field_visual_modifier3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_field_modifier3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_field_modifier3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_field_modifier3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_field_modifier3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATICCTORDECL_in_staticCtorDefinition3229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_staticCtorDefinition3232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_staticCtorDefinition3236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_staticCtorDefinition3246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_staticCtorDefinition3250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_staticCtorDefinition3259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_staticCtorDefinition3263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CTORDECL_in_ctorDefinition3415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_ctorDefinition3418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_field_visual_modifier_in_ctorDefinition3422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERICDESC_in_ctorDefinition3427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_ctorDefinition3431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_ctorDefinition3436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeName_in_ctorDefinition3440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_ctorDefinition3445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_ctorDefinition3448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_ctorDefinition3452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_ctorDefinition3481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_ctorDefinition3485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_ctorDefinition3513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_ctorDefinition3517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_ctorDefinition3545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_ctorDefinition3549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHODDECL_in_methodDefinition3771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VMODIFIER_in_methodDefinition3774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_visual_modifier_in_methodDefinition3778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_in_methodDefinition3783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_method_modifier_in_methodDefinition3788 = new BitSet(new long[]{0x0080000000000018L,0x0000000080000000L,0x0000000000000114L});
    public static final BitSet FOLLOW_GENERICDESC_in_methodDefinition3794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericDescriptor_in_methodDefinition3798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETVALUE_in_methodDefinition3803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_methodDefinition3807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITNAME_in_methodDefinition3811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keywordAggregate_in_methodDefinition3815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arguments_in_methodDefinition3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THROWCLAUSE_in_methodDefinition3823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClauseMethod_in_methodDefinition3827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITHEADER_in_methodDefinition3856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodInfo_in_methodDefinition3860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITBODY_in_methodDefinition3888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_body_in_methodDefinition3892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNITATTR_in_methodDefinition3921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_afterMethodInfo_in_methodDefinition3925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STANDINTOKEN_in_methodInfo4153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_methodSignatureInfo_in_methodInfo4157 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_flags_in_methodInfo4161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_afterMethodInfoEntry_in_afterMethodInfo4206 = new BitSet(new long[]{0x0004040000000402L,0x00F0000000000000L,0x0000000000008800L});
    public static final BitSet FOLLOW_Deprecated_in_afterMethodInfoEntry4236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_afterMethodInfoEntry4264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CPINDEX_in_afterMethodInfoEntry4266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_runtimeInvisibleParameterAnnotations_in_afterMethodInfoEntry4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleAnnotations_info_in_afterMethodInfoEntry4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeInvisibleAnnotations_in_afterMethodInfoEntry4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_runtimeVisibleParameterAnnotations_in_afterMethodInfoEntry4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Exceptions_in_afterMethodInfoEntry4373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwClause_in_afterMethodInfoEntry4378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_afterMethodInfoEntry4404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_afterMethodInfoEntry4406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotationDefault_in_afterMethodInfoEntry4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AnnotationDefault_in_annotationDefault4465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DefaultValue_in_annotationDefault4468 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_annotationValue_in_annotationDefault4472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Signature_in_methodSignatureInfo4506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMDESC_in_methodSignatureInfo4509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeType_in_methodSignatureInfo4514 = new BitSet(new long[]{0x0000000000008008L,0x0000000000008102L});
    public static final BitSet FOLLOW_RETDESC_in_methodSignatureInfo4520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnDescriptor_in_methodSignatureInfo4524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeType_in_returnDescriptor4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VoidType_in_returnDescriptor4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_method_modifier4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_method_modifier4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_method_modifier4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_method_modifier4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_method_modifier4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_method_modifier4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PUBLIC_in_method_visual_modifier4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_method_visual_modifier4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_method_visual_modifier4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITARGUMENTS_in_arguments4784 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_arguments4788 = new BitSet(new long[]{0x0000004000000008L});
    public static final BitSet FOLLOW_DOT_in_arguments4794 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments4796 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DOT_in_arguments4798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Synthetic_in_body4844 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_body4846 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Code_in_body4851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_body4855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bodyExtension_in_body4861 = new BitSet(new long[]{0x0002000000000002L,0x0000000003800000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ExceptionTable_in_bodyExtension4904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTable_in_bodyExtension4909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LineNumberTable_in_bodyExtension4933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lineNumberTable_in_bodyExtension4938 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTable_in_bodyExtension4962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension4967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LocalVariableTypeTable_in_bodyExtension4989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTable_in_bodyExtension4993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMapTable_in_bodyExtension5014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTable_in_bodyExtension5018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_StackMap_in_bodyExtension5043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTable_in_bodyExtension5047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARINFO_in_codeBlock5080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variables_in_codeBlock5084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTION_in_codeBlock5088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instructionSet_in_codeBlock5093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_codeBlockEnd_in_codeBlock5099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeLine_in_instructionSet5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaSwitch_in_instructionSet5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeLine5188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeLine5192 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine5195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operand1_in_codeLine5199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERAND_in_codeLine5204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeLine5206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENTIFIER_in_codeBlockEnd5254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_codeBlockEnd5258 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_codeBlockEnd5260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CPINDEX_in_operand15304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_operand15325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_operand15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variables5373 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables5377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_variable_in_variables5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variable5423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_variable5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_variable5427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_javaSwitch5465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_javaSwitch5468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_javaSwitch5472 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchLine_in_javaSwitch5477 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_switchDefaultLine_in_javaSwitch5483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_pc_in_switchLine5533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchLine5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLine5566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTLITERAL_in_switchDefaultLine5568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClause5598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeList_in_throwClause5602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROWS_in_throwClauseMethod5633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_throwType_in_throwClauseMethod5638 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000102L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_throwType5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_throwType5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QualifiedType_in_throwType5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ETHEADER_in_exceptionTable5732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTable5748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ETENTRY_in_exceptionTable5752 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exceptionTableEntry_in_exceptionTable5757 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_exceptionTableEntry5818 = new BitSet(new long[]{0x0100008008045000L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_exceptionTableEntryValue_in_exceptionTableEntry5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_exceptionTableEntryValue5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_exceptionTableEntryValue5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_TYPE_ASSIGNABLE_in_exceptionTableEntryValue5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineNumberTableLine_in_lineNumberTable5936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_lineNumberTableLine5963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pc_in_lineNumberTableLine5967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_lineNumberTableLine5969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVHEADER_in_localVariableTable6009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable6013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable6017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable6021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable6025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTable6029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LVENTRY_in_localVariableTable6033 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableTableLine_in_localVariableTable6038 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine6099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine6103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_localVariableTableLine6107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableTableLineIdentifier_in_localVariableTableLine6111 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_localVariableTableLine6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_localVariableTableLineIdentifier6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTHEADER_in_stackMapTypeTable6204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTable6206 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTable6208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTable6210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMTENTRY_in_stackMapTypeTable6214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTypeTableEntry_in_stackMapTypeTable6219 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry6268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry6272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6276 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry6278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTypeTableEntry6282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry6293 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry6297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTypeTableEntry6306 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTypeTableEntry6308 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTypeTableEntry6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMHEADER_in_stackMapTable6381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTable6383 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTable6385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTable6387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SMENTRY_in_stackMapTable6391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableEntry_in_stackMapTable6396 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ASSIGN_in_stackMapTableEntry6441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableEntry6443 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000200L});
    public static final BitSet FOLLOW_stackMapTableEntryValue_in_stackMapTableEntry6447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableEntryValue6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypesContainer_in_stackMapTableEntryValue6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypes_in_stackMapTableTypesContainer6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMTTYPES_in_stackMapTableTypes6565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stackMapTableType_in_stackMapTableTypes6570 = new BitSet(new long[]{0x0100008000245008L,0x0200000000020042L,0x0000000100000000L});
    public static final BitSet FOLLOW_stackMapTableTypeObject_in_stackMapTableType6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stackMapTableTypePlainObject_in_stackMapTableType6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_stackMapTableType6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_stackMapTableType6655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_INTLITERAL_in_stackMapTableType6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypePlainObject6686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_stackMapTableTypePlainObject6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_stackMapTableTypeObject6718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stackMapTableTypeObject6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList6760 = new BitSet(new long[]{0x0100008000045002L,0x0200000000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_combinedJavaType_in_type6792 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ARRAYBRACKS_in_type6795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_type6800 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_RBRACK_in_type6802 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_primitiveType_in_combinedJavaType6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_referenceType_in_combinedJavaType6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNITNAME_in_referenceType6894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeDeclSpecifier_in_referenceType6899 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_typeName_in_typeDeclSpecifier6926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPEARGS_in_typeDeclSpecifier6929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeArguments_in_typeDeclSpecifier6933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QualifiedType_in_typeName6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments7002 = new BitSet(new long[]{0x0100008000045002L,0x0200080000020040L,0x0000000110000000L});
    public static final BitSet FOLLOW_type_in_typeArgument7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_typeArgument7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_wildcard7083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_wildcardBounds_in_wildcard7087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_wildcardBounds7112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds7116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_wildcardBounds7143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_wildcardBounds7147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeParameter_in_typeParameters7182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeParameter7212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeBound_in_typeParameter7216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_typeBound7246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_referenceType_in_typeBound7251 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_genericReturnDescriptor_in_genericDescriptor7287 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_genericReturnDescriptor7313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_genericReturnDescriptor7317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceTypeList_in_genericReturnDescriptor7321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeReferenceTypeList7369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_UNITNAME_in_bytecodeReferenceType7397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeDeclSpecifier_in_bytecodeReferenceType7402 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
    public static final BitSet FOLLOW_bytecodeTypeName_in_bytecodeTypeDeclSpecifier7428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_bytecodeTypeDeclSpecifier7431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeTypeArguments_in_bytecodeTypeDeclSpecifier7435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_bytecodeTypeName7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgumentList_in_bytecodeTypeArguments7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeTypeArgument_in_bytecodeTypeArgumentList7537 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeTypeArgument7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeWildcard_in_bytecodeTypeArgument7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_bytecodeWildcard7613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeWildcardBounds_in_bytecodeWildcard7617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_bytecodeWildcardBounds7645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_bytecodeWildcardBounds7672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bytecodeReferenceType_in_bytecodeWildcardBounds7676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bytecodeArrayType_in_bytecodeType7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BaseType_in_bytecodeType7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeObjectType_in_bytecodeType7753 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SEMI_in_bytecodeType7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_bytecodeType7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_bytecodeArrayType7806 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_bytecodeArrayType7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceType_in_simpleBytecodeObjectType7841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_simpleBytecodeReferenceTypeName_in_simpleBytecodeReferenceType7866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_TYPEARGS_in_simpleBytecodeReferenceType7869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArguments_in_simpleBytecodeReferenceType7873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERNALTYPE_in_simpleBytecodeReferenceTypeName7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgumentList_in_simpleBytecodeTypeArguments7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleBytecodeTypeArgument_in_simpleBytecodeTypeArgumentList7965 = new BitSet(new long[]{0x0000000000008002L,0x0000004010008102L,0x0000000000000002L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleBytecodeTypeArgument8010 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleBytecodeTypeArgument8037 = new BitSet(new long[]{0x0000000000008000L,0x0000000000008102L});
    public static final BitSet FOLLOW_bytecodeType_in_simpleBytecodeTypeArgument8041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_simpleBytecodeTypeArgument8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_keywordAggregate8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_type_in_primitiveType8152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_type_in_primitiveType8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_primitiveType8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_type8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floating_point_type_in_numeric_type8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integral_type_in_numeric_type8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_integral_type8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_integral_type8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integral_type8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_integral_type8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_integral_type8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floating_point_type8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_floating_point_type8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literals8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literals8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literals8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literals8476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literals8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literals8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEANLITERAL_in_literals8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_literals8539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literals8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_pc8568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pc8570 = new BitSet(new long[]{0x0000000000000002L});

}