package seven.errorsandthrowables;

// Throwable is the parent class of Error and Exception
// They will catch any problem thrown

public class Throwables {
	
	public static void main(String[] args) {
		try {
			new Throwables().throwIt();
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("Exception caught throwable!");
		} catch (Error e) {
			System.out.println("Error caught throwable");
		} catch (Throwable e) {
			System.out.println("Throwable caught!");
		} finally {
			System.out.println("fin");
		}
	}
	
	private void throwIt() throws Throwable {
		throw new Throwable();
	}
}
