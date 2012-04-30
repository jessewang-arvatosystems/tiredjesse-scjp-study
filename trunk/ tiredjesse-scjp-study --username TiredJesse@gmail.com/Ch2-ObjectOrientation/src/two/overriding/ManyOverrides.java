package two.overriding;

public class ManyOverrides extends C {
	public static void main(String arg[]) {
		ManyOverrides go = new ManyOverrides();
		go.doStuff(); // Runs the method of the nearest override!
		go.doOriginalStuff(); // Force the method to find the original method
	}
}

class A {
	void doStuff() {
		System.out.println("A");
	}
}

class B extends A {
	void doStuff() {
		System.out.println("B");
	}
	
	void doOriginalStuff() {
		super.doStuff(); // Call class A's doStuff()
	}
}

class C extends B {
	void doOriginalStuff() {
		System.out.println("Overriding doOriginalStuff()");
		super.doOriginalStuff(); // Valid! Call the parent's doOriginalStuff()
//		super.super.doStuff(); // Invalid! Can't call a super's super
	}
}
