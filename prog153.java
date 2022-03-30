import java.io.*;
class prog153
{
    public static void main(String args[]) throws IOException
    {
        File f1 = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\interview questions by myself.txt");

        System.out.println("Name = "+f1.getName());
        System.out.println("path ="+f1.getPath());
        System.out.println("Abs Path:"+f1.getAbsolutePath());
        System.out.println("parent:"+f1.getParent());
        System.out.println("exists="+f1.exists());
        System.out.println("Writable="+f1.canWrite());
        System.out.println("Readable="+f1.canRead());
        System.out.println("is Directory="+f1.isDirectory());
        System.out.println("is File="+f1.isFile());
        System.out.println("File Size:"+f1.length()+"Bytes");
        System.out.println("File last modified:"+f1.lastModified());
      
    }
}