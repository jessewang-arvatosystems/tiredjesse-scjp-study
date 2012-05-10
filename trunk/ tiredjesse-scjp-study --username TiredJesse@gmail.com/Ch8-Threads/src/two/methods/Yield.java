package two.methods;

// Yield makes a thread go back to runnable and allow threads with the 
// same priority level to run ahead
// Yield is not guaranteed to work as advertised!

public class Yield {

	public static void main(String[] args) {
		Thread bus = new Thread(new SchoolBus());
		Thread car = new Thread(new Car());
		
		car.start();
		bus.start();		
	}
	
	static class SchoolBus implements Runnable {
		
		@Override
		public void run() {
			for(int i=0; i<30; i++)
				System.out.printf("Child %d gets off the bus\n", i);
		}
		
	}
	
	static class Car implements Runnable {
		
		@Override
		public void run() {
			for (int i=0; i<30; i++) {
				System.out.printf("Car %d crosses the intersection\n", i);
				// Static call
				Thread.yield(); // Does not throw any exceptions
			}
		}
		
	}
}
