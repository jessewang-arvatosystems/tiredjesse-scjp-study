package one.introduction;

public class Encapsulation {}

// Encapsulation helps hides implementation behind an interface or API

// IE:
@SuppressWarnings("unused")
class WellEncapsulatedClass {
	private String name; // Member variable(s) set to private
	
	private void doOnlyInThisClass() {
		System.out.println("Do private method stuff");
	}
	
	// Uses setters and getters to access private members
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
}