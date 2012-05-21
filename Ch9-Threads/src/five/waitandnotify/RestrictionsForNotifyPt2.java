package five.waitandnotify;

public class RestrictionsForNotifyPt2 {
	public static void main(String... args) {
		RestrictionsForNotifyPt2 example = new RestrictionsForNotifyPt2();
		
		example.go();
		
		synchronized (example) {
			example.notify(); // Won't throw an IllegalMonitorStateException() exception since in
							  // synchronized block but doesn't do anything since no threads are waiting
		}
		
		System.out.println("Done");
	}
	
	private void go() {
		System.out.println("Running");
	}
}
