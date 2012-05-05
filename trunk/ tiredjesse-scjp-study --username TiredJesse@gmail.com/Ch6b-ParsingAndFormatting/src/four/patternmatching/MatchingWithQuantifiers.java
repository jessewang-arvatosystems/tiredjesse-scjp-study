package four.patternmatching;

import static four.patternmatching.BasicMatching.matcher;

public class MatchingWithQuantifiers {
	public static void main(String[] quantifiers) {
//		matcher("\\d+", "12a123a23fa2ga200"); // + one or more occurrences
		
//		matcher("\\w*", "12ad 123as 12fa2d"); // * zero or more occurrences 
											  // Note finds an extra space at the end!
		
		matcher("\\d?", "12ad 123as 12fa2d"); // ? zero or one occurrence 
	}
}
