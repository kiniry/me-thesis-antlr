package Runners;

import org.antlr.runtime.tree.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import bytecodeDeobfuscation.JVMLexer;
import bytecodeDeobfuscation.JVMParser;
import bytecodeDeobfuscation.JVMPrettyPrinter;
import bytecodeDeobfuscation.JVMWalker;

/**
 * Iterates and parses all test classes and compares the input to the output.
 * 
 * Testing consists of:
 * <ul>
 * <li> Iterates through all files in selected folder and subfolders to find .class.txt files</li>
 * <li> Uses the massaging mechanism in JavaOutputMassaging to add markers after the flags attributes to the text input. </li>
 * <li> Parses the massaged input text.</li>
 * <li> Load templates and print the parsed text.</li>  
 * <li> Compares the tokens from the lexed input to the lexed output from the pretty printer to test the completeness. </li>
 * </ul>
 * @author Mikkel Nielsen
 */
public class Test {

	private static int ParsedFilesCounter = 0;
	private static int skip = 0;

	/**
	 * @param args the single file which functionality to be used.
	 */
	public static void main(String[] args) {
			
		try {
			if(args.length == 0)
				parseFiles("D:/Libs/ReadableBytecodeClasses");
			switch(args[0]){
			case "1":
				overwriteFiles("src/TestFiles");
				break;
			case "2":
				parseMassagedFiles("src/TestFiles");
				break;
			case "3":
				parseAndMassageFiles("src/TestFiles");
				break;
			default:
				parseFiles("D:/Libs/ReadableBytecodeClasses");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Parses a directory that has been massaged already.
	 * 
	 * @param myDirectoryPath the directory to be parsed
	 * @throws IOException
	 */
	public static void parseMassagedFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseMassagedFile(child);
		}
	}

	/**
	 * Parses an already massaged file ending with .class.txt.
	 * 
	 * @param child the file to be parsed
	 * @throws IOException
	 */
	private static void parseMassagedFile(File child) throws IOException {
		if (child.isDirectory())
			parseFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			System.out.println(child.getName());
			String filetext = FileUtil.deserializeString(child.getAbsolutePath());
			RunTest(filetext);
		}
	}

	/**
	 * Parses a directory, leaves all files unchanged.
	 * 
	 * @param myDirectoryPath the directory to be parsed
	 * @throws IOException
	 */
	public static void parseFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseFile(child);
		}
	}

	/**
	 * Parses a file ending with .class.txt, leaves the file unchanged. Will skip the first "skip" files.
	 * 
	 * @param child the file to be parsed
	 * @throws IOException
	 */
	private static void parseFile(File child) throws IOException {
		if (child.isDirectory())
			parseFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			if(ParsedFilesCounter > skip)
			{
				System.out.println(child.getName() + " - " + ParsedFilesCounter);
				String filetext = FileUtil.deserializeString(child.getAbsolutePath());
				filetext = JavapOutputMassaging.massage(filetext);
				RunTest(filetext);
			}
			ParsedFilesCounter++;
		}
	}

	/**
	 * Parses and massages files in a directory, leaves all files changed.
	 * 
	 * @param myDirectoryPath the directory to be parsed
	 * @throws IOException
	 */
	public static void parseAndMassageFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseAndMassageFile(child);
		}
	}

	/**
	 * Parses a file ending with .class.txt, leaves the file unchanged. Will skip the first "skip" files.
	 * 
	 * @param child the file to be parsed
	 * @throws IOException
	 */
	private static void parseAndMassageFile(File child) throws IOException {
		if (child.isDirectory())
			parseAndMassageFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			JavapOutputMassaging.massage(child);
			System.out.println(child.getName());
			RunTest(child);
		}
	}

	/**
	 * Massages files in a directory, leaves all files changed.
	 * 
	 * @param myDirectoryPath the directory to be massaged
	 * @throws IOException
	 */
	private static void overwriteFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			overwriteFile(child);
		}
	}

	/**
	 * Massages a file ending with .class.txt, leaves the file changed.
	 * 
	 * @param child the file to be massaged
	 * @throws IOException
	 */
	private static void overwriteFile(File child) throws IOException {
		if (child.isDirectory())
			overwriteFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			System.out.println(child.getName());
			JavapOutputMassaging.massage(child);
		}
	}

	/**
	 * Deserializes a file and runs the tests on the file text.
	 * 
	 * @param file
	 */
	private static void RunTest(File file) {
		try {
			String filetext = FileUtil.deserializeString(file.getAbsolutePath());
			RunTest(filetext);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads a printer template, parses the input and prints it again for then to parse the output.
	 * The parsed out is compared to the input.
	 * If input and output is not equal (tokenwise) the output will be printed together with the error.
	 * 
	 * @param filetext file text to be tested.
	 */
	private static void RunTest(String filetext) {
		try {
			FileReader groupFile = new FileReader("D:/Work and Projects/Speciale/ThesisDeobfuscator/Deobfuscation/src/bytecodeDeobfuscation/JVM.stg");
//			StringTemplate.setLintMode(true);
			StringTemplateGroup templates = new StringTemplateGroup(groupFile, DefaultTemplateLexer.class);
			groupFile.close();
			
			CharStream input = new ANTLRStringStream(filetext);
			JVMLexer lexer = new JVMLexer(input);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			JVMParser.program_return ret = parser.program();

			CommonTree theTree = (CommonTree)ret.getTree();
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree); 
			nodes.setTokenStream(tokenStream); 
			JVMWalker walker = new JVMWalker(nodes);
			JVMWalker.program_return ret2 = walker.program();
			
			CommonTree theTree2 = (CommonTree)ret2.getTree();
//			System.out.println(theTree2.toStringTree());
			CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(theTree2);
			nodes2.setTokenStream(tokenStream);
			JVMPrettyPrinter printer = new JVMPrettyPrinter(nodes2);
			printer.setTemplateLib(templates);
			JVMPrettyPrinter.program_return ret3 = printer.program();
			
			StringTemplate output = (StringTemplate)ret3.getTemplate();
			String text = output.toString();
			text = JavapOutputMassaging.massage(text);		

			CharStream charStream2 = new ANTLRStringStream(text);
			JVMLexer lexer2 = new JVMLexer(charStream2);
			CommonTokenStream tokenStream2 = new CommonTokenStream(lexer2);
			JVMParser parser2 = new JVMParser(tokenStream2);
			parser2.program();
			if(!CompareStreams(tokenStream, tokenStream2)){
				PrintWriter writer = new PrintWriter("TestFile.txt");
				writer.print(text);
				writer.close();
//				System.out.println(text);
			}
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Iterates through until a token from the normal channelstream is found and returned.
	 * 
	 * @param iter
	 * @return
	 */
	private static Token GetNextToken(Iterator<Token> iter){
		while(iter.hasNext()){
			Token token = iter.next();
			int chan = token.getChannel();
			if(chan != 99)
				return token;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private static boolean CompareStreams(CommonTokenStream s1, CommonTokenStream s2){
		Iterator<Token> iter1 = s1.getTokens().iterator();
		Iterator<Token> iter2 = s2.getTokens().iterator();

		while(true){
			Token t1 = GetNextToken(iter1);
			Token t2 = GetNextToken(iter2);
			if(t1 == null && t2 == null)
				return true;
			if(t1 != null && t2 == null){
				System.out.println("Original text: \"" + t1.getText() + "\" in line, index: " + t1.getLine() + ", " + t1.getCharPositionInLine());
				return false;
			}
			if(t1 == null && t2 != null){
				System.out.println("Parsed text: \"" + t2.getText() + "\" in line, index: " + t2.getLine() + ", " + t2.getCharPositionInLine());
				return false;
			}
			if(!t1.getText().equals(t2.getText())){
				System.out.println("Original text: \"" + t1.getText() + "\" in line, index: " + t1.getLine() + ", " + t1.getCharPositionInLine());
				System.out.println("Parsed text: \"" + t2.getText() + "\" in line, index: " + t2.getLine() + ", " + t2.getCharPositionInLine());
				return false;
			}
		}
	}
}
