package seven.overriding;

public class OverridingToString {
	
	public static void main(String override[]) {
		// No override toString()
		System.out.println(new House());
		
		// Overrides toString()
		System.out.println(new Car());
	}

}

class House {}

class Car {
	public String toString() {
		return "This is a car object";
	}
}