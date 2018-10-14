package com.demo2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public Date convertStringToDate(String dateString) throws ParseException {
    Date result;
    synchronized(df) {
       result = df.parse(dateString);
    }
    return result;
    }  
    public static void main(String[] args) throws ParseException {
    	DateFormatDemo dateFormatDemo= new DateFormatDemo();
    	Date ss=dateFormatDemo.convertStringToDate("11/05/1985");
    	System.out.println(ss);
	}
}
