package one.introduction;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes", "unused" }) // Used otherwise a lot of warnings will pop up
public class GenericsVersusLegacyCode {
	
	public static void main(String[] tripInTime) {
		// Before Java 5, collections were declared like this:
		List nameRoster = new ArrayList();
		
		// There was no type checking
		nameRoster.add("Mark");
		nameRoster.add(false);
		nameRoster.add(1);
		nameRoster.add(new ArrayList());
		nameRoster.add('j');
		
		// Each time you wanted to retrieve an element casting was necessary
		String firstName = (String) nameRoster.get(0);
//		String firstName2 = (String) nameRoster.get(1); // Throws ClassCastException
		
		// Now generics allow the compiler to check for the type
		// to avoid casting and casting exceptions
		List<String> betterNameRoster = new ArrayList<String>();
		
		betterNameRoster.add("Mark");
//		betterNameRoster.add(false); // Will not compile
//		betterNameRoster.add(1); // Will not compile
//		betterNameRoster.add(new ArrayList()); // Will not compile
//		betterNameRoster.add('j');  // Will not compile, character is not a String
		
		firstName = betterNameRoster.get(0); // No cast required
		
		addMoreStuffToList(nameRoster); // Totally fine
		addMoreStuffToList(betterNameRoster); // Works, but not suggested.
											  // Even though betterNameRoster only accepts Strings, once it is
											  // passed inside this method, it can accept anything!
		
		System.out.printf("NameRoster: %s\n", nameRoster);
		System.out.printf("BetterNameRoster: %s\n", betterNameRoster);
	}
	
	// Note generics and non-generics can mix!
	private static void addMoreStuffToList(List targetList) {
		targetList.add("hello world!");
		targetList.add(true);
		targetList.add(new GenericsVersusLegacyCode());
	}

}
