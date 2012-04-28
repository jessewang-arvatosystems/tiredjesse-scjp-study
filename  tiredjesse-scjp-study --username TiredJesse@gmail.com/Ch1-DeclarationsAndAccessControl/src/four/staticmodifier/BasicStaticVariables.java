package four.staticmodifier;

public class BasicStaticVariables {

	private int nonStaticCount = 0;
	private static int staticCount = 0;
	
	public static void main(String... countingDown) {
		BasicStaticVariables runOne = new BasicStaticVariables();
		BasicStaticVariables runTwo = new BasicStaticVariables();
		runOne.incrementCounters();
		System.out.printf("1st run: %s\n", runOne);
		
		runTwo.incrementCounters();
		System.out.printf("2nd run: %s\n", runTwo); // Static persists through the class rather than the object
	}
	
	private void incrementCounters() {
		nonStaticCount++;
		staticCount++;
	}
	
	public int getCantCount() {
		return nonStaticCount;
	}
	
	public static int getCount() {
		return staticCount;
	}

	@Override
	public String toString() {
		return "[nonStaticCount=" + nonStaticCount + " staticCount=" + staticCount + "]";
	}
}
