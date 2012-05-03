package three.fileio;

import java.io.*;

public class WritingToAFile {

	public static void main(String... fileWriters) {
		char[] in = new char[50]; // to store input
		int size = 0;
		File file = new File("fileTutorial.txt");
		FileWriter fw = null; 
		try {
			fw = new FileWriter(file); // create the file, otherwise use the file that exists
			fw.write("Hello World!\nNewLine\n");
		} catch (IOException e) { e.printStackTrace();
		} finally {
			try {
				fw.flush(); // flush before closing
				fw.close(); // close file when done			
			} catch (IOException e) { e.printStackTrace(); 
			} 
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader(file); // read the file, otherwise will throw FileNotFoundException
			size = fr.read(in); // read the whole file!
		} catch (FileNotFoundException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		} finally {
			try {
				fr.close(); // notice only close, there is no flush for reading a file
			} catch (IOException e) { e.printStackTrace();
			}			
		}
		
		System.out.println(size + " "); // how many bytes read
		for (char c : in)
			System.out.print(c);
		
		// The blocks at the end signify remaining cells left (50-21 or 29)
	}
}