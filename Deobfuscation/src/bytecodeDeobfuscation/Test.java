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
import org.antlr.runtime.TokenStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import bytecodeDeobfuscation.TreeConstructorParser.rule1_return;

public class Test {

	private static int ParsedFilesCounter = 0;
	
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

		TreeConstructorRunner.PrintTree(false);
		
//		try {
////			overwriteFiles("src/TestFiles");
////			parseMassagedFiles("src/TestFiles");
////			parseFiles("D:/Libs/ReadableBytecodeClasses");
////			parseAndMassageFiles("src/TestFiles");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
			System.out.println(child.getName() + " - " + ParsedFilesCounter);
			String filetext = deserializeString(child.getAbsolutePath());
			filetext = JavapOutputMassaging.massage(filetext);
			RunTest(filetext);
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
		CharStream charStream = new ANTLRStringStream(filetext);
		JVMLexer lexer = new JVMLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		JVMParser parser = new JVMParser(tokenStream);
		try {
			parser.program();
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
