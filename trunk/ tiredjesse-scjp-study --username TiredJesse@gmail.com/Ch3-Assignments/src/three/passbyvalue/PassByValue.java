package three.passbyvalue;

// There is only pass by value in Java
// There is NO pass by reference in Java
// When a primitive is passed as a parameter in a method a copy is made

public class PassByValue {

	static int staticNum = 12;
	
	public static void main(String... go) {
		int num = 5;
		
		PassByValue pbv = new PassByValue();
		System.out.println("Before Swap - Static num: " + staticNum + " Local Num: " + num);
		pbv.swap(num, staticNum);
		System.out.println("After Swap - Static num: " + staticNum + " Local Num: " + num);
		
		System.out.println("Before Local Swap - Static num: " + staticNum + " Local Num: " + num);
		int temp = num;
		num = staticNum;
		staticNum = temp;
		System.out.println("After Local Swap - Static num: " + staticNum + " Local Num: " + num);
	}
	
	public void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
}
