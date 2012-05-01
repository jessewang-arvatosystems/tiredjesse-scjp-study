package three.overloading;

public class OverloadingConstructors {
	
	OverloadingConstructors() {
		super(); // Call the parent's constructor (Object class in this case) 
				 // Compiler automatically does this if the Parent class has NO parameters in its' constructor
				 // See next part for more details
	}
	
	OverloadingConstructors(int num) {
		System.out.println(num);
	}
	
	OverloadingConstructors(String word) { 
		System.out.println(word);
	}
	
	OverloadingConstructors(int oneNo, int twoNo) {
		this(oneNo + twoNo); // Call the OverloadingConstructors(int num)
	}
	
	
	public static void main(String[] args) {
		System.out.println("Empty constructor");
		new OverloadingConstructors();
		
		System.out.print("One number: ");
		new OverloadingConstructors(1);
		
		System.out.print("One word: ");
		new OverloadingConstructors("hello");
		
		System.out.print("Two numbers: ");
		new OverloadingConstructors(3,4);
	}

}