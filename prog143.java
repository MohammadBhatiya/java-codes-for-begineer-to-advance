class mythread extends Thread
{
    String nm;
    mythread(String name)
    {
        nm=name;
    }
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(nm+"="+i);
            try
                {
                    Thread.sleep(1000);
                }
            catch (InterruptedException ex) 
            {
               System.out.println(ex.getMessage());
            }
        }
    }
}
class prog143
{
    public static void main(String args[])throws InterruptedException
    {
        mythread x = new mythread("First");
        mythread y = new mythread("second");

        x.start();
        y.start();

        Thread.currentThread().sleep(1000);
        System.out.println("First Thread is suspended");
        x.suspend();
        Thread.currentThread().sleep(4000);
        System.out.println("First Thread is resumed");
        x.resume();
    }
}