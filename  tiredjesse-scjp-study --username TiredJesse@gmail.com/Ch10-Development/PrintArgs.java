public class PrintArgs {

	public static void main(String[] args) {

		if (args.length == 3) {
			System.out.printf("First arg is: %s\n", args[0]);
			System.out.printf("Second arg is: %s\n", args[1]);
			System.out.printf("Third arg is: %s\n", args[2]);
		} else {
			System.out.println("Type in 3 arguments!");
		}

	}

}