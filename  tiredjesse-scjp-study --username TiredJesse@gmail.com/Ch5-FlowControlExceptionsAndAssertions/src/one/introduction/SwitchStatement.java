package one.introduction;

// Similar in function to If, but a little tricker to implement

@SuppressWarnings("unused")
public class SwitchStatement {

	private static final int FOUR = 4;
	private static int six = 6;
	
	private static final int LAZY;
	
	static {
		LAZY = 14;
	}
	
	public static void main(String... switches) {
		final int eight = 8;
		int num = 3;
		
		switch (num) {
			case 5: System.out.println("Num is 5");
					break; // Break out of loop, do not fall through
			case 3: System.out.println("Num is 3");
//			case 3: System.out.println("Num is 3 again"); // Cannot have duplicate cases
			case FOUR: System.out.println("Num is 4"); // Works!
			case eight: System.out.println("Num is 5"); // Works!
//			case six: System.out.println("Num is 6"); // Compilation error 'six' is not final
//			case LAZY: System.out.println("Num is lazy"); // Compilation error 'LAZY' is not a compile time constant
			default: System.out.println("Default");
		}
		
		
	}
	
}
