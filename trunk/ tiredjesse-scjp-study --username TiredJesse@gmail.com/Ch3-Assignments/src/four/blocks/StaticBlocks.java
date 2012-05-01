package four.blocks;

// Static blocks run when the class is loaded
// Static blocks only run once!

public class StaticBlocks extends AnotherStaticBlock {
	
	static {
		System.out.println("Static block");
	}
	
	public static void main(String... statics) {
		// new StaticBlocks() not necessary to run static blocks, 
		// this is used to demonstrate that they only run once
		new StaticBlocks();
		new StaticBlocks();
	}

}

class AnotherStaticBlock {
	
	static {
		System.out.println("Another static block");
	}
	
}
