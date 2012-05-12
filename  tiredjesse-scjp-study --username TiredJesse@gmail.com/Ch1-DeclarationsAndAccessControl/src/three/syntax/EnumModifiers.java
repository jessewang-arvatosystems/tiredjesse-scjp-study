package three.syntax;

// Valid
public enum EnumModifiers{}
enum OuterDefault{}

// Invalid
/*static enum OuterStatic {}
final enum OuterFinal {}
abstract enum OuterAbstract {}
protected enum OuterProtected {}
private enum OuterPrivate {}*/

@SuppressWarnings("unused")
class SomeClass {
	// Enums inside a class can have these modifiers
	public enum InnerPublic{}
	protected enum InnerProtected {}
	enum InnerDefault{}
	private enum InnerPrivate {}
	static enum InnerStatic {}
	
	// Enums can never be final or abstract
	// makes no sense
//	final enum InnerFinal {}
//	abstract enum InnerAbstract {}
}
