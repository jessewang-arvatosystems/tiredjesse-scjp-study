package six.exceptions;

public class PropagatingExceptions {
	
	public static void main(String... args) throws Exception {
		new PropagatingExceptions().go();
	}
	
	private void go() throws Exception {
		doSomething();
	}
	
	private void doSomething() throws Exception {
		throw new Exception("Exception propagating to main");
	}

}
