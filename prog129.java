import java.util.*;
class prog129
{
    public static void main(String args[])
    {
        Vector v = new Vector();
        v.addElement(new Integer(10));
        v.addElement(new Float(12.75));
        v.addElement(new Character('M'));
        v.addElement("Mohammad");
        v.addElement(new Boolean(true));

        System.out.println("Size="+v.size());

        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.elementAt(i));
        }


    }
}