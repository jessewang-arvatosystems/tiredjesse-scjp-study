package six.advanced.outerenum;

public class Dog extends Animal.Default implements Animal.Actions {
	
	public static void main(String[] args) {
		Animal.Default dog1 = new Dog();
		Animal.Actions dog2 = new Dog();
		Dog dog3 = new Dog();
		
		System.out.println("Dog 1: Type Animal.Default (Class)");
		System.out.printf("Name is: %s\n", dog1.NAME);
		System.out.printf("Age is: %s\n", dog1.AVG_AGE);
		dog1.eat();
		dog1.play();
		dog1.sleep();
		dog1.talk();
		
		System.out.println("\nDog 2: Type Animal.Default (Interface)");
		System.out.printf("Name is: %s\n", Animal.Actions.NAME);
		System.out.printf("Age is: %s\n", Animal.Actions.AVG_AGE);
		dog2.eat();
		dog2.play();
		dog2.sleep();
		dog2.talk();
		
		System.out.println("\nDog 3: Type Dog (Class)");
		// Ambiguous, can't tell whether to use the interface variables or default class variables
//		System.out.printf("Name is: %s\n", dog3.NAME);
//		System.out.printf("Age is: %s\n", dog3.AVG_AGE);
		dog3.eat();
		dog3.play();
		dog3.sleep();
		dog3.talk();	
	}

}
