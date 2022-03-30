import java.util.*;
class prog122
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s= sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.setCharAt(1,'$');
        System.out.println("The Replaced String is "+sb);
    }
}