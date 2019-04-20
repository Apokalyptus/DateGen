package de.brainschweig;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Calendar calendar = new GregorianCalendar();
		try {
			calendar.setTime(sdf.parse("01011900"));

			while (calendar.getTime().compareTo(sdf.parse("01012020")) != 0) {
				// for(int a = 0; a < 1000; a++){
				System.out.println(sdf.format(calendar.getTime()));
				calendar.add(Calendar.DAY_OF_YEAR, 1);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
