class One{

    void calculate(double x)
    {
        System.out.println("the square = " +(x*x));
    }
}

class Second extends One{
   
    void calculate(double x)
    {
           System.out.print("sqrt value is="+ (Math.sqrt(x)));
    }


}
public class Poly {
    public static void main(String args[])
    {
        Second s= new Second();
        s.calculate(25);
    }
    
}
