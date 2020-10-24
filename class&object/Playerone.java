package corejava;
class Player


{
	
	String name;
	int age;
	String country;
	int totalrun;
	
	
	
	Player(String name, int age, String  country, int totalrun)
	{
		this.name=name;
		this.age=age;
		this.country=country;
		this.totalrun=totalrun;
		this.score();
		
		
	}


void Disp()
{     
	System.out.println(name);
	System.out.println(age);
	System.out.println(country);
	System.out.println(totalrun);
	
	  
}


void score(){
	 
	
	   if(totalrun>5000)
	   {
		   Disp();
	   }
	    
}
}

public class Playerone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Player p= new Player("a",23,"Ind",5500);
	//	p.score();
		Player p1= new Player("c",22,"nz",3000);
	//	p1.score();
		Player p2= new Player("p",26,"aus",2000);
	//	p2.score();
		Player p3= new Player("b",21,"ban",1000);
	//	p3.score();
		Player p4= new Player("acpb",24,"SL",8000);
	//	p4.score();
		
		

	}

}
