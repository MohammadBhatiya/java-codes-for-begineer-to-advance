/*<applet code="prog167" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;

public class prog167 extends Applet
{
    public void paint(Graphics g)
    {
        Polygon p = new Polygon();
        p.addPoint(50,200);
        p.addPoint(50,150);
        p.addPoint(100,100);
        p.addPoint(150,150);
        p.addPoint(150,200);
        p.addPoint(100,250);
        g.drawPolygon(p);
    }
}