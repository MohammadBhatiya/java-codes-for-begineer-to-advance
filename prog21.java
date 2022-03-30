import java.util.*;
class prog21
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,max;
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        max=(a>b)?a:b;
        System.out.println("Maximum = "+max);
    }
}