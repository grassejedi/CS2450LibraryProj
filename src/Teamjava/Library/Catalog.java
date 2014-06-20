package Teamjava.Library;

/*******************************************
Juan Mendoza
CS2450
Library Project (Java group)
Catalog Class : It represents a library inventory,
  which includes books, DVDs, and Videotapes  
*********************************************/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
	}
	
	// constructor in case we decide to pass file name as parameter
	Catalog(String fileName){
		this.fileName=fileName;
		input = new Scanner(System.in); //opens a scanner, keyboard
	}
	
	//It will ask for the file name and will set it
	public void setFileName(){
		System.out.print("Enter file name: "); 	  //prompt the user
		fileName = input.nextLine();		  	//store the input from the user
		if (fileName.equals("0"))				  //way to exit the program in case no file name known
			System.exit(0);
		openFile(fileName);
		
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
	
	//same than readFile, I just though that I may add something here in the future
	//the name is also more correct
	public void populateCatalog(){
		readFile();
	
	}
	
	//It will create book objects from file parsing
	public Book createBook(String bookInfo){
		String[] fields = bookInfo.split("/");
		if(fields.length==7){
							   //Title,   author,   type,     media,    status 0=in 1=out,          date of loan started        holder
			Book book= new Book(fields[0],fields[1],fields[2],fields[3],Integer.parseInt(fields[4]),Integer.parseInt(fields[5]),fields[6]);
			return book;
		}
		//in case file contains missing information exit and report problem
		else{
			System.out.println("the file contains inconsistent information");
			System.exit(1);
			return null;
			}
	}
	
	//used to populate Catalog (book a a time) 
	private String addBook(Book newBook){
		books.add(newBook);
		System.out.println("You added "+ newBook.getDescription()+" to the Catalog");
		return "You added "+ newBook.getDescription()+" to the Catalog";
	}
	//remove a book (not in requirements, so not used now, but maybe useful for future requirements)
	private String removeBook(Book book){
		books.remove(book);
		System.out.println("You removed "+ book.getDescription()+" to the Catalog");
		return "You removed "+ book.getDescription()+"from the Catalog";
	}
	
	//returns a string with the book status (in|out)
	public String displayBookStatus(Book aBook){
		if (aBook.isCheckedOut()){
			//System.out.println("Book Out");
			return"Out";
		}
		else {
			//System.out.println("Book In");
			return "In";
		}
	}
	//String containing all books and their description
	public String allBooksStatus(){
		 String BookStatus="";
		 for(Book b: books ){
			 System.out.println(b.getDescription()+" "+displayBookStatus(b));
			 BookStatus+=b.getDescription()+" this Item is checked "+displayBookStatus(b)+"\n";
		 }
		 return BookStatus;
	 }
	
	//It will loop in all the catalog books and return a list of those
	//whose maximum loan time is be exceed 
	public List<Book> displayOverDueBooks(){
		List<Book> overDue= new ArrayList<Book>();
		for(int i=0; i<books.size(); i++){
			if (books.get(i).daysOut()>books.get(i).maxLoanTime()){
				overDue.add(books.get(i));
				System.out.println("Overdue: "+books.get(i).getDescription());
			}
		}
		if (overDue.size()>0){
			return overDue;
		}
		
		else{
			System.out.println("no overdue books");
			return overDue;
			}
	}
	
	//It will loop in all the catalog books and return a list of those
	//whose loaner matches the parameter passed  
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
	
        public Book findBook(String title){
            Book target=null;
		for(int i=0; i<books.size(); i++){
			if (books.get(i).getBookTitle().equals(title)){
                                target=books.get(i);
				return target;
			}
		}
                return target;
	}
        
        
	//It will write all book and the session changes to the file
	public void writeToFile(String fileToWrite) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter(fileToWrite, "UTF-8");
		
		for(Book b:books){
			writer.println(b.title+"/"+b.author+"/"+b.type+"/"+b.media+"/"+b.status+"/"+b.date+"/"+b.holder);
		}
		writer.close();
		
	}
}
