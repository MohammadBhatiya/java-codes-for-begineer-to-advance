class rectangle
{
    int l,b,h;
    rectangle(int p,int q,int r)
    {
    l=p;
    b=q;
    h=r;
    System.out.println("Length = "+l);
    System.out.println("Breadth = "+b);
    System.out.println("Heigth = "+h);
    }
}
class area extends rectangle
{
    int m;
    area(int p,int q, int r)
    {
    super(p,q,r);
    m = l*b;
    System.out.println("Area of Rectangle is: "+m);
}
}
class volume extends rectangle
{
    int v;
    volume(int l,int b,int h)
    {
        super(l,b,h);
        v = l*b*h;
        System.out.println("Volume of Rectangle: "+v);
    }
}
class prog64
{
    public static void main (String args[])
    {
        area x = new area(60,70,80);
        volume y = new volume(60,70,80);
        
    }
}