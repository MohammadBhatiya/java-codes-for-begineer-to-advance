import java.util.*;
class prog7
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter First no");
        a = sc.nextFloat();
        System.out.println("Enter Second no");
        b = sc.nextFloat();
        c = a*b;
        System.out.println("Multiplication=" +c);
    }
}