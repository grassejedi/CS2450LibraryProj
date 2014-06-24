/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathon
 */
public class Circulation 
{
    private String bookFileName;
    private Catalog catalog;
    private Patrons patrons;
    private String curStatus;
    private _Date date;
    
    public Circulation(){
        date = new _Date();
        catalog = new Catalog();
        patrons = new Patrons("src/Teamjava/Library/allPatrons.txt");
        populatePatrons();
    }
    
    // Set book file name and populate book list
    public int setBookFileName(String file){
        this.bookFileName = file;
        if(catalog.setFileName(bookFileName) == 1){
            setStatus(file + " is not a correct file format.");
            return 1;
        }else{
            catalog.populateCatalog();
            setStatus("Catalog populated with books from: " + file);
            return 0;
        }
        // We should get feedback from these two functions on success
        
    }
    
    public void checkOut(String bTitle, String pName){
        Patron p = patrons.findPatronByName(pName);
        Book b = findBookByTitle(bTitle);
        if(p.checkOut(b, date.getDate()) == 1)
            setStatus(pName + " cannot check out: " + bTitle);
        else
            setStatus(b.getBookTitle() + " checked out by " + p.getName());
    }
    
    public void checkIn(String bTitle, String pName){
        Patron p = patrons.findPatronByName(pName);
        Book b = findBookByTitle(bTitle);
        if(p.checkIn(b) == 1)
            setStatus("Error checking in");
        else
            setStatus(b.getBookTitle() + " checked in by " + p.getName());
    }
    
    public List<Book> listOverdueBooks(){
        return catalog.displayOverDueBooks();
    }
    
    public List<Book> listCheckedOutByPatron(String pName){
        return catalog.displayBooksByHolder(pName);
    }
    
    public List<Book> listAllBooks(){
        return catalog.getAllBooks();
    }
    
    public List<Patron> listAllPatrons(){
        return patrons.getAllPatrons();
    }
    
    // list books available to patron
    public List<Book> booksAvailableToPatron(String pName){
        List<Book> allBooks = catalog.getAllBooks();
        List<Book> available = new ArrayList();
        Patron p = patrons.findPatronByName(pName);
        for(Book b: allBooks){
            if(p.canCheckOut(b))
                available.add(b);
        }
        return available;
    }
    
    // write to book file and exit
    public void Exit(){
        try{
            catalog.writeToFile(bookFileName);
        }catch(Exception e){
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
        System.exit(0);
    }
    
    // For GUI
    public String printStatus(){
        return this.curStatus;
    }
    
    public String printCurrentDate(){
        return date.yearDateToCalendar(date.getDate());
    }
    
    public void advanceOneDay(){
        date.increaseDay();
        catalog.incrementDayForAllBooks();
        setStatus("Day is now: " + date.yearDateToCalendar(date.getDate()));
    }
    
    // Open patron file and populate patron list
    private void populatePatrons(){
        boolean err = false;
        
        if(patrons.openFile() == 1){
            setStatus("Failed to open patrons file");
            err = true;
        }
        if(patrons.populatePatrons() == 1){
            setStatus("Failed to read patrons file");
            err = true;
        }
        
        if(!err)
            setStatus("Patron list populated");
    }
    
    //Should return a book obj when passed in a book name, should probably go in Catalog
    private Book findBookByTitle(String t){
        List<Book> books = catalog.getAllBooks();
        for(Book book:books){
            if(book.getBookTitle().equals(t))
                return book;
        }
        System.out.println(t + " was not found in the list of books");
        return null;
    }
    
    // Set a message to be displayed to user
    private void setStatus(String message){
        this.curStatus = message;
    }
    
}
