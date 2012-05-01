package four.forloops;

@SuppressWarnings("unused")
public class ForLoops {
	
	private static final int CAPACITY = 10;
	
	public static void main(String... args) {
		int[] array = new int[10];
		int count = 0;
		
		// typical for loop
		for(int i=0; i<CAPACITY; i++) {}
		
		// for each loop (Java 5 and above)
		for(int cell : array) {}
		
		// for loop as a while loop
		for( ;count < 3; ) 
			count++;
		
//		for ( ; ; ) {} // Compiles, infinite loop
		
		// can declare as many type ints in the first section
		// only ONE logic statement in the second section
		// can do whatever you want in the third section, does not HAVE to be incrementing/decrementing
		for(int x=0, y=3; (x<3) && (y>0) ; x++, y--, System.out.println("x is: " + x), System.out.println("y is: " + y)) {}
		
	}

}
