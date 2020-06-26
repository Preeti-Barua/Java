import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class mapjava {
    public static void main(String args[])
    {
        Map<Integer,String>m1=new HashMap<Integer,String>();
        m1.put(1,"J");
        m1.put(2,"A");
        m1.put(3,"V");
        m1.put(4,"A");

        for(Map.Entry m:m1.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        

    }

}