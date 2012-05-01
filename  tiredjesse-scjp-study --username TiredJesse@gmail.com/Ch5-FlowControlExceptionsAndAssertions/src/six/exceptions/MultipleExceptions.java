package six.exceptions;

@SuppressWarnings("unused")
public class MultipleExceptions {
	
	private void doNumberAndStringStuff() throws NumberException, StringException {
		goNumber();
		goString();
	}
	
	private void doNumberAndStringStuff2() throws Exception { // Both Number and String Exceptions are subclasses of Exception
		goNumber();
		goString();
	}
	
	private void goNumber() throws NumberException {
		throw new NumberException();
	}
	
	private void goString() throws StringException {
		throw new StringException();
	}
}

@SuppressWarnings("serial")
class NumberException extends Exception {
	
}

@SuppressWarnings("serial")
class StringException extends Exception {
	
}
