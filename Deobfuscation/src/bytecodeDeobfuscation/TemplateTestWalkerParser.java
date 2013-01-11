// $ANTLR 3.4 TemplateTestWalker.g 2013-01-10 20:05:56

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateTestWalkerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "INT"
    };

    public static final int EOF=-1;
    public static final int IDENTIFIER=4;
    public static final int INT=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TemplateTestWalkerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateTestWalkerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TemplateTestWalkerParser.tokenNames; }
    public String getGrammarFileName() { return "TemplateTestWalker.g"; }



    // $ANTLR start "rule1"
    // TemplateTestWalker.g:13:1: rule1 : ( rule2 )+ ;
    public final void rule1() throws RecognitionException {
        try {
            // TemplateTestWalker.g:13:6: ( ( rule2 )+ )
            // TemplateTestWalker.g:13:8: ( rule2 )+
            {
            // TemplateTestWalker.g:13:8: ( rule2 )+
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
            	    // TemplateTestWalker.g:13:8: rule2
            	    {
            	    pushFollow(FOLLOW_rule2_in_rule129);
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
    // TemplateTestWalker.g:14:1: rule2 : (id= IDENTIFIER | INT );
    public final void rule2() throws RecognitionException {
        Token id=null;
        Token INT1=null;

        try {
            // TemplateTestWalker.g:14:6: (id= IDENTIFIER | INT )
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
                    // TemplateTestWalker.g:15:6: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule244); 

                    System.out.println("Id: '"+(id!=null?id.getText():null)+"'");

                    }
                    break;
                case 2 :
                    // TemplateTestWalker.g:16:6: INT
                    {
                    INT1=(Token)match(input,INT,FOLLOW_INT_in_rule253); 

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


 

    public static final BitSet FOLLOW_rule2_in_rule129 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_rule253 = new BitSet(new long[]{0x0000000000000002L});

}