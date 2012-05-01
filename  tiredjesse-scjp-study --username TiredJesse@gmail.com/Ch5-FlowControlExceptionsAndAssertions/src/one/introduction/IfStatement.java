package one.introduction;

@SuppressWarnings("unused")
public class IfStatement {
	
	public static void main(String args[]) {
		boolean result = false;
		int num1 = 1;
		int num2 = 0;
		
		if (result); // Evaluates to false
		if (result = true); // Sets result to true, then evaluates to true
//		if (num1); // Invalid, 1 and 0 does not evaluate to true/false in Java
//		if (num2);
//		if (num1 = true); // Num is not a boolean type
		
		if (num1 > num2) {
			// if num1 is greater than num2 do something
		} else {
			// if false do something
		}
		
		if (num1 < num2) {
			// if num1 is less than num2 do something
		} else if (num1 == num2) {
			// if num1 is equal to num2 do something
		} else {
			// if num1 is not less than or equal to num2 do something
		}
		
		// Same as previous example, used to demonstrate that else is not required
		if (num1 < num2) {
			// if num1 is less than num2 do something
		} else if (num1 == num2) {
			// if num1 is equal to num2 do something
		}
		
		// If no brackets are used, evaluates first line
		if (false)
			System.out.println("You can't see me!");
			System.out.println("Seen me!");
	}

}
