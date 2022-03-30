import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class prog189
{
    public static void main(String args[])
    {
        MenuBar mb;
        Menu m;
        MenuItem i1,i2,i3;
        Frame f;
        f= new Frame("My Frame");
        mb=new MenuBar();
        m= new Menu("file");
        i1= new MenuItem("Item1");
        i2= new MenuItem("Item2");
        i3= new MenuItem("Item3");
        m.add(i1);
        m.add(i2);
        m.addSeparator();
        m.add(i3);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(300,300);
        f.setVisible(true);
    }
}