import java.util.*;
class prog146
{
    public static void main(String args[])
    {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        try
        {
            age= Integer.parseInt(sc.next());
       
            System.out.println("Your age is "+age);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Enter only digits!!!");
        }
        
    }
}