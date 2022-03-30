import java.util.*;
class prog99
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter first String:");
        s = sc.next();
        String m = new String();
        System.out.println("Enter second String:");
        m = sc.next();
        boolean b=s.equals(m);
        if(b==true)
        {
            System.out.println("Both the Strings are Same");
        }
        else
        {
            System.out.println("Strings are Different");
        }

    }
}