import java.util.*;
class prog78
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        int i,j,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers:");
        for(i=0;i<=9;i++)
        {
            a[i] = sc.nextInt();
        }
        for(j=1;j<=9;j++)
        {
            for(i=0;i<=8;i++)
            {
                if(a[i]>a[i+1])
                {
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                }

            }
        }
        System.out.println("Sorting in Ascending Order:");
        for(i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}