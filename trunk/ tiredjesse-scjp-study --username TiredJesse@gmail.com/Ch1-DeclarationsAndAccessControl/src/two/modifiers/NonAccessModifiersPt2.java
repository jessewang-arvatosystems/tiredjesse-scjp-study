package two.modifiers;

public class NonAccessModifiersPt2 {}

// Legal NonAccessModifiers for code inside classes
abstract class CorrectClass{

	final int finalInt = 0;
	static int staticInt = 0;
	final static int finalStaticInt = 0;
	volatile int volatileInt;
	transient int transientInt;
	
	public CorrectClass() {}
	CorrectClass(int one) {}
	protected CorrectClass(int one, int two) {}
	private CorrectClass(int one, int two, int three) {}
	
	abstract void abstractMethod(); // Note in abstract class
	native void nativeMethod(); // Note does not specify body, native can be in a concrete class!
	static void staticMethod(){}	
	strictfp void strictFloatingPointMethod(){}
	synchronized void synchronizedMethod(){}
	
	void finalParameter(final int finalInt){}
	void finalLocalVariable(){
		@SuppressWarnings("unused")
		final int finalInt;
	}
	
}

//Illegal NonAccessModifiers for code inside classes
/*
class IncorrectClass{
	synchronized int synchronizedInt;
	strictfp int strictFloatingPointInt;
	abstract int abstractInt;
	native int nativeInt;
	
	final IncorrectClass(){}
	abstract IncorrectClass(){}
	static IncorrectClass(){}
	volatile IncorrectClass(){}
	transient IncorrectClass(){}
	volatile IncorrectClass(){}
	synchronized IncorrectClass(){}
	strictfp IncorrectClass(){}
	native IncorrectClass(){}
	
	abstract void abstractMethod(); // Not in an abstract class or interface
	volatile void volatileMethod(){}	
	transient void transientMethod(){}
	
	void badParameters(static int staticInt, volatile int volatileInt, transient int transientInt){}
	void badLocalVariables(){
		private int privateInt;
		protected int protectedInt;
		public int publicInt;
		static int staticInt = 0;
		volatile int volatileInt;
		transient int transientInt;
	}
}
*/