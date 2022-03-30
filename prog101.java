import java.util.*;
class prog101
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter First String String: ");
        s = sc.next();
        String m = new String();
        System.out.println("Enter Second String");
        m = sc.next();
        int b=s.compareTo(m);
        if(b==0)
        {
            System.out.println("Strings are Same");
        }
        else if(b>0)
        {
            System.out.println("String1 is Greater than String2");
        }
        else if(b<0)
        {
            System.out.println("String1 is Less than String2");
        }

    }
}