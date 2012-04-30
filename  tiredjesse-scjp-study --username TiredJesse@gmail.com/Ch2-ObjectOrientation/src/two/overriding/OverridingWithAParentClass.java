package two.overriding;

// Must first extend the class before implementing interfaces
// implementing interfaces then extending a class will cause a compilation error!
public class OverridingWithAParentClass extends ActionAbstractClass implements ActionInterface {
	public static void main(String[] args) {
		ActionInterface go = new OverridingWithAParentClass();
		go.doStuff();
		go.doSomethingElse();
	}

	@Override
	public void doSomethingElse() {
		System.out.println("Concrete class: Implemented interface");
	}
}

abstract interface ActionInterface {
	public abstract void doStuff();
	void doSomethingElse();
}

abstract class ActionAbstractClass {
	// Implements doStuff()
	public void doStuff() {
		System.out.println("Abstract class: Implemented interface");
	}
}
