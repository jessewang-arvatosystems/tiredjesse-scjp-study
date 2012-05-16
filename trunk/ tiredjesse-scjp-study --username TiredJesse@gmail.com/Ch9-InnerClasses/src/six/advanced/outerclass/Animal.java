package six.advanced.outerclass;

public class Animal {
	
	String NAME = "Unknown";
	byte AVG_AGE = -1;
	
	interface Default {
		String NAME = "Animalia";
		byte AVG_AGE = 30;
		
		public void eat();
		public void sleep();
		public void play();
		public void talk();
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		System.out.println("Sleeping");
	}
	public void play() {
		System.out.println("Playing");
	}
	public void talk() {
		System.out.println("Talking");
	}

}
