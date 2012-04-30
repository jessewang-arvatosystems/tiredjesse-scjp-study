package three.casting;

public class CastingPrimitives {
	static byte byteNum = 5;
	static short shortNum = 3;
	static int intNum = 4;
	static long longNum = 10L;
	static float floatNum = 32f;
	static double doubleNum = 321.0;
	
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
