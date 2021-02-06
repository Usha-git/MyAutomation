package CoreJavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
	
		 Calendar cal=Calendar.getInstance();// Create instance for calendar class
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));// to print the current date
		System.out.println(cal.get(cal.DAY_OF_MONTH));//to get olny date
		System.out.println(cal.get(cal.DAY_OF_WEEK_IN_MONTH));// to get the week
		System.out.println(cal.get(cal.MINUTE));
	}

}
