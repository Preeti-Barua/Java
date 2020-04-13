interface A
{
    float height=6.0f;
    void height();

}
interface B
{
    float height=4.8f;
    void height();
}
class child implements A,B{
    public void height()
    {
        float ht= (A.height+B.height)/2;       //child got average height of its parents.
        System.out.println("child's height::::"+ ht);

    }
}
class multi
{
    public static  void main(String args[])
    {
        child ch=new child();
        ch.height();
    }
}