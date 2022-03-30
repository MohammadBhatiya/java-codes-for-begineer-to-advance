import java.util.*;
class student
{
    String name;
    int roll;
    void gets()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student Name: ");
        name = sc.next();
        System.out.println("Enter Student Roll Number: ");
        roll = sc.nextInt();
        
    }
    void puts()
    {
        System.out.println("Name of Student is "+name);
        System.out.println("Roll Number of Student is "+roll);        
    
    }
}
class test extends student
{
     int m1,m2,m3;   
     void getm()
     {

     
         System.out.println("Enter Student Marks1: ");
        m1 = sc.nextInt();
        System.out.println("Enter Student Marks2: ");
        m2 = sc.nextInt();
        System.out.println("Enter Student Marks3: ");
        m3 = sc.nextInt();
     }


    void putm()
    {
        System.out.println("Marks1 of Student is "+m1);        
        System.out.println("Marks2 of Student is "+m2);        
        System.out.println("Marks3 of Student is "+m3);   

    }
}
class result extends test
{
    int total;
    void find()
    {
        total = m1 + m2 + m3;
        System.out.println("Total Marks are "+total);
    }
}
class prog59
{
    public static void main(String args[])
    {
        result x = new result();
        x.gets();
        x.getm();
        x.puts();
        x.putm();
        x.find();
    }
    
}