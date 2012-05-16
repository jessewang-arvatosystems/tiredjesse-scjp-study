package four.serialization;

import java.io.Serializable;

// Statics are not serializable they are not part of the object, they are part of the class
// Transients disable serialization. The transient modifier resets the variable back to default value 

public class SerializableVariables extends FileIO {
	public static void main(String[] args) {
		SerializeMe sm = new SerializeMe(3, 5, 12);
		SerializeMe sm2 = null;
		
		System.out.println("Before object output stream");
		System.out.println("Serializable No: " + sm.getSerializableNumber() + ", Transient No: "
				+ sm.getTransientNumber() + ", Static No: " + SerializeMe.staticNumber);
		
		outputObjectToFile(sm);
			
			// Change values after writing object
			// If serialization was successful these setters should not affect the 
			// the new object
			sm.setSerializableNumber(4);
			sm.setTransientNumber(31);
			SerializeMe.staticNumber = 30;
			
		sm2 = inputObjectFromFile();
		
		System.out.println("Reading in object input stream");
		System.out.println("Serializable No: " + sm2.getSerializableNumber() + ", Transient No: "
				+ sm2.getTransientNumber() + ", Static No: " + SerializeMe.staticNumber);
		
		
	}
}

class SerializeMe implements Serializable {
	private static final long serialVersionUID = 847429635640905556L;

	int serializableNumber;
	transient int transientNumber;
	static int staticNumber;
	
	SerializeMe(int serializableNumber, int transientNumber, int staticNumber) {
		this.serializableNumber = serializableNumber;
		this.transientNumber = transientNumber;
		SerializeMe.staticNumber = staticNumber; 
	}

	public int getSerializableNumber() {
		return serializableNumber;
	}

	public void setSerializableNumber(int serializableNumber) {
		this.serializableNumber = serializableNumber;
	}

	public int getTransientNumber() {
		return transientNumber;
	}

	public void setTransientNumber(int transientNumber) {
		this.transientNumber = transientNumber;
	}

}
