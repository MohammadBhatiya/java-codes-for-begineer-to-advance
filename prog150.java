import java.util.*;
class prog150
{
    public static void main(String args[])
    {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age:");
    age=sc.nextInt();
    try{

    if(age>=18)
    {
    System.out.println("Your age is "+age);
    }
    else
    {
        throw new Exception("Under 18 Exception....");
    }
    }
    catch(Exception ex)
    {
        System.out.println(ex.getMessage());
        }
    }
}