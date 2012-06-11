package one.introduction;

public class WaysToStartThreads {
	
	public static void main(String[] args) {
		Thread one = new ExtendedThread();
		Thread two = new Thread(new ImplementedRunnable());
		Thread three = new Thread(one); // A thread can accept another thread as its' constructor param
		
		one.start();
		two.start();
		three.start();
		
		// Other constructor versions of Thread
		new Thread("Thread Name");
		new Thread(new ImplementedRunnable(), "Thread Name");
	}
}

// Method #1
// Extend Thread
// This method is not recommended because it prevents the ability
// from extending other classes.
// In addition, it is not a good class representation.
// ExtendedThread is a Thread, but it doesn't act like a Thread.
// The ExtendedThread is only used to override the run() method
class ExtendedThread extends Thread {
	@Override
	public void run() {
		System.out.println("#1 Extended Thread's Method Ran");
	}
}

// Method #2
// Implement Runnable
// This method is recommended because it allows the class to extend other classes.
// Also this class implements the Runnable rule, stating that it will act
// like a Runnable for a Thread to use
class ImplementedRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("#2 Implemented Runnable's Thread Method Ran");
	}
}
