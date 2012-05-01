package four.casting;

public class CastingPrimitives {
	static byte byteNum = 5;
	static short shortNum = 3;
	static int intNum = 4;
	static long longNum = 10;
	static long quickCastLongNum = 10L; // Can use capital 'L' or lower case 'l'
	static float floatNum = 32;
	static float quickCastFloatNum = 12f; // Can use capital 'F' or lower case 'f'
	static double doubleNum = 321;
	
	public static void main(String[] downcasts) {
//		byteNum = shortNum; // Downcast required!
		byteNum = (byte) shortNum; // Okay
		
		intNum = shortNum; // Upcast is explicit, same as intNum = (int) shortNum;
		
		floatNum = longNum; // Okay since float has a higher capacity than long
		longNum = (long) floatNum;
		
		doubleNum = shortNum; // Okay since double has a higher capacity than short;
		shortNum = (short) doubleNum;
		
		System.out.println(new CastingPrimitives());
	}

	@Override
	public String toString() {
		return "CastingPrimitives [byteNum=" + byteNum + ", shortNum="
				+ shortNum + ", intNum=" + intNum + ", longNum=" + longNum
				+ ", floatNum=" + floatNum + ", doubleNum=" + doubleNum + "]";
	}

}
