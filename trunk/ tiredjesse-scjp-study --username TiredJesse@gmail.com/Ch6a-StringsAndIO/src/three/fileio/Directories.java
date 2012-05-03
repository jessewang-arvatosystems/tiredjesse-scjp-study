package three.fileio;

import java.io.File;
import java.io.IOException;

public class Directories {
	public static void main(String[] newDirectories) {
		File dir = new File("dirTutorial");
		File file = new File(dir, "fileTutorial.txt");
		File file2 = new File(dir, "fileTutorial2.txt");
		
		dir.mkdir(); // No checked exception
		
		try {
			file.createNewFile(); // Has a checked exception
			file2.createNewFile(); // Has a checked exception
		} catch (IOException e) { e.printStackTrace(); }
		
		if (!dir.delete()) 
			System.out.println("Directory could not be deleted, files are inside directory!");
		
		File newDir = new File("renamedDir");
		File newFile = new File(dir, "renamedFile.txt");
		
		if(file.renameTo(newFile))
			System.out.println("file renamed");		
		if (dir.renameTo(newDir)) // Can rename even if dir is not empty
			System.out.println("directory renamed\n");
		
		System.out.println("Files in renamedDir: ");
		for(String aFile : newDir.list()) {
			System.out.println(aFile);
		}
		
		newFile = new File(newDir, "renamedFile.txt");
		file2 = new File(newDir, "fileTutorial2.txt");
		
		file2.delete();
		newFile.delete();
		
		if (newDir.delete())
			System.out.println("Directory deleted, there were no files inside directory!");
	}
}
