/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teamjava.Library;

/**
 *
 * @author abdulazizalmadi
 */

import java.util.*;
import java.io.*;


public class Patrons {


//    public  String dataBaseFile;
//    public File file;
//        
//
//    public Patrons(String file_Name) {
//        dataBaseFile= file_Name;
//	file = new File(file_Name);
//    }
//    public boolean exisit(){
//	return file.exists();
//    }
//    public boolean readable(){
//	return file.canRead();
//    }  
//    public boolean canWrite(){
//	return file.canWrite();
//    }
//
//    public String[] PatronsList()throws IOException{
//        String [] clients= new String [20];
//        Scanner fileReader = new Scanner(file);
//        Scanner lineReader=new Scanner("");
//        int i;
//        String name,line;
//        int trash;
//        for(i=0; fileReader.hasNext()&& i< clients.length;i++){
//            line=fileReader.nextLine();
//            lineReader=new Scanner(line);
//            name= lineReader.next();
//            if( name.contains("##"))
//                break;
//            clients[i]=name; 
//        }
//        fileReader.close();
//        lineReader.close();
//        return clients;
//    }
//// reads the patrons type from the data base
//    public boolean type(String patrons_name)throws IOException{
//	String tmp="",tmp1="";
//        int ii=0;
//        Scanner fileReader = new Scanner(file);
//        while( fileReader.hasNext()){
//            if( patrons_name.contains(fileReader.next())){
//                System.out.println( "in if 1");
//                ii=fileReader.nextInt();
//                System.out.println( "this is ii = "+ii);
//                if(ii==1)
//                    return true;
//                break;
//            }
//        }
//        fileReader.close();
//        System.out.println( "checking patron type");
//	return false;
//    }
//
//
//    /*
//     * Updates the number of books when borrowed( increment).. namber is positive
//     * Updates the number of books when returned( decriment..) number is negative
//     * returns the number of borrowed books if number=0
//     */
//     public int updateNumber(String name, int number)throws IOException{
//         long index;
//         int tab;
//         String line, number1="";
//         RandomAccessFile fileStream= new RandomAccessFile(file,"rw");
//         String doneReading = "##";
//         do{
//             index= fileStream.getFilePointer();
//             line = fileStream.readLine();
//             Scanner s = new Scanner(line);
//             String tmp=s.next();
//             if( tmp.contains(name)){
//                number1=line.substring(line.length()-1,line.length());
//                line=line.substring(0,line.length()-1);
//                line+=Integer.parseInt(number1)+number;
//                fileStream.seek(index);
//                fileStream.writeBytes(line);
//                break;
//             }
//         }while( !line.equals(doneReading));
//                 
//         fileStream.close();
//         return Integer.parseInt(number1)+number;   
//     }
    // using Juan's Catalog class as a base
    private String fileName;			
    private BufferedReader in;			
    private String currentLine;	
    private Scanner input;
    private List<Patron> patrons;

    Patrons(){
        input = new Scanner(System.in);
        patrons = new ArrayList<Patron>();            
    }

    // Parameterized contructor for passing file name
    Patrons(String fileName){
        patrons = new ArrayList<Patron>(); 
        this.fileName=fileName;
        input = new Scanner(System.in);
    }

    public void setFileName(String file){
        this.fileName= file;
        openFile();
    }

    //To Open file the .txt file  
    public int openFile(){
        try {
                in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
                //sends a messages if failure opening the file
                System.out.println("Error opening file: "+fileName);
                System.out.println("Check file path, and/or spelling ie: fileName.txt");
                return 1;
        }
        return 0;
    }

    //it will read the file line by line until no more lines found
    private int readFile(){
        try {
                currentLine= in.readLine();
                while(currentLine!=null){
                        //it will construct Patron Objects Here
                        addPatron(createPatron(currentLine));
                        currentLine= in.readLine();
                }
        } catch (IOException e) {
                System.out.println("Error reading file");
                e.printStackTrace();
                return 1;
        }
        return 0;
    }

    public int populatePatrons(){
        return readFile();
    }

    // Converts line of file into Patron
    public Patron createPatron(String patronInfo){
        String[] info = patronInfo.split(" ");
        return new Patron(info[0],info[1],Integer.parseInt(info[2]));
    }

    private String addPatron(Patron newPatron){
            patrons.add(newPatron);
            System.out.println("You added "+ newPatron.getName()+" to the Patron list");
            return "You added "+ newPatron.getName()+" to the Patron list";
    }

    private String removePatron(Patron patron){
            patrons.remove(patron);
            System.out.println("You removed "+ patron.getName() +" from the Patron list");
            return "You removed "+ patron.getName()+" from the Patron list";
    }
    
    public List<Patron> getAllPatrons(){
        return patrons;
    }
    
    // Finds Patron using patron name
    // if name is not found, a new patron is created named "PatronNotFound"
    public Patron findPatronByName(String n){ 
        List<Patron> allPatrons = getAllPatrons();
        for(Patron p: allPatrons){
            if(p.getName().equals(n))
                return p;
        }

        System.out.println(n + " was not found in the list of patrons");
        return new Patron("PatronNotFound","adult",0);
    }
    
        /*
     * Updates the number of books when borrowed( increment).. namber is positive
     * Updates the number of books when returned( decriment..) number is negative
     * returns the number of borrowed books if number=0
     */
     public int updateNumber(String name, int number)throws IOException{
         long index;
         String line, number1="";
         RandomAccessFile fileStream= new RandomAccessFile(fileName,"rw");
         //String doneReading = "##";
         do{
             index= fileStream.getFilePointer();
             line = fileStream.readLine();
             Scanner s = new Scanner(line);
             String tmp=s.next();
             if( tmp.contains(name)){
                number1=line.substring(line.length()-1,line.length());
                line=line.substring(0,line.length()-1);
                line+=Integer.parseInt(number1)+number;
                fileStream.seek(index);
                fileStream.writeBytes(line);
                break;
             }
         }while( !line.equals(null));
                 
         fileStream.close();
         return Integer.parseInt(number1)+number;   
     }
}