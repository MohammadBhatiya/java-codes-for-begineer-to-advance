import java.io.*;
class prog154
{
    public static void main(String args[]) throws IOException
    {
        File f1 = new File("E:\\mit_2sem\\Assignments_FY_2Sem");
        System.out.println("is Directory="+f1.isDirectory());
        String[] str=f1.list();
        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }

    }
}