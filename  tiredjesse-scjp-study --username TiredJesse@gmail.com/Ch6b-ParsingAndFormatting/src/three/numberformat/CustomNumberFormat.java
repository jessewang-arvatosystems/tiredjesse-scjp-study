package three.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;

public class CustomNumberFormat {
	public static void main(String... args) {
		float num = 123342.915113f;
		NumberFormat nf = NumberFormat.getInstance();
		
		System.out.print("max fraction digits: " + nf.getMaximumFractionDigits());
		System.out.println(", number: " + nf.format(num));
		
		nf.setMaximumFractionDigits(5);
		System.out.print("new max fraction digits: " + nf.getMaximumFractionDigits());
		System.out.println(", new number: " + nf.format(num));
		
		try {
			System.out.println("Parsed: " + nf.parse("123342.915113")); // No commas, no rounding, no trimming fraction digits
			nf.setParseIntegerOnly(true);
			System.out.println("Only integers " + nf.parse("123342.915113"));  // No commas, no rounding and no numbers after decimal point
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
