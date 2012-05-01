package seven.errorsandthrowables;

// Error is not related to Exceptions
// These are almost never thrown by a programmer

public class Errors {
	
	public static void main(String... args) {
		try {
			new Errors().throwError();
		} catch (Exception ex) {
			System.out.println("Exception caught error!");
		} catch (Error ex) {
			System.out.println("Error caught"); // Errors can be caught too!
		}
	}
	
	private void throwError() { // No throws statement since Error is unchecked
		throw new Error();
	}

}
