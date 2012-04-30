package two.overriding;

/**
 * @see Actor in this same package, then see two.overriding.access.OverridingAClass
 */

public class GoodActor extends Actor {
	
	public String saySomething() {
		return "Good Morning!";
	}
	
	// Changed access modifier from protected to public 
	public Double doStunt() throws NumberFormatException {
		System.out.println("Good Actor is leaping out of a burning building!");
		return 3.0;
	}
}
