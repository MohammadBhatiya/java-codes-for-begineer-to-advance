import java.util.*;
class prog118
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        int a;
        a=sb.capacity();
        System.out.println("The memory stored is "+a);
    }
}