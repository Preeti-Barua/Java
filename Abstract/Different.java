abstract class Myclass{
     // this is abstract method
    abstract void calculate(double x);
}
class Sub1 extends Myclass{

       void calculate(double x)
       {
           System.out.println("square = " +(x*x));

       }
}
class Sub2 extends Myclass{

    void calculate (double x)
    {
        System.out.println("square root=" + Math.sqrt(x));
    }
}
class Sub3 extends Myclass{

    void calculate(double x)
    {
        System.out.println("cube=" + (x*x*x));
    }
}
public class Different {

    public static void main(String args[])
    {

        Sub1 obj1= new Sub1();
        Sub2 obj2= new Sub2();
        Sub3 obj3= new Sub3();
        obj1.calculate(3);
        obj1.calculate(4);
        obj1.calculate(6);



    }

    
}
