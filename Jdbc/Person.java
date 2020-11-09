package corejava;

public class Person {
	
	
	String name;

    
	int id;
	String email;
	String gender;
	
	Person(String name, int id, String email, String gender)
	{
		this.name= name;
		this.id= id;
		this.email=email;
		this.gender=gender;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
