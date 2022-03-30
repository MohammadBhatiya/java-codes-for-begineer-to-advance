/*<applet code="prog172" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;
public class prog172 extends Applet
{
    public void paint(Graphics g)
    {
        Polygon p = new Polygon();
        p.addPoint(100,100);
        p.addPoint(200,200);
        p.addPoint(0,200);
        g.fillPolygon(p);
    }
}