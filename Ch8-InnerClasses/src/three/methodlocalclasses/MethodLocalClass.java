package three.methodlocalclasses;

public class MethodLocalClass {
	
	public static void main(String... go) {
		new MethodLocalClass().doStuff();
	}
	
	void doStuff() {
		// Note order matters!
		// This will not compile, InMethodClass not defined yet
//		InMethodClass inner = new InMethodClass();
//		inner.go();
		
		class InMethodClass {
			void go() {
				System.out.println("Running MethodLocalClass");
			}
		}
		
		InMethodClass inner = new InMethodClass();
		inner.go();
	}
}
