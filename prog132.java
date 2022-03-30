import company.*;
import hr.*;
class prog132
{
    public static void main(String args[])
    {
        employee e= new employee();
        e.setdata(2205034,"Mohammad");
        e.display();
        salary m = new salary();
        m.setdata(2205034,30000);
        m.display();
    }
}