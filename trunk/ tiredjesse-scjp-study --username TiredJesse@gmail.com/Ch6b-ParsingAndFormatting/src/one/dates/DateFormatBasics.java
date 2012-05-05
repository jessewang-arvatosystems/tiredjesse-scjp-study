package one.dates;

import java.text.DateFormat;
import java.util.Date;

/* getInstance() is the only date format that returns the current time
 * getDateInstance() is the same as DateFormat.MEDIUM
 * DateFormat.SHORT returns the numerical date form
 * DateFormat.LONG returns the month (long)
 * DateFormat.FULL is the only date format that returns the current day of the week
 */

public class DateFormatBasics {
	public static void main(String format[]) {
		Date d = new Date(1000000000000L);
		
		DateFormat[] df = new DateFormat[6];
		df[0] = DateFormat.getInstance(); // month/day/year time
		df[1] = DateFormat.getDateInstance(); // month(short) day, year
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT); // month/day/year
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM); // month(short) day, year
		df[4] = DateFormat.getDateInstance(DateFormat.LONG); // month(long) day, year
		df[5] = DateFormat.getDateInstance(DateFormat.FULL); // day of week, month(long) day, year
		
		for (DateFormat formatter : df)
			System.out.println(formatter.format(d));
	}
}
