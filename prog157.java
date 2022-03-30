import java.io.*;
class prog157
{
    public static void main(String args[]) throws IOException
    {
        String s = new String("Mohammad");
        byte b[] = s.getBytes();
        FileOutputStream fos = new FileOutputStream("a.txt");

        fos.write(b);
        fos.close();
        System.out.println("Name is Written");
    }
}