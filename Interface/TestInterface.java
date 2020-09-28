//Interface declaration: by first user
interface Drawable{
    void draw();

}
//Implementation : by second user
class Rectangle implements Drawable{

    public void draw()
    {
        System.out.println("drawing Rectangle");
    }
}
//using interface: by 3rd user
class Circle implements Drawable{
    public void draw()
    {
        System.out.println("drawing Circle");
    }
}
public class TestInterface {

    public static void main(String args[])
    {
        Drawable d= new Circle();
        d.draw();
    }
    
}
