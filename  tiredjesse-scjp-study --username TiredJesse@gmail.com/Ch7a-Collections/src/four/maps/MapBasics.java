package four.maps;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {
	
	public static void main(String[] intro) {
		Map<Object, Object> testMap = new HashMap<Object, Object>();
		MapBasics mp = new MapBasics();
		
		testMap.put(1, "hello"); // Note syntax is put() instead of add()
		testMap.put(4, "world");
		testMap.put(8, "!");
		testMap.put(new MapBasics(), "new map");
		testMap.put(mp, "another new map");
		
		printMap(testMap);
		
		System.out.println("\n" + testMap.get(1));
		System.out.println(testMap.get(4));
		System.out.println(testMap.get(8));
		System.out.println(testMap.get(new MapBasics())); // This issue will be fixed in MapAdvanced
		System.out.println(testMap.get(mp));
	}
	
	public static void printMap(Map<Object, Object> targetMap) {
		for(Map.Entry<Object, Object> oneEntry : targetMap.entrySet())
			System.out.printf("Key is: %s, Value is: %s\n", oneEntry.getKey(), oneEntry.getValue());
	}

}
