interface drawable
{
    void print()

}
class A implements drawable
{
    void print()
    {
        System.out.println("not always!!!!!!!!!!!!");
    }

    public static void main(String args[])
    {
        A6 obj=new  A6();
        obj.print();
    }
}