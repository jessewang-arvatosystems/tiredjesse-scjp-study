package one.introduction;

import java.util.Arrays;

public class DefaultValues {
	private boolean bool1;
	private byte b1;
	private short s1;
	private int i1;
	private long l1;
	private float f1;
	private double d1;
	private String str1;
	private boolean[] bArray1 = new boolean[3];
	private int[] iArray1 = new int[3];
	private String[] sArray1 = new String[3];
	
	public static void main(String [] args) {
		DefaultValues def = new DefaultValues();
		System.out.println(def);
		System.out.println(def.localMethod());
	}
	
	public String localMethod() {
		// Must initialize local primitives and strings
		boolean bool1 = false;
		byte b1 = 0; 
		short s1 = 0;
		int i1 = 0;
		long l1 = 0;
		float f1 = 0;
		double d1 = 0;
		String str1 = null;
		boolean[] bArray1 = new boolean[3];
		int[] iArray1 = new int[3];
		String[] sArray1 = new String[3];
		
		return "LocalValues [bool1=" + bool1 + ", b1=" + b1 + ", s1=" + s1
				+ ", i1=" + i1 + ", l1=" + l1 + ", f1=" + f1 + ", d1=" + d1
				+ ", str1=" + str1 + ", bArray1=" + Arrays.toString(bArray1)
				+ ", iArray1=" + Arrays.toString(iArray1) + ", sArray1="
				+ Arrays.toString(sArray1) + "]";
	}

	@Override
	public String toString() {
		return "DefaultValues [bool1=" + bool1 + ", b1=" + b1 + ", s1=" + s1
				+ ", i1=" + i1 + ", l1=" + l1 + ", f1=" + f1 + ", d1=" + d1
				+ ", str1=" + str1 + ", bArray1=" + Arrays.toString(bArray1)
				+ ", iArray1=" + Arrays.toString(iArray1) + ", sArray1="
				+ Arrays.toString(sArray1) + "]";
	}

	


}
