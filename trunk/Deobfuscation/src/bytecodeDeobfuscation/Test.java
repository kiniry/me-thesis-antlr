package bytecodeDeobfuscation;

import org.antlr.runtime.tree.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import bytecodeDeobfuscation.TreeConstructorParser.rule1_return;

public class Test {

	private static int ParsedFilesCounter = 0;
	private static int skip = 0;
	
	// try {
	// IterateFiles("D:\\Work and Projects\\Speciale\\Repository\\Libraries");
	// } catch (IOException e) {
	// TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		TreeConstructorRunner.PrintTree(false);
		
		try {
//			overwriteFiles("src/TestFiles");
//			parseMassagedFiles("src/TestFiles");
			parseFiles("D:/Libs/ReadableBytecodeClasses");
//			parseAndMassageFiles("src/TestFiles");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean fieldTrue = true;
	private void TestMethod(boolean para1){
		if(para1 && fieldTrue)
		{
			return;
		}
	}
	public static void parseMassagedFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseMassagedFile(child);
		}
	}

	private static void parseMassagedFile(File child) throws IOException {
		if (child.isDirectory())
			parseFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			System.out.println(child.getName());
			String filetext = deserializeString(child.getAbsolutePath());
			RunTest(filetext);
		}
	}

	public static void parseFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseFile(child);
		}
	}

	private static void parseFile(File child) throws IOException {
		if (child.isDirectory())
			parseFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			if(ParsedFilesCounter > skip)
			{
				System.out.println(child.getName() + " - " + ParsedFilesCounter);
				String filetext = deserializeString(child.getAbsolutePath());
				filetext = JavapOutputMassaging.massage(filetext);
				RunTest(filetext);
			}
			ParsedFilesCounter++;
		}
	}

	public static void parseAndMassageFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			parseAndMassageFile(child);
		}
	}

	private static void parseAndMassageFile(File child) throws IOException {
		if (child.isDirectory())
			parseAndMassageFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			JavapOutputMassaging.massage(child);
			System.out.println(child.getName());
			RunTest(child);
		}
	}

	public static void openJar(String jarFileName) throws IOException {
		ZipFile zip = new ZipFile(jarFileName);

		// Process the zip file. Close it when the block is exited.

		try {
			// Loop through the zip entries and print the name of each one.

			for (Enumeration list = zip.entries(); list.hasMoreElements();) {
				ZipEntry entry = (ZipEntry) list.nextElement();
				if (!entry.isDirectory()
						&& entry.getName().endsWith(".class.txt")) {
					System.out.println(entry.getName());
				}
			}
		} finally {
			zip.close();
		}
	}
	
	private static void overwriteFiles(String myDirectoryPath) throws IOException {
		File dir = new File(myDirectoryPath);
		for (File child : dir.listFiles()) {
			overwriteFile(child);
		}
	}

	private static void overwriteFile(File child) throws IOException {
		if (child.isDirectory())
			overwriteFiles(child.getAbsolutePath());
		else if (child.isFile() && child.getName().endsWith(".class.txt")) {
			System.out.println(child.getName());
			JavapOutputMassaging.massage(child);
		}
	}

	private static void RunTest(File file) {
		try {
			String filetext = deserializeString(file.getAbsolutePath());
			RunTest(filetext);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void RunTest(String filetext) {
		try {
			FileReader groupFile = new FileReader("D:/Work and Projects/Speciale/ThesisDeobfuscator/Deobfuscation/src/bytecodeDeobfuscation/JVM.stg");
//			StringTemplate.setLintMode(true);
			StringTemplateGroup templates = new StringTemplateGroup(groupFile, DefaultTemplateLexer.class);
			groupFile.close();
			
			CharStream input = new ANTLRStringStream(filetext);
			JVMLexer lexer = new JVMLexer(input);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			JVMParser.program_return ret = parser.program();

//			CommonTree theTree = (CommonTree)ret.getTree();
//			CommonTreeNodeStream nodes = new CommonTreeNodeStream(theTree); 
//			nodes.setTokenStream(tokenStream); 
//			JVMWalker walker = new JVMWalker(nodes);
//			JVMWalker.program_return ret2 = walker.program();
			

			
			CommonTree theTree2 = (CommonTree)ret.getTree();
			System.out.println(theTree2.toStringTree());
			CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(theTree2);
			nodes2.setTokenStream(tokenStream);
			JVMPrettyPrinter printer = new JVMPrettyPrinter(nodes2);
			printer.setTemplateLib(templates);
			JVMPrettyPrinter.program_return ret3 = printer.program();
			
			StringTemplate output = (StringTemplate)ret3.getTemplate();
			System.out.println(output.toString());
			String text = output.toString();
			text = JavapOutputMassaging.massage(text);
//			
//
//			CharStream charStream2 = new ANTLRStringStream(text);
//			JVMLexer lexer2 = new JVMLexer(charStream);
//			TokenStream tokenStream2 = new CommonTokenStream(lexer);
//			CompareStreams(tokenStream, tokenStream2);
//			JVMParser parser2 = new JVMParser(tokenStream);
//			parser2.program();
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean CompareStreams(TokenStream s1, TokenStream s2){
		if(s1.size() != s2.size()){
			System.out.println("Not the same amount of tokens in both streams!");
			return false;
		}
		for(int i = 0; i < s1.size(); i++){
			Token token1 = s1.get(i);
			Token token2 = s2.get(i);
			if(!token1.getText().equals(token2.getText())){
				System.out.println("Tokens1: " + token1.getText() + " token2: " + token2.getText());
				return false;
			}
		}
		return true;
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
