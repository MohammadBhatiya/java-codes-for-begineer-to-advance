/*<applet code="prog185" width=300 height=300>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog185 extends Applet
{
    Button b1,b2,b3,b4,b5;
    GridLayout gl;
    public void init()
    {
        gl= new GridLayout(3,3);
        setLayout(gl);
        b1= new Button("Button1");
        b2= new Button("Button2");
        b3= new Button("Button3");
        b4= new Button("Button4");
        b5= new Button("Button5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }
}