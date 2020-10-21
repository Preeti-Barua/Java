package corejava;

class Learn{
	
	
	
	int id;
	String name;
	int marks;
	static String cname="its";
	
	
	public Learn(int id, String name, int marks )
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
		
		
	}
	
	
	void  dispStudent()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(cname);
		
	}
	
	
	
	
	
	
}





public class LearningConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		Learn s1= new Learn(1001,"p",40);
		s1.dispStudent();
		Learn s2= new Learn(1002,"A",41);
		s2.dispStudent();
		
		
		
		 
	}

	

}
