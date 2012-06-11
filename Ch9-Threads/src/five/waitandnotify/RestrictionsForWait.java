package five.waitandnotify;

// wait() and notify() must be called from a synchronized context
// wait() tells the JVM to release the key of the current running thread

public class RestrictionsForWait {
	public static void main(String... args) {
		RestrictionsForWait example = new RestrictionsForWait();
		
		example.go();
		try {
			example.wait(); // Will throw an IllegalMonitorStateException()
		} catch (InterruptedException e) {
			System.out.println("Exception caught!"); // Does not trigger the exception
		}
		System.out.println("Done");			

	}
	
	private void go() {
		System.out.println("Running");
	}
}
