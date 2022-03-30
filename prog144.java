import java.util.*;
class prog144
{
    public static void main(String args[])
    {
        int num1,num2,div=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        num1=sc.nextInt();
        System.out.println("Enter Second Number");
        
        num2=sc.nextInt();
        try {
            div=num1/num2;
            System.out.println("Division is "+div);    
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
            // OR we can write
            System.out.println("Divisor must be non-zero");
        }
        
    }
}