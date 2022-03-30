class prog48
{
    public static void main (String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=11;j<=15;j++)
            {
                if(j%3==0)
                {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}