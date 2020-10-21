package corejava;

 class ConstructorAcco {
	
	   int  Accountno;
	   String AccountName;
	   int Amount;
	   
	   
	  
	   
	   ConstructorAcco(int Accountno, String AccountName,int Amount)
	   {  
		  
		  this. Accountno=Accountno;
		  this. AccountName=AccountName;
		   this.Amount=Amount;
		   this.dispStudent(); // this line will execute disp method 
		   this.withdrawl(100);    //this line will execute withdrawl method 
		   this.deposit(4000);//this line will execute deposit method 
		  
	   }
	   

	void dispStudent()
	   {
		   System.out.println(Accountno);
		   System.out.println( AccountName);
		   System.out.println( Amount);
		   
	   }
	
	
	void withdrawl(int i)
	{
		
		      int sum= Amount-i;
		      System.out.println("after withdrawl::  " +sum);
	}
	void deposit(int i)
	{
		int sum=Amount+i;
		 System.out.println("current balance after Deposit:"+sum);
	}
}
	   
	 class  ConstructorAccount
	 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorAcco a= new ConstructorAcco(12,"preeti",1000);
		//a.dispStudent();
		
		

	}

}
