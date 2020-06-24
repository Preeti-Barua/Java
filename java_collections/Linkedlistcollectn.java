import java.util.LinkedList;
import java.util.*;

public class Linkedlistcollectn {



    public static void main(String args[])
    {
        LinkedList<String> object= new LinkedList<String>();

         //adding the elements in the  linked list
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2,"E");
        object.add("F");
        object.add("G");
        System.out.println("linked list is:" +object);

        //removing element from the list

        object.removeLast();
        object.removeFirst();
        object.remove("B");
        System.out.println("Linked list after deletion:" +object);



        //finding element frm the list
        boolean status=object.contains("E");
        if(status)
        {
            System.out.println("list contains E");
        }
        else{
            System.out.println("list doesnt contains E");
        }
 

        //printing the size of the linkedlist
        int size=object.size();
        System.out.println("the size of the linkedlist is:"+ size);
        

    }
    
}