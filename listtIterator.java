import java.util.*;
public class    listtIterator
   
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
            

        ListIterator<String> itr= fruit.listIterator();
        System.out.println("Traversing elements in forward direction");
            while(itr.hasNext()){
                System.out.println("index:" + itr.nextIndex() + "value" +itr.next());
            }

            System.out.println("Traversing elements in backword direction"); 
            while(itr.hasPrevious()){
                System.out.println("index:" + itr.previousIndex() + "value" +itr.previous());

            }
        }
    }
