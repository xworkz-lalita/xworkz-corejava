package com.xworkz.solution;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DA {
	public static void main(String[] args) {
	/*DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    Calendar date = new GregorianCalendar();
    System.out.println( format.format(date.getTime()) );
    date.add(Calendar.DATE, 0);
  
  }*/
		 DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		    Calendar date1 = new GregorianCalendar();
		    Calendar date2 = (Calendar)date1.clone();
		    date2.add(Calendar.DATE, -8500);
		    
		    System.out.println(format.format(date2.getTime()));
		 
		  }

}