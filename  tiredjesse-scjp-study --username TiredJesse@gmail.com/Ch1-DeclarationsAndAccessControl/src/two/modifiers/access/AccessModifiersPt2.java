package two.modifiers.access;

import two.modifiers.AccessModifiers;

/**
 * @see two.modifiers.AccessModifiers before this
 */

public class AccessModifiersPt2 {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
//		access.privateMethod();  // Illegal Access!
//		access.defaultMethod();  // Illegal Access!
//		access.protectedMethod();  // Illegal Access!
		access.publicMethod();
	}
	
}

@SuppressWarnings("unused")
class TestAccessClass extends AccessModifiers {
	
	private void someMethod() {
//		privateMethod(); // Illegal Access!
//		defaultMethod(); // Illegal Access!
		protectedMethod();
		publicMethod();
	}
	
}
