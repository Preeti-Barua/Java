class Animal{
    void eat(){

        System.out.println("eating .....");
    }
}

    class Dog extends Animal{

        void eat(){
            System.out.println("eating .....");
        }
        void bark()
            {
                System.out.println("barking .....");
            }
        void woork()
        {
            super.eat();
            bark();
        }

    }


public class Superkeyword {

  public static void main(String args[])
  {
      Dog d= new Dog();
      d.woork();
  }
    
}
