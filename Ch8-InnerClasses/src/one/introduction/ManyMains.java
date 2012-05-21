package one.introduction;

public class ManyMains {

	public static void main(String[] args) {
		new ManyMains().new A().main(args);
		new ManyMains().new B().main(args);
		new ManyMains().new C().main(args);
	}
	
	// Invalid code
	// Cannot have a static main method in an inner class
	// Can have a non-static main method, but is just a regular
	// method declaration, not calling the actual main() that runs the program

	public class A {
		// public static void main(String[] args) {
		// }
		public void main(String[] args) {
			System.out.println("A");
		}
	}

	public class B {
		// public static void main(String[] args) {
		// }
		public void main(String[] args) {
			System.out.println("B");
		}
	}

	public class C {
		// public static void main(String[] args) {
		// }
		public void main(String[] args) {
			System.out.println("C");
		}
	}

}
