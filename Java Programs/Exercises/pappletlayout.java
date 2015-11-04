import java.awt.*;
import java.applet.Applet;


public class pappletlayout extends Applet
	{
	
	public void init()
	{
	
	GridBagLayout gb = new 	GridBagLayout();
	setLayout(gb); 
	GridBagConstraints c  = new GridBagConstraints();

	Label l = new Label("Name");
	c.gridx = 0;
	c.gridy = 0;
	gb.setConstraints(l,c);
	add(l);

	TextField t = new TextField(30);
	c.gridx = 1;
	c.gridy = 0;
	c.gridwidth=2;
	gb.setConstraints(t,c);
	add(t,c);
	
	t.setEchoChar('*');	

	Label l1 = new Label("Likes");
	c.gridx = 0;
	c.gridy = 1;
	c.gridwidth=1;

	c.insets=new Insets(15,15,10,10);

	gb.setConstraints(l1,c);
	add(l1,c);

	Checkbox c1 = new Checkbox("Sugar");
	c.gridx = 1;
	c.gridy = 1;

	
	c.gridwidth=1;
	gb.setConstraints(c1,c);
	add(c1,c);

	Checkbox c2= new Checkbox("Ice Cream");
	c.gridx = 2;
	c.gridy = 1;

	c.gridwidth=1;
	gb.setConstraints(c2,c);
	add(c2,c);

	Label l2 = new Label("Breakfast");
	c.gridx = 0;
	c.gridy = 2;
	c.gridwidth=1;	
	gb.setConstraints(l2,c);
	add(l2,c);
	
	CheckboxGroup cb = new CheckboxGroup();
	Checkbox bf1 = new Checkbox("Idly", cb,true);
	c.gridx = 1;
	c.gridy = 2;
	c.gridwidth=1;
	gb.setConstraints(bf1,c);
	add(bf1,c);

	Checkbox bf2= new Checkbox("Dosa",cb,false);
	c.gridx = 2;
	c.gridy = 2;
	c.gridwidth=1;
	gb.setConstraints(bf2,c);
	add(bf2,c);

	Checkbox bf3= new Checkbox("Pongal",cb,false);
	c.gridx = 3;
	c.gridy = 2;
	c.gridwidth=1;
	gb.setConstraints(bf3,c);
	add(bf3,c);

	Checkbox bf4= new Checkbox("Poori",cb,true);
	c.gridx = 4;
	c.gridy = 2;
	c.gridwidth=1;
	gb.setConstraints(bf4,c);

	add(bf4,c);

	Label l3 = new Label("Mobiles");
	c.gridx = 0;
	c.gridy = 4;
	c.gridwidth=1;
	gb.setConstraints(l3,c);
	add(l3,c);

	List lt = new List();
	lt.add("Nokia");
	lt.add("Samsung");
	lt.add("Blackberry");
	lt.add("apple");


	c.gridx = 1;
	c.gridy = 4;
	c.gridwidth=1;
	gb.setConstraints(lt,c);
	add(lt,c);
	
	Label l4 = new Label("Jewels");
	c.gridx = 0;
	c.gridy = 5;
	c.gridwidth=1;	
	gb.setConstraints(l4,c);

	add(l4,c);

	Choice ch = new Choice();
	ch.add("Diamond");
	ch.add("Platinum");
	ch.add("Gold");
	ch.add("Silver");
	c.gridx = 1;
	c.gridy = 5;
	c.gridwidth=1;	
	gb.setConstraints(ch,c);
	add(ch,c);

	Label l5 = new Label("Comments");
	c.gridx = 0;
	c.gridy = 7;
	c.gridwidth=1;
	gb.setConstraints(l5,c);
	add(l5,c);

	TextArea tx = new TextArea(5,80);

	c.gridx = 1;
	c.gridy = 7;
	c.gridwidth= 5;
	c.fill=GridBagConstraints.BOTH;

	gb.setConstraints(tx,c);
	add(tx,c);
 
	Button b1 = new Button("Ok");
	c.gridx = 0;
	c.gridy = 9;
	c.gridwidth=1;
	gb.setConstraints(b1,c);
	add(b1,c);

	Button b2 = new Button("Cancel");
	c.gridx = 1;
	c.gridy = 9;
		c.gridwidth=1;
	gb.setConstraints(b2,c);
	add(b2,c);
	

	}
	}

/*<applet code=pappletlayout height=400 width=400>
</applet> */