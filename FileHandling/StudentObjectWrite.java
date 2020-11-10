package Assignment7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class StudentObjectWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream fos= new FileOutputStream("Student");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		
		

		Student s= new Student(101,"PA",78,"java");
		Student s1= new Student(102,"AP",79,"c");
		Student s2= new Student(103,"AC",70,"c++");
		Student s3= new Student(104,"PB",72,"Python");
	//	Student s5= new Student(105,"ACPB",75,"c#");
		
		
		oos.writeObject(s);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		
		
		System.out.println("file object write is over");
		fos.close();
		
		
	

	}

}
