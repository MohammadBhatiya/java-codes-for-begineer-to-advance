import java.util.*;
class prog83
{
    public static void main(String args[])
    {
        int a[][] = new int[3][3];
        int i,j,min;
        System.out.println("Enter number in Matrix");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 3X3:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        min=a[0][0];
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                if(a[i][j]<min)
                {
                    min=a[i][j];
                }
            }
        }
        System.out.println("Minimum= "+min);
    }
}