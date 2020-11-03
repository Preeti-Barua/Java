package home;

import java.util.ArrayList;
import java.util.Iterator;

class Account
{
	     @Override
	public String toString() {
		return "accountno=" + accountno + ", name=" + name + ", address=" + address + ", loan_amt=" + loan_amt
				+ ", irate=" + irate + ", term=" + term + ", loantype=" + loantype + "]";
	}




		int accountno;
	     String name;
	     String address;
	     int loan_amt;
	     int irate;
	     int  term;
	     String loantype;
	     
	     
	     
	     Account( int accountno,String name,String address, int loan_amt ,int irate, int  term,String loantype)
	     {
	    	 this.accountno=accountno;
	    	 this.name=name;
	    	 this.address=address;
	    	 this.loan_amt=loan_amt;
	    	 this.term=term;
	    	 this.loantype=loantype;
	     }



		
		void display()
		{
			System.out.println(accountno+name+address+loan_amt+irate+term+loantype);
		}
	     
	     
	     
	     
	     
}
class A
{
	   static void AddAccount(ArrayList<Account>al)
	   {
		      Account a= new Account(12233,"PB","Delhi",12234,1,2,"q");
		      Account a1= new Account(12223,"AP","sirpur",54334,1,2,"q");
		      Account a2= new Account(124563,"PA","raigarh",35634,1,2,"q");
		      Account a3= new Account(122343,"AC","bhilai",122134,1,2,"q");
		      Account a4= new Account(334556,"CA","Raipur",1344,2,2,"q");
		      
		      
		      al.add(a);
		      al.add(a1);
		      al.add(a2);
		      al.add(a3);
		      al.add(a4);
		      
	   }
	   
	   
	   
	   static void DisplayAccount(ArrayList<Account>al)
	   {
		  // for(Account a: al)
		  // {
			//   System.out.println(a);
		   //}
	   
	   
	   
	   
	    System.out.print("Original contents of al: ");
	    System.out.println();
	      Iterator itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element);
	         System.out.println();
	      }
	   }
	
}



public class Accountone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Account> al= new ArrayList<Account>();
		A.AddAccount(al);
		A.DisplayAccount(al);
        		

		
		
		
	}

}
