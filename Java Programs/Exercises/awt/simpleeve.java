import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code=simpleeve.class height=400 width=400>
</applet> */
public class simpleeve extends Applet implements ActionListener 
	{ 
 	Button b = new Button("I'm a button!"); 
	int numclicks =0;
	Label l = new Label("    ");
	public void init()
	{
	add(b);
	add(l);
	b.addActionListener(this); 
  	}
	 
	public void actionPerformed(ActionEvent e)
	{ numclicks++; 
	l.setText(Integer.toString(numclicks));
	}
}
