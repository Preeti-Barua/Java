package javaAssignment4;

abstract class Employee
{
	  String name;
	  String ssn;
	  
	  
	  Employee(String name)
	  {
		  this.name=name;
		
		  System.out.println("the name :"+name);
		  System.out.println("the name :"+ssn);
		  
		  
	  }
	  
	  
	  abstract void salary();
	  
	  
	  
}
class CommissionEmployee extends Employee{

	


	double sales,commission,salary;

	public CommissionEmployee(String name,double sales, double commission) {
		super(name);
		this.sales = sales;
		this.commission = commission;
	}
	
	
	
	

	@Override
	void salary() {
		// TODO Auto-generated method stub
		this.salary=this.sales*this.commission;
		System.out.println("the salary is "+this.salary);
		
		
		
		
	}
	
	
	   
	
}

class HourlyEmployee extends Employee
{
	double wage,hours,sal;

	public HourlyEmployee(String name,double wage, double hours) {
		super(name);
		this.wage = wage;
		this.hours = hours;
	}
	
	void salary()
	{
		this.sal=this.wage*this.hours ;
		System.out.println("the hourly salary is "+this.sal);
				
	}
}
public class Abstractone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HourlyEmployee ce= new HourlyEmployee("Preeti",1000,57.9);
				ce.salary();
				
				
				
		
		

	}

}
