package three.overloading;

public class OverloadingMethodsPt2 {
	
	// When overloading the priority is the following:
	// #1 Matches the same exact argument: int -> doSomething(int)
	// #2 If #1 not found, widen the parameter: int -> doSomething(long)
	//   										short -> doSomething(long)
	//    NOT the reverse (unless cast is used) long -> doSomething(int) // Invalid!
	// #3 If #2 not found, box the parameter: int -> doSomething(Integer)
	// #4 If #3 not found, widen the box: int -> Integer -> doSomething(Object)
	//    Cannot widen then box! int -> long -> Long -> doSomething(Long) // Invalid!
	//	  If #4 not found, then look for var-args: int -> doSomething(int...)
	
	public static void main(String overloads[]) {
		doSomething(12);
	}
	
	static void doSomething(long num) {
		System.out.println("long argument");
	}
	
	static void doSomething(int... num) {
		System.out.println("var args argument");
	}
	
	static void doSomething(Integer num) {
		System.out.println("Integer argument");
	}
	
	static void doSomething(Long num) {
		System.out.println("Long argument");
	}
	
	static void doSomething(Object num) {
		System.out.println("Object argument");
	}

}
