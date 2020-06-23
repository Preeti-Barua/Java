import java.util.ArrayList;
import java.util.List;

public class listjava {

    //one main thing is the list starts with zero index
    public static void main( String args[]) {
         List<Integer> l1 = new ArrayList<Integer>();                 //creating list l1
         //adding elements in list l1
        l1.add(1); 
        l1.add(2);
        l1.add(4);
        l1.add(6);
        System.out.println(l1);                                       //printing l1

        final List<Integer> l2 = new ArrayList<Integer>();        //creating another list l2
         l2.add(0,3);                                            // adding elements in list l2 giving by indexes
         l2.add(1,8);
         

         System.out.println(l2);

         l1.addAll(1, l2);                //will add list l2 in list l1 from index 1
         System.out.println(l1);           //printing list l1

         //removing elements from list1

         l1.remove(1) ;                             //removing element from index 1
         System.out.println(l1);


         System.out.println();
         System.out.println();
         System.out.println(l1.get(3));                //print value which is in the index 3

         l1.set(4,5);                                    // replace 9 in the index 2
         System.out.println(l1); 

          
        }
    
}