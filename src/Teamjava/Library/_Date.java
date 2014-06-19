/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

/*******************************************
Juan Mendoza
CS2450
Library Project (Java group)
Catalog _Date : It represents a manipulable date object
                to increase date virtually 
*********************************************/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class _Date {

	int dayOfYear;
	
	public _Date(){
	Calendar calendar = Calendar.getInstance();
	dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
	}
	
	public void increaseDay(){
		dayOfYear++;
	}
	
	public int getDate(){
		return dayOfYear;
	}
	
	public String getDateMMDDYY(){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		   //get current date time with Date()
		   Date date = new Date();
		   System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
		
	}
	public String yearDateToCalendar(int yearDay) {
		Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.DAY_OF_YEAR, yearDay);
	    String _date= calendar.getTime().toString();
		return _date;
	}
	
}

