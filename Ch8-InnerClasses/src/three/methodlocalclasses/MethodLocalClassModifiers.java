package three.methodlocalclasses;

@SuppressWarnings("unused")
public class MethodLocalClassModifiers {
	void someMethod() {
		strictfp class IEE_FloatingPointClass {}
		final class FinalClass{}
		abstract class AbstractClass{}
		class DefaultClass{}
		
		// Will not work
//		public class PublicClass{}
//		protected class InnerProtectedClass{}
//		private class PrivateClass{}
//		static class StaticClass{} // No longer counts as an InnerClass (will discuss later)		
	}
	
	// Same for static methods
	static void someStaticMethod() {
		strictfp class IEE_FloatingPointClass {}
		final class FinalClass{}
		abstract class AbstractClass{}
		class DefaultClass{}
		
		// Will not work
//		public class PublicClass{}
//		protected class InnerProtectedClass{}
//		private class PrivateClass{}
//		static class StaticClass{} // No longer counts as an InnerClass (will discuss later)		
	}
	
}
