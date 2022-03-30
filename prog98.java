import java.util.*;
class prog98
{
    public static void main(String args[])
    {
        char ch[] = new char[3];
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter Any string:");
        s = sc.next();
        ch=s.toCharArray();
        for(int i=0;i<=ch.length-1;i++)
        {
            System.out.println(ch[i]);
        }
    }
}