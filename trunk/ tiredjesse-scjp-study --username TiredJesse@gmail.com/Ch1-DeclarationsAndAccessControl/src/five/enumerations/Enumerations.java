package five.enumerations;

// Enums can only implement Interfaces
// Since an enum is NOT a class, cannot extend a class nor be extended upon!
enum OuterEnum implements Messenger {
	ONE("constant one");
	
	private String msg;
	
	private OuterEnum(String msg) {
		setMsg(msg);
	}
	
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
} 

public class Enumerations {
	enum InnerEnum implements Messenger{
		TWO("constant two") {
			@Override
			public String toString() {
				return "overridden msg";
			}

		},
		THREE("constant three");
		
		private String msg;
		
		private InnerEnum(String msg) {
			setMsg(msg);
		}

		@Override
		public void setMsg(String msg) {
			this.msg = msg;
		}
		
		@Override
		public String toString() {
			return msg;
		}
	}; // Semicolon is optional
	
	void someMethod() {
		// Enums cannot be declared in methods
//		enum BadEnum {
//			
//		}
	}
	
	public static void main(String[] args) {
		System.out.println(OuterEnum.ONE); // constant one
		System.out.println(InnerEnum.TWO); // overridden msg
		System.out.println(InnerEnum.THREE); // constant three
	}
}

interface Messenger {
	public abstract String toString();
	void setMsg(String msg); // Note still public and abstract just not mentioned
}