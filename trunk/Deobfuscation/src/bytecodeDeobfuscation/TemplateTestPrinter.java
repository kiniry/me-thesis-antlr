// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g 2013-01-27 22:47:54

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
public class TemplateTestPrinter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "HASH", "IDENTIFIER", "INT", "IntDigit", "Letter", "TOKEN", "WS"
    };

    public static final int EOF=-1;
    public static final int DOT=4;
    public static final int HASH=5;
    public static final int IDENTIFIER=6;
    public static final int INT=7;
    public static final int IntDigit=8;
    public static final int Letter=9;
    public static final int TOKEN=10;
    public static final int WS=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TemplateTestPrinter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateTestPrinter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("TemplateTestPrinterTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return TemplateTestPrinter.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g"; }


    public static class rule1_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rule1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:13:1: rule1 : (s+= rule2 )+ -> list(l=$s);
    public final TemplateTestPrinter.rule1_return rule1() throws RecognitionException {
        TemplateTestPrinter.rule1_return retval = new TemplateTestPrinter.rule1_return();
        retval.start = input.LT(1);


        List list_s=null;
        RuleReturnScope s = null;
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:13:7: ( (s+= rule2 )+ -> list(l=$s))
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:13:9: (s+= rule2 )+
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:13:9: (s+= rule2 )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= IDENTIFIER && LA1_0 <= INT)||LA1_0==TOKEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:13:10: s+= rule2
            	    {
            	    pushFollow(FOLLOW_rule2_in_rule155);
            	    s=rule2();

            	    state._fsp--;

            	    if (list_s==null) list_s=new ArrayList();
            	    list_s.add(s.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // TEMPLATE REWRITE
            // 13:21: -> list(l=$s)
            {
                retval.st = templateLib.getInstanceOf("list",new STAttrMap().put("l", list_s));
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
    // $ANTLR end "rule1"


    public static class rule2_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rule2"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:15:1: rule2 : (r3v= rule3 -> r3(f=$r3v.st)|r4v= rule4 -> r4(f=$r4v.st)|r5v= rule5 -> r4(f=$r5v.st)) ;
    public final TemplateTestPrinter.rule2_return rule2() throws RecognitionException {
        TemplateTestPrinter.rule2_return retval = new TemplateTestPrinter.rule2_return();
        retval.start = input.LT(1);


        TemplateTestPrinter.rule3_return r3v =null;

        TemplateTestPrinter.rule4_return r4v =null;

        TemplateTestPrinter.rule5_return r5v =null;


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:15:7: ( (r3v= rule3 -> r3(f=$r3v.st)|r4v= rule4 -> r4(f=$r4v.st)|r5v= rule5 -> r4(f=$r5v.st)) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:15:9: (r3v= rule3 -> r3(f=$r3v.st)|r4v= rule4 -> r4(f=$r4v.st)|r5v= rule5 -> r4(f=$r5v.st))
            {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:15:9: (r3v= rule3 -> r3(f=$r3v.st)|r4v= rule4 -> r4(f=$r4v.st)|r5v= rule5 -> r4(f=$r5v.st))
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt2=1;
                }
                break;
            case IDENTIFIER:
                {
                alt2=2;
                }
                break;
            case TOKEN:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:15:10: r3v= rule3
                    {
                    pushFollow(FOLLOW_rule3_in_rule278);
                    r3v=rule3();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 15:20: -> r3(f=$r3v.st)
                    {
                        retval.st = templateLib.getInstanceOf("r3",new STAttrMap().put("f", (r3v!=null?r3v.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:16:4: r4v= rule4
                    {
                    pushFollow(FOLLOW_rule4_in_rule294);
                    r4v=rule4();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 16:14: -> r4(f=$r4v.st)
                    {
                        retval.st = templateLib.getInstanceOf("r4",new STAttrMap().put("f", (r4v!=null?r4v.st:null)));
                    }



                    }
                    break;
                case 3 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:17:4: r5v= rule5
                    {
                    pushFollow(FOLLOW_rule5_in_rule2110);
                    r5v=rule5();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 17:14: -> r4(f=$r5v.st)
                    {
                        retval.st = templateLib.getInstanceOf("r4",new STAttrMap().put("f", (r5v!=null?r5v.st:null)));
                    }



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
    // $ANTLR end "rule2"


    public static class rule3_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rule3"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:20:1: rule3 : i1= INT i2= INT ;
    public final TemplateTestPrinter.rule3_return rule3() throws RecognitionException {
        TemplateTestPrinter.rule3_return retval = new TemplateTestPrinter.rule3_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:20:7: (i1= INT i2= INT )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:20:9: i1= INT i2= INT
            {
            i1=(CommonTree)match(input,INT,FOLLOW_INT_in_rule3133); 

            i2=(CommonTree)match(input,INT,FOLLOW_INT_in_rule3137); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule3"


    public static class rule4_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rule4"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:22:1: rule4 : IDENTIFIER INT ;
    public final TemplateTestPrinter.rule4_return rule4() throws RecognitionException {
        TemplateTestPrinter.rule4_return retval = new TemplateTestPrinter.rule4_return();
        retval.start = input.LT(1);


        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:22:7: ( IDENTIFIER INT )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:22:9: IDENTIFIER INT
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule4147); 

            match(input,INT,FOLLOW_INT_in_rule4149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule4"


    public static class rule5_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rule5"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:24:1: rule5 : id1= TOKEN (id2+= IDENTIFIER )+ ;
    public final TemplateTestPrinter.rule5_return rule5() throws RecognitionException {
        TemplateTestPrinter.rule5_return retval = new TemplateTestPrinter.rule5_return();
        retval.start = input.LT(1);


        CommonTree id1=null;
        CommonTree id2=null;
        List list_id2=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:24:7: (id1= TOKEN (id2+= IDENTIFIER )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:24:9: id1= TOKEN (id2+= IDENTIFIER )+
            {
            id1=(CommonTree)match(input,TOKEN,FOLLOW_TOKEN_in_rule5160); 

            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:24:19: (id2+= IDENTIFIER )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestPrinter.g:24:20: id2+= IDENTIFIER
            	    {
            	    id2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule5165); 
            	    if (list_id2==null) list_id2=new ArrayList();
            	    list_id2.add(id2);


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule5"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\7\uffff";
    static final String DFA3_eofS =
        "\1\1\1\uffff\1\4\1\1\1\uffff\1\4\1\1";
    static final String DFA3_minS =
        "\1\6\1\uffff\2\6\1\uffff\2\6";
    static final String DFA3_maxS =
        "\1\12\1\uffff\2\12\1\uffff\2\12";
    static final String DFA3_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\1\1\2\uffff\1\1",
            "",
            "\1\4\1\3\2\uffff\1\4",
            "\1\1\1\5\2\uffff\1\1",
            "",
            "\1\4\1\6\2\uffff\1\4",
            "\1\1\1\5\2\uffff\1\1"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 24:19: (id2+= IDENTIFIER )+";
        }
    }
 

    public static final BitSet FOLLOW_rule2_in_rule155 = new BitSet(new long[]{0x00000000000004C2L});
    public static final BitSet FOLLOW_rule3_in_rule278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule4_in_rule294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule5_in_rule2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_rule3133 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_rule3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule4147 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INT_in_rule4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_rule5160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule5165 = new BitSet(new long[]{0x0000000000000042L});

}