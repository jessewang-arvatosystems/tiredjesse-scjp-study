package two.sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOrder {
	
	public static void main(String[] args) {
		Comparator<String> comparator;
		List<String> list = new ArrayList<String>(0);

		list.add("Xx");
		list.add("xX");
		list.add("XX");
		list.add("  ");
		list.add("xx");
		list.add(" x");
		
		System.out.printf("The list as it stands: %s\n", list);
		
		// reverseOrder() returns a comparator
		// Reverses the natural ordering
		comparator = Collections.reverseOrder();
		
		// reverse() does not return anything
		// Reverses the index positions (not necessarily natural ordering)
		Collections.reverse(list);
		
		System.out.printf("The list reversed: %s\n", list);
		
		Collections.sort(list, comparator);
		System.out.printf("The list in reverse order: %s\n", list);
		
		Collections.sort(list);
		System.out.printf("The list in order: %s\n", list);
		
		// Sorting priority goes as the following:
		// 1. White space
		// 2. Symbols and numbers (will not be tested on this)
		// 3. Capital letters
		// 4. Lower case letters
	}

}
