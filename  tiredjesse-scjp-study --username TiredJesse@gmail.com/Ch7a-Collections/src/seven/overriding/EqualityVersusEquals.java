package seven.overriding;

// == versus .equals() 

public class EqualityVersusEquals {

	private int someNum;
	
	public static void main(String[] args) {
		Integer wrapperNumber = 5;
		int primitiveNumber = 5;
		EqualityVersusEquals object = new EqualityVersusEquals();
		EqualityVersusEquals object2 = object;
		EqualityVersusEquals object3 = new EqualityVersusEquals();
		object.someNum = 12;
		object3.someNum = 12;
		
		// == tests if two primitives are equal or two objects are pointing to the same object
		System.out.println("is 5 equal to primitiveNumber? " + (5 == primitiveNumber));
		System.out.println("is object and object 2 pointing to the same object? " +(object == object2));
		
		// .equals() tests if two wrappers are equal or two objects are meaningfully equivalent
		System.out.println("is wrapper5 equal to 5? " + wrapperNumber.equals(5));
		System.out.println("is object and object 3 pointing to the same object? " + (object == object3));
		System.out.println("is object and object 3 meaningfully equivalent? " + (object.equals(object3)));
		
		System.out.println("is wrapper5 equal to 5L? " + wrapperNumber.equals(5L)); // cannot use .equals() to compare different types!
		System.out.println("is wrapper5 equal to 5? " + (wrapperNumber == 5L));
	}
	
	// Overridden equals method
	public boolean equals(Object o) {
		return (o instanceof EqualityVersusEquals) || ((EqualityVersusEquals)o).someNum == someNum;
	}
	
}
