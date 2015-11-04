import java.awt.*;
import java.applet.Applet;


public class applet2 extends Applet
	{
	
	public void init()
	{
	setBackground(Color.cyan);
	setForeground(Color.magenta);

	Label l = new Label("Name");
	l.setBackground(Color.red);
	l.setForeground(Color.black);
	TextField t = new TextField(30);
	Label l1 = new Label("Password");
	TextField t1 = new TextField(30);
	
	t1.setEchoChar('*');	

	Checkbox c1 = new Checkbox("Sugar");
	Checkbox c2= new Checkbox("Ice Cream");

	CheckboxGroup cb = new CheckboxGroup();
	Checkbox bf1 = new Checkbox("Idly", cb,true);
	Checkbox bf2= new Checkbox("Dosa",cb,false);
	Checkbox bf3= new Checkbox("Pongal",cb,false);
	Checkbox bf4= new Checkbox("Poori",cb,false);

	Button b1 = new Button("Button1");
	Button b2 = new Button("Click ME");

	List lt = new List(2,true);
	lt.add("Nokia");
	lt.add("Samsung");
	lt.add("Blackberry");
	lt.add("apple");

	
	Choice c = new Choice();
	c.add("Diamond");
	c.add("Platinum");
	c.add("Gold");
	c.add("Silver");

	TextArea tx = new TextArea(5,80);

	Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL);
	Scrollbar s1 = new Scrollbar(Scrollbar.VERTICAL);

	add(l);
	add(t);
	add(l1);
	add(t1);

	add(c1);
	add(c2);
	add(bf1);
	add(bf2);
	add(bf3);
	add(bf4);

	add(b1);
	add(b2);

	add(lt);
	add(c);

	add(tx);
	add(s);
	add(s1);  
	}

/*	public void paint(Graphics g)
	{
	g.drawString("Welcome to Applets!", 100,100);
	g.drawOval(50,50,60,40);
	g.fillOval(55,55,10,15);
	g.fillOval(90,55,10,15); 
	showStatus("My first applet.. Wish me good luck"); 
	} */

	}

/*<applet code=applet2 height=400 width=400>
</applet> */