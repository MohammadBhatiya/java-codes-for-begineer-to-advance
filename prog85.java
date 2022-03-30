import java.util.*;
class prog85
{
    public static void main(String args[])
    {
        int a[][] = new int[3][3]; 
        int b[][] = new int[3][3]; 
        int c[][] = new int[3][3]; 
        int i,j,k;
        System.out.println("Enter numbers in Matrix 1:");
        Scanner sc = new Scanner (System.in);
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
        // Matrix 2
        System.out.println("Enter numbers in Matrix 2:");
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
        // Marix Multiply
        
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                c[i][j]=0;
                for(k=0;k<=2;k++)
                {
                c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("mul Matrix is :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}