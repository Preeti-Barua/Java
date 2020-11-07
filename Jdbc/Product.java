package javaAssignment8;

public class Product {
	
	


		int id;
	     @Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", category_name=" + category_name + ", price=" + price
					+ ", manufacture=" + manufacture + ", quantity=" + quantity + "]";
		}



		String name;
	     String category_name;
	     int price;
	     String manufacture;
	     int quantity;
	     
	     
	     
	   Product(int id, String name, String category_name, int price, String manufacture,int quantity)
	   {
		   this.id=id;
		   this.name=name;
		   this.category_name= category_name;
		   this.price=price;
		   this.manufacture= manufacture;
		   this.quantity=quantity;
	   }
	   
	   
	

}
