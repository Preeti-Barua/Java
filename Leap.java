
class Leap
{
     
    public static void  main(String args[])
     
    {
      int  year=2020;

        if (year%400==0)
        {
            System.out.println("is leap year");

        }
        else if(year %4==0)
        {
            System.out.println("is leap year");
        }
        else if(year%100==0 )
        {
            System.out.println("its not a leap year");

        }
    }

}