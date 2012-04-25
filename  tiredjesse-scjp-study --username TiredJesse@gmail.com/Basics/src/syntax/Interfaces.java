package syntax;

//An interface is already abstract unnecessary but legal modifier
//any modifier other than public or abstract is illegal
public abstract interface Interfaces {}

interface SampleInterface extends Interfaces {
	
	//All local variables have the same access and non-access modifiers
	int num = 0;
	public int num2 = 0;
	final int num3 = 0;
	static int num4 = 0;
	public final static int num5 = 0;
	
	//Same goes with methods
	void method1();
	public void method2();
	abstract void method3();
	public abstract void method4();
	
	//Note the modifiers of these variables and methods CANNOT be changed
	/*
	private int badNum = 0;
	volatile int badNum2 = 0;
	
	final void badMethod();
	synchronized void badMethod2();
	*/
}