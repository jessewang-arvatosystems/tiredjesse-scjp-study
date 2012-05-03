package one.introduction;

public class StringMethods {
	private String msg = "Hello World";
	
	private char charPosition = msg.charAt(3);
	private String newMsg = msg.concat(" Peace"); // Same as using: msg + " Peace";
	private boolean same = msg.equalsIgnoreCase("HELLO WORLD PEACE");
	private int length = msg.length();
	private String newString = msg.replace('l', 'L');
	private String originalMsg = msg.substring(0, 11);
	private String lowerMsg = msg.toLowerCase();
	private String upperMsg = msg.toUpperCase();
	private String itself = msg.toString();
	private String trim = "  hello  ".trim();
	
	public static void main(String... moreStrings) {
		System.out.println(new StringMethods());
	}

	@Override
	public String toString() {
		return "StringMethods [msg=" + msg + ", charPosition=" + charPosition
				+ ", newMsg=" + newMsg + ", same=" + same + ", length="
				+ length + ", newString=" + newString + ", originalMsg="
				+ originalMsg + ", lowerMsg=" + lowerMsg + ", upperMsg="
				+ upperMsg + ", itself=" + itself + ", trim=" + trim + "]";
	}

}
