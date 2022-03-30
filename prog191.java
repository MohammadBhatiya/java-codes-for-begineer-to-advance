/*<applet code="prog191" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog191 extends Applet implements KeyListener
{
    String s = new String();
    public void init()
    {
        addKeyListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(s,100,100);
    }
    public void keyPressed(KeyEvent ke)
    {
        s="Key is Pressed";
        repaint();
    }
    public void keyReleased(KeyEvent ke)
    {
        s="Key is Released";
        repaint();
    }
    public void keyTyped(KeyEvent ke)
    {
        s="Key is Typed";
        repaint();
    }

}