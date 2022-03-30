/*<applet code="prog179" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog179 extends Applet implements ItemListener
{
    List l;
    Label l1;
    public void init()
    {
        l1= new Label("Actors:");
        l= new List(5,true);
        l.add("Hrithik Roshan");
        l.add("Akshay Kumar");
        l.add("Varun Dhawan");
        add(l);
        l.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        String str[]=l.getSelectedItems();
        g.drawString("My Favorite Actor is ",100,200);
        for(int i=0;i<str.length;i++)
        {
            g.drawString(str[i],100,250+50*i);
            
        }
    }
}