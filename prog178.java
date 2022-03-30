/*<applet code="prog178" width=500 height=500>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class prog178 extends Applet implements ItemListener
{
    Label l;
    Choice c;
    public void init()
    {
        l=new Label("city:");
        c=new Choice();
        c.add("Dahod");
        c.add("Vadodra");
        c.add("Surat");
        c.add("Ahmdabad");
        c.add("Gandhinagar");
        
        setLayout(null);
        l.setBounds(10,100,100,50);
        c.setBounds(110,100,100,50);
        add(c);
        c.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("i live in "+c.getSelectedItem(),100,200);
    }
}