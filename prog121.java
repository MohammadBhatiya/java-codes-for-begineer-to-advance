import java.util.*;
class prog121
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s =sc.next();
        StringBuffer sb = new StringBuffer(s);
        char c;
        c=sb.charAt(1);
        System.out.println("The Character is "+c);
    }
}