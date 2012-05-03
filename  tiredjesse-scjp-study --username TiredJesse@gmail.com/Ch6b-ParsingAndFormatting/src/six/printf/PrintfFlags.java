package six.printf;

// Order of how the formatting is arranged
// %[arg_index$][flags][width][.precision]conversion char

public class PrintfFlags {
	
	public static void main(String... stringFun) {
		float no1 = 1223.456f;
		float no2 = -3321.321f;
		
		System.out.printf("No1 is: %+f", no1); // + adds + sign
		System.out.printf(", No2 is: %+f\n", no2); // + does nothing here
		
		System.out.printf("No1 is: %(f", no1); // ( does nothing here
		System.out.printf(", No2 is: %(f\n", no2); // ( wraps negative numbers in parenthesis
		
		System.out.printf("No1 is: %,f\n", no1); // , adds commas every three digits

		System.out.printf("No1 is: %020f\n", no1); // 0 pads argument with 0s, 20 width added to show padding
		
		System.out.printf("No1 is: %-20f<\n", no1); // - justifies the argument to the left, 20 width added
		
		System.out.printf("No1 is: %20f<\n", no1); // [nonZeroNumber] after flags designates the width
		
		System.out.printf("No1 is: %.2f\n", no1); // .nonZeroNumber after width designates the precision
		
		// Try to figure this out before running
		System.out.printf("The number is: >%2$(,-15.2f<, the next number is: >%1$+020.1f<", no1, no2);
	}

}
