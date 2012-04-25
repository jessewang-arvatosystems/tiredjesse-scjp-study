package access;

import modifiers.AccessModifiers;

public class AccessModifiersPt2 {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
//		access.privateMethod();  // Illegal Access!
//		access.defaultMethod();  // Illegal Access!
//		access.protectedMethod();  // Illegal Access!
		access.publicMethod();
	}
	
}

class TestAccessClass extends AccessModifiers {
	
	private void someMethod() {
//		privateMethod(); // Illegal Access!
//		defaultMethod(); // Illegal Access!
		protectedMethod();
		publicMethod();
	}
	
}
