package three.syntax;

@SuppressWarnings("unused")
public class Arrays {
	private int[] intArray;
	private int anotherIntArray[]; // Valid, but not as readable
	private int[][] matrixArray;
	private int[] anotherMatrixArray[]; // Again valid, but not readable at all

	private String[] lazyInitArray = { "Moe", "Larry", "Curly" };
	private String[] moreRefinedArray = new String[3]; // 3 is the array capacity

	private Person[] peopleList = new Person[3];

	public static void main(String... testArrays) {
		new Arrays().initArrays();
		new Arrays().initPeopleList();
		System.out.println("No problemos!!!");
	}

	private void initArrays() {
		moreRefinedArray[0] = "Moe";
		moreRefinedArray[1] = "Larry";
		moreRefinedArray[2] = "Curly";
//		moreRefinedArray[3] = "Bobo"; // Will compile, but will encounter a ArrayIndexOutOfBoundsException
	}

	private void initPeopleList() {
		peopleList[0] = new Person("John Doe");
		peopleList[1] = new Clown("Larry"); // Works! Clown is a subclass of Person
//	    peopleList[2] = new Tree("Oak Tree"); Illegal must be of type Person or subclass of Person
	}
}

@SuppressWarnings("unused")
class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

}

class Clown extends Person {

	Clown(String name) {
		super(name);
	}

}

@SuppressWarnings("unused")
class Tree {
	private String name;

	Tree(String name) {
		this.name = name;
	}
}
