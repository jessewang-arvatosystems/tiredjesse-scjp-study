package one.introduction;

// Follows standard PEMDAS rule (parenthesis, exponent, multiplication/division/modulus, addition/subtraction)
// However there is no exponent sign in Java. Need to use Math.pow() instead

public class OrderOfOperation {
	
	public static void main(String... args) {
		float result;
		
		result = 5 * 2 + 3 - 1 % 2 / 5; // (5*2) + 3 - ((1 % 2) / 5)
		System.out.println(result);
		
		result = 5 * (2 + 3 - 1) % 2 / 5;
		System.out.println(result);
	}

}
