package four.deadlock;

public class DeadlockRisk{
	
	private static class Resource {
		public int value;
	}
	private static Resource resourceA = new Resource();
	private static Resource resourceB = new Resource();
	
	public static void main(String[] args) {
		Thread 	reader = new Thread(new DeadlockRisk().new Reader(), "Reader"),
				writer = new Thread(new DeadlockRisk().new Writer(), "Writer");
		
		reader.start();
		writer.start();
	}
	
	public static int read() {
		synchronized (resourceA) { // May deadlock here
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}

	public static void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (resourceA) {
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}

	class Reader implements Runnable {
		
		@Override
		public void run() {
			read();
		}
		
	}
	
	class Writer implements Runnable {
		
		public void run() {
			write(1, 2);
		}
	}
}

