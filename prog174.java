/*<applet code="prog174" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;
public class prog174 extends Applet
{
    Label l1,l2,l3;
    public void init()
    {
        setLayout(null);
        l1= new Label("one");
        l2= new Label("two");
        l3= new Label("three");
        l1.setBounds(10,10,100,50);
        l2.setBounds(10,100,100,50);
        l3.setBounds(10,200,100,50);
        add(l1);
        add(l2);
        add(l3);
       
    }
}