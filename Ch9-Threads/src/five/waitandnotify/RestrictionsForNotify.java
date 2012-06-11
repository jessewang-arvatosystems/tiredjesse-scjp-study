package five.waitandnotify;

// wait() and notify() must be called from a synchronized context
// notify() tells the JVM to wake up the thread thats waiting, and gives it back the key

public class RestrictionsForNotify {
	public static void main(String... args) {
		RestrictionsForNotify example = new RestrictionsForNotify();
		
		example.go();
		example.notify(); // Will throw an IllegalMonitorStateException()
		System.out.println("Done");
	}
	
	private void go() {
		System.out.println("Running");
	}
}
