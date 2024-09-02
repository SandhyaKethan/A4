package genericUtilityOrLib;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * this is a class to get all java related
 * @author sandhya
 * @version 1.8.24
  */

public class JavaUtility {
	/**
	 * this is a generic method for calendar
	 * @param pattern
	 * @return
	 */
public String CalendarHandling(String pattern) {
	Calendar cal=Calendar.getInstance();
	Date d=cal.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat(pattern);
	String date=sdf.format(d);
	return date;
}
/**
 * this is a generic random class method to avoid duplicates
 * @param range
 * @return
 */
public int getRandomNumber(int range) {
	Random r=new Random();
	int num=r.nextInt(range);
	return num;
}
}
