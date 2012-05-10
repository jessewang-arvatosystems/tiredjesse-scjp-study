package four.anonymousclasses;

public class AnonymousClassBasics {
	public static void main(String[] args) {
		System.out.print("The animal: ");
		new Animal().eat();
		
		System.out.print("The zoo animal: ");
		new Zoo().animalEat();
		
	}
}

class Animal {
	void eat() {
		System.out.println("hunts for food");
	}
}

@SuppressWarnings("unused")
class Zoo {
	// Notice extra curly brace after the parenthesis
	Animal animal = new Animal() {
		void eat() {
			System.out.println("gets fed food");
		}
		void drink() { // Compiles fine, but can never be used!
			System.out.println("gets a nice cool glass of water");
		}
	};
	
	void animalEat() {
		animal.eat();
//		animal.drink(); // Compilation error, the Animal class does not have this method
	}
}