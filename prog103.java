import java.util.*;
class prog103
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter Any String:: ");
        s = sc.next();
        boolean b = s.endsWith("t");
        if(b==true)
        {
            System.out.println("String ends With T");
        }
        else
        {
            System.out.println("String Does not ends With T");
        }
    }
}