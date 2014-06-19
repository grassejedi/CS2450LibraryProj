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
Book Class : It represents a library item,
  which includes books, DVDs, and Videotapes  
*********************************************/
import java.util.Calendar;
import java.util.Date;

public class Book {
	//Variables that represent book description 
	String title;
	String author;
	String type;		// Adult | Children
	int status;       	// 0 checked in | 1 checked out
	String holder;
	int date;			// date when loan started
	String media;		// book | DVD | videotape
	int maxLoanTime;
	int daysOut;
	//ourDate is an object to manipulate date (travel to future) 
	_Date ourDate;
	
	public Book(String title,String author, String type,String media, int status, int date, String holder){
		ourDate= new _Date();
		daysOut=0;
		this.holder=holder;
		this.author=author;
		this.title=title;
		this.type=type;
		this.status=status;
		this.media=media;
		this.date=date;
		// setting up the maximum loan time base on type and media
		if(type.equals("Adult"))
			maxLoanTime=14;
		if(type.equals("Children"))
			maxLoanTime=7;
		if(media.equals("DVD"))
			maxLoanTime=2;
		if(media.equals("Videotape"))
			maxLoanTime=3;
	}
	
	//it changes the book status from 0= checked in to 1= checked out (and the other way back)   
	public void modifyStatus(){
		if (status==0)
			status=1;
		else if (status==1)
			status=0;
		else{
			status=-1;
			System.out.println("Undefined book status");
			}
	}
	
	//to verify that a book is check in
	public boolean isCheckedOut() {
		if (status == 0) 
			return false;
		else 
			return true;
	}
	
	//to verify the type of items *****************
	public boolean isChildrenBook(){
		return (type.equals("Children"));
	}
	
	public boolean isAdultBook(){
		return (type.equals("Adult"));
	}
	
	public boolean isMedia(){
		return (media.equals("DVD")||type.equals("Videotape"));
	}
	//**********************************************
	
	public String getDescription() {
		String description="";
		description= "Title: "+title +"  Author: "+author +"  Type: "+ type+"  Media type: "+ media; 
		return description;
	}

	//it will be used to determine overdue books
	public int daysOut() {	
		if (date==0)
			return 0;
		
		daysOut=ourDate.getDate()-date;
		return daysOut;
		
	}

	public int maxLoanTime() {
		return maxLoanTime;
	}

	public Object whoHasIt() {
		return holder;
	}
	//it will return containing the date (in regular calendar form)
	public String loanStarted() {
		if (date == 0) return "this item is checked in";
		Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.DAY_OF_YEAR, date);
	    String _date= calendar.getTime().toString();
		return _date;
	}
	
	public String getBookTitle(){
		return title;
	}
	//it will be used when checking in and out books
	public void setloaner(String holder){
		this.holder=holder;
	}
}
