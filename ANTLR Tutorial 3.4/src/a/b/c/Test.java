package a.b.c;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			String filetext = deserializeString();
			CharStream charStream =  new ANTLRStringStream(filetext);
			JVM lexer = new JVM(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	  public static String deserializeString() throws IOException {
	      int len;
	      char[] chr = new char[4096];
	      final String filepath = "D:\\Work and Projects\\Speciale\\HelloWorldBytecode.txt";
	      File file = new File(filepath);
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
