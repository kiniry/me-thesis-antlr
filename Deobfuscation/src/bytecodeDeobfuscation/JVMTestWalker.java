package bytecodeDeobfuscation;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import bytecodeDeobfuscation.JVMParser.program_return;
import bytecodeDeobfuscation.TemplateTestParser.rule1_return;

public class JVMTestWalker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CharStream input =  new ANTLRStringStream("foo.bar.2");
			
			JVMLexer lexer = new JVMLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			program_return ret = parser.program();
			CommonTree theTree = (CommonTree)ret.getTree();
			System.out.println("The pretty-printed tree:");
			System.out.println(theTree.toStringTree());
			// Walk resulting tree; create treenode stream first
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree);
			// AST nodes have payloads that point into token stream 
			nodes.setTokenStream(tokenStream);
			// Create a tree Walker attached to the nodes stream 
			JVMWalker walker = new JVMWalker(nodes);
			// Invoke the start symbol, rule program
			walker.program();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
