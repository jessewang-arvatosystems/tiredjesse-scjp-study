package four.maps;

import java.util.HashMap;
import java.util.Map;
import static four.maps.MapBasics.printMap;

// Sister Class had its' equals() and hashCode() methods overridden while
// the Brother Class has not

public class MapAdvanced {
	
	public static void main(String... args) {
		Map<Object, Object> brothersAndSisters = new HashMap<Object, Object>();
		brothersAndSisters.put(new Brother("James"), "James Value");
		brothersAndSisters.put(new Brother("Keith"), "Keith Value");
		brothersAndSisters.put(new Sister("Mary"), "Mary Value");
		brothersAndSisters.put(new Sister("Jane"), "Jane Value");
		
		printMap(brothersAndSisters);
		
		System.out.println("\n" + brothersAndSisters.get(new Brother("James")));
		System.out.println(brothersAndSisters.get(new Brother("Keith")));
		System.out.println(brothersAndSisters.get(new Sister("Mary")));
		System.out.println(brothersAndSisters.get(new Sister("Jane")));
		
		// If equals() and hashCode() are not overridden, the keys become "lost"
		// they are still in the map according the printMap() function but they
		// cannot be retrieved
		
		/**
		 * @see seven.overriding for more info overriding equals() and hashCode()
		 */
	}
	
}

abstract class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}

class Brother extends Person {
	Brother(String name) {
		super(name);
	}
}

class Sister extends Person {
	Sister(String name) {
		super(name);
	}
	
	// Compares values
	public boolean equals(Object otherSister) {
		return otherSister instanceof Sister && ((Sister)otherSister).name == this.name;
	}
	
	// Finds correct bucket
	public int hashCode() {
		return name.length();
	}
}
