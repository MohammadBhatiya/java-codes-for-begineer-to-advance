import java.util.*;
class prog18
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("Enter Third Number");
        c = sc.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {
            System.out.println(a+"is Maximum");
            }
            else
            {
             System.out.println(c+"is Maximum");
            }
        }
        else if(b>c)
        {
            
            System.out.println(b+"is Maximum");

        }
        else
        {
            System.out.println(c+"is Maximum");
        }
        

    }
}