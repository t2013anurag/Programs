import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class eve extends Applet implements ActionListener
	{
	String msg;
	TextField t,t1;
	Checkbox c1,c2;	
	public void init()
	{
	setBackground(Color.cyan);
	setForeground(Color.magenta);
	Label l = new Label("Name");
	t = new TextField(30);
	Label l1 = new Label("Password");
	t1 = new TextField(30);
	t1.setEchoChar('*');	
	c1 = new Checkbox("Sugar");
	c2= new Checkbox("Ice Cream");
	Button b2 = new Button("Click ME");
	add(l);
	add(t);
	add(l1);
	add(t1);
	add(c1);
	add(c2);
	add(b2);
	b2.addActionListener(this);
	}

	public void paint(Graphics g)
	{
	g.drawString(msg, 100,100);
	showStatus("My first applet.. Wish me good luck"); 
	} 

	public void actionPerformed(ActionEvent e)
	{
	msg = t.getText() + " "+ t1.getText();
	if (c1.getState() == true ) msg+= "Sugar";
	if (c2.getState() == true ) msg+= "IceCream";
	repaint();
	}
	}



/*<applet code=eve height=400 width=400>
</applet> */