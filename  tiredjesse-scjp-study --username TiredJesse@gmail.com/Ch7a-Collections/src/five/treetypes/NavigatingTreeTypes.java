package five.treetypes;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigatingTreeTypes {
	
	public static void main(String[] trees) {
		// There are two classes that implement the Navigable interface TreeSet and TreeMap.
		// They have new methods introduced in Java 6 to help with navigating information
		
		TreeSet<Integer> planeTimes = new TreeSet<Integer>();
		TreeMap<String, Integer> trainTimes = new TreeMap<String, Integer>();
		
		planeTimes.add(830);
		planeTimes.add(1030);
		planeTimes.add(1200);
		planeTimes.add(1500);
		planeTimes.add(1600);
		planeTimes.add(2000);
		
		trainTimes.put("A", 500);
		trainTimes.put("A", 900);
		trainTimes.put("A", 1800);
		trainTimes.put("B", 0);
		trainTimes.put("D", 800);
		
		// Java 5 version
		SortedSet<Integer> subSetPlaneTimes1 = planeTimes.headSet(1300); // 830, 1030, 1200
		SortedMap<String, Integer> subMapTrainTimes1 = trainTimes.headMap("C"); // Key values A, B and their values
		System.out.printf("J5 Latest time before 1300 is: %d\n", subSetPlaneTimes1.last());
		System.out.printf("J5 Latest station before C is: %s\n", subMapTrainTimes1.lastKey());
		
		SortedSet<Integer> subSetPlaneTimes2 = planeTimes.tailSet(1550); // 1600, 2000
		SortedMap<String, Integer> subMapTrainTimes2 = trainTimes.tailMap("C"); // Key value D and its values
		System.out.printf("J5 Earliest time after 1550 is: %d\n", subSetPlaneTimes2.first());
		System.out.printf("J5 Latest station after C is: %s\n", subMapTrainTimes2.firstKey());
		
		// Java 6 version
		System.out.printf("J6 Latest time before 1300 is: %d\n", planeTimes.lower(1300));
		System.out.printf("J6 Latest station before C is: %s\n", trainTimes.lowerKey("C"));
		System.out.printf("J6 Earliest time after 1550 is: %d\n", planeTimes.higher(1550));
		System.out.printf("J6 Latest station after C is: %s\n", trainTimes.higherKey("C"));
	}

}
