import java.awt.*;



public class win extends Frame
	{
	
	win()
	{
	super("Application");
	setBackground(Color.cyan);
	setForeground(Color.magenta);

	Label l = new Label("Name");
	l.setBackground(Color.red);
	l.setForeground(Color.black);
	TextField t = new TextField(30);
	Label l1 = new Label("Password");
	TextField t1 = new TextField(30);
	
	t1.setEchoChar('*');	

	setSize(500,600);
	
	setTitle("Application");
	setVisible(true);
	add(l);
	add(t);
	add(l1);
	add(t1);
	pack();
	}

	public static void main(String args[])
	{
	new win();
	}
	}

