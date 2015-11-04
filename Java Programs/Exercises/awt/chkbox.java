import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="chkbox" height=200 width=400>
</applet> */

public class chkbox extends Applet implements ItemListener
	{
	
	CheckboxGroup bf = new CheckboxGroup();;
	Checkbox Idly , Dosa, Puri,Vada, Pongal;
	String msg = " ";
	float amount = 0;

	
	public void init()
		{
		Idly = new Checkbox("Idly",bf,true);
		Dosa = new Checkbox("Dosai",bf,false);
		Puri = new Checkbox("Puree",bf,false);
		Vada = new Checkbox("Vadai",bf,false);
		Pongal = new Checkbox("Pongal",bf,false);
		add(Idly); add(Dosa); add(Puri); add(Vada); add(Pongal);
		Idly.addItemListener(this);
		Dosa.addItemListener(this);
		Vada.addItemListener(this);
		Pongal.addItemListener(this);
		Puri.addItemListener(this);
	
		}
	
public void itemStateChanged(ItemEvent i)
		{
		if (Vada.getState() == true ) { amount += 10; msg ="  "+ Vada.getLabel();}
		if (Idly.getState() == true ) {amount += 15;msg = "  "+Idly.getLabel();}
		if (Dosa.getState() == true ) {amount += 20;msg = "  "+Dosa.getLabel();}
		if (Puri.getState() == true ) {amount += 25;msg = "  "+Puri.getLabel();}
		if (Pongal.getState() == true) {amount += 20;msg = "  "+Pongal.getLabel();}

		repaint();
		}
	public void paint(Graphics g)
		{
		g.setColor(Color.red);
		g.drawString(msg,200,200);
		g.drawString("Total Amount " + Float.toString(amount) , 250,250);
		}
	}
