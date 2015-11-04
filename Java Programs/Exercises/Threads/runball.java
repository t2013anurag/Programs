import java.awt.*;
import java.applet.*;
import java.lang.*;

/*<applet code=runball width=200 height=500>
</applet> */

public class runball extends Applet implements Runnable
	{
	
	Thread t;
	String ms="WELCOME TO JAVA";
	int startx1 = 10 , starty1 = 10 , x = 10, y = 10;

	public void init()
		{
		setBackground(Color.red);
		setForeground(Color.black);
		}

	public void start()
		{
		t = new Thread(this);
		t.start();
		}
	public void run()
		{
		char s;
		
		int c = 1;
		
		while (true)
		{
		try
		{
		c++;
		repaint(); Thread.sleep(100);
		if ( startx1 <= 500) { startx1 += x;  }
		else {startx1 = 10; starty1 = 10;  }
		
		}
		catch(InterruptedException e) { e.printStackTrace();}
		}
		}
			
	public void paint(Graphics g)
		{
		g.fillOval(startx1,starty1,25,25);
				
		}
	}