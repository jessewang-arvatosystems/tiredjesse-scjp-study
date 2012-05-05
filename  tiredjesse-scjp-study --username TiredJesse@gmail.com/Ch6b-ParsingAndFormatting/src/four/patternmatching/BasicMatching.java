package four.patternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicMatching {
	public static void main(String... args) {
//		matcher("ab", "aabbaaabbaaaa");
		
//		matcher("\\d", "12a2adf2a23a"); // \d is 'D'igit character, extra backslash is used for Strings
		
//		matcher("\\s", " a d12 df 12a"); // \s is white 'S'pace character
		
		matcher("\\w", " $ ad _ _ 2a"); // \w is any 'W'ord character includes numbers and underscores
		
//		matcher("[3jh]", "aah3d _ d2gac0d"); // [] matches any char found in the brackets
		
//		matcher("[^3jh]", "aah3d _ d2gac0d"); // [] matches any char not found in the brackets
		
//		matcher("[g-m]", "alb aks21 ha gmj"); // [X-Y] matches any char found in between X and Y, inclusive
		
//		matcher("[g-ma-c]", "alb aks21 ha gmj"); // [X-YA-B] matches any char found in between X and Y
												 // and between A and B inclusive.
		
//		matcher(".", "a _ %1 &#"); // . any character
		
//		matcher("\\.", "ad.fdasd ."); // \\. regex sees this as the period character
	}
	
	public static void matcher(String pattern, String stringToMatch) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(stringToMatch);
		
		while(m.find())
			System.out.println("Match found at index: " + m.start() + ", The matched word is: " + m.group());		
	}
}
