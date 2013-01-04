// $ANTLR 3.4 TemplateTestWalker.g 2013-01-04 16:29:04

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateTestWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOT", "HASH", "IDENTIFIER", "INT", "IntDigit", "Letter", "WS"
    };

    public static final int EOF=-1;
    public static final int DOT=4;
    public static final int HASH=5;
    public static final int IDENTIFIER=6;
    public static final int INT=7;
    public static final int IntDigit=8;
    public static final int Letter=9;
    public static final int WS=10;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TemplateTestWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateTestWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TemplateTestWalker.tokenNames; }
    public String getGrammarFileName() { return "TemplateTestWalker.g"; }



    // $ANTLR start "rule1"
    // TemplateTestWalker.g:12:1: rule1 : ( rule2 )+ ;
    public final void rule1() throws RecognitionException {
        try {
            // TemplateTestWalker.g:12:6: ( ( rule2 )+ )
            // TemplateTestWalker.g:12:8: ( rule2 )+
            {
            // TemplateTestWalker.g:12:8: ( rule2 )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= IDENTIFIER && LA1_0 <= INT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TemplateTestWalker.g:12:8: rule2
            	    {
            	    pushFollow(FOLLOW_rule2_in_rule136);
            	    rule2();

            	    state._fsp--;


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
    // $ANTLR end "rule1"



    // $ANTLR start "rule2"
    // TemplateTestWalker.g:13:1: rule2 : (id= IDENTIFIER | INT );
    public final void rule2() throws RecognitionException {
        CommonTree id=null;
        CommonTree INT1=null;

        try {
            // TemplateTestWalker.g:13:6: (id= IDENTIFIER | INT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            else if ( (LA2_0==INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // TemplateTestWalker.g:14:6: id= IDENTIFIER
                    {
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule251); 

                    System.out.println("Id: '"+(id!=null?id.getText():null)+"'");

                    }
                    break;
                case 2 :
                    // TemplateTestWalker.g:15:6: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_rule260); 

                    System.out.println("Int: '"+(INT1!=null?INT1.getText():null)+"'");

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
        return ;
    }
    // $ANTLR end "rule2"

    // Delegated rules


 

    public static final BitSet FOLLOW_rule2_in_rule136 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_rule260 = new BitSet(new long[]{0x0000000000000002L});

}