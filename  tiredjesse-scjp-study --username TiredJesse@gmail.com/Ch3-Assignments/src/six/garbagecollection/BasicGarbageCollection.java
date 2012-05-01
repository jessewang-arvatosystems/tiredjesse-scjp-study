package six.garbagecollection;

// Garbage collection is not guaranteed. It is based on the computer's JVM.
// Run the main method multiple times to see that the Trash object 
// will not always be be collected

public class BasicGarbageCollection {

	@SuppressWarnings("unused")
	public static void main(String... trashCollection) {
		Trash trash = new Trash();
		trash = null;
		System.gc(); // Not recommended! Call for Garbage Collection (not guaranteed)
					 // Will not be on SCJP 6
//		Runtime.getRuntime().gc(); // Equivalent to System.gc();
		
		// Some long method
		for(int i=0; i<100000; i++) {} 
	}
	
}