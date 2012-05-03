package one.introduction;

public class Strings {
	
	public static void main(String... intro) {
		int num = 5;
		String msg = "Hello";
		
		// Strings are immutable, meaning that their value cannot change!
		num++;
		msg.concat(" World"); // Create a " World" String object that no one points to
		
		System.out.println("num is: " + num);
		System.out.println("msg is: " + msg);
		
		// You can change the reference, but the String objects is still in the heap
		msg += " World";
		System.out.println("msg is now: " + msg);
		// The "Hello" object is still floating somewhere in the heap
		
		String takeMsg = msg; // takeMsg points to "Hello World" object
		msg = " Peace!"; // New reference made for msg. msg now points to " Peace!" object
		System.out.println(takeMsg + msg);
	}

}
