import java.util.ArrayList;
import java.util.List;

public class listjava1 {

    public static void main (String args[])
    {

        List<String> L= new ArrayList <String>();
        L.add("learning");
        L.add("java");
        L.add("collections");
        System.out.println(L);      //prints in [] brackets
        
        System.out.println("Index of java:"+L.indexOf("java"));
        System.out.println("Index of learning: "+L.indexOf("learning"));
        System.out.println("Element of no element present: "+L.indexOf("Hi"));

       //iterating the list element using for each-loop!
       for( String LL:L)
       {
            System.out.println(LL);
       }
            
        }
        


    }
        
    
    
