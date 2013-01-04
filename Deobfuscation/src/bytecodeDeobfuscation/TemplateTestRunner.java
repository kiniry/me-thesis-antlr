package bytecodeDeobfuscation;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import bytecodeDeobfuscation.TemplateTestParser.rule1_return;

public class TemplateTestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CharStream input =  new ANTLRStringStream("foo.bar.2");
			
			TemplateTestLexer lexer = new TemplateTestLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			TemplateTestParser parser = new TemplateTestParser(tokenStream);
			rule1_return ret = parser.rule1();
			CommonTree theTree = (CommonTree)ret.getTree();
			System.out.println("The pretty-printed tree:");
			System.out.println(theTree.toStringTree());
			// Walk resulting tree; create treenode stream first
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree);
			// AST nodes have payloads that point into token stream 
			nodes.setTokenStream(tokenStream);
			// Create a tree Walker attached to the nodes stream 
			TemplateTestWalker walker = new TemplateTestWalker(nodes);
			// Invoke the start symbol, rule program
			walker.rule1();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
