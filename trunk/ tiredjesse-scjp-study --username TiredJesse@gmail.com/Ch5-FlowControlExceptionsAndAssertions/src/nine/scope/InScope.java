package nine.scope;

public class InScope {
	
	public static void main(String... test) {
		
		if (true) {
			int x = 5;
			System.out.println(x);
		}
//		System.out.println(x); // x is only within the if-block's scope
		
		for(int x=0;x<3;x++) {
			System.out.println(x);
		}
//		System.out.println(x); // x is only within the for loop scope
		
		try {
			int x = 7;
			System.out.println(x);
		} catch (Exception ex) {
//			System.out.println(x); // x is only within the try block's scope
		} finally {
//			System.out.println(x); // x is not in scope
		}
		
		
		
	}

}
