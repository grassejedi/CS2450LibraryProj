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
    
    public Circulation(){
        catalog = new Catalog();
        patrons = new Patrons("allPatrons.txt");
        populatePatrons();
    }
    
    // Open patron file and populate patron list
    private void populatePatrons(){
        patrons.openFile();
        patrons.populatePatrons();
    }
    
    // Set book file name and populate book list
    public void setBookFileName(String file){
        this.bookFileName = file;
        catalog.setFileName(bookFileName);
        catalog.populateCatalog();
    }
    
    public int checkOut(String bTitle, String pName){
        Patron p = patrons.findPatronByName(pName);
        Book b = findBookByTitle(bTitle);
        return p.checkOut(b);               //return 0 or 1 depending on success
    }
    
    public int checkIn(String bTitle, String pName){
        Patron p = patrons.findPatronByName(pName);
        Book b = findBookByTitle(bTitle);
        return p.checkIn(b);            //return 0 or 1 depending on success
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
    
    public void Exit(){
        try{
            catalog.writeToFile(bookFileName);
        }catch(Exception e){
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
        System.exit(0);
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
}
