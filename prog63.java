class student
{
    int roll;
    String name;
    student(int a,String b)
    {
        roll=a;
        name=b;
        System.out.println("rollno. :"+roll);
        System.out.println("Student name :"+name);
       
    }
}
class test extends student
{
    int m1,m2,m3;
    test(int a,String b,int p,int q,int r)
    {
        super(a,b);
        m1=p;
        m2=q;
        m3=r;
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);

    }

}

class result extends test
{
    int total;
    result(int a,String b,int p,int q,int r)
    {
    super(a,b,p,q,r);
    total = m1+m2+m3;
    System.out.println("Total marks = "+total);
    }
}
class prog63
{
    public static void main (String args[])
    {
        result x = new result(1,"raj",60,70,80);

    }
}