package overiding;
class Shape{
	
	   void area()
	   {
		    System.out.println("calculating Area");
	   }
	   
	   
}
class Circle extends Shape{
	
	void area()
	{
	    float pi=3.14f;
	    int r=2;
	  
	    float areaofcircle= pi *r*r;
	    System.out.println(areaofcircle);
		
	}
	
}
class Triangle extends Shape
{
	void area()
	{
		int b=2;
		int h=4;
		 float a= b*h;
		 float areaoftriangle=a/2;
		 
		 System.out.println(areaoftriangle);
	}
}


class Rectangle extends Shape
{
	void area()
	{
		int l=2,b=3;
		int areaofrect= l*b;
		System.out.println(areaofrect);
	}
}
public class Overidingpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
            Rectangle r= new Rectangle();
            r.area();
            
	}

}
