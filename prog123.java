import java.util.*;
class prog123
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s= sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.append('$');
        System.out.println("The Replaced String is "+sb);
    }
}