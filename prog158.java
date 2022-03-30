import java.io.*;
class prog158
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = new FileInputStream("prog157.java");
        File f=new File("prog157.java");
        long l=f.length();
        byte b[]=new byte[(int)l];
        fis.read(b);
        fis.close();
        String str=new String(b);
        System.out.println(str);
    }
}