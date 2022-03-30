class mydata
{
    int n;
    boolean turn=true;
    synchronized void write(int i)
    {
        if(turn==false)
        {
            try {
                wait();    
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
        n=i;
        System.out.println("write="+n);
        turn=false;
        notify();
    }
    synchronized void read()
    {
        if(turn==true)
        {
            try {
                wait();    
            } catch (Exception e) {
                //TODO: handle exception
            }   
        }
        System.out.println("read="+n);
        turn=true;
        notify();
    }
}
class producer extends Thread
{
    mydata m;
    producer(mydata x)
    {
        m=x;
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            m.write(i++);
        }
    }
}
class consumer extends Thread
{
    mydata m;
    consumer(mydata x)
    {
        m=x;
    }
    public void run()
    {
        while(true)
        {
            m.read();
        }
    }
}
class prog142
{
    public static void main(String args[])
    {
        mydata d = new mydata();
        producer p = new producer(d);
        consumer c = new consumer(d);

        p.start();
        c.start();
    }
}