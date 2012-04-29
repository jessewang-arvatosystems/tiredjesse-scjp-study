package four.staticmodifier;

public class BasicStaticVariables {

	private static final int ONE = 1; // Constant variable declaration
	
	private int nonStaticCount = 0;
	private static int staticCount = 0;
	
	public static void main(String... countingDown) {
		BasicStaticVariables runOne = new BasicStaticVariables();
		BasicStaticVariables runTwo = new BasicStaticVariables();
		runOne.incrementCounters(ONE, ONE);
		System.out.printf("1st run: %s\n", runOne);
		
		runTwo.incrementCounters(ONE, ONE);
		System.out.printf("2nd run: %s\n", runTwo); // Static persists through the class rather than the object
	}
	
	// Parameters are named poorly, but this is used to demonstrate differences
	// when referring to the object/classes variable versus the local variable
	private void incrementCounters(int staticCount, int nonStaticCount) {
		this.nonStaticCount += nonStaticCount;
//		this.staticCount += staticCount; // Okay, but compiler will show warning b/c "this" points to the object
		
		BasicStaticVariables.staticCount += staticCount; // Much better, calling the class makes more sense. 
//		BasicStaticVariables.nonStaticCount; // No good since the variable only exists if there's an object					
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
