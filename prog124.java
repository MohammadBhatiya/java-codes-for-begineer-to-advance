import java.util.*;
class prog124
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:");
        String s= sc.next();
        System.out.println("Enter Second String:");
        String m = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.insert(1,m);
        System.out.println("The Replaced String is "+sb);
    }
}