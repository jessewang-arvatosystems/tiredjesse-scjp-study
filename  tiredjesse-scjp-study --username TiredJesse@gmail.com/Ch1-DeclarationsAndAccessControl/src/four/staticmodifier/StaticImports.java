package four.staticmodifier;

import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.lang.Integer.*; // Wild card means any method that uses that has Integer as prefix

import static java.util.Arrays.toString;
import static java.lang.Double.toString;

import java.util.Arrays;

@SuppressWarnings("unused")
public class StaticImports {
	
	public static void main(String[] moreStaticStuff) {
		System.out.println("The boring old way"); // Note java.lang.System is automatically imported
		out.println("Using a shortcut");
		
		Arrays.asList(); // Note must import Arrays!
		asList(); // Okay shortcut works
//		sort(new int[] {1,2,3}); // Nope doesn't work since did not import static java.util.Arrays.sort;
		
		// Both work since the wild card was used
		parseInt("123");
		getInteger("321");
		
		// Avoid "import static" with too many packages, otherwise compiler encounters ambiguity issues
//		toString(new int[] {1, 2, 3}); //Supposed to be Arrays.toString()
//		toString(3.1); // Supposed to be Double.toString();
		
		// This still works!
		Arrays.toString(new int[] {1, 2, 3});
		Double.toString(3.1);	
	}
	
}
