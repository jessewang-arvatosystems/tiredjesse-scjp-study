package one.introduction;

@SuppressWarnings("unused")
public class TwoWaysToStartThreads {
	
	public static void main(String[] args) {
		Thread one = new NotRecommendedMethod();
		Thread two = new Thread(new RecommendedMethod());
		// or
		Runnable methodTwo = new RecommendedMethod();
		Thread three = new Thread(methodTwo);
		
		one.start();
		two.start();
		
		// Other constructor versions of Thread
		new Thread("Thread Name");
		new Thread(new RecommendedMethod(), "Thread Name");
	}
}

// Method #1
// Extend Thread
// This method is not recommended because it prevents the ability
// from extending other classes.
// In addition, it is not a good class representation.
// NotRecommendedMethod is a Thread, but it doesn't act like a Thread.
// The NotRecommendedMethod is only used to override the run() method
class NotRecommendedMethod extends Thread {
	@Override
	public void run() {
		System.out.println("#1 Not Recommended Method Ran");
	}
}

// Method #2
// Implement Runnable
// This method is recommended because it allows the class to extend other classes.
// Also this class implements the Runnable rule, stating that it will act
// like a Runnable for a Thread to use
class RecommendedMethod implements Runnable {
	@Override
	public void run() {
		System.out.println("#2 Recommended Method Ran");
	}
}
