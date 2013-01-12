package bytecodeDeobfuscation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
			File file = new File("D:/Work and Projects/Speciale/HelloWorldBytecode.txt");
			System.out.println(file.getName());
			String filetext;
			filetext = deserializeString(file.getAbsolutePath());
//			filetext = JavapOutputMassaging.massage(filetext);
			Parse(filetext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void Parse(String fileText){
		try {
			CharStream input =  new ANTLRStringStream(fileText);
			
			JVMLexer lexer = new JVMLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			program_return ret = parser.program();
			CommonTree theTree = (CommonTree)ret.getTree();
			System.out.println("The walked tree:");
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

	/**
	 * Load a text file contents as a <code>String<code>.
	 * This method does not perform enconding conversions
	 * 
	 * @param file
	 *            The input file
	 * @return The file contents as a <code>String</code>
	 * @exception IOException
	 *                IO Error
	 */
	public static String deserializeString(String filename) throws IOException {
		int len;
		char[] chr = new char[4096];
		File file = new File(filename);
		final StringBuffer buffer = new StringBuffer();
		final FileReader reader = new FileReader(file);
		try {
			while ((len = reader.read(chr)) > 0) {
				buffer.append(chr, 0, len);
			}
		} finally {
			reader.close();
		}
		return buffer.toString();
	}
}
