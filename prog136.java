class mythread extends Thread
{
     public void run()
     {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Hii");
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

class prog136
{
    public static void main(String args[])
    {
        mythread t = new mythread();
        t.start();
    }
}