/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.util.List;

/**
 *
 * @author Jonathon
 */
public class Circulation 
{
    private Catalog catalog;
    //private Patrons patrons;
    
    public void Circulation(){
        catalog = new Catalog();
        //patrons = new Patrons("patrons.txt");
    }
    
    public void setBookFileName(){
        catalog.setFileName();
    }
    
    public int checkOut(Book b, Patron p){
        return p.checkOut(b);           //return 0 or 1 depending on success
    }
    
    public int checkIn(Book b, Patron p){
        return p.checkIn(b);            //return 0 or 1 depending on success
    }
    
    public List<Book> listOverdueBooks(){
        return catalog.displayOverDueBooks();
    }
    
    public List<Book> listBooksByPatron(Patron p){
        return catalog.displayBooksByHolder(p.getName());
    }
    
    public List<Book> listAllBooks(){
        return catalog.books;
    }
    
    public List<Book> booksAvailableToPatron(){
        
    }
}
