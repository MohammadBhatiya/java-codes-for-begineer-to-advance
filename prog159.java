import java.io.*;
class prog159
{
    public static void main(String args[]) throws IOException
    {
        String s = new String("Rohan");
        FileWriter fw = new FileWriter("a.txt");
        fw.write(s);
        fw.close();
        System.out.println("name is written");
    }
}