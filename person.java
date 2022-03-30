package pack2;
public class person
{
    int income;
    String name;
    public void setdata(String n,int in)
    {
        name=n;
        income=in;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Income is :"+income);

    }
}
