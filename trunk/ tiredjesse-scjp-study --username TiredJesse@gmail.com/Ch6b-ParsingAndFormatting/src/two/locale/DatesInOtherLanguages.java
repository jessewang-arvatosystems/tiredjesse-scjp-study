package two.locale;

import java.util.Locale;

public class DatesInOtherLanguages {
	
	public static void main(String[] args) {

		Locale locDef = Locale.getDefault(); // Looks at the JVM
		Locale locItaly = new Locale("it", "IT");
		Locale locDenmark = new Locale("da", "DK");
		
		System.out.println("Countries: ");
		System.out.println("default: " + locItaly.getDisplayCountry(locDef));
		System.out.println("Italians called Italy as: " + locItaly.getDisplayCountry(locItaly));
		
		System.out.println("\nLanguages: ");
		System.out.println("default: " + locDenmark.getDisplayLanguage(locDef));
		System.out.println("in Denmark Danish is pronouced as: " + locDenmark.getDisplayLanguage(locDenmark));
		System.out.println("Danish said in Italy is: " + locDenmark.getDisplayLanguage(locItaly));
	}

}
