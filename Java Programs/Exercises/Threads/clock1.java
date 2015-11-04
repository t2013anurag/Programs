import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.SimpleDateFormat;

/* <applet code=clock1.class height=300 width=300>
</applet> */


public class clock1 extends Applet implements Runnable
	{ 
	Thread myThread = new Thread(this); 
	Label clock= new Label("");; 
	Label dat = new Label(" ");
	Date d = new Date();
	
	public void init()
	{ 
	
	dat.setFont (new Font ("Verdana", Font.BOLD,28));
	dat.setBackground(Color.black);
	dat.setForeground(Color.white);
	add(dat);
	
	SimpleDateFormat df = new SimpleDateFormat(" dd:MM:yy ");
	String dt = df.format(d);
	System.out.println(dt);
	dat.setText(dt);
	
	clock.setFont (new Font ("Verdana", Font.BOLD,28));
	clock.setBackground(Color.blue);
	clock.setForeground(Color.white);
	add(clock);
	myThread.start();
	}

public void run()
	{
	while (true)
	{ 
	Date d = new Date();
	SimpleDateFormat df1 = new SimpleDateFormat(" hh:mm:ss ");
	String t = df1.format(d);
	clock.setText(t);
	}
	} 

public void paint(Graphics g)
	{
	g.fillOval(30,30,40,40);
	}
}