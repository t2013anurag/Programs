import java.awt.*;

public class win1
	{
	public static void main(String args[])
	{
	Frame f = new Frame();
	f.setLayout(new GridLayout(2,2));
	Label l = new Label("Name");
	TextField t = new TextField();
	Label l1 = new Label("Regno");
	TextField t1 = new TextField();

	f.add(l);

	f.add(t);
	f.add(l1);
	f.add(t1);
	f.setSize(300,300);	
	f.setVisible(true);
	}
	}
	