import java.util.*;
class prog22
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c,max;
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("Enter Third Number");
        c = sc.nextInt();
        max=(a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println("Maximum = "+max);
    }
}