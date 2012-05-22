package two.methods;

// Join tells the current thread to join at the end of the specified thread
// Join essentially combines two threads into one.
// Using join is guaranteed and releases the lock of the current joining thread

/* In Example below:
 * 1. main() Thread "Main" started (1 Thread)
 * 2. a.start() Thread "Main" runs and starts Thread "A" (2 Threads)
 * 3. a.join() Thread "A" running, put the stack of Thread "Main" at the end of Thread "A" (1 Thread)
 * 4. b.start() Once Thread "A" completes, Thread "Main" continues to run and starts Thread "B" (2 Threads)
 * 
 * Thread Stacks
 * 1. [main's stack: main()]
 * 2. [main's stack: main()]  [A's stack: A.run()]
 * 3. [A's stack: A.run(), main()] // a.join() called
 * 4. [main's stack: main()]  [B's stack: B.run()]
 */


public class Join {
	
	public static void main(String... args) {
		Thread 	a = new Thread("A") {
			public void run() {
				printChar50Times('1');
			}
		},
				b = new Thread("B") {
			public void run() {
				printChar50Times('0');
			}
		};
		
		a.start();
		
		// Must handle InterruptedException
		// Comment this block to see the difference
		try { 
			a.join(); // Tell the main thread to join at the end of thread a
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("___");
		
		b.start();
	}
	
	
	private static void printChar50Times(char character) {
		for(int index=0; index<50; index++) {
			System.out.print(character);
		}
	}
}
