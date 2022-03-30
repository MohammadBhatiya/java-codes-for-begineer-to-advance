import java.util.*;
class prog16
{
    public static void main (String args[])
    {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        a = sc.nextInt();
        
        if(a>0)
        {
            System.out.println(a+ "is Positive");
        }
        else if(a<0)
        {
            System.out.println(a+ "is Negative");
        }
        else
        {
            System.out.println(a+ "is Zero");
        }

    }
}