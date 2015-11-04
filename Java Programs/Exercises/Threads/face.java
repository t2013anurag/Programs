import java.awt.*;
import java.applet.*;
import java.lang.*;

/*<applet code=face width=200 height=500>
</applet> */

public class face extends Applet implements Runnable
	{
	
	Thread t;
	String ms="WELCOME TO JAVA";
	int startx1 = 100 , starty1 = 110 , x = 10, y = 10;
	int startx2 = 150 , starty2 = 110; 
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
		repaint(); Thread.sleep(1000);
		if ( c % 2 == 0) {startx1 += x; starty1 += y;  }
		else {startx1 -= x; starty1 -= y;  }
		
		if ( c % 2 == 0) {startx2 += x; starty2 += y;  }
		else {startx2 -= x; starty2 -= y;  }
		
		s = ms.charAt(0);
		ms = ms.substring(1,ms.length());
		ms += s;
		}
		catch(InterruptedException e) { e.printStackTrace();}
		}
		}
			
	public void paint(Graphics g)
		{
		g.drawOval(70,90,140,120);
		g.fillOval(startx1,starty1,25,25);
		g.fillOval(startx2,starty2,25,25);
		g.drawLine(150,205,150, 350);
		g.drawString(Integer.toString(startx1), 400,400);
		g.drawString(Integer.toString(starty1), 420,420);
		g.drawString(ms , 300,120);
		}
	}