package three.syntax;

enum OuterEnum{
	ONE("constant one");
	
	private String msg;
	
	private OuterEnum(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
} 

public class Enumerators {
	enum InnerEnum{
		TWO("constant two") {
			public String getMsg() {
				return "overridden msg";
			}
		};
		
		private String msg;
		
		private InnerEnum(String msg) {
			this.msg = msg;
		}
		
		public String getMsg() {
			return msg;
		}
	}; // Semicolon is optional
	
	public static void main(String[] args) {
		System.out.println(OuterEnum.ONE.getMsg()); // constant one
		System.out.println(InnerEnum.TWO.getMsg()); // overridden msg
	}
}