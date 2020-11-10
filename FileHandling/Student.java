package Assignment7;

import java.io.Serializable;

public class Student implements Serializable {
	


	int id;
	String name;
	int marks;
	String subject;
	
	
	Student(int id, String name, int marks, String subject)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.subject=subject;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+marks+" "+subject);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", subject=" + subject + "]";
	}

}
