import java.applet.*;
import java.awt.*;
public class appletParameter extends Applet{
private String strDefault="Hello!JAva Applet";
public void paint(Graphics g){
String strParameter=this.getParameter("Message");
if(strParameter==null)
strParameter=strDefault;
g.drawString(strParameter,50,25);
}
}
<HTML>
<HEAD>
<TITTLE>Passing Parameter in Java Applet</TITLE>
</HEAD>
<BODY>
This is the applet:<P>
<APPLET code="appletParameter.class" width="800" height="100">
<PARAM name="message" value="Welcome to apsit">
</APPLET>
</BODY>
</HTML>
