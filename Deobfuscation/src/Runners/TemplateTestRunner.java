package Runners;

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

import bytecodeDeobfuscation.TemplateTestLexer;
import bytecodeDeobfuscation.TemplateTestParser;
import bytecodeDeobfuscation.TemplateTestParser.rule1_return;
import bytecodeDeobfuscation.TemplateTestPrinter;

/**
 * Runner created to visualize the tree structure and to learn how the StringTemplate framework works.
 * 
 * Testing consists of:
 * <ul>
 * <li> Read a manual created string.</li>
 * <li> Parses the input text.</li>
 * <li> Prints the tree structure.</li>
 * <li> Load templates and print the final generated text.</li>  
 * </ul>
 * @author Mikkel Nielsen
 */
public class TemplateTestRunner {
	public static void main(String[] args) {
		try {
			CharStream input =  new ANTLRStringStream("foo 56.bar 1.2 234243234. TOKEN hah hha hahhah hahaha");
			
			TemplateTestLexer lexer = new TemplateTestLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			TemplateTestParser parser = new TemplateTestParser(tokenStream);
			rule1_return ret = parser.rule1();
			CommonTree theTree = (CommonTree)ret.getTree();
			System.out.println("The pretty-printed tree:");
			System.out.println(theTree.toStringTree());
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree);
			nodes.setTokenStream(tokenStream);
			TemplateTestPrinter walker = new TemplateTestPrinter(nodes);

			FileReader groupFile = new FileReader("D:/Work and Projects/Speciale/Repository/AntlrWorksProj/TemplateTest.stg");
			StringTemplateGroup templates = new StringTemplateGroup(groupFile, DefaultTemplateLexer.class);
			groupFile.close();
			walker.setTemplateLib(templates);
			TemplateTestPrinter.rule1_return ret2 = walker.rule1();

			StringTemplate output = (StringTemplate)ret2.getTemplate();
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
