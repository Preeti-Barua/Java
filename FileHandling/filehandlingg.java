package home;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class filehandlingg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileWriter fw = new FileWriter("E-dac");
		// read data from console
       
       
       InputStreamReader ir= new InputStreamReader(System.in);
       BufferedReader br= new BufferedReader(ir);
       System.out.println("enter the string to write the file");
       String str;
       str=br.readLine();

       //write data into the file
       
       fw.write(str);
       System.out.println("File write is over");
       fw.close();
	}


}
