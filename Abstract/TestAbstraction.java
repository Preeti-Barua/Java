package home;

abstract class Bike
{
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("running Safety");
	}
}
public class TestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b= new Honda();
		b.run();
		b.changeGear();
		

	}

}
