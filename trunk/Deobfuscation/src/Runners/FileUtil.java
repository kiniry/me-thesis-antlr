package Runners;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
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
