package one.introduction;

public class InnerClassTutorial {

	public static void main(String... intro) {
		// Calling InnerClass from another class
		// Version #1
		// Instantiate outer class, then use outer object to instantiate inner class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		outer.outerMethod();
//		inner.outerMethod(); // Won't compile, inner class not aware of OuterMethod()
		inner.innerMethod();
//		outer.innerMethod(); // Won't compile, outer class not aware of InnerMethod()
		
		// Version #2
		// Instantiate anonymous outer class, then use outer object to instantiate inner class
		OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
		
//		inner2.outerMethod();
		inner2.innerMethod();
	}
	
}

class OuterClass {	
	void outerMethod() {
		@SuppressWarnings("unused")
		InnerClass in = new InnerClass(); // Valid. Since InnerClass is local to OuterClass,
										  // InnerClass can be instantiated without an OuterClass object
	}
	
	class InnerClass {
		void innerMethod() {}
	}
}