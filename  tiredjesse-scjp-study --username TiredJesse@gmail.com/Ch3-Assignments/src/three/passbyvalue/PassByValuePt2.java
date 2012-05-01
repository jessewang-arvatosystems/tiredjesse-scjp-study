package three.passbyvalue;

// The work-around is to pass an OBJECT and change the object's properties

public class PassByValuePt2 {

	static int staticNum = 12;
	int num = 5;
	
	public static void main(String... go) {
		
		PassByValuePt2 pbv = new PassByValuePt2();
		System.out.println("Before Swap - Static num: " + staticNum + " Local Num: " + pbv.getNum());
		betterSwap(pbv);
		System.out.println("After Swap - Static num: " + staticNum + " Local Num: " + pbv.getNum());
		
	}
	
	public static void betterSwap(PassByValuePt2 object) {
		int temp = object.getNum();
		object.setNum(PassByValuePt2.staticNum);
		PassByValuePt2.staticNum = temp;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
