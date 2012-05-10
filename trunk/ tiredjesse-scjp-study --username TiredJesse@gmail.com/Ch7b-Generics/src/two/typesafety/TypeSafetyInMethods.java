package two.typesafety;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyInMethods {

	@SuppressWarnings("unused")
	public static void main(String tooSafe[]) {
		// The benefit of type safety in generics is that it allows you to avoid
		// scenarios like the following:
		
		Dog[] dogArray = new Dog[3];
		addToAnimalArray(dogArray); // Adding a cat to a dog array!
									// Compiles, but then throws an ArrayStoreException since
									// adding a cat to a dog array doesn't make any sense
		
		List<Dog> dogList = new ArrayList<Dog>();
//		addToAnimalList(dogList); // Compile error. Stops you from running to the same problem
		
		List<Animal> animalList = new ArrayList<Animal>();
		addToAnimalList(animalList); // Valid
		
		// The reason for the difference is that the JVM knows the type of the Array
		// while it doesn't know for a Collection. Java has to be able to run legacy code
		// and in legacy code collections do not have types!
	}
	
	private static void addToAnimalArray(Animal[] animalArray) {
		animalArray[0] = new Cat();
	}
	
	private static void addToAnimalList(List<Animal> animalList) {
		animalList.add(new Cat());
	}
	
}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}
