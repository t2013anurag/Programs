import java.awt.*;

class gui extends Frame
	{
	public static void main(String args[])
	{
	Frame f = new Frame();
	f.setVisible(true);
	f.setSize(600,600);
	
	Panel p = new Panel();

	Label l = new Label("Name");
	TextField t = new TextField();

	p.add(l);
	p.add(t);
	f.add(p);
	}
	}
