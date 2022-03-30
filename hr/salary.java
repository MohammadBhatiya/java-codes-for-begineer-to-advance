package hr;
public class salary
{
    int sal,employee_id;
    public void setdata(int s,int i)
    {
        sal=s;
        employee_id=i;
    }
    public void display()
    {
        System.out.println("Employee Id: "+employee_id);
        System.out.println("Employee Salary: "+sal);
    }
}