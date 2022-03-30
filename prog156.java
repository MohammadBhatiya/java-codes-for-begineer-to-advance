import java.io.*;
class prog156
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = new FileInputStream("a.txt");
        int b= fis.read();
        fis.close();
        System.out.println("byte = "+b);
    }
}