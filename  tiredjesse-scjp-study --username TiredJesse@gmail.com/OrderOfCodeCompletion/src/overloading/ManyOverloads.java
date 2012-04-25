package overloading;

import java.util.Arrays;
import java.util.List;

// See which methods run when you comment out other methods

public class ManyOverloads {

	public static void main(String[] args) {
		char character = 123;
		char[] charArray = {231, 123, 3};
		Character[] charArray2 = {231, 123, 3};
		List<Character> charCollection = Arrays.asList(charArray2);

		int num = 123;
		int[] numArray = {1, 2, 3};
		Integer[] numArray2 = {1, 2, 3};
		List<Integer> numCollection = Arrays.asList(numArray2);
		
		// Guess what runs
		new ManyOverloads().doStuff(character);
		new ManyOverloads().doStuff(num);		
		new ManyOverloads().doStuff(charArray);
		new ManyOverloads().doStuff(numArray);
		new ManyOverloads().doStuff(charArray2);
		new ManyOverloads().doStuff(numArray2);
		new ManyOverloads().doStuff(charCollection);
		new ManyOverloads().doStuff(numCollection);	
	}

	private void doStuff(byte i) { System.out.println("byte"); }
	private void doStuff(short i) { System.out.println("short"); }
	private void doStuff(char i) { System.out.println("char"); }
	private void doStuff(int i) { System.out.println("int"); }
	private void doStuff(long i) { System.out.println("long"); }
	private void doStuff(float i) { System.out.println("float"); }
	private void doStuff(double i) { System.out.println("double"); }
	
	// Note varargs is equivalent to an array
	private void doStuff(byte... i) { System.out.println("byte..."); }
	private void doStuff(short... i) { System.out.println("short..."); }
	private void doStuff(char... i) { System.out.println("char..."); }
	private void doStuff(int... i) { System.out.println("int..."); }
	private void doStuff(long... i) { System.out.println("long..."); }
	private void doStuff(float... i) { System.out.println("float..."); }
	private void doStuff(double... i) { System.out.println("double..."); }

	private void doStuff(Byte i) { System.out.println("BYTE"); }
	private void doStuff(Short i) { System.out.println("SHORT"); }
	private void doStuff(Character i) { System.out.println("CHARACTER"); }
	private void doStuff(Integer i) { System.out.println("INTEGER"); }
	private void doStuff(Long i) { System.out.println("LONG"); }
	private void doStuff(Double i) { System.out.println("DOUBLE"); }
	private <T> void doStuff(T i) {System.out.println("Generic");} // The equivalent of Object
//	private void doStuff(Object i) { System.out.println("OBJECT"); }
	
	// Note varargs is equivalent to an array
	private void doStuff(Short... i) { System.out.println("SHORT..."); }
	private void doStuff(Character... i) { System.out.println("CHARACTER..."); }
	private void doStuff(Integer... i) { System.out.println("INTEGER..."); }
	private void doStuff(Long... i) { System.out.println("LONG..."); }
	private void doStuff(Double... i) { System.out.println("DOUBLE..."); }
	private <T> void doStuff(T... i) {System.out.println("Generic...");} // The equivalent of Object...
//	private void doStuff(Object... i) { System.out.println("OBJECT..."); }
	
}
