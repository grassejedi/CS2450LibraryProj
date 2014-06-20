/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author abdulazizalmadi
 */

import java.util.*;
import java.io.*;


public class Patrons {


    public  String dataBaseFile;
    public File file;
        

    public Patrons(String file_Name) {
        dataBaseFile= file_Name;
	file = new File(file_Name);
    }
    public boolean exisit(){
	return file.exists();
    }
    public boolean readable(){
	return file.canRead();
    }  
    public boolean canWrite(){
	return file.canWrite();
    }

    public String[] PatronsList()throws IOException{
        String [] clients= new String [20];
        Scanner fileReader = new Scanner(file);
        Scanner lineReader=new Scanner("");
        int i;
        String name,line;
        int trash;
        for(i=0; fileReader.hasNext()&& i< clients.length;i++){
            line=fileReader.nextLine();
            lineReader=new Scanner(line);
            name= lineReader.next();
            if( name.contains("##"))
                break;
            clients[i]=name; 
        }
        fileReader.close();
        lineReader.close();
        return clients;
    }
// reads the patrons type from the data base
    public boolean type(String patrons_name)throws IOException{
	String tmp="",tmp1="";
        int ii=0;
        Scanner fileReader = new Scanner(file);
        while( fileReader.hasNext()){
            if( patrons_name.contains(fileReader.next())){
                System.out.println( "in if 1");
                ii=fileReader.nextInt();
                System.out.println( "this is ii = "+ii);
                if(ii==1)
                    return true;
                break;
            }
        }
        fileReader.close();
        System.out.println( "checking patron type");
	return false;
    }


    /*
     * Updates the number of books when borrowed( increment).. namber is positive
     * Updates the number of books when returned( decriment..) number is negative
     * returns the number of borrowed books if number=0
     */
     public int updateNumber(String name, int number)throws IOException{
         long index;
         int tab;
         String line, number1="";
         RandomAccessFile fileStream= new RandomAccessFile(file,"rw");
         String doneReading = "##";
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
         }while( !line.equals(doneReading));
                 
         fileStream.close();
         return Integer.parseInt(number1)+number;   
     }
    }