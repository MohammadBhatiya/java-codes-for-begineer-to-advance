import java.util.*;
class addition
{
    int a,b,c;
    addition(int i,int j)
    {
       a=i;
       b=j;
    }
    addition(addition x)
    {
        a=x.a;
        b=x.b;
    }
    void add()
    {
        c=a+b;
        System.out.println("Addition="+c);
    }
}
    class prog52
    {
        public static void main (String args[])
        {
            addition x = new addition(12,23);
            x.add();
            addition y=new addition(x);
            y.add();
        }
    }