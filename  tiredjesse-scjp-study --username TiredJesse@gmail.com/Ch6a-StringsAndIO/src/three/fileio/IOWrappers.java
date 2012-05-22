package three.fileio;

import java.io.*;

// FileReader and FileWriter are the most basic readers and writers
// There are readers and writers with much more functionality
// The readers can wrap other readers and same goes for writers

@SuppressWarnings("unused")
public class IOWrappers {
	
	public static void main(String[] args) throws IOException {
		File file = new File("fileTutorial.txt");
		
		// FileWriter can accept Strings or Files as its' constructor parameter
		// Methods: write(), close() and flush()
		FileWriter fw = new FileWriter("fileTutorial.txt");
		FileWriter fw2 = new FileWriter(file);
		
		// BufferedWriter can only accept other writers as its' constructor argument
		// Methods: write(), close(), flush() and newLine() (equivalent to doing \n)
		BufferedWriter bw = new BufferedWriter(fw);
		
		// PrintWriter can accept Strings, Files, Writers and even OutputStreams
		// Methods: write(), close(), flush(), format(), printf(), println() and print()
		PrintWriter pw = new PrintWriter("fileTutorial.txt"); // As of Java 5
		PrintWriter pw2 = new PrintWriter(file); // As of Java 5
		PrintWriter pw3 = new PrintWriter(fw);
		PrintWriter pw4 = new PrintWriter(new ObjectOutputStream(System.out));
		
		// FileReader can accept Strings or Files as its' constructor parameter
		// Methods: read() and close()
		FileReader fr = new FileReader("fileTutorial.txt");
		FileReader fr2 = new FileReader(file);
		
		// BufferedReader can only accept other readers as its' constructor argument
		// Methods: read(), readLine() and close()
		BufferedReader br = new BufferedReader(fr);
	}

}
