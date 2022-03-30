import java.util.*;
class prog102
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter Any String:: ");
        s = sc.next();
        boolean b = s.startsWith("p");
        if(b==true)
        {
            System.out.println("String Starts With P");
        }
        else
        {
            System.out.println("String Does not Starts With P");
        }
    }
}