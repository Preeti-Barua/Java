package corejava;

class Personone
{

	int id;
	String name;
	int age;
		
	public Personone(int id, String name, int age) {
		// TODO Auto-generated constructor stub

		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	void dispPerson()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
}
  class Student extends Personone
 {
    int mark;

 	Student(int id,String name,int age,int mark)
 	{
 		
 		super(id,name,age);
 		this.mark=mark;
 		//it invoke super class parametarised constructor
 		
 		
 	}
 	
 	
 	void Printmark()
 	{
 		System.out.println(mark);
 	}
 	
 	void findResult()
 	{
 		if(mark>30)
 		{
 			System.out.println("pass");
 			
 		}
 		else
 		{
 			System.out.println("fail");
 		}
 		
 	}
 	
 		
 }
  class Teacher extends Personone
{
	int sal;
	    Teacher(int id, String name, int age, int sal)
	   
	   {
		   super(id,name,age);
		   this.sal=sal;
		   
	   }
		public void dispsal() {
			// TODO Auto-generated method stub
			System.out.println("Salary is " +sal);
		}
}
	

public class TestInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Student s= new Student(101,"preeti",22,600);
		s.dispPerson();
		s.Printmark();
		s.findResult();
		  
		     Teacher t= new Teacher(101,"p",10,1000);
		     t.dispPerson();
		      t.dispsal();
		    
		       
	}

}
