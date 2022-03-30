import java.util.*;
class prog95
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any String:");
        s = sc.next();
        ch = s.charAt(1);
        System.out.println("Extracted character = "+ch);
    }
}