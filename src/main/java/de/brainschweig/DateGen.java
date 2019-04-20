package main.java.de.brainschweig;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddmmyyyy");
		Calendar calendar = new GregorianCalendar();
		try {
			calendar.setTime(sdf.parse("01011900"));

			while (calendar.getTime().compareTo(sdf.parse("01012018")) != 0) {
				// for(int a = 0; a < 1000; a++){
				System.out.println(sdf.format(calendar.getTime()));
				calendar.add(Calendar.DATE, 1);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
