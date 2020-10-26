package overiding;
class Animal
{
	 void makesound()
	 {
		 System.out.println("Performing Overriding");
	 }
}

class Dog extends Animal{
	
	void makesound()
	{
		System.out.println("Dogs barks");
	}
}

class Cat extends Animal{
	   void makesound()
	   {
		   System.out.println("Cat meows");
	   }
}
public class Overloadingone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cat c= new Cat();
		c.makesound();

	}

}
