import java.util.*;
class rectangle
{
    int l,b,h;
    void getr()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        l = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle:");
        b = sc.nextInt();
        System.out.println("Enter Height of Rectangle");
        h = sc.nextInt();
    }
    void putr()
    {
        System.out.println("Length of Rectangle is "+l);
        System.out.println("Breadth of Rectangle is "+b);
        System.out.println("Height of Rectangle is "+h);
    }
}
class area extends rectangle
{
    int a;
    void find()
    {
        a = l*b;
        System.out.println("Area of Rectangle is "+a);
    }
}
class volume extends rectangle
{
    int v;
    void find()
    {
        v = l*b*h;
        System.out.println("Volume of Rectangle is "+v);
    }
}
class prog60
{
    public static void main (String args[])
    {
        area x = new area();
        x.getr();
        x.putr();
        x.find();
        volume y=new volume();
        y.getr();
        y.putr();
        y.find();
    }
}
