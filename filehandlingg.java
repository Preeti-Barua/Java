package home;

import java.io.FileWriter;
import java.io.IOException;

public class filehandlingg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileWriter fw = new FileWriter("E-dac");
		// read data from console
       String str= "welcome to java E-learning";
       
       //write data into the file
       
       fw.write(str);
       System.out.println("File write is over");
       fw.close();
	}

}
