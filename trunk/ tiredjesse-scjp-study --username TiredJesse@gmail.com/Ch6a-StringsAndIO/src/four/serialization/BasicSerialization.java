package four.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BasicSerialization implements Serializable { // Important to implement this!
	
	private static final long serialVersionUID = 4040544480212537283L;
	private int number = 5;
	
	public static void main(String... serializationStuff) {
		BasicSerialization before = new BasicSerialization();
		BasicSerialization after = null;
		
		System.out.println("Number in Before is: " + before.number);
		
		before.number = 14;
		
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs); // ObjectOutputStream accepts OutputStreams as its' constructor argument
			os.writeObject(before);
			os.flush();
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis); // ObjectInputStream accepts InputStreams as its' constructor argument
			after = (BasicSerialization) ois.readObject(); // Must must use cast!
			ois.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number in After is: " + after.number); // Serialization is successful if value is equal to 14
	}

}
