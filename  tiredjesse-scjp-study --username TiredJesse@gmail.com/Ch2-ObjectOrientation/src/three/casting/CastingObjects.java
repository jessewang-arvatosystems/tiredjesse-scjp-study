package three.casting;

// All of the code will compile, but there will be ClassCastExceptions thrown
// The cast () has to be the reference type or a subclass of that reference Type
// IE: Plant p2 = (OakTree) o2; is valid and Plant p2 = (Tree) o2; is valid

public class CastingObjects {

	@SuppressWarnings("unused")
	public static void main(String... castingProblems) {
		Plant p1 = new Plant();
		Tree t1 = (Tree) p1; // A Plant is not necessarily a Tree.
		OakTree o1 = (OakTree) p1; // A Plant is not necessarily an OakTree.

		OakTree o2 = new OakTree();
		Tree t2 = o2; // Any OakTree is a Tree.
		Plant p2 = o2; // Any OakTree is a Plant. Same as p2 = (OakTree) o2; and p2 = (Tree) o2;

		Tree t3 = new Tree();
		Plant p3 = t3; // Any Tree is a Plant.
		OakTree o3 = (OakTree) t3; // A Tree is not necessarily an OakTree.

		Animal a1 = new Cat(); // Think of this as saying a1 is pointing to a Cat Object.
		Cat c1 = (Cat) a1; // A Cat is a Cat. The cast (Cat) is required.
		Dog d1 = (Dog) a1; // A Cat is not a Dog
		Felines f1 = (Cat) a1; // A Cat is a Cat. The cast is required because a1 is originally type Animal
		Felines f2 = (Felines) a1; // Any Cat is a Feline
		Lion l1 = (Lion) a1; // Any Cat is not necessarily a Lion
		
		// All valid since Lion is a Cat, is a Feline and is an Animal
		Lion l2 = new Lion();
		Cat c2 = l2;
		Felines f3 = l2;
		Animal a2 = l2;
//		Dog d2 = (Dog) l2; // Won't even compile!
		
		a1.saySomething();
		c1.saySomething();
//		c2.saySomething(); // Can't see the saySomething() method
//		c3.saySomething(); // Can't see the method!
	}

}

class Plant {}
class Tree extends Plant {}
class OakTree extends Tree {}

interface Felines {}

abstract class Animal {
	abstract void saySomething();
}

class Dog extends Animal {
	void saySomething() {
		System.out.println("Bark!");
	}
}

class Cat extends Animal implements Felines {
	void saySomething() {
		System.out.println("Meow!");
	}
}

class Lion extends Cat {
	void saySomething() {
		System.out.println("Roar!");
	}
}