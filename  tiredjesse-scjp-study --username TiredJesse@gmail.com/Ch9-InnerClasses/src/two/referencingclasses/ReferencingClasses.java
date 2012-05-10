package two.referencingclasses;

public class ReferencingClasses {
	public static void main(String[] args) {
		new OuterClass().new InnerClass().referencingStuff();
	}
}


class OuterClass {
	private String msg = "Outer variable";
	
	String doStuff() {
		return "Outer stuff";
	}
	
	@Override
	public String toString() {
		return "Outer Object";
	}
	
	class InnerClass {
		private String msg = "Inner variable";
		
		String doStuff() {
			return "Inner stuff";
		}
		
		@Override
		public String toString() {
			return "Inner Object";
		}
		
		// Has to be done in a non-static context
		void referencingStuff() {
			System.out.printf("Outer object: %s\n", OuterClass.this);
			System.out.printf("Outer variable: %s\n", OuterClass.this.msg);
			System.out.printf("Outer method: %s\n", OuterClass.this.doStuff());
			System.out.printf("Inner object: %s\n", this); // or InnerClass.this
			System.out.printf("Inner variable: %s\n", msg); // or this.msg
			System.out.printf("Inner method: %s\n", doStuff()); // or this.doStuff()
		}
		
		
	}
	
}