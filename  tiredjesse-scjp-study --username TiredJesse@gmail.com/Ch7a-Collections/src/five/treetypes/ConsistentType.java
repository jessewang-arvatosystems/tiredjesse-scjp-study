package five.treetypes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConsistentType {
	
	public static void main(String... args) {
		Set<Number> setOfNumbers = new HashSet<Number>();
		
		setOfNumbers.add(12);
		setOfNumbers.add(12.12);
		setOfNumbers.add(12L);
		setOfNumbers.add((short)12);
		
		TreeSet<Number> treeSetOfNumbers = new TreeSet<Number>();
		
		// Casts TreeSet<Number> to TreeSet<Integer> 
		// Can now only sort by types of Integer
		treeSetOfNumbers.add(12); 
		
//		treeSetOfNumbers.add(12L); // ClassCastException
		treeSetOfNumbers.add(1212);
		treeSetOfNumbers.add(3212);
		
		treeSetOfNumbers.removeAll(treeSetOfNumbers);

		// Casts TreeSet<Number> to TreeSet<Double>
		// Can now only sort by types of Double
		treeSetOfNumbers.add(12.12);
		treeSetOfNumbers.add(22.12);
		treeSetOfNumbers.add(22.00);
//		treeSetOfNumbers.add(1); // ClassCastException

		
	}

}
