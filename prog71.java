import java.util.*;
interface student
{
    int roll=12;
    String name="Mohammad";
    
}
interface sport extends student
{
    int score=80;
    void show();
}
class test implements student
{
    int m1,m2,m3;
    void getm()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Marks1:");
        m1= sc.nextInt();
        System.out.println("Enter Marks2:");
        m2=sc.nextInt();
        System.out.println("Enter Marks3:");
        m3=sc.nextInt();

    }
    void putm()
    {
        System.out.println("Student Marks1: "+m1);
        System.out.println("Student Marks2: "+m2);
        System.out.println("Student Marks3: "+m3);
    }
}
class result extends test implements sport
{
    int total;
    public void show()
    {
    total=m1+m2+m3+score;
    System.out.println("Roll Number: "+roll);
    System.out.println("Name of Student: "+name);
    System.out.println("Score= "+score);
    System.out.println("Total Marks= "+total);

    }

}
class prog71
{
    public static void main(String args[])
    {
        result x = new result();
        x.getm();
        x.putm();
        x.show();
    }
}