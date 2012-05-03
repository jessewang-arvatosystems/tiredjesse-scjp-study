package five.tokenizing;

import java.util.Scanner;

public class ScannerBasics {
	
	public static void main(String[] scanners) {
		System.out.println("Input: ");
		System.out.flush();
		
		Scanner s = new Scanner(System.in);
		String token;
		do {
			token = s.findInLine("hello");
			System.out.println("Found " + token);
		} while (token != null);
	}

}
