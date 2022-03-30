class prog43
{
    public static void main (String args[])
    {
        int i,j;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}