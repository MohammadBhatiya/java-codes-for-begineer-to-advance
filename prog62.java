class test
{
    int m1,m2,m3;
    test(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);

    }

}
class result extends test
{
    int total;
    result(int a,int b,int c)
    {
    super(a,b,c);
    total = m1+m2+m3;
    System.out.println("Total marks = "+total);
    }
}
class prog62
{
    public static void main (String args[])
    {
        result x = new result(60,70,80);

    }
}