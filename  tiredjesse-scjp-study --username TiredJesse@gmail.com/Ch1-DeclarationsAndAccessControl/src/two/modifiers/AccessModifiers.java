package two.modifiers;

@SuppressWarnings("unused")
public class AccessModifiers {
	
	private void privateMethod() {}
	protected void protectedMethod() {}
	void defaultMethod() {}
	public void publicMethod() {}
	
}

class DefaultAccess {
	
	public int num;
	public static int staticNum;
	public void doStuff() {};
	public static void doStaticStuff() {}
	
}

@SuppressWarnings("unused")
class TestAccess extends AccessModifiers {
	
	private void someMethod() {
//		privateMethod(); // Illegal access!
		defaultMethod();
		protectedMethod();
		publicMethod();
	}
	
	/**
	 * @see continued in two.modifiers.access.AccessModifiersPt2
	 */
}