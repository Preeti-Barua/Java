package home;

class Homework
{
	int age;
	String name;
	float sal;
	
	
	

	void setdata(int age,String name,float sal)
	{
		this.age=age;
		this.name=name;
		this.sal=sal;
		System.out.println(age +" "+name+" "+sal);
		
	}

	
	
}
public class Perone {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Homework h= new Homework();
		h.setdata(23, "Pb", 2300);


	
		Homework h1= new Homework();
		h1.setdata(23, "ac", 33000);
		
		
	
	
		
		
		

	}

}
