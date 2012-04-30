package two.overriding.access;

import two.overriding.Actor;
import two.overriding.GoodActor;

/**
 * @see Actor and GoodActor classes in two.overriding package, before looking at this class
 */

public class OverridingAClass {
	public static void main(String args[]) {
		Actor plainActor = new Actor();
		Actor polyActor = new GoodActor();
		GoodActor goodActor = new GoodActor();
		
		System.out.println(plainActor.saySomething()); // Hello World!
		System.out.println(polyActor.saySomething()); // Good Morning! (Polymorphism)
		System.out.println(goodActor.saySomething()); // Good Morning!
		
//		plainActor.doStunt(); // Invalid, since Actor's doStunt() is protected
//		polyActor.doStunt(); // Looks like it will work b/c of polymorphism but doesn't!
						 	 // The compiler looks to the Actor's doStunt() before the GoodActor's doStunt()
		goodActor.doStunt(); // Valid!
	}
}
