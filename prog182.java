/*<applet code="prog182" width=300 height=500>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class prog182 extends Applet
{
    Label l;
    TextArea ta;
    public void init()
    {
        l= new Label("Address");
        ta= new TextArea(10,50);
        add(l);
        add(ta);

    }
}