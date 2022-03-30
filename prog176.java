/*<applet code="prog176" width=300 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog176 extends Applet implements ItemListener
{
    Checkbox m,k,p;
    public void init()
    {
        setLayout(null);
        m= new Checkbox("Mouse");
        k= new Checkbox("Keyboard");
        p= new Checkbox("Pendrive");
        m.setBounds(10,100,100,50);
        k.setBounds(10,150,100,50);
        p.setBounds(10,200,100,50);
        add(m);
        add(k);
        add(p);
        m.addItemListener(this);
        k.addItemListener(this);
        p.addItemListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(m.getLabel()+"="+m.getState(),10,300);
        g.drawString(k.getLabel()+"="+k.getState(),10,350);
        g.drawString(p.getLabel()+"="+p.getState(),10,400);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();

    }
}