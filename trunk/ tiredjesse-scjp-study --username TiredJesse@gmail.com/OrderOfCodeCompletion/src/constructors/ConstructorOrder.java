package constructors;

public class ConstructorOrder {
	public static void main(String[] args) {
		new Child();
	}
}

class Grandparent {
	Grandparent() {
		System.out.println("Grandparent");
	}
}

class Parent extends Grandparent {
	Parent() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	Child() {
		System.out.println("Child");
	}
}