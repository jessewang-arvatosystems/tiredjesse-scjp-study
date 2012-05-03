package two.stringbuilder;

public class StringBuilderMethods {
	
	public static void main(String... methods) {
		StringBuilder builderOne = new StringBuilder("Hello ");
		StringBuilder builderTwo = new StringBuilder("World!");
//		StringBuilder builderThree = new StringBuilder(builderOne + builderTwo); // + does not work for StringBuilders
		
		builderOne.append(builderTwo); // use append instead
		System.out.println(builderOne);
		
		builderOne.delete(5, builderOne.length()); // length() works just like String
		System.out.println(builderOne);
		
		builderOne.insert(3, "aba"); // Not available for Strings
		System.out.println(builderOne);
		
		builderOne.reverse(); // Self Explanatory
		System.out.println(builderOne);
	}

}
