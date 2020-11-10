package Assignment7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentObjectRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student p;
		FileInputStream fis=new FileInputStream("Student");
	//	FileInputStream fis1=new FileInputStream("Student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	//	ObjectInputStream ois1=new ObjectInputStream(fis1);
		System.out.println("1.to see result along with subject status pass/fail \n 2. to sort marks  ");
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		switch (op) 
		
		{
		// case 1
		case 1: 	int pass=0,fail=0;
		try {
			while((p= (Student) ois.readObject()) != null) {
				int minmarks=40;
				String a="Passed",b="Fail";
				if(p.marks > minmarks ) {
				System.out.println(a);
				System.out.println(p.id +" " + p.name + " " +p.marks +" " +p.subject);
				pass++;
		
					
					String status="Passed";
					System.out.println("Result " +status);
					System.out.println("Student Passed in " +p.subject +" with marks " +p.marks);
					System.out.println("----------------------------------------------------------");
					
			
				}
				else {
					
					System.out.println(b);
					System.out.println(p.id +" " + p.name + " " +p.marks +" " +p.subject);
					fail++;
					
						String status="Failed";
						System.out.println("Result " +status);
						System.out.println("Student failed in " +p.subject +" with marks " +p.marks);
						System.out.println("----------------------------------------------------------");
						
					
				}
				
			}
			
		}
		
			
		 catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println("Total Student passed " +pass);
				System.out.println("Total student failed "+fail);
			System.out.println("Result Declared");
		}
			
			break;
			//case 2
		case 2: ArrayList<Student> al=new ArrayList<Student>();
		
		try{while((p=(Student) ois.readObject()) != null){
			
			al.add(p);
		}}
		catch(EOFException y) {
			System.out.println("Data wriiten into the array list after fetching it from the file");
		}
		
		Sortbymarks z=new Sortbymarks();
		Collections.sort(al,z);
		
		for (Student student : al) {
			System.out.println(student);
		}
		
		System.out.println("---------------------------------------------------------------------------------------- ");
			

		default:
//			System.out.println("Wrong input");
			break;
		}
	
////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////	
		
		
}
	


}

class Sortbymarks implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.marks>o2.marks)
			return -1;
		else 
			return 1;
		//return o1.name.compareTo(o2.name);
	}

}
