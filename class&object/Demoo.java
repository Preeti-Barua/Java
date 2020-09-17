class Person{

        String name ="PB";
        int age= 23;

        //methods
        void talk()    
         {

            System.out.println("name is"+ name);
            System.out.println("age is"+ age);

        }     
    }

    class Demoo{

        public static void main(String args[])
        {
              Person p1= new Person();
              p1.name= "AP";               //here in the Person class, we stored "PB" and 23. but
              p1.age= 22;                             // is storing "PB" and 22 again in the same variables,here the output is "AP" and 22 that 
                                            // means the data "PB"& 22 is overwritten.
              

              p1.talk();
        }
    }