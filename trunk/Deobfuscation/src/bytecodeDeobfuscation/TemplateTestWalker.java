// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g 2013-01-27 22:47:50

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateTestWalker extends TreeParser {
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


    public TemplateTestWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateTestWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TemplateTestWalker.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g"; }


    public static class rule1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:15:1: rule1 : ( rule2 )+ ;
    public final TemplateTestWalker.rule1_return rule1() throws RecognitionException {
        TemplateTestWalker.rule1_return retval = new TemplateTestWalker.rule1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        TemplateTestWalker.rule2_return rule21 =null;



        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:15:6: ( ( rule2 )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:15:8: ( rule2 )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:15:8: ( rule2 )+
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
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:15:8: rule2
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_rule2_in_rule155);
            	    rule21=rule2();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule21.getTree());


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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule2"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:16:1: rule2 : (id= IDENTIFIER | INT );
    public final TemplateTestWalker.rule2_return rule2() throws RecognitionException {
        TemplateTestWalker.rule2_return retval = new TemplateTestWalker.rule2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id=null;
        CommonTree INT2=null;

        CommonTree id_tree=null;
        CommonTree INT2_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:16:6: (id= IDENTIFIER | INT )
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
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:17:6: id= IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule270); 
                    id_tree = (CommonTree)adaptor.dupNode(id);


                    adaptor.addChild(root_0, id_tree);


                    System.out.println("Id: '"+(id!=null?id.getText():null)+"'");

                    }
                    break;
                case 2 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TemplateTestWalker.g:18:6: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_rule279); 
                    INT2_tree = (CommonTree)adaptor.dupNode(INT2);


                    adaptor.addChild(root_0, INT2_tree);


                    System.out.println("Int: '"+(INT2!=null?INT2.getText():null)+"'");

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_rule2_in_rule155 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_rule279 = new BitSet(new long[]{0x0000000000000002L});

}