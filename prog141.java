class mydata
{
    void show()
    {
        int i;
    
    System.out.println("start");
    for(i=1;i<=5;i++)
    {
        System.out.println(i);
        try 
        {
            Thread.sleep(1000);        
        } 
        catch (InterruptedException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    System.out.println("End");
}
}
class mythread extends Thread
{
    mydata m;
    mythread(mydata x)
    {
        m=x;
    }
    public void run()
    {
        synchronized(m)
        {
        m.show();
        }
    }
}
class prog141
{
    public static void main(String args[])
    {
        mydata d = new mydata();
        mythread t1 = new mythread(d);
        mythread t2 = new mythread(d);
        t1.start();
        t2.start();
    }
}