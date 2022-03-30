import java.io.*;
class prog160
{
    public static void main(String args[]) throws IOException
    {
        File f=new File("a.txt");
        long l=f.length();
        char a[]=new char[(int)l];
        FileReader fr = new FileReader("a.txt");
        fr.read(a);
        fr.close();
        String s=new String(a);
        System.out.println(s);
    }
}
