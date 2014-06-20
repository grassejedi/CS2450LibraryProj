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
    
     public String name;
     public boolean type;
     public int numberOfBooks;    

     public Patron(){
         super("/Users/abdulazizalmadi/Desktop/SoftwareEngineering/final_Project/netbeans/JavaApplication3/src/Library/test1.txt");
	 name="";
	 type= false;
	 numberOfBooks= 0;
     }

     public Patron( String name_ID, boolean _type, int numOfBooks){
	 super("/Users/abdulazizalmadi/Desktop/SoftwareEngineering/final_Project/netbeans/JavaApplication3/src/Library/test1.txt");
         name=name_ID;
	 type= _type;
	 numberOfBooks=numOfBooks;
     }

// Patron name1 checks out number of books
     public boolean checkout(String name1, int number){
       try{
         Patron checkingOut = new Patron();
         name= name1;
         type= checkingOut.type(name1);
         numberOfBooks= checkingOut.updateNumber(name1,0);
         if( type && numberOfBooks+number < 7){
             numberOfBooks= checkingOut.updateNumber(name,number);
             return true;
         }else if(!type && numberOfBooks+number < 4){
             numberOfBooks= checkingOut.updateNumber(name,number);
             return true;
         }
       }catch( Exception e){
	    System.out.println("IO error: Wrong file type or data type");
	    System.exit(0);
	}
         return false;
     }
// Patron name1 checks in number of books
     public boolean checkin(String name1, int number){
       try{
         Patron checkingIn = new Patron();
         checkingIn.name= name1;
         checkingIn.type= checkingIn.type(name1);
         checkingIn. numberOfBooks= checkingIn.updateNumber(name1,0);
         if( numberOfBooks-number >= 0){
             numberOfBooks= checkingIn.updateNumber(name,-number);
             return true;
         }
       }catch( Exception e){
	    System.out.println("IO error: Wrong file type or data type");
	    System.exit(0);
	}
         return false;
     }

     
   // is name1 adult..  
     public boolean isAdult(String name1){
       try{
         Patron tmp = new Patron();
         name= name1;
         type= tmp.type(name1);
       }catch( Exception e){
	    System.out.println("IO error: Wrong file type or data type");
	    System.exit(0);
	}
	 return type;
      }
   // returns the number of checked out books name1 has  
     public int numOfBooks(String name1){
       try{
         Patron checkingIn = new Patron();
         name= name1;
         type= checkingIn.type(name1);
         numberOfBooks= checkingIn.updateNumber(name1,0);
       }catch( Exception e){
	    System.out.println("IO error: Wrong file type or data type");
	    System.exit(0);
       }
       return numberOfBooks;
     }

     public static void printClients ( String[] array){
         for(int i=0;i< array.length;i++)
             System.out.println("clien "+i+" = "+ array[i]);
     }
     public static void main(String args[]){
	 try{
         Patron b1= new Patron();
         
         System.out.println(" Mike has 6 books, and Johne has 3 books");
         System.out.println(" is Mike adult? "+ b1.isAdult("Alex"));
         System.out.println(" Mikes number of books "+ b1.numOfBooks("Alex"));
         System.out.println(" Mike checks in 1 = "+ b1.checkin("Alex", 1));
         System.out.println(" Mikes number of books "+ b1.numOfBooks("Alex"));
        /* System.out.println(" is Johnes adult? "+b1.type("Johne"));
         System.out.println(" -2 books from Johne "+ b1.updateNumber("Johne", -2));
         System.out.println(" Johnes number of books "+ b1.updateNumber("Johne", 0));*/
         System.out.println(" Done ");
         printClients(b1.PatronsList());
        }catch( Exception e){
	    System.out.println("IO error: Wrong file type or data type");
	    System.exit(0);
	}
    }
}
