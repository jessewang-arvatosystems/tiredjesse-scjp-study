package three.syntax;

// Var-args are valid since JRE 1.5

public abstract class VarArgs {
	
//	abstract void getNames(String[] names); // #1
	
	abstract void getNames(String... names); // Can accept 0 to infinite names, equivalent as writing #1 method
	
	abstract void getNames(String name, String... names); // 1 to infinite names. NOT the same as #1 method
//	abstract void getNames(String...names, String name); // Bad syntax, var-args must be the last parameter
	
//	abstract void getNamesAndAges(String...names, byte... ages); // Bad syntax, only one var-arg per method
}
