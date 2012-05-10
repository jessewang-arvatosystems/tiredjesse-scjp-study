package three.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardNotation {
	public static void main(String[] args) {
//		List<Animal> catList = new ArrayList<Cat>(); // Won't work
		
		// Accept anything that extends Animal such as Cat and Dog
		// Note if Animal was an interface, this would still be correct syntax
		// there is no implements instead it is just extends
		List<? extends Animal> catList = new ArrayList<Cat>(); // Valid!
//		List<Cat> catList2 = new ArrayList<? extends Animal>(); // Bad syntax. Wild cards are declared on left hand side!
		
		// Accept anything that is a super of Cat, such as Animal and Object 
		List<? super Cat> animalList = new ArrayList<Animal>(); // Also Valid!
		
		List<Cat> catList2 = new ArrayList<Cat>();
//		addToAnimalList(catList); // In two.typesafety.TypeSafetyInMethods, this is shown why it will not work
//		addToAnimalList(catList2);
		addToGenericList(catList);
		addToGenericList(catList2); // Okay
//		addToGenericList(animalList); // Won't compile
		addToGenericList2(animalList);
		addToGenericList2(catList2); // No problem!
	}
	
	@SuppressWarnings("unused")
	private static void addToAnimalList(List<Animal> animalList) {
		animalList.add(new Cat());
	}
	
	private static void addToGenericList(List<? extends Animal> animalList) {
//		animalList.add(new Cat()); // will not compile can't add a new Cat() to a List<? extends Animal>
								   // since ? extends Animal can be any subtype of animal, can even be
								   // an abstract class or an interface
	}
	
	private static void addToGenericList2(List<? super Cat> animalList) {
		animalList.add(new Cat()); // Valid
	}
	
	// A mnemonic used is PECS, Producer-Extends, Consumer-Super
	// A Producer outputs something
	// A Consumer does something with the object passed in
	// You can think of it as a Producer is a getter and a Consumer is a setter
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}