package one.dates;

import java.util.Calendar;
import java.util.Date;

public class DateBasics {
	
	public static void main(String... dates) {
		Date d = new Date();
		System.out.println("Date : " + d); // Prints current date (Day Month DayNo Time TIMEZONE Year)
		
		// Most of dates methods are deprecated, use Calendar instead.
		
		// Calendar is a singleton, must use getInstance() instead of new
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar: " + c.getTime()); // Same as new Date();
		
		c.add(Calendar.DAY_OF_YEAR, 30); // Adds to the days of the year
		System.out.println("Add 30 days: " + c.getTime()); // About a month ahead
		
		c.roll(Calendar.DAY_OF_WEEK, 7); // Roll loops around. (7 has no effect)
		System.out.println("Add 7 days in the week: " + c.getTime());
	}

}
