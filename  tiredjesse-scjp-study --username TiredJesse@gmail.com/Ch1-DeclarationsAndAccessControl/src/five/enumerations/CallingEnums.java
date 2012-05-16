package five.enumerations;

public class CallingEnums {
	
	enum Animal {
		MONKEY,
		GIRAFFE,
		HORSE,
		DOLPHIN;
	}
	
	static Animal a;
	Animal b;
	
	public static void main(String... args) {
		a = a.HORSE; // Valid, but not good syntax, should access statically
		a = new CallingEnums().b.DOLPHIN; // Same comment as last line
		Animal[] animals = {Animal.MONKEY, Animal.DOLPHIN, Animal.MONKEY, a};
		
		for(Animal a : animals) {
			System.out.println(a); // Print animals in array
		}
		
		System.out.printf("\n");
		
		for(Animal a : Animal.values()) {
			System.out.println(a); // Print animals in enum
		}
	}

}