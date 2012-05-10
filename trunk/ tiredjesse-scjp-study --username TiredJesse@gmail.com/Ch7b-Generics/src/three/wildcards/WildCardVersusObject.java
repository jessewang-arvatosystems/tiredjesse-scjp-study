package three.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardVersusObject {
	
	public static void main(String... versus) {
		// Wild card accepts ANYTHING
		List<Object> objectList = new ArrayList<Object>();
//		List<Object> objectList2 = new ArrayList<WildCardVersusObject>();
		
		List<?> wildCardList = new ArrayList<Object>();
		List<?> wildCardList2 = new ArrayList<WildCardVersusObject>();
		
		addToObjectList(objectList);
//		addToObjectList(wildCardList); Only accepts List<Object>
//		addToObjectList(wildCardList2); Only accepts List<Object>
		
		// To repeat, wild card can accept anything
		addToWildCardList(objectList);
		addToWildCardList(wildCardList);
		addToWildCardList(wildCardList2);
	}
	
	private static void addToObjectList(List<Object> objList) {
		objList.add(new Object());
		objList.add(new WildCardVersusObject()); // Sure WildCardVersusObject extends Object
	}
	
	private static void addToWildCardList(List<?> wildCardList) {
//		wildCardList.add(new Object()); // Will not compile! Can put something invalid in here
//		wildCardList.add(new WildCardVersusObject());
	}

}
