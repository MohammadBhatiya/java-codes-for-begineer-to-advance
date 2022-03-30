import java.util.*;
class prog119
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    int a;
    a=sb.capacity();
    System.out.println("original Capacity is"+a);
    sb.ensureCapacity(32);
    a=sb.capacity();
    System.out.println("ensure Capacity is"+a);
    
}
}