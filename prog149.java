import java.util.*;
class prog149
{
    public static void main(String args[])
    {
        int num1,num2,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        num2=sc.nextInt();
        try
        {
            div=num1/num2;
            System.out.println("Division= "+div);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Divisor must be non-zero");
        }
        finally
        {
            System.out.println("Good Bye");
        }
        
    }
}