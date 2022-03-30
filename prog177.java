/*<applet code="prog177" width=300 height=500>
</applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class prog177 extends Applet implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox c1,c2,c3;
    public void init()
    {
        setLayout(null);
        cbg=new CheckboxGroup();
        c1=new Checkbox("Red",cbg,false);
        c2=new Checkbox("Green",cbg,false);
        c3=new Checkbox("Blue",cbg,false);
        c1.setBounds(10,100,100,50);
        c2.setBounds(10,150,100,50);
        c3.setBounds(10,200,100,50);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
       Checkbox c=cbg.getSelectedCheckbox();
       if(c==c1)
       {
           setBackground(Color.red);
       }
       else if(c==c2)
       {
           setBackground(Color.green);
       }
       else
       {
           setBackground(Color.blue);
       }
    }

}