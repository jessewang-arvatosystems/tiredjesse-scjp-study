package two.switchadvanced;

@SuppressWarnings("unused")
public class SwitchAdvanced {

	final static Byte CONST_BYTE = 2;
	final static Short CONST_SHORT = 3;
	final static Character CONST_CHAR = 'A';
	final static Integer CONST_INT = 2;
	
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
		switch(c1){ case 'a' : break; }
		switch(b1){ case 0 : break; }
		switch(s1){ case 0 : break; }
		switch(i1){ case 0 : break; }
//		switch(l1){ case 0 : break; } // Invalid!
//		switch(f1){ case 0 : break; } // Invalid!
//		switch(d1){ case 0 : break; } // Invalid!
//		switch(str1){ case "hello" : break; } // Invalid!
		switch(anEnum) { case A : break; }
		switch(bigC1) {} // {case CONST_CHAR : break;} // Cannot have wrapper constants!
		switch(bigB1) {} // {case CONST_BYTE : break;}
		switch(bigS1) {} // {case CONST_SHORT : break;}
		switch(bigI1) {} // {case CONST_INT : break;}
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