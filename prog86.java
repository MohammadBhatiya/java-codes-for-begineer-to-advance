class prog86
{
    public static void main(String args[])
    {
    int x[][] = new int[3][];
    x[0] = new int[2];
    x[1] = new int[4];
    x[2] = new int[3];
    int i;
    x[0][0]=1;
    x[0][1]=2;

    x[1][0]=10;
    x[1][1]=20;
    x[1][2]=30;
    x[1][3]=40;

    x[2][0]=100;
    x[2][1]=200;
    x[2][2]=300;

    for(i=0;i<=1;i++)
    {
        System.out.print(x[0][i]+" ");
    }
    System.out.println();
    for(i=0;i<=3;i++)
    {
        System.out.print(x[1][i]+" ");
    }
    System.out.println();
    for(i=0;i<=2;i++)
    {
        System.out.print(x[2][i]+" ");
    }










    }
}