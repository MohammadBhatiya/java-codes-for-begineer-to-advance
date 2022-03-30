/*<applet code="prog175" width=300 height=300>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog175 extends Applet implements ActionListener
{
    Button b;
    FlowLayout fl;
    public void init()
    {
        fl=new FlowLayout();
        setLayout(fl);
        b= new Button("Click Me");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        b.setLabel("Button Clicked");
    }
}