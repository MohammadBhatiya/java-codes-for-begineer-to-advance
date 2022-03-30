import java.util.*;
class prog73
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for(i=0;i<=9;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for(i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}