import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=mouseeve height=200 width=200>
</applet> */

public class mouseeve extends Applet implements MouseListener, MouseMotionListener
	{
	String msg; int mx,my;
	
	public void init()
	{
	addMouseListener(this);
	addMouseMotionListener(this);
	}
	
public void mouseClicked(MouseEvent me)
		{
		msg = "Mouse clicked" ; 
		mx = me.getX();
		my = me.getY();
		}

public void mouseEntered(MouseEvent me)
	{setBackground(Color.red);}

public void mouseMoved(MouseEvent me)
	{setBackground(Color.blue); }

public void mouseDragged(MouseEvent me)
	{setBackground(Color.cyan);}
	
public void mouseExited(MouseEvent me)
	 {setBackground(Color.gray);}

public void mousePressed(MouseEvent me)
	 {setBackground(Color.green);}


public void mouseReleased(MouseEvent me)
	 {setBackground(Color.white);}

public void paint(Graphics g)
		{
		g.drawString(msg,mx,my);
		}

}