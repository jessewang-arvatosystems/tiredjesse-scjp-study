package five.breakandcontinue;

// Labels ONLY work with while and for loops!

public class LabledBreakAndContinues {
	
	public static void main(String... args) {
		
		outer:
			while(true) {
				while(true) {
					break outer;
				}
			}
	
		
		for(int i=0; i<3; i++) {
			jLabel:
				for (int j=0; j<3; j++) {
					for (; ;) {
						continue jLabel;
					}
				}
			System.out.println("i is: " + i);
		}
	
		System.out.println("Out of while and for loops");
		
	}

}
