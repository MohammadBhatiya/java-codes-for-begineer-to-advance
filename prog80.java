class prog80
{
    public static void main(String args[])
    {
        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
        int i,j;
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