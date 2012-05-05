package two.sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingObjects {

	public static void main(String... sortingClothes) {
		List<Clothes> drawer = new ArrayList<Clothes>(0);
		drawer.add(new Clothes("T-Shirt", "Cotton", 10)); // add() will always add to the end of the list
		drawer.add(new Clothes("Jacket", "Silk", 50));
		drawer.add(new Clothes("Jacket", "Leather", 30));
		drawer.add(new Clothes("Suit", "Silk", 25));

		System.out.printf("Unsorted clothes:\n%s\n", drawer);

		Collections.sort(drawer); // If Comparable was not implemented will not compile
								  // The compiler does not know how to sort objects!

		System.out.printf("Sorted clothes:\n%s\n", drawer);
	}

	private static class Clothes implements Comparable<Clothes> { // Note clothes is in <> to specify the
																  // intention of sorting Clothes
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

		// return negative value when: thisObject < otherObject
		// return zero when: thisObject == otherObject
		// return positive value when: thisObject > otherObject
		public int compareTo(Clothes otherClothes) {
			int typeIsBigger;
			typeIsBigger = type.compareTo(otherClothes.type);

			// First check jacket type, then check weight
			if (typeIsBigger == 0) {
				if (weight < otherClothes.weight) {
					return -1;
				} else if (weight > otherClothes.weight) {
					return 1;
				} else {
					return 0;
				}
			}

			return typeIsBigger;
		}

	}
}
