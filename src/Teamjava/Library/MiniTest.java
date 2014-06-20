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
MiniTest class:
		Basic functionality test of: 
		Book, Catalog and _Date classes  
*********************************************/
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


public class MiniTest {
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		//testing Book Class**********************************************************************************************************
        //In parameters: the first 0 is status (0 means in, 1 means out) 
		//               the second 0 means the year day the book was check out( 1= means jan 01 2014, 365= means dec 31 2014)                       		
		//Book myBook= new Book("Book title","Book author","Adult","DVD",0,0,"holder");
		/*
		Book myBook= new Book("The Hobbit","J. R. R. Tolkien","Children","DVD",0,0,"library");
		Book myBook2= new Book("Harry Potter and the Deathly Hallows","J.K. Rowling","Children","book",1,100,"Child Scott");
		System.out.println(myBook.isCheckedOut());
		System.out.println(myBook.daysOut());
		System.out.println(myBook.getBookTitle());
		System.out.println(myBook.getDescription());
		System.out.println(myBook.whoHasIt());
		myBook.setloaner("Adult Jon");
		System.out.println(myBook.whoHasIt());
		System.out.println(myBook.maxLoanTime());
		System.out.println(myBook.isMedia());
		System.out.println("_________________________________");//book2
		System.out.println(myBook2.isCheckedOut());
		System.out.println(myBook2.daysOut());
		System.out.println(myBook2.getBookTitle());
		System.out.println(myBook2.getDescription());
		System.out.println(myBook2.whoHasIt());
		myBook2.setloaner("Child Mark");
		System.out.println(myBook2.whoHasIt());
		System.out.println(myBook2.maxLoanTime());
		System.out.println(myBook2.isMedia());
		//********************************************************************************************************************************
		*/
		
		//testing _Date Class*************************************************************************************************************
		/*
		_Date myDate= new _Date();
		System.out.println(myDate.getDate());
		System.out.println(myDate.yearDateToCalendar(myDate.getDate()));
		myDate.increaseDay();
		System.out.println(myDate.getDate());
		System.out.println(myDate.yearDateToCalendar(myDate.getDate()));
		//**********************************************************************************************************************************
		*/
		
		//testing Catalog Class*************************************************************************************************************
		/* 
		Catalog myCatalog = new Catalog();
		myCatalog.setFileName();
		myCatalog.populateCatalog();
		myCatalog.allBooksStatus();
		myCatalog.displayOverDueBooks();
		myCatalog.displayBooksByHolder("Neil");
		myCatalog.writeToFile("test.txt");
		//**********************************************************************************************************************************
		*/
	}

}

