interface first
{
    void show();
}
class second implements first
{
    public void show()
    {
        System.out.println("example of interface");
    }
}
class prog68
{
    public static void main(String args[])
    {
        second x = new second();
        x.show();
    }
}