package one.introduction;

// Thread priority informs the JVM that this thread to run before/after other threads
// The highest priority is 10, average/default is 5 and lowest priority is 1
// The thread priority is not guaranteed to work as advertised!

public class ThreadPriorities {
	public static void main(String... priorities) {
		Thread highestPriority = new Thread(new GrandParent());
		Thread avgPriority = new Thread(new Parent());
		Thread lowestPriority = new Thread(new Child());
		
		highestPriority.setPriority(10); // Try to run first
		// or
		highestPriority.setPriority(Thread.MAX_PRIORITY);
		
		lowestPriority.setPriority(1); // Try to run last
		// or
		lowestPriority.setPriority(Thread.MIN_PRIORITY);
		
		avgPriority.setPriority(5); // Default
		// or
		avgPriority.setPriority(Thread.NORM_PRIORITY);
		
		lowestPriority.start();
		avgPriority.start();
		highestPriority.start();
	}
}

class GrandParent implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++)
			System.out.printf("Grandparent %d\n", i);
	}
	
}

class Parent implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++)
			System.out.printf("Parent %d\n", i);
	}
	
}

class Child implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<100; i++)
			System.out.printf("Child %d\n", i);
	}
	
}
