package classes;

class OneClass {
	void doStuff() {
		System.out.println("Outer class");
	}
}

public class TooManyClasses {

	public static void main(String[] args) {
		System.out.printf("Before running run(): ");
//		new OneClass().doStuff(); Note will have a compilation error, the outside class can't be found
		new TooManyClasses().run();
	}
	
	void run() {
		System.out.printf("Before inner class: ");
		new OneClass().doStuff();
		
		class OneClass {
			void doStuff() {
				System.out.println("Inner class");
			}
		}
		
		System.out.printf("After inner class: ");
		new OneClass().doStuff();
	}
	
	class OneClass {
		void doStuff() {
			System.out.println("Middle class");
		}
	}
	
}
