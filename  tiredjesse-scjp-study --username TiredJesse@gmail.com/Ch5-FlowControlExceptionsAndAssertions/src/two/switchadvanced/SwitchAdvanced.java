package two.switchadvanced;

@SuppressWarnings("unused")
public class SwitchAdvanced {

	public static void main(String... args) {
		boolean bool1 = false;
		char c1 = 'a';
		byte b1 = 0;
		short s1 = 0;
		int i1 = 0;
		long l1 = 0;
		float f1 = 0;
		double d1 = 0;
		String str1 = "hello";
		SomeEnum anEnum = SomeEnum.A;
		
		Character bigC1 = new Character('a');
		Byte bigB1 = 5;
		Short bigS1 = new Short("123");
		Integer bigI1 = Integer.valueOf(512);
		Number number = 123;
		
//		switch(bool1){} // Invalid!
		switch(c1){}
		switch(b1){}
		switch(s1){}
		switch(i1){}
//		switch(l1){} // Invalid!
//		switch(f1){} // Invalid!
//		switch(d1){} // Invalid!
//		switch(str1){} // Invalid!
		switch(anEnum) {}
		switch(bigC1) {}
		switch(bigB1) {}
		switch(bigS1) {}
		switch(bigI1) {}
//		switch(number) {} // Invalid!
		
		switch(b1) {
			case 1: System.out.println("in range"); 
					break; 
//			case 128: System.out.println("out of range"); // Invalid! Exceeds byte's range
//					break;
		}
	}
}

enum SomeEnum {
	A;
}