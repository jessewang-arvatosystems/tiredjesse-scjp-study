package classes;

class Actor {
	void jump() {
		System.out.println("Leaps to the side!");
	}
}

public class AnonymousClasses {

	public static void main(String[] args) {
		new AnonymousClasses().directActor(new Actor() {
			void jump() {
				System.out.println("Jumps out of a burning building!");
			}
		}); // Very important to note semicolon here
	}
	
	void directActor(Actor actor) {
		actor.jump();
	}
	
}
