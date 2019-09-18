package Day14;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
	public static void main(String args[]) throws IOException
	{	
		 FileReader file = new FileReader("C:\\test\\hello.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	      
	            System.out.println(fileInput.readLine()); 
	          
	  
	}

}
