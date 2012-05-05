package two.sortingandsearching;

import java.util.Arrays;

public class SearchingArraysAndCollections {
	
	public static void main(String[] args) {
		int[] numbers = {6, 3, 5, 4, 1, 3};
		int index;
		
		index = Arrays.binarySearch(numbers, 3);
		System.out.printf("Before sorting, two 3s: 3 found at index of: %d\n", index);
		
		// The binarySearch algorithm thinks the insertion point for 3 is index of 0
		// The output is (-insertion point) - 1
		
		// binarySearch works best when the array is sorted and has no duplicate elements
		Arrays.sort(numbers);
		index = Arrays.binarySearch(numbers, 3);
		System.out.printf("After sorting, two3s: 3 found at index of: %d\n", index);
		
		numbers[2] = 7;
		Arrays.sort(numbers);
		index = Arrays.binarySearch(numbers, 3);
		System.out.printf("After sorting, one3: 3 found at index of: %d\n", index);
		
		// Collections also has a binarySerach
//		Collections.binarySearch(arg0, arg1); // Example not shown but works exactly the same way
		
	}

}
