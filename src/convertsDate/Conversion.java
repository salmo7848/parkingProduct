package convertsDate;

import java.util.Calendar;
import java.util.Date;

public class Conversion {
	
	public Calendar dateToCalendar(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;

	}
	
	public Date calendarToDate(Calendar calendar) {
		return calendar.getTime();
	}
	
	
}
