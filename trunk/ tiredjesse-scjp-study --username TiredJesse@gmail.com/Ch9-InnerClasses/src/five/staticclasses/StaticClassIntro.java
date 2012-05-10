package five.staticclasses;

// For static classes, the outer class does not need to be instantiated 
// to instantiate the inner class

@SuppressWarnings("unused")
public class StaticClassIntro {
	// Calling an inner static class from another class
	public static void main(String... statics) {
		OuterClass outer = new OuterClass();

		// For non-static classes
		OuterClass.NonStaticInnerClass nonStaticInner = outer.new NonStaticInnerClass();
//		NonStaticInnerClass nonStaticInner2 = outer.new NonStaticInnerClass(); // Invalid type

//		OuterClass.StaticInnerClass staticInner = outer.new StaticInnerClass(); // Can't instantiate a static class
//		OuterClass.StaticInnerClass staticInner = new StaticInnerClass(); // Can't find class
		OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
//		StaticInnerClass staticInner2 = new OuterClass.StaticInnerClass(); // Invalid type

		OuterClass.StaticInnerClass.AnotherStaticInnerClass innerStaticInner = new OuterClass.StaticInnerClass.AnotherStaticInnerClass();
	}

}

@SuppressWarnings("unused")
class OuterClass {

	// Calling an inner static class from the outer class
	public static void main(String[] args) {
		NonStaticInnerClass nonStaticClass = new OuterClass().new NonStaticInnerClass();
		
		// Static classes have the same notation as calling another class!
		StaticInnerClass staticClass = new StaticInnerClass();
		StaticClassIntro anotherClass = new StaticClassIntro();
	}

	class NonStaticInnerClass {

	}

	static class StaticInnerClass {
		static class AnotherStaticInnerClass {

		}
	}
}
