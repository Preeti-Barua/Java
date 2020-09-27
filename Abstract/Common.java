class Myclass
{

    //method to calculate square value
    void calculate(double x)
    {
        System.out.println("Square="    +(x*x));
    }
}
public class Common {

    public static void main(String args[])
    {

        Myclass s= new Myclass();
        Myclass s1= new Myclass();
        Myclass s2= new Myclass();
        s.calculate(3);
        s1.calculate(4);
        s2.calculate(5);

    }
    
}
