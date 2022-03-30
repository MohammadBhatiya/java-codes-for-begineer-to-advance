/*<applet code="prog192" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog192 extends Applet implements KeyListener
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
        s="Asci value is "+ke.getKeyCode();
        repaint();
    }
    public void keyReleased(KeyEvent ke)
    {
        
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }

}