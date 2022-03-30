import java.util.*;
class prog100
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter First String:");
        s= sc.next();
        String m = new String();
        System.out.println("Enter Second String");
        m= sc.next();
        boolean b = s.equalsIgnoreCase(m);
        if(b==true)
        {
            System.out.println("Both Strings are Same");
        }
        else
        {
            System.out.println("Strings are Different");
        }

        

    }
}