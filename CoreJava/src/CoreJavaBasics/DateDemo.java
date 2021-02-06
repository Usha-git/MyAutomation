package CoreJavaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Date d=new Date();//to find the current date
	SimpleDateFormat sdf=new SimpleDateFormat("M/dd/yyyy");//to convert our format whatever we want
	SimpleDateFormat sd=new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
	System.out.println(sd.format(d));
	System.out.println(sdf.format(d));
	System.out.println(d.toString());
	
	}

}
