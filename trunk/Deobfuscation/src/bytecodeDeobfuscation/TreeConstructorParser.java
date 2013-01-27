// $ANTLR 3.4 D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g 2013-01-27 22:44:56

  package bytecodeDeobfuscation;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TreeConstructorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNOTATIONVALUE", "AnnotationAssign", "CPINDEX", "DOT", "EXTENDS", "HASH", "IDENTIFIER", "INT", "IntDigit", "Letter", "THEONERULE", "WS", "','"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int ANNOTATIONVALUE=4;
    public static final int AnnotationAssign=5;
    public static final int CPINDEX=6;
    public static final int DOT=7;
    public static final int EXTENDS=8;
    public static final int HASH=9;
    public static final int IDENTIFIER=10;
    public static final int INT=11;
    public static final int IntDigit=12;
    public static final int Letter=13;
    public static final int THEONERULE=14;
    public static final int WS=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TreeConstructorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TreeConstructorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TreeConstructorParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g"; }


    public static class rule1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule1"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:20:1: rule1 : a1= AnnotationAssign i1= IDENTIFIER i2= IDENTIFIER INT ( extendsRule )? -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ANNOTATIONVALUE[a1.getText()] ^( THEONERULE INT ( extendsRule )? ) ) ;
    public final TreeConstructorParser.rule1_return rule1() throws RecognitionException {
        TreeConstructorParser.rule1_return retval = new TreeConstructorParser.rule1_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a1=null;
        Token i1=null;
        Token i2=null;
        Token INT1=null;
        TreeConstructorParser.extendsRule_return extendsRule2 =null;


        Object a1_tree=null;
        Object i1_tree=null;
        Object i2_tree=null;
        Object INT1_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_AnnotationAssign=new RewriteRuleTokenStream(adaptor,"token AnnotationAssign");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_extendsRule=new RewriteRuleSubtreeStream(adaptor,"rule extendsRule");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:3: (a1= AnnotationAssign i1= IDENTIFIER i2= IDENTIFIER INT ( extendsRule )? -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ANNOTATIONVALUE[a1.getText()] ^( THEONERULE INT ( extendsRule )? ) ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:5: a1= AnnotationAssign i1= IDENTIFIER i2= IDENTIFIER INT ( extendsRule )?
            {
            a1=(Token)match(input,AnnotationAssign,FOLLOW_AnnotationAssign_in_rule163);  
            stream_AnnotationAssign.add(a1);


            i1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule167);  
            stream_IDENTIFIER.add(i1);


            i2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule171);  
            stream_IDENTIFIER.add(i2);


            INT1=(Token)match(input,INT,FOLLOW_INT_in_rule173);  
            stream_INT.add(INT1);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:57: ( extendsRule )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EXTENDS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:57: extendsRule
                    {
                    pushFollow(FOLLOW_extendsRule_in_rule175);
                    extendsRule2=extendsRule();

                    state._fsp--;

                    stream_extendsRule.add(extendsRule2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: extendsRule, INT, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 21:70: -> ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ANNOTATIONVALUE[a1.getText()] ^( THEONERULE INT ( extendsRule )? ) )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:72: ^( IDENTIFIER[i1.getText() + \" \" + i2.getText()] ANNOTATIONVALUE[a1.getText()] ^( THEONERULE INT ( extendsRule )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, i1.getText() + " " + i2.getText())
                , root_1);

                adaptor.addChild(root_1, 
                (Object)adaptor.create(ANNOTATIONVALUE, a1.getText())
                );

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:150: ^( THEONERULE INT ( extendsRule )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THEONERULE, "THEONERULE")
                , root_2);

                adaptor.addChild(root_2, 
                stream_INT.nextNode()
                );

                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:21:167: ( extendsRule )?
                if ( stream_extendsRule.hasNext() ) {
                    adaptor.addChild(root_2, stream_extendsRule.nextTree());

                }
                stream_extendsRule.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

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


    public static class extendsRule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extendsRule"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:24:1: extendsRule : d1= EXTENDS v1= somerule listRule -> ^( IDENTIFIER[$d1] IDENTIFIER[\"d\" + v1.getTree().toString()] listRule ) ;
    public final TreeConstructorParser.extendsRule_return extendsRule() throws RecognitionException {
        TreeConstructorParser.extendsRule_return retval = new TreeConstructorParser.extendsRule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token d1=null;
        TreeConstructorParser.somerule_return v1 =null;

        TreeConstructorParser.listRule_return listRule3 =null;


        Object d1_tree=null;
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_listRule=new RewriteRuleSubtreeStream(adaptor,"rule listRule");
        RewriteRuleSubtreeStream stream_somerule=new RewriteRuleSubtreeStream(adaptor,"rule somerule");
        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:25:3: (d1= EXTENDS v1= somerule listRule -> ^( IDENTIFIER[$d1] IDENTIFIER[\"d\" + v1.getTree().toString()] listRule ) )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:25:5: d1= EXTENDS v1= somerule listRule
            {
            d1=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extendsRule109);  
            stream_EXTENDS.add(d1);


            pushFollow(FOLLOW_somerule_in_extendsRule113);
            v1=somerule();

            state._fsp--;

            stream_somerule.add(v1.getTree());

            pushFollow(FOLLOW_listRule_in_extendsRule115);
            listRule3=listRule();

            state._fsp--;

            stream_listRule.add(listRule3.getTree());

            // AST REWRITE
            // elements: listRule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 25:37: -> ^( IDENTIFIER[$d1] IDENTIFIER[\"d\" + v1.getTree().toString()] listRule )
            {
                // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:25:40: ^( IDENTIFIER[$d1] IDENTIFIER[\"d\" + v1.getTree().toString()] listRule )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDENTIFIER, d1)
                , root_1);

                adaptor.addChild(root_1, 
                (Object)adaptor.create(IDENTIFIER, "d" + v1.getTree().toString())
                );

                adaptor.addChild(root_1, stream_listRule.nextTree());

                adaptor.addChild(root_0, root_1);
                }

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
    // $ANTLR end "extendsRule"


    public static class somerule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "somerule"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:28:1: somerule : INT ;
    public final TreeConstructorParser.somerule_return somerule() throws RecognitionException {
        TreeConstructorParser.somerule_return retval = new TreeConstructorParser.somerule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT4=null;

        Object INT4_tree=null;

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:29:3: ( INT )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:29:5: INT
            {
            root_0 = (Object)adaptor.nil();


            INT4=(Token)match(input,INT,FOLLOW_INT_in_somerule140); 
            INT4_tree = 
            (Object)adaptor.create(INT4)
            ;
            adaptor.addChild(root_0, INT4_tree);


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
    // $ANTLR end "somerule"


    public static class listRule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "listRule"
    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:32:1: listRule : IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ ;
    public final TreeConstructorParser.listRule_return listRule() throws RecognitionException {
        TreeConstructorParser.listRule_return retval = new TreeConstructorParser.listRule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER5=null;
        Token char_literal6=null;
        Token IDENTIFIER7=null;

        Object IDENTIFIER5_tree=null;
        Object char_literal6_tree=null;
        Object IDENTIFIER7_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");

        try {
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:32:9: ( IDENTIFIER ( ',' IDENTIFIER )* -> ( IDENTIFIER )+ )
            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:32:11: IDENTIFIER ( ',' IDENTIFIER )*
            {
            IDENTIFIER5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_listRule150);  
            stream_IDENTIFIER.add(IDENTIFIER5);


            // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:32:22: ( ',' IDENTIFIER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Work and Projects\\Speciale\\ThesisDeobfuscator\\Deobfuscation\\src\\bytecodeDeobfuscation\\TreeConstructor.g:32:23: ',' IDENTIFIER
            	    {
            	    char_literal6=(Token)match(input,16,FOLLOW_16_in_listRule153);  
            	    stream_16.add(char_literal6);


            	    IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_listRule155);  
            	    stream_IDENTIFIER.add(IDENTIFIER7);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:40: -> ( IDENTIFIER )+
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
    // $ANTLR end "listRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_AnnotationAssign_in_rule163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule167 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_rule171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_rule173 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_extendsRule_in_rule175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extendsRule109 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_somerule_in_extendsRule113 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_listRule_in_extendsRule115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_somerule140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_listRule150 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_listRule153 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_listRule155 = new BitSet(new long[]{0x0000000000010002L});

}