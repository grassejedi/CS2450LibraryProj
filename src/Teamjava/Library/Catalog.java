package Teamjava.Library;

/*
Juan Mendoza
CS2450
Library Project (java group)
File reader
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalog {
	
	//GLobal Variables
	public String fileName;			
	BufferedReader in;			
	String currentLine;	
	Scanner input;
	String content;
	List<Book> books;
	Book currentBook;
	//constructors
	Catalog(){
		input=new Scanner(System.in);
		books = new ArrayList<Book>();
		content="";//delete this not needed
		
	}
	
	// constructor in case we decide to pass file name as parameter
	Catalog(String fileName){
		this.fileName=fileName;
		input = new Scanner(System.in); //opens a scanner, keyboard
		content="";
	}
	
	//It will ask for the file name and will set it
	public void setFileName(){
		System.out.print("Enter file name: "); 	  //prompt the user
		String fileName = input.nextLine();		  //store the input from the user
		if (fileName.equals("0"))				  //way to exit the program in case no file name known
			System.exit(0);
		openFile(fileName);
		this.fileName= fileName;
	}
	
	//To Open file the .txt file  
	public void openFile(String fileName){
		try {
			in = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			//sends a messages if failure opening the file
			System.out.println("Error opening file: "+fileName);
			System.out.println("Check file path, and/or spelling ie: fileName.txt");
			System.out.println("Try again, or enter 0 as file name to terminate program");
			setFileName();
		}
	}
	
	//it will read the file line by line until no more lines found
	private void readFile(){
		try {
			currentLine= in.readLine();
			while(currentLine!=null){
				//it will construct Book Objects Here
				addBook(createBook(currentLine));
				currentLine= in.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}
	}
	
	public void populateCatalog(){
		readFile();
	}
	
	public Book createBook(String bookInfo){
		return null;
	}
	
	private String addBook(Book newBook){
		books.add(newBook);
		System.out.println("You added "+ newBook.getDescription()+" to the Catalog");
		return "You added "+ newBook.getDescription()+" to the Catalog";
	}
	private String removeBook(Book book){
		books.remove(book);
		System.out.println("You removed "+ book.getDescription()+" to the Catalog");
		return "You removed "+ book.getDescription()+"from the Catalog";
	}
	public String displayBookStatus(){
		if (currentBook.isCheckedOut()){
			System.out.println("Book Out");
			return"Book Out";
		}
		else {
			System.out.println("Book In");
			return "Book In";
		}
	}
	
	public List<Book> displayOverDueBooks(){
		List<Book> overDue= new ArrayList<Book>();
		for(int i=0; i<books.size(); i++){
			if (books.get(i).daysOut()>books.get(i).maxLoanTime()){
				overDue.add(books.get(i));
				System.out.println("Overdue: "+books.get(i).getDescription());
			}
		}
		return overDue;
	}
	
	public List<Book> displayBooksByHolder(String holder){
		List<Book> booksOut= new ArrayList<Book>();
		for(int i=0; i<books.size(); i++){
			if (books.get(i).whoHasIt().equals(holder)){
				booksOut.add(books.get(i));
				System.out.println(holder +" checked out: "+books.get(i).getDescription()+" on :"+books.get(i).loanStarted());
			}
		}
		return booksOut;
	}
	
}
