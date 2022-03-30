import java.util.*;
class prog15
{
    public static void main (String args[])
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        if (a>b)
        {
            System.out.println(a+" is Maximum");
        }
        else
        {
            System.out.println(b+" is Maximun");
        }

    }
}