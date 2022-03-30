import java.util.*;
class prog125
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Reversed String is "+sb);

    }
}