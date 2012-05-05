package five.treetypes;

import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableMethods {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		TreeMap map = new TreeMap();
		set.add(1);
		set.add(2);
		set.add(3);
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		// the lowest element >= entry 
		set.ceiling(2); // 2
		map.ceilingKey(2); // 2
		
		// the lowest element > entry
		set.higher(2); // 3
		map.higherKey(2); //3
		
		// the highest element <= entry
		set.floor(2); // 2
		map.floorKey(2); // 2
		
		// the highest element < entry
		set.lower(2); // 3
		map.lowerKey(2); //3
		
		// Polling is a new feature added to TreeMap and TreeSet in Java 6
		// returns and removes the first entry
		set.pollFirst(); // 1 and removes 1
		map.pollFirstEntry(); // <1, "one"> and removes <1, "one">
		
		// returns and removes the last entry 
		set.pollLast(); // 3 and removes 3
		map.pollLastEntry(); // <3, "three"> and removes <3, "three">
		
		// returns navigable set/map in reverse order
		set.descendingSet(); // 3, 2, 1
		map.descendingMap(); // <3, "three>, <2, "two">, <1, "one">
	}

}
