package javaassignmnet2;

public class Author {
	
	
	 String name;
	 String email;
     char Gender;
	
	

Author(String name, String email, char Gender)
{
	this.name=name;
	this.email=email;
	this.Gender=Gender;
}



public  String getName()
{
	   return name;
}

 
public String getEmail()
{
	return email;
}

public char getGender()
{
	return Gender;
}


}
