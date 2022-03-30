import java.util.*;
class prog113
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
        boolean b =s.equals(r);
        if(b==true)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Plaindrome");
        }

           
        

    }
}