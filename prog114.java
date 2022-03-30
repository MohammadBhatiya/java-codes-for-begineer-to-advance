import java.util.*;
class prog114
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter any String:");
        s = sc.next();
        for(int i=0;i<=s.length()-1;i++)
        {
        switch(s.toLowerCase().charAt(i)){
             case 'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                count++;
                break;  
            
        }    
        }   
            System.out.println("Total Number of vowels: "+count);
    }
}