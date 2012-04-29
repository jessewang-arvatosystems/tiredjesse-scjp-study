package four.staticmodifier;

@SuppressWarnings("static-access")
public class StaticMethods {

	public static void main(String insideStaticMethod []) {
		
//		nonStaticMethodStop(); // Illegal move. Must instantiate object before using non-static method/variables
		new StaticMethods().nonStaticMethodStop(); // Legal!
		
		// Legal but pointless, compiler translates to StaticMethods.staticMethodGo();
		new StaticMethods().staticMethodGo();
		
		StaticMethods.staticMethodGo(); // Valid! Since we're inside the class where the method was declared...
		staticMethodGo(); // This works as well!
	}
	
	static void staticMethodGo() {
		System.out.println("I'm static and I'm grooving!");
	}
	
	void nonStaticMethodStop() {
		System.out.println("I'm not static, I can't be used until someone calls a new instance of StaticMethods!");
	}
}
