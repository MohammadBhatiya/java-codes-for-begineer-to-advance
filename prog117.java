import java.util.*;
class prog117
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=sc.next();
        StringBuffer sb = new StringBuffer(s);
        int a;
        a=sb.length();
        System.out.println("Length of the String is "+a);
    }
}