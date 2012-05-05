package two.sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingObjectsPt2 {

	public static void main(String... sortingClothes) {
		List<Clothes> drawer = new ArrayList<Clothes>(0);
		drawer.add(new Clothes("T-Shirt", "Cotton", 10));
		drawer.add(new Clothes("Jacket", "Silk", 50));
		drawer.add(new Clothes("Jacket", "Leather", 30));
		drawer.add(new Clothes("Suit", "Silk", 25));

		System.out.printf("Unsorted clothes:\n%s\n", drawer);

		Collections.sort(drawer, new ClothesSorter()); // The comparator is inserted in the second parameter.
													   // Arrays.sort() can also use the comparator

		System.out.printf("Sorted clothes:\n%s\n", drawer);
	}
	
	private static class ClothesSorter implements Comparator<Clothes> {
		// return negative value when: thisObject < otherObject
		// return zero when: thisObject == otherObject
		// return positive value when: thisObject > otherObject
		public int compare(Clothes thisClothes, Clothes otherClothes) { // note is now compare() instead of compareTo()
																		// also accepts two parameters instead of one.
			int typeIsBigger;
			typeIsBigger = thisClothes.type.compareTo(otherClothes.type);
			
			// First check jacket type, then check weight
			if (typeIsBigger == 0) {
				if (thisClothes.weight < otherClothes.weight) {
					return -1;
				} else if (thisClothes.weight > otherClothes.weight) {
					return 1;
				} else {
					return 0;
				}
			}
			return typeIsBigger;
		}
		
	}

	private static class Clothes {
		private String type;
		private String fabric;
		private int weight;

		Clothes(String type, String fabric, int weight) {
			this.type = type;
			this.fabric = fabric;
			this.weight = weight;
		}

		public String toString() {
			return "Clothes [type=" + type + ", fabric=" + fabric + ", weight="
					+ weight + "]";
		}

	}
}
