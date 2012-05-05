package five.treetypes;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class BackedCollections {
	
	public static void main(String[] subs) {
		// TreeMaps and TreeSets can create submaps or subsets 
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		TreeSet<String> set = new TreeSet<String>();
		
		map.put(1, "one");
		map.put(3, "three");
		map.put(5, "five");
		map.put(10, "ten");
		
		set.add("apples");
		set.add("grapes");
		set.add("oranges");
		set.add("pears");
		set.add("strawberries");
		
		System.out.printf("map: %s\n", map);
		System.out.printf("set: %s\n", set);
		
		SortedMap<Integer, String> submap = map.subMap(1, 5); // from inclusive, to exclusive, 1, 3
		SortedSet<String> subset = set.subSet("grapes", "strawberries"); // from inclusive, to exclusive, grapes, oranges, pears
		System.out.printf("submap: %s\n", submap);
		System.out.printf("subset: %s\n", subset);
		
		submap.put(2, "two");
//		submap.put(6, "six"); // Throws IllegalArgumentException, Out of original range
		subset.add("orange juice");
//		subset.add("bananas"); // Throws IllegalArgumentException, Out of original range
		
		map.put(4, "four");
		map.put(9, "nine");
		set.add("bananas");
		set.add("kiwis");
		
		// Changes made to the subset/submap alters the original set/map!
		System.out.printf("new submap: %s\n", submap);
		System.out.printf("new subset: %s\n", subset);
		System.out.printf("new map: %s\n", submap);
		System.out.printf("new set: %s\n", subset);
		
		// Other backed collection methods
		// If no boolean is specified, always inclusive for starting point and 
		// exclusive for ending points when using head
		submap = map.headMap(3); // 1, 2 (exclusive)
		subset = set.headSet("grapes"); // apples, bananas (exclusive)
		
		submap = map.tailMap(5); // 5, 9, 10 (inclusive)
		subset = set.tailSet("oranges"); // oranges, pears, bananas (inclusive)
		
		// Can also make it be inclusive or exclusive
		submap = map.headMap(3, true); // 1, 2, 3 (inclusive)
		subset = set.headSet("grapes", true); // apples, bananas, grapes (inclusive)
		
		submap = map.tailMap(5, false); // 9, 10 (exclusive)
		subset = set.tailSet("oranges", false); // pears, bananas (exclusive)
		
		submap = map.subMap(1, true, 5, true); // 1, 2, 3, 4, 5 (all inclusive)
		subset = set.subSet("grapes", true, "strawberries", true); // grapes, kiwis, orange juice, oranges, pears
																   // strawberries (all inclusive)
	}

}
