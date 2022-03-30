final class first 
{
    void show()
    {
        System.out.println("It is first class");
    }
}
class second extends first
{
    void display()
    {
        System.out.println("It is second class");
    }
}
class prog65
{
    public static void main (String args[])
    {
        second s = new second();
        s.show();
        s.display();
    }
}