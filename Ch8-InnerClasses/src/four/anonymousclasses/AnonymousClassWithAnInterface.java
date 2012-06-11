package four.anonymousclasses;

public class AnonymousClassWithAnInterface {
	public static void main(String[] args) {
		new Supermarket().peopleAction();
	}
}

abstract class Person {
	public abstract void action();
}

class Supermarket {
	// Note new is being used on an abstract class (could also be an interface)!
	// This does not mean an object of Person is created, rather
	// an anonymous class that implements Person is created
	Person cashier = new Person() {
		public void action() {
			System.out.println("Sells goods");
		}
	}; // Note semi-colon at the end
	
	Person manager = new Person() {
		public void action() {
			System.out.println("Manages employees");
		}
	};
	
	void peopleAction() {
		System.out.print("The cashier: ");
		cashier.action();
		
		System.out.print("The manager: ");
		manager.action();
	}
}