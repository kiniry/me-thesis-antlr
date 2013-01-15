package bytecodeDeobfuscation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

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
			FileReader groupFile = new FileReader("D:/Work and Projects/Speciale/Repository/AntlrWorksProj/JVM.stg");
			StringTemplateGroup templates = new StringTemplateGroup(groupFile, DefaultTemplateLexer.class);
			groupFile.close();
			
			CharStream input =  new ANTLRStringStream(fileText);
			
			/*
			 * Lexer and parser part
			 */
			JVMLexer lexer = new JVMLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			program_return ret = parser.program();
			
			/*
			 * Tree walker part		
			 */
			CommonTree theTree = (CommonTree)ret.getTree();
//			System.out.println("The walked tree:");
//			System.out.println(theTree.toStringTree());
			// Walk resulting tree; create treenode stream first
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree);
			// AST nodes have payloads that point into token stream 
			nodes.setTokenStream(tokenStream);
			// Create a tree Walker attached to the nodes stream 
			JVMWalker walker = new JVMWalker(nodes);
			// Invoke the start symbol, rule program
			JVMWalker.program_return ret2 = walker.program();
			
			/*
			 * Pretty printer part
			 */
			theTree = (CommonTree)ret2.getTree();
			nodes = new CommonTreeNodeStream(theTree);
			nodes.setTokenStream(tokenStream);
			// Create a tree Walker attached to the nodes stream 
			JVMPrettyPrinter printer = new JVMPrettyPrinter(nodes);
			printer.setTemplateLib(templates);
			// Invoke the start symbol, rule program
			JVMPrettyPrinter.program_return ret3 = printer.program();
			StringTemplate output = (StringTemplate)ret3.getTemplate();
			System.out.println(output.toString());
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
