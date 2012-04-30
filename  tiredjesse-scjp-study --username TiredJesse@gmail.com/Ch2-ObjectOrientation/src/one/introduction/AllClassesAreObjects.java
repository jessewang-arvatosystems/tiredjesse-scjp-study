package one.introduction;

public class AllClassesAreObjects {

	public static void main(String[] args) {
		Object[] objArray = new Object[3];
		
		objArray[0] = new Object();
		objArray[1] = new ExplcitlyStatedSubclassOfObject();
		objArray[2] = new AllClassesAreObjects();
	}
	
}

// Okay, but all classes extends Object except the Object class itself
class ExplcitlyStatedSubclassOfObject extends Object {
	
}