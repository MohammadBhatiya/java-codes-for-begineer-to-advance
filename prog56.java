import java.util.*;
class number
{
    int a,b,c;
    int largest()
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    void find()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number:");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        c = largest();
        System.out.println("Largest Number = "+c);
    }
}
class prog56
{
    public static void main (String args[])
    {
        number x = new number();
        x.find();
    }
}