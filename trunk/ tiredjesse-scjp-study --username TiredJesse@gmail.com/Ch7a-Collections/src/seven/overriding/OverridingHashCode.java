package seven.overriding;

import java.util.HashSet;
import java.util.Set;

public class OverridingHashCode {
	public static void main(String... overrides) {
		Animal catOne = new Cat("Meowy", 123);
		Animal catTwo = new Cat("Meowy", 123);
		Animal catThree = new Cat("Hello Meowy!", 123);
				
		Animal dogOne = new Dog("Doggy", 123);
		Animal dogTwo = new Dog("Doggy", 238412974);
		Animal dogThree = new Dog("Hello Doggy!", 123);
		
		System.out.printf("Is Cat one is equal to Cat two: %b\n", catOne.equals(catTwo));
		System.out.printf("Is Cat one is equal to Cat three: %b\n", catOne.equals(catThree));
		System.out.printf("Is Dog one is equal to Dog two: %b\n", dogOne.equals(dogTwo));
		System.out.printf("Is Dog one is equal to Dog three: %b\n", dogOne.equals(dogThree));
		
		Set<Animal> setOfDogs = new HashSet<Animal>();
		
		setOfDogs.add(dogOne);
		setOfDogs.add(dogTwo);
		
		for(Animal oneDog : setOfDogs) {
			System.out.println(oneDog.getName());
		}
		
		// One output from setOfDogs this time!
		
	}
	
	private static abstract class Animal {
		private String name;
		private int weight;
		
		Animal(String name, int weight) {
			this.name = name;
			this.weight = weight;
		}
		
		String getName() {
			return name;
		}
		
		@SuppressWarnings("unused")
		int getWeight() {
			return weight;
		}
	}
	
	private static class Cat extends Animal {
		Cat(String name, int weight) {
			super(name, weight);
		}
	}
	
	private static class Dog extends Animal {
		Dog(String name, int weight) {
			super(name, weight);
		}
		
		public boolean equals(Object object) {
			// Kind of hard to read, but does two checks
			// First check object is an instance of Dog
			// If passes first check, then compare the two names
			return (object instanceof Dog && ((Dog)object).getName() == getName());
		}
		
		// If two objects are equal they MUST have the same hashcode
		// It is valid to return a single number as a hashcode, but it is
		// recommended to make the hashCode as diverse as possible
		public int hashCode() {
//			return getWeight(); // Not good hashcode as dogs of different weight can still be the same
			return getName().length();
		}
	}
}

