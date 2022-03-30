import java.util.*;
class prog107
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter String:");
        s=sc.next();
        String m = new String();
        System.out.println("Enter String to join:");
        m= sc.next();
        String n;
        n = s.concat(m);
        System.out.println("Full String is "+n);
    }
}