import java.io.*;
class prog155
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("a.txt");

        fos.write(97);
        fos.close();
        System.out.println("byte written");
    }
}