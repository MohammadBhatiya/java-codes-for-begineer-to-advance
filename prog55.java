class prog55
{
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition = "+c);
    }
    static void sub(int a,int b)
    {
        int c;
        c=a-b;
        System.out.println("Substraction = "+c);
    }
    public static void main (String args[])
    {
        prog55 x = new prog55();
        x.add(10,20);
        prog55.sub(30,20);
    }
}