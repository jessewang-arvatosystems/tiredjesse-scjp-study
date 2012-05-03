package three.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

/* NumberFormat is a singleton
 * getInstance() formats numbers with commas. Rounds to the thousandth place.
 * getInstance(Locale) formats numbers in the specified Locale. Rounds to the thousandth place.
 * getNumberInstance() same as getInstance()
 * getNumberInstance(Locale) same as getInstance(Locale)
 * getCurrencyInstance() formats number to JVM def locale's currency format. Rounds to the hundredth place.
 * getCurrencyInstance(Locale) formats number in the specified locale's currency format. Rounds to the hundredth place.
 */

public class NumberFormatBasics {
	
	public static void main(String[] args) {
		float num = 12312.51673f;
		Locale locBR = new Locale("pt", "BR"); // Brazil
		
		NumberFormat[] nf = new NumberFormat[6];
		nf[0] = NumberFormat.getInstance();
		nf[1] = NumberFormat.getInstance(locBR);
		nf[2] = NumberFormat.getNumberInstance();
		nf[3] = NumberFormat.getNumberInstance(locBR);
		nf[4] = NumberFormat.getCurrencyInstance();
		nf[5] = NumberFormat.getCurrencyInstance(locBR);
		
		for(NumberFormat formatter : nf)
			System.out.println(formatter.format(num));
			
	}

}
