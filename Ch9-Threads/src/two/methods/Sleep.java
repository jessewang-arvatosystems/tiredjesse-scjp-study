package two.methods;

// Sleep makes the current thread slow down, by forcing it to stop for a period of time
// This is guaranteed to stop the thread!
// However, it is not guaranteed that the thread will immediately start running
// after the alloted period has passed.

public class Sleep implements Runnable {
	
	public static void main(String[] threads) {
		Thread thread = new Thread(new Sleep());
		thread.start();		
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.printf("Seconds Elapsed: %s\n", i);
			
			// Must handle InterruptedException!
			try {
				// Static call
				Thread.sleep(1000); // In milliseconds
//				thread.sleep(1000); // Valid, will compile without exceptions but deceptive
									// sleep() is a static method in the Thread class
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
