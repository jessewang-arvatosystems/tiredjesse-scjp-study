package one.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBasics {
	
	public static void main(String... arrays) {
		int[] anArray = new int[2]; // arrays have a fixed capacity
		List<Integer> anArrayList = new ArrayList<Integer>(2); // Has a variable capacity
		
		anArrayList.add(0, 151);
		anArray[0] = 151;
		
		anArrayList.add(1, 121);
		anArray[1] = 121;
		
		anArrayList.add(2, 321); // No problem, though must be at the capacity!
								 // Writing anything higher than 2 will cause an IndexOutOfBoundsException!
//		anArray[2] = 321; // Throws ArrayIndexOutOfBoundsException
		
		// Note that Collections and Maps deal with Wrapper classes, NOT primitives
		anArrayList.add(3, 5); // 5 autoboxed into an Integer. 
							   // Before autoboxing, this would have to be written: 
							   // anArrayList.add(2, new Integer(5));
		
		// Any class that implements Collection can also be sorted
		System.out.printf("Unsorted Array: %s\n", Arrays.toString(anArray));
		System.out.printf("Unsorted ArrayList: %s\n", anArrayList);
		
		Arrays.sort(anArray);
		Collections.sort(anArrayList);
		
		System.out.printf("Sorted Array: %s\n", Arrays.toString(anArray));
		System.out.printf("Sorted ArrayList: %s\n", anArrayList);
	}

}
