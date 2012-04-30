package two.overriding;

/**
 * @see GoodActor in this same package, then see two.overriding.access.OverridingAClass
 */

public class Actor {
	
	public String saySomething() {
		return "Hello World!";
	}
	
	protected Number doStunt() throws IllegalArgumentException {
		System.out.println("Actor is doing nothing");
		return 5;
	}
}

