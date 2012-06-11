package six.advanced.outerabstractclass;

public class Dog extends Animal {

	private Default defaultActions;
	
	Dog() {
		defaultActions = new Default();
	}
	
	public static void main(String[] args) {
		Animal dog1 = new Dog();
		Dog dog2 = new Dog();
		
		System.out.println("Dog 1: Type Animal (Abstract Class)");
		System.out.printf("Name is: %s\n", dog1.NAME);
		System.out.printf("Age is: %s\n", dog1.AVG_AGE);
		dog1.eat();
		dog1.play();
		dog1.sleep();
		dog1.talk();
		
		System.out.println("\nDog 2: Type Dog (Class)");
		System.out.printf("Name is: %s\n", dog2.NAME);
		System.out.printf("Age is: %s\n", dog2.AVG_AGE);
		dog2.eat();
		dog2.play();
		dog2.sleep();
		dog2.talk();
		
	}

	@Override
	public void eat() {
		defaultActions.eat();
	}

	@Override
	public void sleep() {
		defaultActions.sleep();
	}

	@Override
	public void play() {
		defaultActions.play();
	}

	@Override
	public void talk() {
		defaultActions.talk();
	}

}
