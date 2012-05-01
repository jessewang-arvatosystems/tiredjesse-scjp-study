// To run old Java versions do: -source versNo.
// To run this class use javac -source 1.3 or earlier
// My suggestion is to run this through command prompt if you don't have JRE 1.3 on your IDE.
// Copy and paste code in a text editor, name file as PreAssertions.java. 
// Compile using javac -source 1.3 PreAssertions.java
// Then run using java PreAssertions 

/**
 * @see Assertions in eight.assertions first
 */

public class PreAssertions {
	
	public static void main(String[] args) {
		// Compiler will show warnings in Java 1.3
		// Versions later than Java 1.3 will generate a compilation failure
		
		int assert = 5;	
		System.out.println("the value of assert is: " + assert);
		
//		assert false : "Can't reach here"; // will not work in Java 1.3
	}

}
