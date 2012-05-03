package six.printf;

public class BasicPrintf {
	
	public static void main(String... args) {
		boolean b = false;
		char c = 'a';
		int i = 123;
		float f = 12.3f;
		String s = "Hello World";
		
		// Note format is the same exact thing as printf
		// I'm using printf because it is found in other languages like C++
		System.out.format("Boolean is: %b\n", b);
		
		System.out.printf("Boolean is: %b\n", b);
		System.out.printf("Char is: %c\n", c);
		System.out.printf("Int is: %d\n", i);
		System.out.printf("Float is: %f\n", f);
		System.out.printf("String is: %s\n", s);
		
		int noOne = 111;
		int noTwo = 222;
		// In the order that you label the parameters
		System.out.printf("Num one is: %d, Num two is: %d\n", noOne, noTwo); 
		
		// For more control use %#$d
		System.out.printf("Num two is: %2$d, Num one is: %1$d\n", noOne, noTwo); 
	}

}
