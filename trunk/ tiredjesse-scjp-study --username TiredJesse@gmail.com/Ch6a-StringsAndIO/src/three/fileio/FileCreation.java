package three.fileio;

import java.io.File; // Must import java.io to use File class
import java.io.IOException; // Due to making a new file

public class FileCreation {
	public static void main(String... args) throws IOException {
		File file = new File("fileTutorial.txt");
		boolean fileCreationSuccess = false;
		
		if (!file.exists() || !file.isFile()) { // check if there is a file already made
												// if there is a file, check that it is a file (and not a directory)
			fileCreationSuccess = file.createNewFile(); // make fileTutorial.txt
		}
		
		
		if (fileCreationSuccess) {
			System.out.println("New file has been created!");
		} else {
			System.out.println("No file has been created, it already exists!");
		}
	}
}
