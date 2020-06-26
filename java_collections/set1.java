import java.util.HashSet;
import java.util.Set;

public class set1
{

    public static  void main(String args[])
    {
        Set<Integer> values =new HashSet<>();

        values.add(2);
        values.add(4);
    
        values.add(2);
        values.add(9);

       


        for(int i:values)
        {
            System.out.println(i);
        }
    }
}