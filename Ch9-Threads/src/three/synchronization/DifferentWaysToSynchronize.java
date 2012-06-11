package three.synchronization;

@SuppressWarnings("unused")
public class DifferentWaysToSynchronize {
	
	private static int staticValue;
	private int nonStaticValue;

	public synchronized void synchronizeMethod(int nonStaticValue) {
		this.nonStaticValue = nonStaticValue;
	}
	
	public void synchronizeBlock(int nonStaticValue) {
		// optional code here
		synchronized(this){
			this.nonStaticValue = nonStaticValue;
		}
		// optional code here
	}
	
	public static synchronized void staticSynchronizedMethod(int staticValue) {
		DifferentWaysToSynchronize.staticValue = staticValue;
	}

	public static void staticSynchronizeBlock(int staticValue) {
		// optional code here
		synchronized(DifferentWaysToSynchronize.class) {
			DifferentWaysToSynchronize.staticValue = staticValue;
		}
		// optional code here
	}
	
	// Another version of a staticSynchronizeBlock
	public static void staticSynchronizeBlockVers2(int staticValue) {
		// optional code here
		try {
			Class<?> c = Class.forName("three.synchronization.DifferentWaysToSynchronize");
			synchronized(c) {
				DifferentWaysToSynchronize.staticValue = staticValue;
			}
		} catch (ClassNotFoundException e) {}
		// optional code here
	}
	
	
}
