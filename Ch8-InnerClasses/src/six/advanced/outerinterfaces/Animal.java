package six.advanced.outerinterfaces;

public interface Animal {
	
	String NAME = "Unknown";
	byte AVG_AGE = -1;
	
	// inner static class
	static class Default {
		String NAME = "Animalia";
		byte AVG_AGE = 30;
		
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
	
	void eat();
	void sleep();
	void play();
	void talk();

}
