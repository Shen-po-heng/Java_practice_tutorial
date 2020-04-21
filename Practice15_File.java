package practice;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileWriter;	// Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/*
Program name: File
Editor:Shen Po Heng
Date:04.07.2020 
goal: File of Java
The File class from the java.io package, allows us to work with files. 
*/

public class Practice15_File {
	  public static void main(String[] args) {
		  	//Create a file
		    try {
		      File f= new File("file.txt");
		      if (f.createNewFile()) {
		        System.out.println("File created: " + f.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    //Write To a File
		    try {
		        FileWriter Writer = new FileWriter("file.txt");
		        Writer.write("Haha, it is fun enough!");
		        Writer.close();
		        System.out.println("Successfully wrote to the file.");
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    //Read a File
		    try {
		        File Read = new File("file.txt");
		        Scanner Get = new Scanner(Read);
		        while (Get.hasNextLine()) {
		          String data = Get.nextLine();
		          System.out.println(data);
		        }
		        
		      } catch (FileNotFoundException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    
		    //Get File Information
		    File Obj = new File("filename.txt");
		    if (Obj.exists()) {
		      System.out.println("File name: " + Obj.getName());
		      System.out.println("Absolute path: " + Obj.getAbsolutePath());
		      System.out.println("Writeable: " + Obj.canWrite());
		      System.out.println("Readable " + Obj.canRead());
		      System.out.println("File size in bytes " + Obj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		    //Delete a File
		    /*
		    File Obj02 = new File("filename.txt"); 
		    if (Obj02.delete()) { 
		      System.out.println("Deleted the file: " + Obj02.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    }
		     */
	  }
}