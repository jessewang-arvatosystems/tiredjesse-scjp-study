package four.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// If you don't understand the <T> symbol and T type, don't worry about it
// The main crux of the FileIO code is the ObjectOutputStream and ObjectInputStream
// To learn more about the <T> and T go to the Ch7b-Generics

public abstract class FileIO {
	private static String filename = "testSer.ser";
	
	public static <T> void outputObjectToFile(T outputObject) {
		try {
			FileOutputStream fs = new FileOutputStream(filename);
			ObjectOutputStream os = new ObjectOutputStream(fs); // ObjectOutputStream accepts OutputStreams as its' constructor argument
			os.writeObject(outputObject);
			os.flush();
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}		
	}

	@SuppressWarnings("unchecked")
	public static <T> T inputObjectFromFile() {
		T inputObject = null;
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis); // ObjectInputStream accepts InputStreams as its' constructor argument
			inputObject = (T) ois.readObject(); // Must must use cast!
			ois.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return inputObject;
	}
	
}
