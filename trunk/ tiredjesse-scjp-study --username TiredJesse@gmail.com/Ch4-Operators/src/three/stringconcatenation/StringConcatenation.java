package three.stringconcatenation;

public class StringConcatenation {
	
	public static void main(String... concat) {
		String msgOne = "Hello ";
		String msgTwo = "World";
		
		System.out.println(msgOne + msgTwo);
		
		int x = 3;
		int y = 4;
		System.out.println(x + y); // Math
		System.out.println("x plus y is: " + x + y); // Concatenate
		System.out.println("(x plus y) is: " + (x + y)); // In parenthesis do math
		System.out.println(x + y + " x plus y is: " + x + y); // Before string do math, afterwards concatenate
		System.out.println("" + x + y); // Concatenate
		System.out.println("" + ++x + y); // Increment/decrement still works
	}

}
