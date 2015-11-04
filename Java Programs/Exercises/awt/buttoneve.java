import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/*<applet code=buttoneve height=200  width=200>
</applet> */

public class buttoneve extends Applet implements ActionListener
	{

	Image i1 , i2 , i3;

	Button b1 = new Button("Red");
	Button b2 = new Button("Green");
	Button b3 = new Button("Blue");
	int no = 0;


	public void init()
		{
		i1 = getImage(getDocumentBase() , "2d.jpg");
		i2 = getImage(getDocumentBase() , "b.jpg");
		i3 = getImage(getDocumentBase() , "3d.jpg");

		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		add(b3);
		b3.addActionListener(this);
		}	

	public void actionPerformed(ActionEvent a)
		{
		String str = a.getActionCommand();
		if (str.equals("Red")) no = 1;
		if (str.equals("Green")) no = 2;
		if (str.equals("Blue")) no = 3; 
		repaint();
		}

	public void paint(Graphics g)
		{
		g.drawString("Button Demo" , 100,130);
		if (no == 1) 	g.drawImage(i1,0,0,this);
		if (no == 2) 	g.drawImage(i2,0,0,this);
		if (no == 3) 	g.drawImage(i3,0,0,this);
		}
	}