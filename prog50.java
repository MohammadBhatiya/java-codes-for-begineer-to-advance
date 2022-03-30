import java.util.*;
class addition
{
    int a,b,c;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
    }
    void add()
    {
        c=a+b;
        System.out.println("Addition="+c);
    }
}
class prog50
{
    public static void main (String args[])
    {
        addition x= new addition();
        x.getdata();
        x.add();
    }
}
