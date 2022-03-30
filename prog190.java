/*<applet code="prog190" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog190 extends Applet implements MouseListener,MouseMotionListener
{
    String s =new String();
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(s,100,100);
    }
    public void mousePressed(MouseEvent me)
    {
        s="Mouse is pressed";
        repaint();
    }
    public void mouseClicked(MouseEvent me)
    {
        s="Mouse is clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        s="Mouse is Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        s="Mouse is Exited";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        s="Mouse is Released";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        s="mouse is Dragged";
        repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
        s="mouse is moved";
        repaint();
    }
}