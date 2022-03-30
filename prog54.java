class shapes
{
    void area(float r)
    {
        float a;
        a=3.14f*r*r;
        System.out.println("Area of circle= "+a);
        
    }
    void area(int l,int b)
    {
        int a;
        a=l*b;
        System.out.println("Area of Rectangle = "+a);
    }
    void area(double l,double b)
    {
        double a;
        a=0.5*l*b;
        System.out.println("Area of Triangle = "+a);
    }
}
class prog54
{
    public static void main (String args [])
    {
        shapes x = new shapes();
        x.area(15f);
        x.area(10,20);
        x.area(20.22,30.33);
    }
}