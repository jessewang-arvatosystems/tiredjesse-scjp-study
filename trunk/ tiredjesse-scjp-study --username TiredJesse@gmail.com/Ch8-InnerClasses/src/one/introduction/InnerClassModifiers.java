package one.introduction;

@SuppressWarnings("unused")
public class InnerClassModifiers {
	// Similar to Outer Classes
	strictfp class IEE_FloatingPointClass {}
	final class FinalClass{}
	abstract class AbstractClass{}
	public class PublicClass{}
	class DefaultClass{}
	
	// Only for Inner Classes
	protected class InnerProtectedClass{}
	private class PrivateClass{}
	static class StaticClass{} // No longer counts as an InnerClass (will discuss later)
	
	void someMethod() {
		// No access modifiers other than default
		// Also no static modifier
		strictfp class InnerMethod_IEE_FloatingPointClass {}
		final class InnerMethodFinalClass {}
		abstract class InnerMethodAbstractClass {}
		class InnerMethodClass{}
	}
}
