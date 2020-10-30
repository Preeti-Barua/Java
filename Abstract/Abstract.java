package javaAssignment4;



abstract class Card
{
	  String nameoncard;
	  String number;
	  String cvv;
	  
	  
	

	 Card(String nameoncard, String number, String cvv)
	 {
			
			// TODO Auto-generated constructor stub
		     this.nameoncard=nameoncard;
			 this.number=number;
	    	 this.cvv=cvv;
	    	
	    	 
	    	 System.out.println("name :"+this.nameoncard); 
	    	 System.out.println("card number:"+this.number);
	    	 System.out.println("Cvv:" +this.cvv);
	    	 
	  }
	  
        abstract void pay(double amount);

	

}  




class Creditcard extends Card
{

	 
          Creditcard(String nameoncard, String number, String cvv, String expirationDate)
          {
                 super(nameoncard,number,cvv);
          }
          
		
		
		
	

	
	
        void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("amount in creditclass::"+amount);
      	   
		
	}
	
}
class Debitcard extends Card
{
	 Debitcard(String nameoncard, String number, String cvv, String expirationDate)
     {
               super(nameoncard,number,cvv);
     }
     

        void pay(double amount)
	{
		System.out.println("amount in debitclass::"+amount);

	}
        
}


public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Creditcard c=new Creditcard("Preeti","123734567","433","12-1-2021");
		c.pay(2346.9);

		
		
		
		Debitcard d=new Debitcard("Preetika","1734567","473","22-6-2021");
		d.pay(3456.77);
		
	
		
		

	}

}
