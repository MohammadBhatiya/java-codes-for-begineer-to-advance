import java.util.*;
class myexception extends Exception
{
    myexception(String msg)
    {
        super(msg);
    }
}

class prog151
{
    public static void main(String args[])
    {
        int m1,m2,m3,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks 1:");
        m1=sc.nextInt();
        System.out.println("Enter Marks 2:");
        m2=sc.nextInt();
        System.out.println("Enter Marks 3:");
        m3=sc.nextInt();

        try 
        {
            if(m1>100 || m2>100 || m3>100)
            {
                throw new myexception("Marks Greater than 100 Error");
            }
            else
            {
                total=m1+m2+m3;
                System.out.println("Total= "+total);
            }
        }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        
    }
}