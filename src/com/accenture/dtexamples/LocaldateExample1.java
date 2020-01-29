package com.accenture.dtexamples;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
/**
 * 
 * @author mani.a.arora
 * Today's,Yesterday's,Tomorrow's date in Java 8
 * Current day,month and Year in Java 8
 *
 */
public class LocaldateExample1 {

	public static void main(String[] args) {
		
		//Today's Date
		//now()-Obtains the current date from the system clock in the default time-zone. 
		LocalDate date= LocalDate.now();
		//Yesterday's Date
		LocalDate yesterday= date.minusDays(1);
		//tomorrow's Date
		LocalDate tomorrow=date.plusDays(1);
		
		System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    
	   //Current day,month and year in java 8
	   //Way 1
	   int day=date.getDayOfMonth();
	   int month=date.getMonthValue();
	   int year=date.getYear();
	   System.out.printf("Year : %d  Month : %d  day : %d \n", year, month, day);
	   
	   //Way 2
	   //ChronoField enum defines a standard set of fields such as DAY_OF_MONTH, DAY_OF_WEEK, DAY_OF_YEAR, ERA, HOUR_OF_DAY, MINUTE_OF_HOUR
	   //ChronoField to extract the field value from a date.
	   int d=date.get(ChronoField.DAY_OF_MONTH);
	   int m=date.get(ChronoField.MONTH_OF_YEAR);
	   int y=date.get(ChronoField.YEAR);
	   
	   
	   System.out.printf("Year : %d  Month : %d  day : %d \n", y, m, d);
	   
	   //Plus and Minus Operations
	   System.out.println("Date After 10 days: "+date.plusDays(10));
	   System.out.println("Date After 3 weeks: "+date.plusWeeks(3));
	   System.out.println("Date After 20 months: "+date.plusMonths(20));
	   System.out.println("Date After 2 Years: "+date.plusYears(2));
	   
	   
	   System.out.println("Date before 10 days: "+date.minusDays(10));
	   System.out.println("Date before 3 weeks: "+date.minusWeeks(3));
	   System.out.println("Date before 20 months: "+date.minusMonths(20));
	   System.out.println("Date befor 2 Years: "+date.minusYears(2));
	   
	   //with method: returns a copy of an object with the specified field changed
	    //With Method-Returns a copy of this LocalDate with the year,dayOFMonth,monthOfYear altered. 
		
	   LocalDate localDate=date.withDayOfMonth(2).withYear(2018).withMonth(9);
	   System.out.println(localDate);
	   
		
       
		

	}

}
