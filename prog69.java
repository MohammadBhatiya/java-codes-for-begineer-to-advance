import java.util.*;
interface sport
{
    int score=80;
    void show();
}
class test
{
    int m1,m2,m3;
    void getm()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Marks:");
        m1 = sc.nextInt();
        System.out.println("Enter Second Marks:");
        m2 = sc.nextInt();
        System.out.println("Enter Third Marks:");
        m3 = sc.nextInt();
    }
    void putm()
    {
        System.out.println("First Marks:"+m1);
        System.out.println("Second Marks:"+m2);
        System.out.println("Third Marks:"+m3);
    }
}
class result extends test implements sport
{
    int total;
    public void show()
    {
        total = m1+m2+m3;
        System.out.println("score:"+score);
        System.out.println("Total Marks:"+total);
        
    }
}
class prog69
{
    public static void main(String args[])
    {
        result x = new result();
        x.getm();
        x.putm();
        x.show();
    }
}