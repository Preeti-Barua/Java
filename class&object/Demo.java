class Person{

        String name;
        int age;


        public void talking()
        {
                  System.out.println("hello my name is "+ name);
                  System.out.println("age  is "+ age);

        }
        
}

public class Demo {
     public static void main(String args[])
     {
         Person P= new Person();
         P.name= "PB";
         P.talking();
     }


    
}
