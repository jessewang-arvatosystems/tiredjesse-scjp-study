package one.introduction;

// "import static" removes need to declare System prefix in .out.println()
import static java.lang.System.out;	

public class BetterHelloWorld {
	
	// When class is declared, static blocks run first
	static {
		out.print("New ");
	}
	
	// Anonymous blocks runs after static blocks and before constructors
	{
		out.print("and ");
	}
	
	// Constructors run after anonymous blocks
	// "private" blocks this class from being instantiated from outside
	private BetterHelloWorld() {
		out.print("improved ");
		sayHelloWorld();
	}
	
	// "..." is a var-arg, valid syntax for JRE 1.5 and after
	public static void main(String... betterWorld) { 
		new BetterHelloWorld();
	}
	
	// "final" blocks the overriding of this method
	private final void sayHelloWorld() { 
		out.println("Hello World!");
	}
	
}
