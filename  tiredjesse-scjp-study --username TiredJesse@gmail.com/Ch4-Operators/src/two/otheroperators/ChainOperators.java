package two.otheroperators;

public class ChainOperators {
	
	public static void main(String... operator) {
		float x = 5;
		
		// Same as x = x + 10
		x += 10;
		System.out.println("x is: " + x);
		
		// Same as x = x - 6	
		x -= 6;
		System.out.println("x is: " + x);
		
		// Same as x = x*2	
		x *= 2;
		System.out.println("x is: " + x);
		
		// Same as x = x/3	
		x /= 3;
		System.out.println("x is: " + x);
		
		// Same as x = x % 5
		x %= 5;
		System.out.println("x is: " + x);
		
		// PEMDAS rules do not apply here, the chain operator always goes last
		float y = 6;
		
		y *= 2 + 3; // Looks like it should be 15, but is actually y*(2+3) or 30
		System.out.println("y is: " + y);
	}

}
