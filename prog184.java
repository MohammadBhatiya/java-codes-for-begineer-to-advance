/*<applet code="prog184" width=300 height=300>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class prog184 extends Applet
{
    Button b1,b2,b3,b4,b5;
    BorderLayout bl;
    public void init()
    {
        bl=new BorderLayout();
        setLayout(bl);
        b1= new Button("Button1");
        b2= new Button("Button2");
        b3= new Button("Button3");
        b4= new Button("Button4");
        b5= new Button("Button5");
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

    }
}