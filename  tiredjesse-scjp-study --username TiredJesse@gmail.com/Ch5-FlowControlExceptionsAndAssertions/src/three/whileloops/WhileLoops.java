package three.whileloops;

public class WhileLoops {
	
	public static void main(String... whiles) {
		int count = 0;
		
		while(count < 3) {
			System.out.println("in while loop");
			count++;
		}
		
		do {
			System.out.println("in do while loop");
			count--;
		}
		while(count > 0); // Must have semicolon at the end
		
		while(count < 3)
			count++; // Similar to if statements, no brackets means evaluate only first expression
		System.out.println("Count after while loop: " + count);
		
		do count--; 
		while(count > 0);
		System.out.println("Count after do while loop: " + count);
		
		// Tricky Loop
		do while (count == 0)
			count++;
		while(count++ != 3);
		
		/* This loop is really:
		 * do {
		 * 	while(count == 0) {
		 * 		count++
		 * 	}
		 * } while (count++ != 3);
		 */
		
		System.out.println("Count after tricky loop: " + count);
	}

}
