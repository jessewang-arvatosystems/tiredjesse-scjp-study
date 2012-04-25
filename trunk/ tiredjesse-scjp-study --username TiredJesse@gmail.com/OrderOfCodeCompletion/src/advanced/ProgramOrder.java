package advanced;

public class ProgramOrder {

	public static void main(String[] args) {
		new ClassC();
		System.out.printf("\n");
		new ClassC(); // Notice static only runs once!
	}
	
}

class ClassA {
	static { System.out.println("Static block a"); }
	
	{ System.out.println("Anonymous block a"); }
	
	ClassA () { System.out.println("Constructor a"); }
}

class ClassC extends ClassB {
	static { System.out.println("Static block c"); }
	
	{ System.out.println("Anonymous block c"); }
	
	ClassC () { System.out.println("Constructor c"); }
}

class ClassB extends ClassA {
	static { System.out.println("Static block b"); }
	
	{ System.out.println("Anonymous block b"); }
	
	ClassB () { System.out.println("Constructor b"); }
}
