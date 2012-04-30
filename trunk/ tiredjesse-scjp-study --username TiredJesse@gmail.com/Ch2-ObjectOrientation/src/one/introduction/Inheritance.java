package one.introduction;

public class Inheritance {}

// Inheritance allows a class to be a subclass of a superclass and allows the class 
// to have access to the superclass' public & protected variables and methods.

// When a class inherits another class, it is an IS-A relationship.
// Inheritance is the key concept behind polymorphism, overriding, overloading and casting.

//IE:
abstract class Animal {
	protected String name;
	
	protected abstract void walk();
}

class Dog extends Animal {
	Dog(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("Walking on four legs");
	}
}