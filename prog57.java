import java.util.*;
class test
{
    int m1,m2,m3;
    void getm()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        m1=sc.nextInt();
        System.out.println("Enter Second Number:");
        m2=sc.nextInt();
        System.out.println("Enter Third Number:");
        m3=sc.nextInt();
        
    }
    void putm()
    {
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
       
    }
    
}
class result extends test
{
    int total;
    void find()
    {
        total=m1+m2+m3;
        System.out.println("total = "+total);
    }
}
class prog57
{
    public static void main(String args[])
    {
        result x = new result();
        x.getm();
        x.putm();
        x.find();
    }
}