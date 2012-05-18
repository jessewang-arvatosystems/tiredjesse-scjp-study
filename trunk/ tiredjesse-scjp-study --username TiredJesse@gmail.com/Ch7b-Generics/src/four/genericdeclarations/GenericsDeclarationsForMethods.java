package four.genericdeclarations;

class Feline {}
class Cat extends Feline {}
class Kitten extends Cat {}

public class GenericsDeclarationsForMethods {
	
	public static void main(String[] args) {
		Feline f = new Feline();
		Feline f2 = new Cat();
		Feline f3 = new Kitten();
		
		Cat c = new Cat();
		Cat c2 = new Kitten();
		
		Kitten k = new Kitten();
		
		// Only felines
//		addFeline(new Object());
		addFeline(f);
		addFeline(f2);
		addFeline(f3);
		addFeline(c);
		addFeline(c2);
		addFeline(k);		
		System.out.println();
		
		// Only cats
//		addCat(new Object());
//		addCat(f);
//		addCat(f2);
//		addCat(f3);
		addCat(c);
		addCat(c2);
		addCat(k);
		System.out.println();
		
		// Only kittens
//		addKitten(new Object());
//		addKitten(f);
//		addKitten(f2);
//		addKitten(f3);
//		addKitten(c);
//		addKitten(c2);
		addKitten(k);
		System.out.println();
		
		// Anything
		addSomething(new Object());
		addSomething(f);
		addSomething(f2);
		addSomething(f3);
		addSomething(c);
		addSomething(c2);
		addSomething(k);
	}
	
	private static <T extends Feline> void addFeline(T element) {
		System.out.printf("addFeline %s\n", element.getClass().getSimpleName());
	}
	
	private static <T extends Cat> void addCat(T element) {
		System.out.printf("addCat %s\n", element.getClass().getSimpleName());
	}
	
	private static <T extends Kitten> void addKitten(T element) {
		System.out.printf("addKitten %s\n", element.getClass().getSimpleName());
	}
	
	// super is not allowed in generic declarations
//	private static <T super Kitten> void addKittenParents(T element) {
//		System.out.printf("addKittenParent %s\n", element.getClass().getSimpleName());
//	}
	
	private static <T> void addSomething(T element) {
		System.out.printf("addSomething %s\n", element.getClass().getSimpleName());
	}
	
//	private static <?> void addSomething2(? element) {
//		System.out.printf("addSomething %s\n", element.getClass().getSimpleName());
//	}
}


