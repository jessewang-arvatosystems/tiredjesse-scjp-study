package two.stringbuilder;

// StringBuilder same API as StringBuffer
// The only difference is that StringBuilder was implemented in Java 5
// and does not have synchronized methods

public class StringBuilderIntroduction {
	
	public static void main(String[] stringBuilders) {
		// Remember that Strings are immutable
		String msg = "Hello";
		msg.concat(" World!");
		System.out.println(msg);
		
		// StringBuilders and StringBuffers are not immutable
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World!");
		System.out.println(builder);
	}
}
