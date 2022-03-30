/*<applet code="prog183" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class prog183 extends Applet
{
    Button b1,b2,b3;
    FlowLayout fl;
    public void init()
    {
        fl=new FlowLayout(FlowLayout.LEFT,50,50);
        setLayout(fl);    
        b1= new Button("Button1");
        b2= new Button("Button2");
        b3= new Button("Button3");
        add(b1);
        add(b2);
        add(b3);

    }

}