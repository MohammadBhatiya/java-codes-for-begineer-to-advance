/*<applet code="prog173" width=300 height=300>
</applet>*/
import java.applet.*;
import java.awt.*;
public class prog173 extends Applet
{
    FlowLayout fl;
    Label l1,l2,l3;
    public void init()
    {
        fl=new FlowLayout();
        setLayout(fl);
        l1= new Label("one");
        l2= new Label("two");
        l3= new Label("three");
        add(l1);
        add(l2);
        add(l3);

    }
}
