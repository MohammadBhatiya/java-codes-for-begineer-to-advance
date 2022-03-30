class prog49
{
    public static void main (String args[])
    {
        int i,j;
       l1: for(i=1;i<=5;i++)
        {
           l2: for(j=11;j<=15;j++)
            {
                if(j%3==0)
                {
                    continue l1;
                }
                System.out.println(j);
            }
        }
    }
}