package five.covariantreturns;

// As of Java 5, returns can be covariant.
// This means that a child of a class can be returned.
// However, this case is not the same when Generics are involved.

public class CovariantReturns {

	public static void main(String[] args) {
		
		System.out.println("Getting parent");
		getPerson(People.PARENT);
		System.out.println("Parent retrieved");
		
		System.out.println("Getting son");
		getPerson(People.SON);
		System.out.println("Parent son");		
		
		System.out.println("Getting grandson");
		getPerson(People.GRANDSON);
		System.out.println("Grandson retrieved");
	}
	
	static Parent getPerson(People p) {
		switch (p) {
			case PARENT: return new Parent();
			case SON: return new Son();
			case GRANDSON: return new Grandson();
			default: return null;
		}
	}
	
	static Grandson getGrandson() {
//		return new Parent(); // Compilation failure
//		return new Child(); // Compilation failure
		return new Grandson();
	}
	
}

class Parent {}
class Son extends Parent {}
class Grandson extends Son {}

enum People {
	PARENT,
	SON,
	GRANDSON;
}