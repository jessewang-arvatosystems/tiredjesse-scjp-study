package one.introduction;

public class Polymorphism {}

// Polymorphism allows a reference variable to refer to a subtype of its' object
// This feature is seen when a subclass overrides its' superclass' method
// The REFERENCE type not the OBJECT type determines which methods can be called

// IE:
class Building {
	private int sqFeet = 10000;
	
	int getSqFeet() {
		System.out.println("Getting generic building's square footage");
		return sqFeet;
	}
}

class House extends Building {
	private int sqFeet = 2000;
	
	int getSqFeet() {
		System.out.println("Getting house's square footage");
		return sqFeet;
	}
	
	void somethingBuildingsCantDo() {
		System.out.println("For Houses only!");
	}
	
	public static void main(String... args) {
		Building building = new Building();
		Building house = new House();
		House goodOldHouse = new House();
		
		System.out.println("Building's sq feet: " + building.getSqFeet());
		System.out.println("House's sq feet: " + house.getSqFeet());
		
//		building.somethingBuildingsCantDo(); // Doesn't work!
//		house.somethingBuildingsCantDo(); // Method not found in Building so doesn't work!
		goodOldHouse.somethingBuildingsCantDo();
	}
	
}
