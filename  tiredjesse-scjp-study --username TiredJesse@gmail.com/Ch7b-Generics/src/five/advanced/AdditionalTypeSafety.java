package five.advanced;

import java.util.ArrayList;
import java.util.List;

public class AdditionalTypeSafety {
	
	public static void main(String[] args) {
		List<Fruit> basket = new ArrayList<Fruit>();
		
		addOrange(basket);
		
		System.out.printf("There is/are %d piece(s) of fruit in the basket.", basket.size());
	}
	
	// Will run perfectly fine
//	private static void addOrange(List<Fruit> basket) {
//		basket.add(new Orange());
//	}
	
	// Will run perfectly fine
//	private static void addOrange(List<? super Orange> basket) {
//		basket.add(new Orange()); 
//	}
	
	// Won't work
//	private static void addOrange(List<?> basket) {
//		basket.add(new Orange()); // ? is too vague, not permitted to add anything to list
//	}
	
	// Won't work
//	private static void addOrange(List<? super Orange> basket) {
//		basket.add(new Object()); // Invalid, not allowed to put an Object here
//								  // even though Object is a supertype of Orange
//	}
	
	// Works, but requires a cast
	@SuppressWarnings("unchecked")
	private static <T> void addOrange(List<T> basket) {
		basket.add((T) new Orange());
		basket.add((T) new Fruit());
	}
}

class Fruit {}

class Orange extends Fruit {}
