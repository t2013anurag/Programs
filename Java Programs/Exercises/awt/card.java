import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="card" height=200 width=400>
</applet> */

public class card extends Applet implements ActionListener
	{
	CardLayout cl = new CardLayout();
	
	Panel p = new Panel();
	Panel breakfast = new Panel();
	Panel lun = new Panel();
	
	Button b1 = new Button("Breakfast");
	Button b2 = new Button("Lunch");

	CheckboxGroup bf = new CheckboxGroup();
	Checkbox Idly , Dosa, Puri,Vada, Pongal;

	CheckboxGroup lunch = new CheckboxGroup();
	Checkbox  Meals, Curd, Sambar, Roti, Biriyani;
	
	public void init()
		{
		add(b1); add(b2);
		p.setLayout(cl);
		Idly = new Checkbox("Hot Idly",bf,true);
		Dosa = new Checkbox("Dosai",bf,false);
		Puri = new Checkbox("Puree Potato",bf,false);
		Vada = new Checkbox("Vadai",bf,false);
		Pongal = new Checkbox("White Pongal",bf,false);

		Meals = new Checkbox("Full Meals",lunch,true);
		Curd = new Checkbox("Curd Rice",lunch,false);
		Sambar = new Checkbox("Sambar Rice",lunch,false);
		Roti = new Checkbox("Parotta",lunch,false);
		Biriyani = new Checkbox("Biriyani",lunch,false);

		lun.add(Biriyani);lun.add(Meals); lun.add(Curd); lun.add(Roti); lun.add(Sambar); 

		breakfast.add(Idly); breakfast.add(Dosa); breakfast.add(Puri);breakfast.add(Vada); breakfast.add(Pongal);

		p.add(breakfast,"break"); p.add(lun, "Lunch");
		add(p);
		b1.addActionListener(this);
		b2.addActionListener(this);
		}

public void actionPerformed(ActionEvent a)
		{
		String s = a.getActionCommand();
		if (s.equals("Lunch")) cl.show(p, "Lunch");
		if (s.equals("Breakfast")) cl.show(p, "break");
		repaint();
		} 
	}
