package two.arrays;

// Detail in how an array can fit into another array

@SuppressWarnings("unused")
public class MultiDimensionalArrays {
	
	public static void main(String[] moreArrays) {
		int[][][][] a1 = new int[2][3][4][5];
		int[][] a2 = new int[4][1];
		int[] a3 = new int[1];
		int num = 5;
		
		// Compiles with any number combination
		// However must note the size of each array to avoid ArrayIndexOutOfBoundsException
		num = a1[1][2][3][4]; 
		a2 = a1[1][2];
		a3 = a2[1];
		a3 = a1[1][1][3];
		num = a1[1][1][3][2];
	}
}
