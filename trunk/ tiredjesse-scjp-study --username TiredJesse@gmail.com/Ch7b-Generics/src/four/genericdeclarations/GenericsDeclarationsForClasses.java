package four.genericdeclarations;

public class GenericsDeclarationsForClasses {}

class Food {}
class Fruit extends Food {}
class Apple extends Fruit {}

// All of the following are valid
@SuppressWarnings("unused")
class Pie<T> {
	public static void main(String[] munch) {
		Pie<Fruit> p = new Pie<Fruit>();
	}
}

@SuppressWarnings("unused")
class Pie2<T extends Fruit> {
	public static void main(String[] munch) {
		Pie2<Fruit> p = new Pie2<Fruit>();
	}
}

@SuppressWarnings("unused")
class Pie3<T extends Food> {
	public static void main(String[] munch) {
		Pie3<Fruit> p = new Pie3<Fruit>();
	}
}

// Invalid forms for classes
// Wild cards not allowed
/*class Pie4<?> {
	public static void main(String[] munch) {
		Pie4<Fruit> p = new Pie4<Fruit>();
	}
}*/

// super not allowed in generic declarations for classes and methods
/*class Pie5<T super Fruit> {
	public static void main(String[] munch) {
		Pie5<Fruit> p = new Pie5<Fruit>();
	}
}

class Pie6<T super Apple> {
	public static void main(String[] munch) {
		Pie6<Fruit> p = new Pie6<Fruit>();
	}
}*/
