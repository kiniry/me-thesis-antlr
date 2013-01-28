package Runners;

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

import bytecodeDeobfuscation.JVMLexer;
import bytecodeDeobfuscation.JVMParser;
import bytecodeDeobfuscation.JVMPrettyPrinter;
import bytecodeDeobfuscation.JVMScramblingInformationGatherer;

/**
 * Iterates and parses a single file and runs the descrambling tree walker.
 * 
 * Testing consists of:
 * <ul>
 * <li> Read the file.</li>
 * <li> Parses the massaged input text.</li>
 * <li> Walk and descramble the input text.</li>
 * <li> Load templates and print the final text.</li>  
 * </ul>
 * @author Mikkel Nielsen
 */
public class ScramblingTestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("D:/Work and Projects/Speciale/HelloWorldBytecode.txt");
			System.out.println(file.getName());
			String filetext;
			filetext = FileUtil.deserializeString(file.getAbsolutePath());
			Parse(filetext);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void Parse(String fileText){
		try {
			FileReader groupFile = new FileReader("D:/Work and Projects/Speciale/ThesisDeobfuscator/Deobfuscation/src/bytecodeDeobfuscation/JVM.stg");
			StringTemplateGroup templates = new StringTemplateGroup(groupFile, DefaultTemplateLexer.class);
			groupFile.close();
			
			CharStream input =  new ANTLRStringStream(fileText);
			JVMLexer lexer = new JVMLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			JVMParser.program_return ret = parser.program();
			
			
			CommonTree theTree = (CommonTree)ret.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree);
			nodes.setTokenStream(tokenStream);
			JVMScramblingInformationGatherer scrambler = new JVMScramblingInformationGatherer(nodes);
			JVMScramblingInformationGatherer.program_return ret2 = scrambler.program();

			theTree = (CommonTree)ret2.getTree();
			nodes = new CommonTreeNodeStream(theTree);
			nodes.setTokenStream(tokenStream);
			JVMPrettyPrinter printer = new JVMPrettyPrinter(nodes);
			printer.setTemplateLib(templates);
			JVMPrettyPrinter.program_return ret3 = printer.program();
			StringTemplate output = (StringTemplate)ret3.getTemplate();
			System.out.println(output.toString());
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
