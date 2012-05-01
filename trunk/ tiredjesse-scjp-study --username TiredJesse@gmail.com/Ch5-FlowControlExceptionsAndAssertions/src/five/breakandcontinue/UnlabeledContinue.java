package five.breakandcontinue;

public class UnlabeledContinue {
	public static void main(String... continuing) {
		int count = 0;
		
		while(count < 3) {
			count++;
			if (count <= 3)
				continue; // Skip rest and go back to the top
			count--;
		}
		
		for(int i=0; i<3 ;) {
			i++;
			if (i <= 3)
				continue; // Skip rest and go back to the top
			i--;
		}
		
		System.out.println("Out of while and for loops");
	}
}
