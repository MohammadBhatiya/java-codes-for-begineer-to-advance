import java.util.*;
class prog145
{
    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        int ind,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter index");
        ind=sc.nextInt();
        try{
            System.out.println("element="+arr[ind]);
    
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Invalid Index");
        }
        

    }
}