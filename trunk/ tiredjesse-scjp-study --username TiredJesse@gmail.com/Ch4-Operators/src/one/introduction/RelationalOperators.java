package one.introduction;

public class RelationalOperators {
	public static void main(String args[]) {
		int no1 = 2;
		int no2 = 5;
		boolean result;
		
		//greater than
		result = no1 > no2;
		System.out.println("Greater than test: " + result);
		
		//greater than or equal to
		result = no1 >= no1;
		System.out.println("Greater than or equal to test: " + result);
		
		//less than
		result = no1 < no2;
		System.out.println("Less than test: " + result);
			
		//less than or equal to
		result = no2 <= no2;
		System.out.println("Less than or equal to test: " + result);
		
		//equal to
		result = no1 == no2;
		System.out.println("Equal to test: " + result);
		
		//not equal to
		result = no1 !=  no2;
		System.out.println("Not equal to test: " + result);
	}

}
