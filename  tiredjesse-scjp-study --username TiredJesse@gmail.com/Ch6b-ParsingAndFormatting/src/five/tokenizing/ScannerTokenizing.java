package five.tokenizing;

import java.util.Scanner;

public class ScannerTokenizing {
	
	public static void main(String... args) {
	
		Scanner s = new Scanner("asd 21123123 a 123 s dfask 912ha asdj asd 1");
		
		while(s.hasNext())
			System.out.println(s.next()); // Space is the default delimiter
		
		s.close();
		
		Scanner s2 = new Scanner("asd 21123123 a 123 s dfask 912ha asdj asd 1");
		
		while(s2.hasNext()) {
			if (s2.hasNextShort()) {
				System.out.println("Short found: " + s2.next());			
			} else if(s2.hasNextInt()) {
				System.out.println("Int found: " + s2.next());				
			} else {
				System.out.println("Some string found: " + s2.next());
			}
		}
		
		s2.close();
	}

}
