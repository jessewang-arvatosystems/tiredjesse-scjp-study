package five.breakandcontinue;

public class UnlabeledBreak {
	public static void main(String... breaking) {
		int count = 0;
		
		while(true) {
			count++;
			if (count == 3) {
				break;
			}
		}
		
		for(; ;) {
			break;
		}
		
		System.out.println("Broken out of while and for loops");
	}
}
