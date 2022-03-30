class addition
{
    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition= "+c);
    }
   void add(float a,float b)
   {
       float c;
       c=a+b;
       System.out.println("Addition= "+c);
   } 
   void add(double a,double b)
   {
       double c;
       c=a+b;
       System.out.println("Addition= "+c);
   }
}
class prog53
{
    public static void main (String args[])
    {
        addition x = new addition();
        x.add(10,23);
        x.add(10.2f,23.5f);
        x.add(10.25,23.65);
    }
}