package one.introduction;

public class IntegerLiterals {
	public static void main(String... sameNumbers) {
		int num1 = 25; // decimal literal (0-9) or 10^x
		int num2 = 031; // octal literal (0 (0-7)+) or 8^x
		int num3 = 0x19; // hexadecimal literal (0x (0-9a-f)+) or 16^x
		
		System.out.println("Num1 is: " + num1);		
		System.out.println("Num2 is: " + num2);
		System.out.println("Num3 is: " + num3);
	}
}
