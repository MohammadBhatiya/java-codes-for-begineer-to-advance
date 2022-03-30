abstract class first
{
    abstract void show();
}
class second extends first
{
    public void show()
    {
        System.out.println("example of abstract class");
    }
}
class prog66
{
    public static void main(String args[])
    {
        second x = new second();
        x.show();
    }
}