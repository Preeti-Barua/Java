package home;

class Personone{
         private String name;
         private int age;
         
         public void setname(String name)
         {
        	 this.name=name;
         }
         public void setAge(int age)
         {
        	 this.age= age;
        	 
         }
         public String getName()
         {
        	 return name;
         }
         public int getAge()
         {
        	 return age;
         }
         
         
         
	
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personone p1=new Personone();
		p1.setname("Raju");
		p1.setAge(20);
		System.out.println("Name =" +p1.getName());
		System.out.println("Age =" +p1.getAge());
		
		

	}

}
