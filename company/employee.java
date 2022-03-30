package company;
public class employee
{
    int employee_id;
    String employee_name;
    public void setdata(int i,String name)
    {
        employee_id=i;
        employee_name=name;
    }
    public void display()
    {
        System.out.println("Employee ID : "+employee_id);
        System.out.println("Employee Name: "+employee_name);
    }
}