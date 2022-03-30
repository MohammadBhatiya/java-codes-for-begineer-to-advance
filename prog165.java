/*<applet code="prog165" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;

public class prog165 extends Applet
{
    public void paint(Graphics g)
    {
        int x[]={100,200,0};
        int y[]={100,200,200};
        g.drawPolygon(x,y,3);
    }
}