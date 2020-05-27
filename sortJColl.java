import java.util.*;
public class sortJColl
{
    public static void  main(String args[])
    {
        List<String> fruit= new ArrayList<String>();

        
       fruit.add("mango");
       
        fruit.add("kiwi");
        fruit.add("banana");

        fruit.add("apple");
        fruit.add("orange");
        fruit.add("strawberry");
        System.out.println("sorting the fruits(By alphebetical order)::");
        Collections.sort(fruit);   //sorting list


   
        for(String f:fruit) //traversing list
        System.out.println(f);
        System.out.println("\n\n\n\n");
        System.out.println("sorting the numbers::");
        List<Integer> list1= new ArrayList<Integer>();

        
       list1  .add(5);
       
       list1.add(3);
       list1.add(7);

       list1.add(8);
       list1.add(9);
       list1.add(0);

        Collections.sort(list1);   //sorting list


       
        for(Integer l:list1) //traversing list
        System.out.println(l);
        

    }
}