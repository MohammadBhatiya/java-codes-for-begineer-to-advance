import java.util.*;
class prog126
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.delete(1,4);
        System.out.println("New String is "+sb);
    }
}