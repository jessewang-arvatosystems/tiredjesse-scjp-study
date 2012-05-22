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
		// Everything will compile, those that are commented out will throw an IllegalFormatConversionException
		System.out.format("Boolean Test1 is: %b\n", b);
		System.out.printf("Boolean Test2 is: %b\n", b);
		
		// Any non boolean value will also work and will return true
		System.out.printf("Boolean Test3 is: %b\n", c); 
		System.out.printf("Boolean Test4 is: %b\n", i); 
		System.out.printf("Boolean Test5 is: %b\n", f); 
		System.out.printf("Boolean Test6 is: %b\n", s); 
		System.out.printf("Boolean Test7 is: %b\n\n", 0); 
		
//		System.out.printf("Char Test1 is: %c\n", b); 
		System.out.printf("Char Test2 is: %c\n", c);
		System.out.printf("Char Test3 is: %c\n\n", i); // Works since numbers can be converted to chars. Works up to 65535
//		System.out.printf("Char Test4 is: %c\n", f); 
//		System.out.printf("Char Test5 is: %c\n", s);
//		System.out.printf("Char Test6 is: %c\n", "a"); 

//		System.out.printf("Int Test1 is: %d\n", b);
//		System.out.printf("Int Test2 is: %d\n", c); 
		System.out.printf("Int Test3 is: %d\n\n", i);
//		System.out.printf("Int Test4 is: %d\n", f); 
//		System.out.printf("Int Test5 is: %d\n", s); 
		
//		System.out.printf("Float Test1 is: %f\n", b);
//		System.out.printf("Float Test2 is: %f\n", c);
//		System.out.printf("Float Test3 is: %f\n", i); // Will not work for ints
		System.out.printf("Float Test4 is: %f\n\n", f);
//		System.out.printf("Float Test4 is: %f\n", s);
		
		System.out.printf("String is: %s\n", b);
		System.out.printf("String is: %s\n", c);
		System.out.printf("String is: %s\n", i);
		System.out.printf("String is: %s\n", f);
		System.out.printf("String is: %s\n\n", s);
		
		int noOne = 111;
		int noTwo = 222;
		// In the order that you label the parameters
		System.out.printf("Num one is: %d, Num two is: %d\n", noOne, noTwo); 
		
		// For more control use %#$d
		System.out.printf("Num two is: %2$d, Num one is: %1$d\n", noOne, noTwo); 
	}

}
