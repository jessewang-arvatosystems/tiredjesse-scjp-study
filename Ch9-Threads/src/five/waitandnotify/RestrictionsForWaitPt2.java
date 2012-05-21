package five.waitandnotify;

public class RestrictionsForWaitPt2 {
	public static void main(String... args) {
		RestrictionsForWaitPt2 example = new RestrictionsForWaitPt2();
		
		example.go();
		
		synchronized (example) { // Put a lock on the example object
			try {
				example.wait(2000); // Will not throw an exception
									// Because there is no notify, the program to waits for 2 seconds
									// before proceeding
			} catch (InterruptedException e) {
				System.out.println("Exception caught!"); 
			}
		}
		System.out.println("Done");			
	}
	
	private void go() {
		System.out.println("Running");
	}
}
