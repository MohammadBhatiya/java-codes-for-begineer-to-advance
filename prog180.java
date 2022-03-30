/*<applet code="prog180" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog180 extends Applet implements AdjustmentListener
{
    Label l1,l2,l3;
    Scrollbar s1,s2,s3;
    public void init()
    {
        setLayout(null);
        l1= new Label("Red");
        l2= new Label("Green");
        l3= new Label("Blue");
        s1=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        s2=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        s3=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        l1.setBounds(10,10,100,50);
        s1.setBounds(110,10,200,50);

        l2.setBounds(10,110,100,50);
        s2.setBounds(110,110,200,50);

        l3.setBounds(10,200,100,50);
        s3.setBounds(110,200,200,50);

        add(l1);
        add(l2);
        add(l3);
        add(s1);
        add(s2);
        add(s3);
        
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }

        public void adjustmentValueChanged(AdjustmentEvent ae)
        {
            int r=s1.getValue();
            int g=s2.getValue();
            int b=s3.getValue();
            Color c=new Color(r,g,b);
            setBackground(c);
            
        }   
}