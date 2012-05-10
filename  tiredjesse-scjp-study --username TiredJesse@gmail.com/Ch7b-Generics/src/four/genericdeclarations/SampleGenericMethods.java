package four.genericdeclarations;

import java.util.ArrayList;
import java.util.List;

public class SampleGenericMethods {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Animal> animalList = makeCustomArrayList(new Animal());
		List<Person> personList = makeCustomArrayList(new Person()); 
//		List<Person> personList2 = makeCustomArrayList(new Animal()); // Compiler error!
																	  // Setting a person list to an animal list 
		List<Car> carList = makeCustomArrayList(new Car());
		
//		List<Car> carList2 = makeCustomNumberArrayList(new Car()); // Car not subclass of Number
		List<Integer> numList = makeCustomNumberArrayList(new Integer(5));
		List<Float> numList2 = makeCustomNumberArrayList(new Float(20));
		
	}
	
	private static <T> ArrayList<T> makeCustomArrayList(T element) {
		return new ArrayList<T>();
	}
	
	// The type must be a subclass of Number
	private static <T extends Number> ArrayList<T> makeCustomNumberArrayList(T element) {
		return new ArrayList<T>();
	}

}

class Animal {}
class Person {}
class Car {}