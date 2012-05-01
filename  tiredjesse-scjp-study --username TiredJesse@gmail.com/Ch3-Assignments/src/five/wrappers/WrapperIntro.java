package five.wrappers;

@SuppressWarnings("unused")
public class WrapperIntro {
	
	private boolean bool1 = new Boolean(true);
	private byte b1 = new Byte((byte)5);
	private short s1 = new Short((short)2);
	private char c1 = new Character('2');
	private int i1 = new Integer(5);
	private long l1 = new Long(123);
	private float f1 = new Float(21);
	private double d1 = new Double(23);

	private Number anyNumber = i1;
	
	public static void main(String... wraps) {
		int i1 = new Integer("5"); // Parses 5 to small int
		int i2 = Integer.parseInt("5"); // Same as above without instantiated Integer
		Integer bigI1 = Integer.valueOf(5); // Returns a wrapper IntegerObject
		long l1 = bigI1.longValue(); // Convert to primitive long
	}

}
