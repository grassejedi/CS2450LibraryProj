/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teamjava.Library;

import java.util.*;
import java.io.*;
/**
 *
 * @author abdulazizalmadi
 */
public class Patron extends Patrons{
    
//     public String name;
//     public boolean type;
//     public int numberOfBooks;    
//
//     public Patron(){
//         super("/Users/abdulazizalmadi/Desktop/SoftwareEngineering/final_Project/netbeans/JavaApplication3/src/Library/test1.txt");
//	 name="";
//	 type= false;
//	 numberOfBooks= 0;
//     }
//
//     public Patron( String name_ID, boolean _type, int numOfBooks){
//	 super("/Users/abdulazizalmadi/Desktop/SoftwareEngineering/final_Project/netbeans/JavaApplication3/src/Library/test1.txt");
//         name=name_ID;
//	 type= _type;
//	 numberOfBooks=numOfBooks;
//     }
//
//// Patron name1 checks out number of books
//     public boolean checkout(String name1, int number){
//       try{
//         Patron checkingOut = new Patron();
//         name= name1;
//         type= checkingOut.type(name1);
//         numberOfBooks= checkingOut.updateNumber(name1,0);
//         if( type && numberOfBooks+number < 7){
//             numberOfBooks= checkingOut.updateNumber(name,number);
//             return true;
//         }else if(!type && numberOfBooks+number < 4){
//             numberOfBooks= checkingOut.updateNumber(name,number);
//             return true;
//         }
//       }catch( Exception e){
//	    System.out.println("IO error: Wrong file type or data type");
//	    System.exit(0);
//	}
//         return false;
//     }
//// Patron name1 checks in number of books
//     public boolean checkin(String name1, int number){
//       try{
//         Patron checkingIn = new Patron();
//         checkingIn.name= name1;
//         checkingIn.type= checkingIn.type(name1);
//         checkingIn. numberOfBooks= checkingIn.updateNumber(name1,0);
//         if( numberOfBooks-number >= 0){
//             numberOfBooks= checkingIn.updateNumber(name,-number);
//             return true;
//         }
//       }catch( Exception e){
//	    System.out.println("IO error: Wrong file type or data type");
//	    System.exit(0);
//	}
//         return false;
//     }
//
//     
//   // is name1 adult..  
//     public boolean isAdult(String name1){
//       try{
//         Patron tmp = new Patron();
//         name= name1;
//         type= tmp.type(name1);
//       }catch( Exception e){
//	    System.out.println("IO error: Wrong file type or data type");
//	    System.exit(0);
//	}
//	 return type;
//      }
//   // returns the number of checked out books name1 has  
//     public int numOfBooks(String name1){
//       try{
//         Patron checkingIn = new Patron();
//         name= name1;
//         type= checkingIn.type(name1);
//         numberOfBooks= checkingIn.updateNumber(name1,0);
//       }catch( Exception e){
//	    System.out.println("IO error: Wrong file type or data type");
//	    System.exit(0);
//       }
//       return numberOfBooks;
//     }
//
//     public static void printClients ( String[] array){
//         for(int i=0;i< array.length;i++)
//             System.out.println("clien "+i+" = "+ array[i]);
//     }
//}
    private String name;
    private String type;            // "adult" or "child"
    private int amountCheckedOut;   // amount of books currently checked out by patron
    private int checkOutLimit;      // the max amount of books the patron is able to check out

    public Patron(String name, String type, int checkedOut){
        this.name = name;
        this.type = type;
        this.amountCheckedOut = checkedOut;
        if(type.equals("adult"))
            this.checkOutLimit = 6;
        else if(type.equals("child"))
            this.checkOutLimit = 3;
    }
    
    public String getName(){
        return this.name;
    }
            
    public boolean isAdult(){
        return type.equals("adult");
    }
    
    public boolean isChild(){
        return type.equals("child");
    }
    
    // Checks book out from library so that it is unavailable to be checked out again until returned.
    public int checkOut(Book book, int date){
        if(!canCheckOut(book)){
            System.out.println(this.name + " cannot check out: " + book.getBookTitle());
            return 1;
        }
        Patrons patrons = new Patrons("src/Teamjava/Library/allPatrons.txt");
        try{
            patrons.updateNumber(this.name, 1);
        }catch(Exception e){
            e.printStackTrace();
        }
        this.amountCheckedOut++;
        book.startLoan(date, this.name);
        return 0;
    }

    
    public int checkIn(Book book){
        //Only check in the book if this patron has it checked out
        if(!book.whoHasIt().equals(this.name)){
            System.out.println("Book: " + book.getBookTitle() + "is not checked out by " + this.name);
            return 1;
        }
        Patrons patrons = new Patrons("src/Teamjava/Library/allPatrons.txt");
        try{
            patrons.updateNumber(this.name, -1);
        }catch(Exception e){
            e.printStackTrace();
        }
        this.amountCheckedOut--;
        book.setloaner("library");
        book.modifyStatus();
        book.resetDaysOut();
        return 0;
    }
    

    @Override
    public String toString(){
        return "Name: " + this.name + ", Type: " + this.type + ", # checked out: " + this.amountCheckedOut; 
    }
    
    // Patron can check out if:
    // Adult && within checkout limit && book not checked out
    // Child && book is children's book && within checkout limit && book not checked out
    public boolean canCheckOut(Book b){
        return (isAdult() || isChild() && b.isChildrenBook()) && amountCheckedOut < checkOutLimit && !b.isCheckedOut();
    }
}
