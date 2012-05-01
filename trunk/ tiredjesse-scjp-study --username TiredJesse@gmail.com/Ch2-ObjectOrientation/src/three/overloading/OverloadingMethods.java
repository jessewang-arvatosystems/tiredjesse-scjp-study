package three.overloading;

public class OverloadingMethods {
	
	public static void main(String overloads[]) {
		doSomething();
		doSomething("12");
		doSomething(12);
	}
	
	// Static was used only for convenience's sake
	static void doSomething() {
		System.out.println("No arguments");
	}
	
	static void doSomething(String msg) {
		System.out.println("String argument");
	}
	
	static void doSomething(int num) {
		System.out.println("int argument");
	}

}
