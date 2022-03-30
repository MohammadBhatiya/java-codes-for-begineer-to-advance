import java.util.*;
class prog112
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s= new String();
        System.out.println("Enter any String:");
        s=sc.next();
        int p;
        p=s.length();
        String r= new String();
        for(int i=p-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
            System.out.println("Reverse of String is "+r);
        

    }
}