package javaAssignment4;

import java.util.Scanner;


 class  InSufficientFundException extends Exception {

	
 public InSufficientFundException(String msg)
 {
	 super(msg);
    }
 
}




 class Account {
	 
	 
	
	
	 void withdraw()
	 
	 {
		 Scanner s= new Scanner(System.in);
		 
		 int withdrawal;
		    int amount = 3000;

		  System.out.println("enter the amount you want to withdrawal");
		
		 withdrawal=s.nextInt();
   try {
	   
	   if(withdrawal>amount)
	   {
		   InSufficientFundException e=new InSufficientFundException("the amount is more than current amount");
		   throw e;
	   }
	   
	   
   }
   catch(InSufficientFundException e){
	   
	   
	   System.out.println(e);
	   
   }
   
   amount= amount-withdrawal;
   System.out.println("total amount after withdrawal is:"+amount);
   
   
 }
 }
 

 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		      Account a= new Account();
		      a.withdraw();
		
	}

}
