package four.blocks;

// Anonymous blocks run each time an object of the class is initiated
// Anonymous blocks run after static blocks and before constructors

public class AnonymousBlocks extends AnotherAnonymousBlock {
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Anonymous block");
	}
	
	AnonymousBlocks() {
		System.out.println("Constructor");
	}
	
	public static void main(String... statics) {
		new AnonymousBlocks();
		new AnonymousBlocks();
	}

}

class AnotherAnonymousBlock {
	
	static {
		System.out.println("Another static block");
	}
	
	{
		System.out.println("Another anonymous block");
	}
	
}
