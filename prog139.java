class addthread extends Thread
{
    public void run()
    {
        int i,add=0;
        for(i=1;i<=5;i++)
        {
            add=add+i;
            System.out.println("Additon is "+add);
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

class multiplythread extends Thread
{
    public void run()
    {
        int i,mul=1;
        for(i=1;i<=5;i++)
        {
            mul=mul*i;
            System.out.println("Multiplication is "+mul);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}

class prog139
{
    public static void main(String args[])
    {
        addthread t= new addthread();
        multiplythread m= new multiplythread();
        t.start();
        m.start();
    }
}