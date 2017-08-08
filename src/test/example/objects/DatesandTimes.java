/**
 * 
 */
package test.example.objects;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Julian Schroeter
 *
 */
public class DatesandTimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Date date = new Date();
			System.out.println(date);
			
			GregorianCalendar gc = new GregorianCalendar(2019, 1, 23);
			gc.add(GregorianCalendar.DATE, 1);
			Date d2 = gc.getTime();
			System.out.println(d2);
			
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
			System.out.println(df.format(d2));
			
			LocalDateTime ldt = LocalDateTime.now();
			System.out.println(ldt);
			
			LocalDate ld = LocalDate.of(2019, 1, 23);
			System.out.println(ld);
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
			System.out.println(dtf.format(ld));
	}

}
