/* 4) Write a Java program that creates a  account class with instance variable accno,accname,amount and instance method 
 withdraw, deposit, and  interest. Create object of account class test all methods.*/
package corejava;

import java.util.Scanner;

class Account{
	
	//instance variable
	     int accno;
	     String accname;
	     int amount;
	


        //instance method
	 	void readData()
		   {
			   Scanner s= new Scanner(System.in);
			   System.out.println("enter account no");
			   accno=s.nextInt();
			   System.out.println("enter name");
			   accname=s.next();
			   System.out.println("enter amount");
			   amount=s.nextInt();
			  
		   }

void withdraw(int i)
{
	   int sum= amount-i;
	   System.out.println("current balance after withdrawal:"+sum);
}
void deposit(int i)
{
	int sum=amount+i;
	 System.out.println("current balance after Deposit:"+sum);
}
	
void  interest(int i)
{
	int sum=(amount/2)/100;
	 System.out.println("interst amount is:"+sum);
	
}
void display()
{
	System.out.println(accno);
	System.out.println(accname);
	System.out.println(amount);
}
}


 class Accountone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   
	/*
		   Account n=new Account();
	
		   n.readData();
		   n.display();
     	   n.withdraw(200);
     	   n.deposit(4000);
     	   
     	  Account n1=new Account();
     	  n1.readData();
		   n1.display();
    	   n1.withdraw(2200);
    	   n1.deposit(400);
    	   */
		
		int num=10;
		Account e[] =  new Account[num]; //create size in stack
		
	
		
		 
		
		for(int i = 0;i<e.length;i++)
		{
			e[i] = new Account();//create memory in heap
			e[i].readData();
			e[i].display();
			e[i].withdraw(2200);
			 e[i].deposit(400);
		}
		
		
	     	   
	     	   
	     	   
		   
		   
	      }
	}


