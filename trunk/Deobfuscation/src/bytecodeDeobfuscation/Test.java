package bytecodeDeobfuscation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

		//try {
		//IterateFiles("D:\\Work and Projects\\Speciale\\Repository\\Libraries");
		//} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		//	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IterateFiles("src/TestFiles");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			String filetext = deserializeString();
//			CharStream charStream =  new ANTLRStringStream(filetext);
//			JVMLexer lexer = new JVMLexer(charStream);
//			TokenStream tokenStream = new CommonTokenStream(lexer);
//			JVMParser parser = new JVMParser(tokenStream);
//			try {
//				parser.program();
//			} catch (RecognitionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	
	private static void RunTest(File file){
		try {
			String filetext = deserializeString(file.getAbsolutePath());
			CharStream charStream =  new ANTLRStringStream(filetext);
			JVMLexer lexer = new JVMLexer(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			JVMParser parser = new JVMParser(tokenStream);
			try {
				parser.program();
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}
	
	public static void IterateFiles(String myDirectoryPath) throws IOException{
		 File dir = new File(myDirectoryPath);
		  for (File child : dir.listFiles()) {
		    handleFile(child);
		  }
	}
	
	private static void handleFile(File child) throws IOException{
		  if(child.isDirectory())
			  IterateFiles(child.getAbsolutePath());
		  else if (child.isFile() && child.getName().endsWith(".txt"))
		        {
			  		System.out.println(child.getName());
			  		RunTest(child);
		        }
	}
	
	public static void openJar(String jarFileName) throws IOException{
		ZipFile zip = new ZipFile(jarFileName);

		  // Process the zip file. Close it when the block is exited.

		  try {
		     // Loop through the zip entries and print the name of each one.

		     for (Enumeration list = zip.entries(); list.hasMoreElements(); ) {
		        ZipEntry entry = (ZipEntry) list.nextElement();
		        if (!entry.isDirectory() && entry.getName().endsWith(".class"))
		        {
	        		System.out.println(entry.getName());
		        }
		     }
		  }
		  finally {
		     zip.close();
		  }
	}
	
	/**
	   * Load a text file contents as a <code>String<code>.
	   * This method does not perform enconding conversions
	   *
	   * @param file The input file
	   * @return The file contents as a <code>String</code>
	   * @exception IOException IO Error
	   */
	  public static String deserializeString(String filename) throws IOException {
	      int len;
	      char[] chr = new char[4096];
	      final String filepath = "D:/Work and Projects/Speciale/Soot/Workspace/HelloObfuscator/bin/ClassForByteCode.txt";
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