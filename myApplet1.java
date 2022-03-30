/* <applet code="myApplet1" width=300 height=300>
<param name="no1" value="20"></param>
<param name="no2" value="40"></param>
</applet>*/
import java.applet.*;
import java.awt.*;
public class myApplet1 extends Applet
{
    int a,b,c;
    public void init()
    {
        setBackground(Color.red);
        setForeground(Color.yellow);
        Font f = new Font("Times New Roman",Font.BOLD|Font.ITALIC,30);
        setFont(f);
        a=Integer.parseInt(getParameter("no1"));
        b=Integer.parseInt(getParameter("no2"));
        c=a+b;
    }
    public void paint(Graphics g)
    {
        g.drawString("add="+c,100,100);
    }
}