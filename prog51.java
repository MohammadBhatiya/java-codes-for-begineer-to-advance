import java.util.*;
class student
{
    String name;
    int roll,fees;
    void getdata()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Name:");
        name = sc.next();
        System.out.println("Enter Your Roll Number:");
        roll = sc.nextInt();
        System.out.println("Enter Your Fees:");
        fees = sc.nextInt();
    }
    void print()
    {
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+roll);
        System.out.println("Fees:"+fees);
    }
    
}
class prog51
{
    public static void main(String args[])
    {
       student x=new student();
       x.getdata(); 
       x.print();
    }
}