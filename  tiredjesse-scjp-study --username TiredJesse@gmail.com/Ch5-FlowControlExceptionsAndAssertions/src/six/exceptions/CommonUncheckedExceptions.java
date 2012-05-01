package six.exceptions;

public class CommonUncheckedExceptions {
	
	public static void main(String... args) {
		// The following exceptions are unchecked.
		// This means the method that throws these exceptions does not need to add a throws statement
		// All exceptions compile correctly individually. The comments are used to hide 
		// compile errors due to throwing too many exceptions right next to each other
		
		// Unchecked exceptions are a subclass of the RuntimeException()
//		throw new RuntimeException();
		
		// Thrown by JVM
//		throw new ArrayIndexOutOfBoundsException(); // Access invalid index of an array
//		throw new ClassCastException(); // Cast an object incorrectly
//		throw new NullPointerException(); // Access an object that is null
//		throw new ExceptionInInitializerError(); // Exception occurs when attempting to initialize static variable or initialization block
//		throw new StackOverflowError(); // Too much recursion
//		throw new NoClassDefFoundError(); // JVM can't find class required
		
		// Thrown by programmer
//		throw new IllegalStateException(); // State doesn't match the operation being attempted
//		throw new IllegalArgumentException(); // Method receives an argument it does not expect
//		throw new NumberFormatException(); // Subclass of IllegalArgumentException. Parsing a string that cannot be a number
//		throw new AssertionError(); // Thrown if assert statement is false
		
	}

}
