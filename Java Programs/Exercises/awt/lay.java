import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="lay" height=200 width=400>
</applet> */

public class lay extends Applet 
	{
	
	public void init()
		{

		Panel mainp = new Panel();			
	
	
		CheckboxGroup bf = new CheckboxGroup();
		Checkbox Idly,Dosa,Puri,Vada,Pongal;

		Idly = new Checkbox("Hot Idly",bf,true);
		Dosa = new Checkbox("Dosai",bf,false);
		Puri = new Checkbox("Puri Potato",bf,false);
		Vada = new Checkbox("Vadai",bf,false);
		Pongal = new Checkbox("White Pongal",bf,false);
			

		Label l = new Label("Name");
		Label l1 = new Label("Password");
		TextField t = new TextField(30);
		TextField t1 = new TextField(10);
	
		Font f = new Font("Ariel", Font.BOLD, 30);
		
	
		CheckboxGroup lunch = new CheckboxGroup();
		Checkbox  Meals, Curd, Sambar, Roti, Biriyani;
		Meals = new Checkbox("Meals",bf,false);
		Curd = new Checkbox("Curd",bf,false);
		Sambar = new Checkbox("Sambar Potato",bf,false);
		Roti = new Checkbox("Roti",bf,false);
		Biriyani = new Checkbox("Biriyani",bf,true);
			
		Button b1 = new Button("First");
		Button b2 = new Button("Second");
		Button b3 = new Button("Third");


		Panel p1 = new Panel(new GridLayout(2,3));
		Panel p2 = new Panel(new BorderLayout());
		Panel p3 = new Panel(new FlowLayout(FlowLayout.LEADING,25,25));

		add(b1);
		add(b2);
		add(b3);
		mainp.setLayout(new FlowLayout());
		
		p1.add(Idly); p1.add(Dosa); p1.add(Puri); p1.add(Vada); p1.add(Pongal);
		

//		setFont(f);
		t1.setEchoChar('*');
		
		p2.add(l,BorderLayout.WEST);
		p2.add(t, BorderLayout.CENTER);
		p2.add(l1,BorderLayout.SOUTH);
		p2.add(t1,BorderLayout.EAST);
p3.add(Meals); p3.add(Curd); p3.add(Sambar); p3.add(Roti); p3.add(Biriyani);
		
		p1.setBackground(Color.red);
		p2.setBackground(Color.cyan);
		p3.setBackground(Color.magenta);
		
		add(p1);
		add(p2);
		add(p3);
		add(mainp);
		}
	

	}



	
	