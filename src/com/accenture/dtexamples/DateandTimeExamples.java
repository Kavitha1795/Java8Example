package com.accenture.dtexamples;

import java.util.Calendar;
import java.util.Date;

public class DateandTimeExamples {

	public static void main(String[] args) {

		Date d = new Date();

		System.out.println(d);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		
		c.set(2018, 1, 10);
		
		System.out.println(c.getTime());
	}
}
