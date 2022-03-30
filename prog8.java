import java.util.*;
class prog8
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Addtion="+(a+b));
        System.out.println("Substraction="+(a-b));
        System.out.println("Multipliction="+(a*b));
        System.out.println("Division="+(a/b));
        System.out.println("Modulo="+(a%b));

    }
}