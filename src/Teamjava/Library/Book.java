/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;


public class Book {
	String title;
	String type;
	String status;
	String holder;
	String date;
	int maxLoanTime;
	int daysOut;
	
	public Book(String title, String type, String status, String date){
		holder="library";
		daysOut=0;
		this.title=title;
		this.type=type;
		this.status=status;
		this.date=date;
		if(type.equals("Adult"))
			maxLoanTime=14;
		else if(type.equals("Children"))
			maxLoanTime=7;
		else if(type.equals("DVD"))
			maxLoanTime=2;
		else if(type.equals("Videotape"))
			maxLoanTime=3;
		else
			maxLoanTime=0;
	}
	
	public void modifyStatus(){
		if (status.equals("in"))
			status="out";
		else if (status.equals("out"))
			status="in";
		else{
			status="Undefined";
			System.out.println("Undefined book status");
			}
	}
	
	public boolean isCheckedOut() {
		if (status.equals("in")) 
			return false;
		else 
			return true;
		
	}
	
	public boolean isChildrenBook(){
		return (type.equals("Children"));
	}
	
	public boolean isAdultBook(){
		return (type.equals("Adult"));
	}
	
	public boolean isMedia(){
		return (type.equals("DVD")||type.equals("Videotape"));
	}
	public String getDescription() {
		String description="";
		description= "Title: "+title +" Type: "+ type+" the book is checked "+ status; 
		return description;
	}

	public int daysOut() {
		return daysOut;
	}

	public int maxLoanTime() {
		return maxLoanTime;
	}

	public Object whoHasIt() {
		return holder;
	}

	public String loanStarted() {
		return loanStarted();
	}
	
	public String getBookTitle(){
		return title;
	}
	public void setloaner(String holder){
		this.holder=holder;
	}
}

