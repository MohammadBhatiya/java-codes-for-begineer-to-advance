/*<applet code="prog186" width=300 height=300>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog186 extends Applet
{
    Panel p,p1,p2;
    CardLayout cl;
    public void init()
    {
        cl=new CardLayout();
        p=new Panel();
        p1=new Panel();
        p2=new Panel();
        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p.setLayout(cl);
        p.add(p1,"first");
        p.add(p2,"second");
        add(p);
        cl.show(p,"first");

    }
}