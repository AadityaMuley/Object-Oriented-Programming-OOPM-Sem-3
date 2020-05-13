import java.awt.*;
import java.applet.*;
public class Smiley extends Applet
{
public void paint(Graphics g)
{
Font f=new Font("Helvetica",Font.BOLD,20);
g.setFont(f);
g.drawString("Keep Smiling!!!",50,30);
g.drawOval(60,60,200,200);
g.setColor(Color.yellow);
g.fillOval(90,120,50,20);
g.fillOval(190,120,50,20);
g.drawLine(165,125,165,175);
g.drawArc(110,130,95,95,0,-180);
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.awt.*;
import java.applet.*;
public class Snow extends Applet
{
public void paint(Graphics g)
{
Font f= new Font("Helvetica", Font.BOLD,20);
g.setFont(f);
g.drawString("Snow Man!!!",50,30);
g.drawOval(110,110,80,80);
g.drawOval(102,190,100,100);
g.drawOval(83,290,140,140);
g.setColor(Color.black);
g.fillOval(130,130,5,5);
g.fillOval(165,130,5,5);
g.drawLine(110,110,190,110);
g.drawLine(190,230,250,230);
g.drawLine(70,190,120,230);
g.drawArc(130,140,40,40,0,-180);
g.setColor(Color.yellow);
g.fillOval(250,30,45,45);
g.setColor(Color.red);
g.fillRect(125,40,50,70);
}
}
