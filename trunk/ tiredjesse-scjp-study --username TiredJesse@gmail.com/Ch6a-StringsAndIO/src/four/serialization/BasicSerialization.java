package four.serialization;

import java.io.Serializable;

public class BasicSerialization extends FileIO { 
	// The FileIO class was made for convenience, due to a lot of repeating code
	// Look at the class first before continuing
	
	private static int inputNumber = 14;
	
	public static void main(String... serializationStuff) {
		SerializableClass before = new SerializableClass(inputNumber);
		SerializableClass after;
		
		System.out.println("Number in Before is: " + before.getNumber());
		outputObjectToFile(before);
		
		
		after = inputObjectFromFile();
		System.out.println("Number in After is: " + after.getNumber()); 
		// Serialization is successful if value is equal to inputNumber
	}

}

class SerializableClass implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int number;
	
	public SerializableClass(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
}
