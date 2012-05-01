package five.wrappers;

@SuppressWarnings("unused")
public class Autoboxing {

	public static void main(String... autoBoxes) {
		Integer bigI1 = 5; // Primitive int 5 boxes to Integer wrapper
		int i1 = bigI1; // Unboxes Integer wrapper into primitive int 5;
		
		// Before Java 5 had to unbox and box manually
		Integer bigI2 = new Integer(5); // Box;
		int i2 = bigI2.intValue(); // Unbox
		
		// Strange things occur when comparing primitives and Wrappers
		int i3 = 200;
		Integer bigI3 = 200;
		Integer bigI4 = 200;
		
		compareNumbers(i3, bigI3);
		compareNumbers(bigI4, bigI3); // Note unboxes to primitive ints
		compareWrapperNumbers(bigI4, bigI3); // Weird things happening!
		
		// HOWEVER == comparison does work when dealing with numbers < 128
		Integer bigI5 = 127;
		Integer bigI6 = 127;
		compareWrapperNumbers(bigI5, bigI6);
	}
	
	private static void compareNumbers(int no1, int no2) {		
		if (no1 == no2) {
			System.out.println("The two numbers are equal");
		} else {
			System.out.println("The two numbers are not equal");
		}	
	}
	
	private static void compareWrapperNumbers(Integer no1, Integer no2) {
		if (no1 == no2) {
			System.out.println("The two numbers are equal");
		} else {
			System.out.println("The two numbers are not equal");
		}	
	}
	
}
