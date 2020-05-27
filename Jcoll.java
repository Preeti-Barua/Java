import java.util.*;
public class Jcoll
{
    public static void  main(String args[])
    {
        List<String> list= new ArrayList<String>();

        
        list.add("mango");
        list.add("kiwi");
        list.add("apple");
        list.add("orange");
        list.add("strawberry");

        System.out.println("returning element :" +list.get(1));
        list.set(2,"cranberry");
        for(String fruit:list)
        System.out.println(fruit);
        

    }
}