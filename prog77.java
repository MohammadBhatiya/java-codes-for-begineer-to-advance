import java.util.*;
class prog77
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        int i,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers");
        for(i=0;i<=9;i++)
        {
            a[i]=sc.nextInt();
        }
        min=a[0];
        for(i=1;i<=9;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum= "+min);
       
    }
}