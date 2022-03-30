import java.util.*;
class prog74
{
    public static void main(String args[])
    { 
    int a[] = new int[10];
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 Numbers:");
    for(i=0;i<=9;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Array in Reverse Order:");
    for(i=9;i>=0;i--)
    {
        System.out.println(a[i]);
    }
}
}