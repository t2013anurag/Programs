import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="keyapp" height=200 width=400>
</applet> */

public class keyapp extends Applet implements KeyListener
	{
	String msg="I am the original ";int x=10, y =20;

	public void init()
		{
		addKeyListener(this);
		requestFocus();
	}

public void keyPressed(KeyEvent k)
		{
		showStatus("Key press");
		int ch = k.getKeyCode();
		switch (ch)
			{
			case KeyEvent.VK_F1 : msg += "Pressed f1 key"; break;		
			default : msg += "";
			}repaint();	
		}
	

	public void keyReleased(KeyEvent k)
		{
//		msg += "I just released a key"; repaint();
		showStatus("Key released");
		}

	public void keyTyped(KeyEvent k)
		{
//		showStatus("Key Typed");		
		msg += k.getKeyChar(); repaint();
		}
	public void paint(Graphics g)
		{
		g.setColor(Color.red);
		g.drawString(msg,x,y);
		}
	}
