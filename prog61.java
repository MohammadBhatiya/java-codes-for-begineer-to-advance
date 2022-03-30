class first
{
    int a;
    first(int i)
    {
        a=i;
        System.out.println("a="+a);
    }
}
class second extends first 
{
    int b;
    second(int i,int j)
    {
        super(i);
        b=j;
        System.out.println("b="+b);
    }
}
class prog61
{
    public static void main(String args[])
    {
        second s = new second(100,200);
    }
}