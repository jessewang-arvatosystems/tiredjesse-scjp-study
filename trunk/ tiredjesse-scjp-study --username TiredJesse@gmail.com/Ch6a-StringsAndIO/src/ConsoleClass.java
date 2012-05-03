import java.io.Console;

// Console is in Java 6 
// Console does not work with Eclipse IDE
// Copy and paste code using a text editor and save as ConsoleClass.java
// Compile and run in cmd prompt

public class ConsoleClass {
	public static void main(String[] args) {
		Console console = System.console();
		String name;
		char[] pw;

		if (console != null) {
			pw = console.readPassword("%s", "Type your password: "); // Hides whatever is typed, returns a char[]
			System.out.print("Your password is: ");
			for (char ch : pw)
				console.format("%c", ch); // format output, same as saying printf
			console.format("\n");
	
			name = console.readLine("%s", "Write something: "); // Echoes whatever is typed, returns a String
	
			console.format("You wrote: %s \n", name);
		}
	}
}