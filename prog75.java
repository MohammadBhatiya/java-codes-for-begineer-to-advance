import java.util.*;
class prog75
{
    public static void main(String args[])
    { 
    int a[] = new int[10];
    int i,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 Numbers:");
    for(i=0;i<=9;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Sum of Array:");
    for(i=0;i<=9;i++)
    {
        sum=sum+a[i];
    }
        System.out.println("sum="+sum);

}
}