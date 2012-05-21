package six.exceptions;

public class OverridingMethodsWithExceptions {

	public static void main(String... exceptions) {
		Child c = new Child();
		c.doStuff(); // Okay, don't need to catch or throw exception
		
		Parent p = new Parent();
		try {
			p.doStuff(); // Need to catch/throw exception
		} catch (Exception e) {}
		
		Parent p2 = new Child();
		try {
			p2.doStuff(); 	// Need to catch/throw exception
							// p2 looks at the Parent.doStuff() first, before looking at the Child.doStuff()
		} catch (Exception e) {}
		
	}
}

class Parent {
	void doStuff() throws Exception {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void doStuff() {
		System.out.println("Child");
	}
}
