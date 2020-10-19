package home;

public class Per {
	 int age;
	 String name;
	 
	 void talk()
	 {
		 System.out.println("age is:" +age);
		 System.out.println("name is: "+name);
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Per p= new Per();
      p.age=23;
      p.name="preeti";
    		 p.talk();
    		
	}

}


