import java.util.*;
class prog115
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any string:");
        s=sc.next();
        for(char j='a';j<='z';j++)
        {
            count=0;
        for(int i=0;i<=s.length()-1;i++)
        {   
            if(s.toLowerCase().charAt(i)==j)
            {
                count++;
            }
        }
        if(count>0)
        {
        System.out.println("The number of  "+j+"="+count);
        }
        }
    }
}