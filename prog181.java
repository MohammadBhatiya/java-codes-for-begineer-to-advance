/*<applet code="prog181" width=500 height=500>
</applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class prog181 extends Applet implements ActionListener
{
    Button b1,b2,b3,b4,b5;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    public void init()
    {
        setLayout(null);
        l1=new Label("First Number ");
        l1.setBounds(100,40,100,20);
        l2=new Label("Second Number ");
        l2.setBounds(100,80,100,20);
        l3=new Label("Third Number ");
        l3.setBounds(100,120,100,20);
        t1=new TextField();
        t1.setBounds(210,40,100,20);
        t2=new TextField();
        t2.setBounds(210,80,100,20);
        t3=new TextField();
        t3.setBounds(210,120,100,20);
        b1= new Button("Add");
        b1.setBounds(80,150,60,50);
        b2= new Button("Sub");
        b2.setBounds(130,150,60,50);
        b3= new Button("Mul");
        b3.setBounds(180,150,60,50);
        b4= new Button("Div");
        b4.setBounds(230,150,60,50);
        b5= new Button("Mod");
        b5.setBounds(280,150,60,50);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);    
        b2.addActionListener(this);    
        b3.addActionListener(this);    
        b4.addActionListener(this);    
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(ae.getSource()==b1)
        {
            t3.setText(String.valueOf(a+b));
        }
        else if(ae.getSource()==b2)
        {
            t3.setText(String.valueOf(a-b));
        }
        else if(ae.getSource()==b3)
        {
            t3.setText(String.valueOf(a*b));
        }
        else if(ae.getSource()==b4)
        {
            t3.setText(String.valueOf(a/b));
        }
        else if(ae.getSource()==b5)
        {
            t3.setText(String.valueOf(a%b));
        }

    }
}