package five.tokenizing;

// Easy to implement, but not suitable for really long strings

public class StringSplitting {
	public static void main(String[] args) {
		String reallyLongString = "asd ada 2 sd1 adf 3";
		String[] tokens = reallyLongString.split("\\d");
		for (String s : tokens)
			System.out.println(s);
	}
}
