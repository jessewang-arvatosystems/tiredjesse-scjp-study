package four.genericdeclarations;

// The letter does not matter, by convention T = type, E = element
class ConcreteGenericClass<T> {}
abstract class AbstractGenericClass<T> {}
interface GenericInterface<T> {}
//enum GenericEnum<T> {} // enums can't have generic types

// Can add multiple generic types
class ManyGenerics<A, B, C, D, E>{} // No limit
//class ManyGenerics2<A, B, A, D, A>{} // Can't have duplicate types

//class NoWildCards<?> {} // Cannot have a wild card as a type

// Follows same rules as identifiers
class ValidGenericTypes<_, $, a1, _b> {} 
//class InvalidGenericTypes<1, ., /, 1a, a.> {}

@SuppressWarnings("unused")
public class GenericsDeclarationsBasics {
	// For generic methods, the angle brackets are placed before the return type
	private static <A> void someGenericMethod() {
		A genericVariable = null;
//		B invalidVariable = null; // Won't compile, since B was never assigned as a generic type
	}
	
	// Similar to classes, multiple types can be assigned
	<B, C, D> void multipleGenericsInAMethod() {
		B genericVariable1;
		C genericVariable2;
		D genericVariable3;
	}
	
	// Generic Types can be placed in a parameter
	<T> void addElement(T element) {}
	
	// Generic Types can also be returned
	<T> T getElement(T element) { return element; }
	
	// Similar to classes, wild card and identifier rules apply here
//	<?> void anotherGenericMethod() {}
//	<1, ., /, a> void anotherGenericMethod() {}
	<_, $, a1, _b> void validGenericMethod() {}
	
	// Constructors can also have generics
	public <T> GenericsDeclarationsBasics() {
		T genericVariable = null;
	}
}