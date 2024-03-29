package Runners;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Massaging an input character sequence generated by javap with the aim of 
 * simplifying parsing with the grammar JVM.g.
 * 
 * Massaging consists of:
 * <ul>
 * <li> Adding a end-of-flags marker '%' after a flags section of a field or
 * method/constructor declaration. </li>
 * </ul>
 * @author Joe Kiniry
 */
public class /*@ pure @*/ JavapOutputMassaging {
	
	public static final char FLAGS_MARKER = '%';

	/**
	 * @param args the single file that is to be massaged and overwritten.
	 */
	public static void main(String[] args) {
		if (args.length != 1)
			return;
		else massage(new File(args[0]));
	}
	
	// Performs massaging on a file, over-writing its content.
	//@ require a_file.canWrite();
	public static /*@ pure @*/ void massage(File a_file) {
		final StringBuffer buffer = new StringBuffer();
		try {
			if (a_file.canWrite()) {
				int len;
				char[] chr = new char[4096];
				final FileReader reader = new FileReader(a_file);
				try {
					while ((len = reader.read(chr)) > 0) {
						buffer.append(chr, 0, len);
					}
				} finally {
					reader.close();
				}
			} else {
				System.err.println("Cannot write over file '" + a_file.toString() + "'");
			}
			String result = massage(buffer.toString());
			File outputFile = new File(a_file.getAbsolutePath());
			FileWriter fr = new FileWriter(outputFile);
			fr.write(result);
			fr.close();
		} catch (IOException ioe) {
			System.err.println("Failed to process file '" + a_file.toString() + "'");
		}
	}

	// Performs massaging on a character string, returning the massaged stream.
	public static /*@ pure @*/ String massage(String a_string) {
		String[] split_input = a_string.split("\r?\n");
		for (int i = 0; i < split_input.length; i++)
			if (recognizeFlags(split_input[i]))
			{
				split_input[i] = appendMarker(split_input[i]);
			}
			else
			{
				if(i != split_input.length - 1)
					split_input[i] = split_input[i] + "\r\n";
			}
		StringBuffer sb = new StringBuffer();
		for (String s : split_input)
			sb.append(s);
		return sb.toString();
	}

	// Performs massaging on a character stream, returning the massaged stream.
	public static /*@ pure @*/ InputStream massage(InputStream a_stream) {
		assert false;
		return null;
	}
	
	// Is the input line of the form "^[ \t]+flags:.*"?
	public static /*@ pure @*/ boolean recognizeFlags(String a_line) {
		return a_line.trim().startsWith("flags:");
	}
	
	// Return the flags marker appended onto the end of the provided string.
	public static /*@ pure @*/ String appendMarker(String a_string) {
		return a_string + "\n" + FLAGS_MARKER + "\n";
	}
}
