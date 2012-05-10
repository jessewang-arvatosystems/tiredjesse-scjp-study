package two.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class LocalBasics {
	
	public static void main(String[] dates) {
		Locale locIT = new Locale("it"); // Italian (Language, Country)
		Locale locITinCH = new Locale("it", "CH"); // Italian in Switzerland
		
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 14); // Note month starts at 0
		Date d = c.getTime();
		
		DateFormat[] df = new DateFormat[3];
		df[0] = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		df[1] = DateFormat.getDateInstance(DateFormat.FULL, locITinCH);
		df[2] = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locITinCH);
		
		System.out.println("Italian: " + df[0].format(d));
		System.out.println("Italian used in Switzerland: " + df[1].format(d));
		System.out.println("Time Described in Italian: " + df[2].format(d));
		
		// This works too, can't seem to figure this out right now
		Locale locJapan = new Locale("ja", "JP");
		TimeZone zone = TimeZone.getDefault();
		Calendar c2 = Calendar.getInstance(locJapan);
		Calendar c3 = Calendar.getInstance(zone);
		Calendar c4 = Calendar.getInstance(zone, locJapan);
		System.out.println(c2.getTime());
		System.out.println(c3.getTime());
		System.out.println(c4.getTime());
	}

}
