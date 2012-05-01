package two.otheroperators;

public class ConditionalOperator {
	
	public static void main(String[] conditions) {
		int no1 = 5;
		int no2 = 3;
		int no3 = 4;
		String msg;
		
		msg = (no1 > no2) ? "no1 is greater than no2" : "no1 is less than no2"; 
		System.out.println(msg);
		
		// same as
		if(no1 > no2) {
			msg = "no1 is greater than no2";
		} else {
			msg = "no1 is less than no2";
		}
		System.out.println(msg);
		
		msg = (no2 > no1) ? "no2 is greater than no1" : (no2 > no3) ? "no2 is greater than no3" 
				: "no2 is less than no3";
		System.out.println(msg);
		
		// same as
		if (no2 > no1) {
			msg = "no2 is greater than no1";
		} else if (no2 > no3) {
			msg = "no2 is greater than no3";
		} else {
			msg = "no2 is less than no3";
		}
		System.out.println(msg);
	}

}
