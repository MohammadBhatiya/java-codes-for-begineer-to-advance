import java.util.*;
class prog81
{
    public static void main(String args[])
    {
        int a[][] = new int[3][3];
        int i,j;
        System.out.println("Enter number in matrix:");
        Scanner sc = new Scanner (System.in);
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 3X3:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}