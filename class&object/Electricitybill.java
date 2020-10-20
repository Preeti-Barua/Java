/*  Create a class Electricity bill with data members as customer number, customer name, units consumed and methods as follows:

1.  readData() - to read the values of data members.
2. showData - to display the customer details
3. computeBill() - to calculate and return electricity charges to be paid.calculate    the bill as specified below

             number of units  charges
  < = 100   Rs.1.20
       for the next 200 units  Rs. 2.00
    for the next 300 units Rs. 3.00
  for more  Rs. 5.00  
ex:  input = 320 units output = 100*1.20 +200*2.00+20*3.00 =  Rs. 580*/
package corejava;

import java.util.Scanner;

    class Ebill {
    	
    	//instance variable
	   int customer_no;
	   String customer_name;
	   int unit_consumed; 
	   
	   
	   //instance method
	   void readData()
	   {
		   Scanner s= new Scanner(System.in);
		   System.out.println("enter id");
		   customer_no=s.nextInt();
		   System.out.println("enter name");
		   customer_name=s.next();
		   System.out.println("enter powerconsumed");
		   unit_consumed=s.nextInt();
		   
	   }
	   
	   void showData()
	   {
		   System.out.println("costomer number is:"+customer_no);
		   System.out.println("costomer name is:"+customer_name);
		   System.out.println("unit consumed is:"+unit_consumed);
		   
	   }
	   void computeBill()
	   {
		   double totalbill = 0;
		   
		   if(unit_consumed<=100)
		   {
			    totalbill=unit_consumed*1.20;
			    
		   }
		   else if(unit_consumed<=200)
		   {
			    totalbill=100*1.20+
			    		(unit_consumed-100)*2.00;
			    
		   }
		   else if(unit_consumed<=300)
		   {
			   totalbill=(100*1.20) +
					   (200*2) +(unit_consumed-200)*3.00;
		   }
		   else if(unit_consumed<600){
			   totalbill=100*1.20 +
					   200*2 +
					   300*3 +(unit_consumed-300)*5.00;
		   }
		   
		   System.out.println("the ebill is:"+totalbill);
	   }
}
	   
	   public class Electricitybill
	   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    

       Ebill e= new Ebill();
       //e is the reference
		e.readData();
		e.showData();
		e.computeBill();
		

	       Ebill e1= new Ebill();
	       //e is the reference
			e1.readData();
			e1.showData();
			e1.computeBill();
		
		
		
		
		
	}

	
}
