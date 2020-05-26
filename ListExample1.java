import java.util.*;
public class ListExample1{
    public static void main(String args[]){
        List<String> list =new ArrayList<String>();
        list.add("MAngo");
        list.add("Apple");
        
        list.add("kiwi");
        
        for(String fruit:list)
        System.out.println(fruit);
        
    }
}