package two.arrays;

public class MultiDimensionalArraysPt2 {
	
	public static void main(String... strings) {
		int[] array;
		int[][] twoDarray;
		int[][][] threeDarray;
		int[][][][] fourDarray;
		
//		array = new int[-5]; // Compiles, but throws NegativeArraySizeException
		array = new int[0]; // An array with no capacity
		array = new int[1];
//		array = {2}; // Invalid, can only be done when initializing
		
		twoDarray = new int[1][1];
		twoDarray = new int[1][]; // Valid do not need to list both dimensions
								  // [] equivalent as listing a capacity of 1
//		twoDarray = new int[][1]; // Invalid, cannot list a dimension after an undefined dimension
		
		threeDarray = new int[1][1][1];
		threeDarray = new int[1][1][];
		threeDarray = new int[1][][];
//		threeDarray = new int[][1][1];
//		threeDarray = new int[][][1];
		
		fourDarray = new int[1][1][1][1];
		fourDarray = new int[1][1][1][];
		fourDarray = new int[1][1][][];
		fourDarray = new int[1][][][];
//		fourDarray = new int[1][][1][1];
//		fourDarray = new int[1][][][1];
//		fourDarray = new int[][1][1][];
//		fourDarray = new int[][1][1][1];
		
		twoDarray[0] = array; // 2D array[0] -> array
		threeDarray[0] = twoDarray; // 3Darray[0] -> 2Darray
		threeDarray[0][0] = array; // 3Darray[0][0] -> array
		fourDarray[0] = threeDarray; // 4Darray[0] -> 3Darray
		fourDarray[0][0] = twoDarray; // 4Darray[0][0] -> 2Darray
		fourDarray[0][0][0] = array; // 4Darray[0][0][0] -> array
		
		
	}

}
