package three.synchronization;

public class WaitAndNotify implements Runnable {
	
	private Calculator calculator;
	
	public WaitAndNotify(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		synchronized (calculator) {
			try {
				System.out.println("Waiting for calculation...");
				calculator.wait();
				// or
//				calculator.wait(1000); // Wait until X milliseconds pass
			} catch (InterruptedException e) {
			}
			System.out.printf("The result is: %d\n", calculator.getResult());
		}
	}
	
	public static void main(String[] args) {
		Calculator 	add = new Calculator(3, 6, CalcFunctions.ADD),
					subtract = new Calculator(3, 6, CalcFunctions.SUBTRACT),
					multiply = new Calculator(3, 6, CalcFunctions.MULTIPLY),
					divide = new Calculator(3, 6, CalcFunctions.DIVIDE);
		
		
		Thread 	adding = new Thread(new WaitAndNotify(add)),
				subtracting = new Thread(new WaitAndNotify(subtract)),
				multiplying = new Thread(new WaitAndNotify(multiply)),
				dividing = new Thread(new WaitAndNotify(divide));

		adding.start();
		subtracting.start();
		multiplying.start();
		dividing.start();
		
		new Thread(add).start();
		new Thread(subtract).start();
		new Thread(multiply).start();
		new Thread(divide).start();
	}
}

class Calculator implements Runnable {

	private final CalcFunctions function;
	private final int num1, num2;
	private int result = 0;

	Calculator(int num1, int num2, CalcFunctions function) {
		this.num1 = num1;
		this.num2 = num2;
		this.function = function;
	}

	@Override
	public void run() {
		synchronized (this) {
			switch (function) {
				case ADD: addMethod(); break;
				case SUBTRACT: subtractMethod(); break;
				case MULTIPLY: multiplyMethod(); break;
				case DIVIDE: divideMethod(); break;
				default: assert(false);
			}
//			notify(); // Tell one waiting thread to go back to runnable
					  // The notified thread is not guaranteed to be the first thread
					  // told to wait. It can be any thread in the waiting state.
			notifyAll(); // Tell all currently waiting threads to go back to runnable
		}
	}

	public int getResult() { return result; }
	private void setResult(int result) { this.result = result; }
	
	private void divideMethod() { setResult(num2 / num1); }
	private void multiplyMethod() { setResult(num2 * num1); }
	private void subtractMethod() { setResult(num2 - num1); }
	private void addMethod() { setResult(num2 + num1); }

}

enum CalcFunctions {
	ADD,
	SUBTRACT,
	MULTIPLY,
	DIVIDE;
}
