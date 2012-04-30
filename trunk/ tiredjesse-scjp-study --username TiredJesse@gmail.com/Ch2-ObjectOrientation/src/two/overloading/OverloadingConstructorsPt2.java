package two.overloading;

public class OverloadingConstructorsPt2 {
	OverloadingConstructorsPt2() {
		System.out.println("Running parent class constructor");
	}
	
	public static void main(String ... args) {
		System.out.print("No Constructor: ");
		new NoConstructor();
		
		System.out.print("Empty Constructor: ");
		new EmptyConstructor();
		
		System.out.print("Parameter in Constructor: ");
		new ParameterInConstructor("Hello World!");
		
		System.out.print("Child Parameter in Constructor: ");
		new ParameterInConstructor("Hello Everyone!");
	}
}

// Note super() is never noted, but compiler does it automatically
class NoConstructor extends OverloadingConstructorsPt2 {}

class EmptyConstructor extends OverloadingConstructorsPt2 {
	EmptyConstructor() {} // Same as NoConstructor's constructor
}

class ParameterInConstructor extends OverloadingConstructorsPt2 {
	ParameterInConstructor(String msg) {
		System.out.println(msg);
	}
}

class ChildOfParameterConstructor extends ParameterInConstructor {
	// Must call super()!
	ChildOfParameterConstructor(String msg) {
		super(msg);
	}
}

