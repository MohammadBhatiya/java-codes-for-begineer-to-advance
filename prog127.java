import java.util.*;
class prog127
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.deleteCharAt(1);
        System.out.println("New String is "+sb);


    } 
}