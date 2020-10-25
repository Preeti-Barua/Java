
package javaassignmnet2;



public class Authorone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author ac= new Author("Preeti","Pb@gmail.com",'F');
		Book b= new Book("Headfirst",ac,1400.61,1);
		
		
		b.Dis();
	
        System.out.println("Quantity :" +b.getQty());		
        System.out.println("Quantity :" +b.getPrice());	
		
		

	}

}
