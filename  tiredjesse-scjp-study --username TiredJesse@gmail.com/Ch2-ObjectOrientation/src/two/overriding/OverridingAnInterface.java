package two.overriding;

public class OverridingAnInterface implements OverrideThisInterface {
	
	public static void main(String... args) {
		new OverridingAnInterface().doStuff();
		new OverridingAnInterface().finalArgument(20);
	}

	// To note:
	// Return type Integer is a subclass of Number (legal since Java 5)
	// The exception NumberFormatException is a subclass of IllegalArgumentException
	public Integer doStuff() throws NumberFormatException {
		System.out.println("Doing stuff");
		return 1; 
	}
	
	// The co-variant return check will not work for primitives!
//	public int doSomethingElse() {} // Invalid!
//	public byte doSomethingElse() {} // Invalid!
	public short doSomethingElse() { // Valid!
		return (short) 5;
	}
	
	public void finalArgument(int num) { // Valid don't need to add final modifier
		num++;
	}

}

abstract interface OverrideThisInterface {
	public abstract Number doStuff() throws IllegalArgumentException;
	public short doSomethingElse();
	public void finalArgument(final int num);
}
