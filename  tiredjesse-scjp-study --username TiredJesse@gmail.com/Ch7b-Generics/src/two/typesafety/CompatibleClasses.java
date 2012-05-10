package two.typesafety;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompatibleClasses {
	
	@SuppressWarnings("unused")
	public static void main(String... compatibility) {
		Parent[] personArray = new Parent[2];
		personArray[0] = new Parent();
		personArray[1] = new Child();
		
		Parent[] personArray2 = new Child[2]; // no problem, child is a parent
//		personArray2[0] = new Parent(); // Will compile, but Parent will not fit in a Child Array
		personArray2[1] = new Child();
		
		// Generics have different rules than Arrays
		List<Parent> personList = new ArrayList<Parent>();
		personList.add(new Parent());
		personList.add(new Child());
		
//		List<Parent> personList = new ArrayList<Child>(); // Type mismatch, will not compile!
		List<Child> personList2 = new ArrayList<Child>();
		
		System.out.printf("PersonArray1: %s\n", Arrays.toString(personArray));
		System.out.printf("PersonArray2: %s\n", Arrays.toString(personArray2));
		System.out.printf("PersonList: %s\n", personList);
		
		
		acceptArrays(personArray); 
		acceptArrays(personArray2); // This works fine, Child[] is a Parent[]
		acceptLists(personList);
//		acceptLists(personList2); // Will not compile
		
	}
	
	private static void acceptArrays(Parent[] personArray) {
		System.out.println("accepted array");
	}
	
	private static void acceptLists(List<Parent> personList) {
		System.out.println("accepted list");
	}

}

class Parent {
	public String toString() {
		return "Parent Object";
	}
}

class Child extends Parent {
	public String toString() {
		return "Child Object";
	}
}
