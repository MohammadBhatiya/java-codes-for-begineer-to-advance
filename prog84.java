import java.util.*;
class prog84
{
    public static void main(String args[])
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i,j;
        // matrix 1
        System.out.println("Enter Matrix 1:");
        Scanner sc = new Scanner(System.in);
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1 is :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // matrix 2

        System.out.println("Enter Matrix 2:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2 is :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        // matrix addition
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of Matrix a and b is :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}