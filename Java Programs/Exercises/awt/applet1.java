import java.awt.*;
import java.applet.Applet;


public class applet1 extends Applet
	{
	
	public void init()
	{
	Font f = new Font("Ariel", Font.BOLD, 30);
	setBackground(Color.pink);
	setForeground(Color.cyan);
	setLayout(null);
	Label l = new Label("Name");
	l.setBounds(25,25,100,50);
	l.setFont(f);
	
	TextField t = new TextField(30);
	t.setBounds(125,25,150,50);
	t.setEchoChar('*');	

	Checkbox c1 = new Checkbox("Sugar");
	Checkbox c2= new Checkbox("Ice Cream");
	
	Label l2 = new Label ("Likes");
	l2.setBounds(25,125,100,50);
	c1.setBounds(150,125,100,50);
	c2.setBounds(250,125,100,50);
	
	CheckboxGroup cb = new CheckboxGroup();
	Checkbox bf1 = new Checkbox("Idly", cb,true);
	Checkbox bf2= new Checkbox("Dosa",cb,false);
	Checkbox bf3= new Checkbox("Pongal",cb,false);
	Checkbox bf4= new Checkbox("Poori",cb,true);

	Button b1 = new Button("Ok");
	Button b2 = new Button("Cancel");

	List lt = new List();
	lt.add("Nokia");
	lt.add("Samsung");
	lt.add("Blackberry");
	lt.add("apple");
	lt.setMultipleMode(true);
	
	Choice c = new Choice();
	c.add("Diamond");
	c.add("Platinum");
	c.add("Gold");
	c.add("Silver");
	Label l3 = new Label("Jewels");
	l3.setBounds(25,340,50,50);
	c.setBounds(100,340,200,200);
	TextArea tx = new TextArea(5,80);

	Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL);
	add(l);
	add(t);
	add(l2);
	add(c1);
	add(c2);
	add(bf1);
	add(bf2);
	add(bf3);
	add(bf4);
	add(b1);
	add(b2);
	add(lt);
	add(l3);
	add(c);
	add(tx);
	add(s);
	}

	
	}

/*<applet code=applet1 height=400 width=400>
</applet> */