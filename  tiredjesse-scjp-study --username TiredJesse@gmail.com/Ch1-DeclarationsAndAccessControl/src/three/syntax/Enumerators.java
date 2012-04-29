package three.syntax;

// Enums can only implement Interfaces
// Since an enum is NOT a class, cannot extend a class nor be extended upon!
enum OuterEnum implements Messenger {
	ONE("constant one");
	
	private String msg;
	
	private OuterEnum(String msg) {
		setMsg(msg);
	}
	
	@Override
	public String getMsg() {
		return msg;
	}
	
	@Override
	public void setMsg(String msg) {
		this.msg = msg;
	}
} 

public class Enumerators {
	enum InnerEnum implements Messenger{
		TWO("constant two") {
			@Override
			public String getMsg() {
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
		public String getMsg() {
			return msg;
		}
	}; // Semicolon is optional
	
	public static void main(String[] args) {
		System.out.println(OuterEnum.ONE.getMsg()); // constant one
		System.out.println(InnerEnum.TWO.getMsg()); // overridden msg
		System.out.println(InnerEnum.THREE.getMsg()); // constant three
	}
}

interface Messenger {
	public abstract String getMsg();
	void setMsg(String msg); // Note still public and abstract just not mentioned
}