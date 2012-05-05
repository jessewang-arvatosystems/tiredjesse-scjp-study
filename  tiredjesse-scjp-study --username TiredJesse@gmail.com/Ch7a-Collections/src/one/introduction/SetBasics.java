package one.introduction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetBasics {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// Raw types shown, should be using generic types but deliberately
		// done to show subtle differences between the two sets
		Set testSet = new HashSet(); // Works fine
//		Set testSet = new TreeSet(); // Will not compile
									 // TreeSet does not know how to sort with different types
		
		testSet.add("hello");
		testSet.add(1);
		testSet.add(false);
		testSet.add(123.355);
		
		for(Object obj : testSet) {
			System.out.println(obj);
		}
		
		System.out.println();
		Set testSet2 = new TreeSet();
		
		testSet2.add(1);
		testSet2.add(10);
		testSet2.add(5);
//		testSet2.add(10.1);	// Will cause a ClassCastException, Double to Integer
//		testSet2.add(new Short((short) 3));	// Cannot even compare against different types of wrappers
		
		// Old way before the for each loop
		Iterator iterator = testSet2.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
