package two.otheroperators;

public class IncrementAndDecrement {
	public static void main(String... numbers) {
		int x = 5;
		int y = 5;
		int a = 5;
		int b = 5;
		
		//Pre-increment, add one to 'a'
		System.out.println("x is : " + x);
		System.out.println("++x is : " + ++x + "\n");
		
		//Pre-decrement, subtract one from 'b'
		System.out.println("y is : " + y);
		System.out.println("--y is : " + --y + "\n");
		
		//Pre-increment, add one to 'a' the next time it is called
		System.out.println("a is : " + a);
		System.out.println("a++ is : " + a++);
		System.out.println("a is : " + a + "\n");
		
		//Post-decrement, subtract one from 'b' the next time it is called
		System.out.println("b is : " + b);
		System.out.println("b-- is : " + b--);
		System.out.println("b is : " + b);
	}

}
