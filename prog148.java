import java.util.*;
class prog147
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        int ind,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index: ");
        try{

        
        ind= sc.nextInt();
        try 
        {
            c=100/(30-a[ind]);
            System.out.println("div="+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Divisor must be non-zero");
        }
        catch(ArrayIndexOutOfBoundsException am)
        {
            System.out.println("Invalid array index");
        }
        }
        catch(InputMismatchException mb)
        {
            System.out.println("Digit are only accepted");
        }
      
    }
}