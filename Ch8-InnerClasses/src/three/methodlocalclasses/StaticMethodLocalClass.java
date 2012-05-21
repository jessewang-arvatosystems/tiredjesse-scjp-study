package three.methodlocalclasses;

public class StaticMethodLocalClass {
	
	int outerNonStaticNum = 123;
	static int outerStaticNum = 2435;
	
	public static void main(String... go) {
		StaticMethodLocalClass.doStuff();
	}
	
	@SuppressWarnings("unused")
	static void doStuff() {
		int innerNonFinalNum = 5;
		final int innerFinalNum= 10;
		
		class InMethodClass {
			void go() {
//				System.out.printf("Inner non-final variable, %d\n", innerNonFinalNum); // Required num to be final!
				System.out.printf("Inner final variable, %d\n", innerFinalNum);
//				System.out.printf("Outer non-static variable, %d\n", outerNonStaticNum); // Needs to be static
				System.out.printf("Outer static, %d\n", outerStaticNum);
			}
		}
		
		InMethodClass inner = new InMethodClass();
		inner.go();
	}
}
