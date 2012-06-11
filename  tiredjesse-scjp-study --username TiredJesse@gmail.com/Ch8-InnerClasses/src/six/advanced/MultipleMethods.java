package six.advanced;

public class MultipleMethods {

	public static void main(String[] args) {
		MultipleMethods m = new MultipleMethods();
		m.runGo();
		System.out.printf("Main: ");
		new six.advanced.A().go();
	}

	void runGo() {
		System.out.printf("Before inner class A: ");
		new A().go(); // Doesn't know method local class exists yet

		@SuppressWarnings("hiding")
		class A {
			void go() {
				System.out.println("inner");
			}
		}

		System.out.printf("After inner class A: ");
		new A().go(); // Knows about the method local class
		this.new A().go(); // current object is MultipleMethods
						   // this could also be represented as: new MultipleMethods.new A().go()
		new six.advanced.A().go(); // specify the outermost A() class
	}

	class A {
		void go() {
			System.out.println("middle");
		}
	}

}

class A {
	void go() {
		System.out.println("outer");
	}
}
