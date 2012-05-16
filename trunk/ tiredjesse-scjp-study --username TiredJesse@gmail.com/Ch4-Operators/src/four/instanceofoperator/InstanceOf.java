package four.instanceofoperator;

// Use the instanceof operator to check if the instance if a subclass of a class
// The instanceof operator can only be done to classes that are related to each other

public class InstanceOf {
	
	public static void main(String... related) {
		Grandfather grandfather = new Grandfather();
		Father father = new Father();
		Son son = new Son();
		Cousin cousin = new Cousin();
		
		boolean result;
		
		result = grandfather instanceof Person;
		System.out.println("Grandfather is a person: " + result);
		
		result = father instanceof Grandfather;
		System.out.println("Father is a child to Grandfather: " + result);
		
		result = grandfather instanceof Father;
		System.out.println("Grandfather is a child to Father: " + result);
		
		result = son instanceof Father;
		System.out.println("Son is a child to Father: " + result);	
		
		result = father instanceof Son;
		System.out.println("Father is a child to son: " + result);
		
//		result = cousin instanceof Son; // Compilation error, not related to each other!
//		System.out.println("Cousin is a child to son: " + result);
		
		result = cousin instanceof Person; // Okay, valid!
		System.out.println("Cousin is a person: " + result);
		
		result = null instanceof Object; // Compiles, always will be false;
		System.out.println("null is an Object: " + result);
	}
}

interface Person {}
class Grandfather implements Person {}
class Father extends Grandfather {}
class Son extends Father {}
class Cousin implements Person{}