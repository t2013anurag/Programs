import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="winapp" height=200 width=400>
</applet> */

public class winapp extends Applet implements WindowListener
	{
	String msg=" ";
	Frame f = new Frame("Sample window");

	public void init()
		{
		f.setVisible(true);
		f.addWindowListener(this);
		}
	public void windowActivated(WindowEvent m)
		{ msg = "I am activted";repaint();}
	public void windowClosed(WindowEvent m)
		{ }
	public void windowClosing(WindowEvent m)
		{ }
	public void windowDeactivated(WindowEvent m)
		{ msg = "I am deactivated";repaint();}
	public void windowIconified(WindowEvent m)
		{}
	public void windowDeiconified(WindowEvent m)
		{ }
	public void windowOpened(WindowEvent m)
		{ }

	public void paint(Graphics g)
		{
		g.setColor(Color.red);
		g.drawString(msg,200,200);
		}
	}
