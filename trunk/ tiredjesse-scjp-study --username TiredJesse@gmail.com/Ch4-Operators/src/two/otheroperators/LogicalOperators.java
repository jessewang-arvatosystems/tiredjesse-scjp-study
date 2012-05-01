package two.otheroperators;

public class LogicalOperators {
	
	public static void main(String... logic) {
		int x = 3;
		int y = 7;
		int z = 4;
		boolean result;
		
		// AND
		result = (x > y) && (++x > z);
		System.out.println("AND: " + result + ", x is: " + x);
		
		// Bitwise AND, Evaluates everything even if first operand is false
		result = (x > y) & (++x > z);
		System.out.println("Bitwise AND: " + result + ", x is: " + x);
		
		// OR
		result = (y > x) || (++x > z);
		System.out.println("OR: " + result + ", x is: " + x);
		
		// Bitwise OR, Evaluates everything even if first operand is true
		result = (y > x) | (++x > z);
		System.out.println("Bitwise OR: " + result + ", x is: " + x);
		
		// XOR
		result = false ^ true;
		System.out.println("XOR: " + result);
		
		// NOT
		result = !false;
		System.out.println("NOT: " + result);
	}

}
