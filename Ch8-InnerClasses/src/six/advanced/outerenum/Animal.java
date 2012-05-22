package six.advanced.outerenum;

public enum Animal {

	INSTANCE;
	
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
	
	interface Actions {
		String NAME = "Animal Actions";
		byte AVG_AGE = 123;
		
		void eat();
		void sleep();
		void play();
		void talk();
	}
	
}