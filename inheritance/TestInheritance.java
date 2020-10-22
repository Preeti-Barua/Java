package corejava;


class BankAccount{
	
    int accountNumber=101;
    int totalbalance=3000;
    
  
  
    	           
    	        		   

 void deposit(int a)
    {
   
    	totalbalance= totalbalance+a;
    	System.out.println("after deposit: "+totalbalance);
    }
    void withdraw(int a)
    {
 
    	totalbalance=totalbalance-a;
    	System.out.println("After withdrawal: "+totalbalance);
    	
    }
    void getBalance()
    {   
    	
    	  System.out.println("your balance:"+totalbalance);
    
    	
    }
}
class CheckingAccount extends BankAccount
{
   int fee=2000;
   


   
   void deductFee(int n)
   {
	  
	  totalbalance=totalbalance-fee;
	  System.out.println("your balance  after fee deduction:"+totalbalance);
	   
   }
   
   
   
}






class SavingAccount extends BankAccount {
 
 
	
	int interestRate;
	 
	void addInterest()
	{
		
		int sum=  (totalbalance/2)/100;
		 System.out.println("interst amount is:"+sum);
		
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		BankAccount s= new BankAccount();
	  s.deposit(5000);
	  s.withdraw(4);
	  s.getBalance();
	  
		
	  CheckingAccount c= new CheckingAccount();
	  c.deposit(5000);
	  c.withdraw(1000);
	  c.getBalance();
	  c.deductFee(2000);
	  
	  */
	  SavingAccount a= new SavingAccount();
	  a.deposit(5000);
	  a.withdraw(1000);
	  a.getBalance();
	  a.addInterest();
	  
	  
		

	}

}
