package six.exceptions;

public class ExceptionMatching {
	
	public static void main(String... matching) {
		try {
			new ExceptionMatching().go();
		} catch (NotThatBadException ex) {	// Catch the most specific case first
		} catch (BadException ex) {
		}
		
		
		try {
			new ExceptionMatching().go();
		} catch (BadException ex) {	// Broad exception
//		} catch (NotThatBadException ex) { // Compilation error since BadException is more broad than NotThatBadException
		}
	}
	
	private void go() throws BadException {
		throw new BadException();
	}

}

@SuppressWarnings("serial")
class BadException extends Exception {}

@SuppressWarnings("serial")
class NotThatBadException extends BadException {}
