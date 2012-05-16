package four.instanceofoperator;

interface Tree {}
interface Plastic{}

class ElmTree implements Tree {}
class Toy implements Plastic {}
class FakeTree implements Tree, Plastic {}

public class InstanceOfPt2 {
	public static void main(String[] args) {
		Tree elmTree1 = new ElmTree();
		ElmTree elmTree2 = new ElmTree();

		Tree fakeTree1 = new FakeTree();
		Plastic fakeTree2 = new FakeTree();
		FakeTree fakeTree3 = new FakeTree();
		
		Plastic toy1 = new Toy();
		Toy toy2 = new Toy();
		
		// instanceof always looks to the reference type for relations
		// ElmTree will be an instanceof Tree
		// Toy will be an instanceof Plastic
		// FakeTree will be an instanceof Tree and Plastic
		System.out.printf("Elm Tree1 is a tree: %b\n", elmTree1 instanceof Tree);
		System.out.printf("Elm Tree1 is made of plastic: %b\n", elmTree1 instanceof Plastic);
		System.out.printf("Elm Tree2 is a tree: %b\n", elmTree2 instanceof Tree);
		System.out.printf("Elm Tree2 is made of plastic: %b\n\n", elmTree2 instanceof Plastic);
				
		System.out.printf("Fake Tree1 is a tree: %b\n", fakeTree1 instanceof Tree);
		System.out.printf("Fake Tree1 is made of plastic: %b\n", fakeTree1 instanceof Plastic);
		System.out.printf("Fake Tree2 is a tree: %b\n", fakeTree2 instanceof Tree);
		System.out.printf("Fake Tree2 is made of plastic: %b\n", fakeTree2 instanceof Plastic);
		System.out.printf("Fake Tree3 is a tree: %b\n", fakeTree3 instanceof Tree);
		System.out.printf("Fake Tree3 is made of plastic: %b\n\n", fakeTree3 instanceof Plastic);
		
		System.out.printf("Toy1 is made of plastic: %b\n", toy1 instanceof Plastic);
		System.out.printf("Toy1 is a tree: %b\n", toy1 instanceof Plastic);
		System.out.printf("Toy2 is made of plastic: %b\n", toy2 instanceof Plastic);
		System.out.printf("Toy2 is a tree: %b", toy2 instanceof Plastic);
	}
}