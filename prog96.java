import java.util.*;
class prog96
{
    public static void main(String args[])
    {
        char ch[] = new char[3];
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any String:");
        s = sc.next();
        s.getChars(0,3,ch,0);
        for(int i=0;i<=2;i++)
        {
        System.out.println(ch[i]);
        }
    }
}