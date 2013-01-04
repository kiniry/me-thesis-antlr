// $ANTLR 3.4 TemplateTest.g 2013-01-04 16:29:03

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateTestParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TemplateTestParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateTestParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TemplateTestParser.tokenNames; }
    public String getGrammarFileName() { return "TemplateTest.g"; }


    public static class rule1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule1"
    // TemplateTest.g:16:1: rule1 : rule2 ( DOT rule2 )* -> ( rule2 )+ ;
    public final TemplateTestParser.rule1_return rule1() throws RecognitionException {
        TemplateTestParser.rule1_return retval = new TemplateTestParser.rule1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOT2=null;
        TemplateTestParser.rule2_return rule21 =null;

        TemplateTestParser.rule2_return rule23 =null;


        Object DOT2_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_rule2=new RewriteRuleSubtreeStream(adaptor,"rule rule2");
        try {
            // TemplateTest.g:16:6: ( rule2 ( DOT rule2 )* -> ( rule2 )+ )
            // TemplateTest.g:16:8: rule2 ( DOT rule2 )*
            {
            pushFollow(FOLLOW_rule2_in_rule147);
            rule21=rule2();

            state._fsp--;

            stream_rule2.add(rule21.getTree());

            // TemplateTest.g:16:14: ( DOT rule2 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DOT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TemplateTest.g:16:15: DOT rule2
            	    {
            	    DOT2=(Token)match(input,DOT,FOLLOW_DOT_in_rule150);  
            	    stream_DOT.add(DOT2);


            	    pushFollow(FOLLOW_rule2_in_rule152);
            	    rule23=rule2();

            	    state._fsp--;

            	    stream_rule2.add(rule23.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: rule2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 16:27: -> ( rule2 )+
            {
                if ( !(stream_rule2.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rule2.hasNext() ) {
                    adaptor.addChild(root_0, stream_rule2.nextTree());

                }
                stream_rule2.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule1"


    public static class rule2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule2"
    // TemplateTest.g:17:1: rule2 : ( IDENTIFIER | INT );
    public final TemplateTestParser.rule2_return rule2() throws RecognitionException {
        TemplateTestParser.rule2_return retval = new TemplateTestParser.rule2_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set4=null;

        Object set4_tree=null;

        try {
            // TemplateTest.g:17:6: ( IDENTIFIER | INT )
            // TemplateTest.g:
            {
            root_0 = (Object)adaptor.nil();


            set4=(Token)input.LT(1);

            if ( (input.LA(1) >= IDENTIFIER && input.LA(1) <= INT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set4)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule2"

    // Delegated rules


 

    public static final BitSet FOLLOW_rule2_in_rule147 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_DOT_in_rule150 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule2_in_rule152 = new BitSet(new long[]{0x0000000000000012L});

}