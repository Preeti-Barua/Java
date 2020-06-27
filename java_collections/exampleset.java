import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exampleset{
    public static void main(String args[])
    {
        Map<String,String>  map = new HashMap <>();
        map.put("myname","advait");
        map.put("age","twenty-two");
        map.put("actor","sara");

        System.out.println(map);
        System.out.println(map.get("myname"));

        
        Set <String> keys=map.keySet();
        
        for(String key:keys)
        {
            System.out.println(key +"   " + map.get(key));
        }
        
    }
}