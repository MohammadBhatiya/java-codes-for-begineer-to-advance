import java.util.*;
interface sport
{
    int score=80;
    void show();
}
class student
{
    int roll;
    String name;
    void gets()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number:");
        roll = sc.nextInt();
        System.out.println("Enter Name:");
        name = sc.next();
    }
    void puts()
    {
        System.out.println("Roll Number :"+roll);
        System.out.println("Name of the Student :"+name);
    }
}
class test extends student
{
    int m1,m2,m3;
    void getm()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks 1:");
        m1 = sc.nextInt();
        System.out.println("Enter Marks 2:");
        m2 = sc.nextInt();
        System.out.println("Enter Marks 3:");
        m3 = sc.nextInt();
    }
    void putm()
    {
        System.out.println("Student Marks 1:"+m1);
        System.out.println("Student Marks 2:"+m2);
        System.out.println("Student Marks 3:"+m3);
    }
}
class result extends test implements sport
{
    int total;
    public void show()
    {
        total = m1+m2+m3+score;
        System.out.println("score"+score);
        System.out.println("Total Marks:"+total);
    }
}
class prog70
{
    public static void main(String args[])
    {
        result x = new result();
        x.gets();
        x.getm();
        x.puts();
        x.putm();
        x.show();
    } 

}