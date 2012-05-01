package six.exceptions;

public class BasicExceptionHandling {
	
	public static void main(String... basicStructure) {
		
		// Valid statements
		try {}
		catch (Exception ex) {}
		
		try {}
		finally {}
		
		try {}
		catch (Exception ex) {}
		finally {}
		
		try {
			System.out.println("In try block");
			throwException();
			System.out.println("After throwing Exception"); // Never runs!
		} catch (Exception ex) {
			System.out.println("Run this if exception occurs");
		} finally {
			System.out.println("Always run this");
		}
		
//		try {
//			System.out.println("Illegal Structure");
//		}
		
//		try {} 
//		System.out.println("Can't be here");
//		catch (Exception ex) {}
		
//		try {}
//		System.out.println("Can't be here");
//		finally {}
		
	}
	
	private static void throwException() throws Exception {	// Checked Exceptions must be thrown
		throw new Exception();
	}

}
