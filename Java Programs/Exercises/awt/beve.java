import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code=beve height=200 width=200>
</applet> */

class lessexception extends Exception
	{
	lessexception() {System.out.println("name should be more than 3 chars");}
	}


public class beve extends Applet implements ActionListener
	{
	Button b1 = new Button("Blue");
	TextField tf = new TextField();	
	public void init()
	{
	b1.setBackground(Color.blue);
	b1.addActionListener(this);
	add(tf);
	add(b1);
	
	}
	

	public void actionPerformed(ActionEvent a)
		{
		setBackground(Color.blue);
		try
		{
		if ((tf.getText()).length() < 3) throw new lessexception();
		}
		catch (lessexception e) {System.out.println(e);}
		}	


	}

