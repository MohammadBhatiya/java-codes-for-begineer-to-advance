import java.util.*;
class prog97
{
    public static void main(String args[])
    {
        byte b[] = new byte[3];
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any String:");
        s = sc.next();
        b=s.getBytes();
        for(int i=0;i<=b.length-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}