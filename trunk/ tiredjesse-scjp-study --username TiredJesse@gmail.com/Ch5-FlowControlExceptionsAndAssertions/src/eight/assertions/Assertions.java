package eight.assertions;

/*
 * The general rules for assertions is that:
 * 1. Don't use assertions in public methods
 * 2. Use assertions in private methods
 * 3. Do use assertions in public methods in places that you expect never to reach
 * 4. Don't verify command line arguments
 * 5. Do not use assertions to cause side effects (change variables)
 */

// Assertions were implemented since Java 1.4
// Prior to Java 1.4 'assert' can be used an identifier
// In command line use -ea or -enableassertions to enable assertions
// To specify which assertions to enable do -ea:PACKAGE.class or -ea:PACKAGE... (all classes in package)
// To specify which assertions to disable do -da:PACKAGE.class or -da:PACKAGE... 
// To disable assertions for system classes do -dsa

/**
 * @see PreAssertions in default package next
 */
public class Assertions {
	
	public static void main(String... args) {
		// Version one
		assert true; // Will not throw any AssertionException
		
		// Version two
//		assert false : "Detail about some error"; // Expression after : must return something
												  // does not need to be a string
		
		doStuff();
		doSomething(2);
	}
	
	public static void doStuff() {
		int x = 5;
//		assert true : x = 10; // Don't do this! Will first set x = 10, then return x
		if (x == 5) {
			System.out.println("Did stuff");
		} else {
			assert false;
		}
	}
	
	private static void doSomething(int x) {
		assert (x > 5) : "x is less than or equal to 5";
		
		System.out.println("x is greater than 5");
	}

}
