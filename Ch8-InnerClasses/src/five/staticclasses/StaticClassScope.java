package five.staticclasses;

// For static classes, the outer class does not need to be instantiated 
// to instantiate the inner class

public class StaticClassScope {

	int outerNumber = 12;
	
	static class SomeStaticInnerClass {
		
		public int doStuff() {
//			return outerNumber; // can't see outerNumber
			return new StaticClassScope().outerNumber;
		}
	}
	
}
