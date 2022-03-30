class message
{
    message()
    {
        System.out.println("Welcome");
    }

protected void finalize()
{
    System.out.println("Good Bye!!");
}
}
class prog67
{
    public static void main(String args[])
    {
        message x = new message();
        x=null;
        System.gc();
    }
}