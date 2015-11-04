import java.awt.*;
import java.applet.Applet;


public class gridapplet2 extends Applet
	{
	
	public void init()
	{
	Panel p= new Panel();
	Panel p2= new Panel();
	Panel p3= new Panel();
	p.setLayout(new GridLayout(4,2));
	p2.setLayout(new GridLayout(3,4));

	Label l = new Label("Name");


	TextField t = new TextField(30);

	Label l1 = new Label("Password");
	TextField t1 = new TextField(30);
	
	t1.setEchoChar('*');	

	Label l2 = new Label("Likes");
	Checkbox c1 = new Checkbox("Sugar");
	Checkbox c2= new Checkbox("Ice Cream");
	Checkbox c3= new Checkbox("Coffee");

	Label l3 = new Label("Breakfast");
	CheckboxGroup cb = new CheckboxGroup();
	Checkbox bf1 = new Checkbox("Idly", cb,true);
	Checkbox bf2= new Checkbox("Dosa",cb,false);
	Checkbox bf3= new Checkbox("Pongal",cb,false);


	Button b1 = new Button("Button1");
	Button b2 = new Button("Click ME");
	Label l4 = new Label("Mobiles");
	List lt = new List(2,true);
	lt.add("Nokia");
	lt.add("Samsung");
	lt.add("Blackberry");
	lt.add("apple");

	Label l5 = new Label("Jewels");	
	Choice c = new Choice();
	c.add("Diamond");
	c.add("Platinum");
	c.add("Gold");
	c.add("Silver");
	Label l6 = new Label("Comments");
	TextArea tx = new TextArea(5,10);


	p.add(l);
	p.add(t);
	p.add(l1);
	p.add(t1);
	p.add(l4);
	p.add(lt);
	p.add(l5);
	p.add(c);
	p2.add(l2);
	p2.add(c1);
	p2.add(c2);
	p2.add(c3);

	p2.add(l3);
	p2.add(bf1);
	p2.add(bf2);
	p2.add(bf3);
	
	p2.add(l6);
	p2.add(tx);
	p2.add(b1);
	p2.add(b2);
	add(p);
	add(p2);
	
	}

	}

/*<applet code=gridapplet2 height=400 width=400>
</applet> */