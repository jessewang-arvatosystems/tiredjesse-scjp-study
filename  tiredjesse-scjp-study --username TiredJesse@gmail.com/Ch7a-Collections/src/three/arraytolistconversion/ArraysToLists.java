package three.arraytolistconversion;

import java.util.Arrays;
import java.util.List;

public class ArraysToLists {
	
	public static void main(String... args) {
		String[] nameArray = {"John", "Jane", "Bill", "Mary"};
		List<String> nameList = Arrays.asList(nameArray);
		
		for(String name : nameList)
			System.out.println("Name: " + name);
		
		// asList() does not work with primitive arrays
		int[] numArray = {3, 2, 1, 6, 12, 6};
//		List<Integer> numList = Arrays.asList(numArray); // Will not compile!
		
		// Must wrap numbers as Integer before doing asList()
		Integer[] newNumArray = new Integer[numArray.length];
		for(int i=0; i<numArray.length; i++) {
			newNumArray[i] = numArray[i];
		}
		List<Integer> numList = Arrays.asList(newNumArray);
		for(int num : numList)
			System.out.println("int: " + num);
	}

}
