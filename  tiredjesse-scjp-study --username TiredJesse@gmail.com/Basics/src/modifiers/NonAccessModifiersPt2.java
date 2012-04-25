package modifiers;

public class NonAccessModifiersPt2 {}

//Legal NonAccessModifiers for code inside classes
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
	static IncorrectClass(int one){}
	volatile IncorrectClass(int one, int two){}
	transient IncorrectClass(int one, int two, int three){}
	volatile IncorrectClass(int one, int two, int three, int four){}
	synchronized IncorrectClass(int one, int two, int three, int four, int five){}
	strictfp IncorrectClass(int one, int two, int three, int four, int five, int six){}
	native IncorrectClass(int one, int two, int three, int four, int five, int six, int seven){}
	
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