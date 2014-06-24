/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teamjava.Library;

import java.util.List;

/**
 *
 * @author Jon
 */
public class CirculationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulation c = new Circulation();
        c.setBookFileName("src/Teamjava/Library/allBooks.txt");
        
//      All Books
        System.out.println("________________All Books___________________");
        List<Book> books = c.listAllBooks(); 
        for(Book b: books){
            System.out.println(b.getBookTitle());
        }
        
        System.out.println();
        System.out.println("________________All Patrons___________________");
        List<Patron> patrons = c.listAllPatrons();
        for(Patron p:patrons){
            System.out.println(p.getName());
        }
        
        System.out.println();
        System.out.println("Child checking out children's book");
        c.checkOut("Black Beauty", "Bill");
        System.out.println(c.printStatus());                //Checked out: 1
        
        System.out.println();
        System.out.println("Child checking out adult's book (should fail)");
        c.checkOut("And Then There Were None", "Bill");     //Fail: cannot check out adult book
        
        System.out.println();
        System.out.println("2nd book");
        c.checkOut("The Little Prince", "Bill");
        System.out.println(c.printStatus());                //Checked out: 2
        
        System.out.println();
        System.out.println("Advance time");
        c.advanceOneDay();                                  //Advance one day
        System.out.println(c.printStatus()); 
        
        System.out.println();
        System.out.println("Try to check out a book that is already checked out (should fail)");
        c.checkOut("Black Beauty", "Bill");                 //Fail: Already checked out

        System.out.println();
        System.out.println("3rd book");
        c.checkOut("The Alchemist", "Bill");
        System.out.println(c.printStatus());                //Checked out: 3
        
        System.out.println();
        System.out.println("Advance time");
        c.advanceOneDay();                                  //Advance one day
        System.out.println(c.printStatus()); 
        
        System.out.println();
        System.out.println("Try to check out past limit (should fail)");
        c.checkOut("The Thorn Birds", "Bill");              //Fail: Limit reached

        System.out.println();
        System.out.println("------------Books checked out by Bill------------");
        books = c.listCheckedOutByPatron("Bill");
//        for(Book b: books){
//            System.out.println(b.getDescription());
//        }
        
        System.out.println();
        System.out.println("Check in a book");
        c.checkIn("The Little Prince", "Bill");
        System.out.println(c.printStatus());
        
        System.out.println();
        System.out.println("-----Books checked out by Bill (should be missing The Little Prince)----");
        books = c.listCheckedOutByPatron("Bill");
//        for(Book b: books){
//            System.out.println(b.getDescription());
//        }
        
        System.out.println();
        System.out.println("advance 4 days");
        c.advanceOneDay();c.advanceOneDay();c.advanceOneDay();c.advanceOneDay();
        
        System.out.println();
        System.out.println("-----Overdue Books-----");
        books = c.listOverdueBooks();
//        for(Book b: books){
//            System.out.println(b.getDescription());
//        }
        
        System.out.println();
        System.out.println("----Books available to Bill(should be childrens books that are checked in)---");
        books =c.booksAvailableToPatron("Bill");
        for(Book b: books){
            System.out.println(b.getBookTitle());
        }
        
        System.out.println();
        System.out.println("3rd book");
        c.checkOut("The Little Prince", "Bill");
        System.out.println(c.printStatus());                //Checked out: 3
        
        System.out.println();
        System.out.println("----Books available to Bill(should not show anything since he has 3 books checked out)---");
        books=c.booksAvailableToPatron("Bill");
        for(Book b: books){
            System.out.println(b.getBookTitle());
        }
        
        System.out.println();
        System.out.println("Adult checking out adult's book");
        c.checkOut("Dream of the Red Chamber", "Mike");
        System.out.println(c.printStatus());                //Checked out: 1
        
        System.out.println();
        System.out.println("-----Books checked out by Mike----");
        books = c.listCheckedOutByPatron("Mike");        
        //c.Exit();
    }
    
}
