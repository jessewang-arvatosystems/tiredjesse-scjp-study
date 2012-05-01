package one.introduction;

public class Scope {
	private static int staticVariable = 5;
	private int instanceVariable;
	
	public static void main(String... scopeTester) {
		Scope s1 = new Scope();
		s1.instanceVariable = 12;
		Scope.staticVariable = 30;
		
		Scope s2 = new Scope();
		System.out.println("Main - Instance Variable: " + s2.instanceVariable);
		System.out.println("Main - Static Variable: " + Scope.staticVariable);
//		System.out.println("Main - Local Variable " + localVariable); // Out of scope
//		System.out.println("Main - Block Variable " + blockVariable); // Out of scope
		s2.go();
	}
	
	public void go() {
		int localVariable = 10;
		for (int blockVariable = 20; blockVariable == 20; blockVariable++) {
			System.out.println("Inside go() - Block Variable " + blockVariable);
			System.out.println("Inside go() - Instance Variable: " + instanceVariable);
			System.out.println("Inside go() - Static Variable: " + Scope.staticVariable);
			System.out.println("Inside go() - Local Variable " + localVariable);
		}
//		System.out.println("Outside go() - Block Variable " + blockVariable); // Out of scope
		System.out.println("Outside go() - Instance Variable: " + instanceVariable);
		System.out.println("Outside go() - Static Variable: " + Scope.staticVariable);
		System.out.println("Outside go() - Local Variable " + localVariable);
	}
}
