package home;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilereadString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  //Create or open it for readmode 
		
		FileReader fr= new FileReader("E-dac");
		BufferedReader br= new BufferedReader(fr);
		
	   String str=	br.readLine();
	   System.out.println("data got from file edac is="+str);
		fr.close();
		  //Read data from the file
		   //there is no direct method to read String
		
		
		
		}

}
