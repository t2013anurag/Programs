import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;


public class jdbcawt implements ActionListener
	{
	TextField t = new TextField(60);
	TextField t1 = new TextField(60);
	Button b = new Button("Submit");
	Frame f = new Frame();
	CardLayout cl = new CardLayout();
	
	Panel p = new Panel();
	Panel loginp = new Panel();

	public static void main(String args[])
	{
	jdbcawt m = new jdbcawt();
	}
	
	public jdbcawt()
	{
	t1.setEchoChar('*');
	MenuBar m = new MenuBar();

	Menu ad = new Menu("Admin");
	MenuItem c1 = new MenuItem("Login");
	
	
	Menu pro = new Menu("Process");
	MenuItem s1 = new MenuItem("Total");
	MenuItem s2 = new MenuItem("ADD");
	MenuItem s3 = new MenuItem("Update");
	
	Menu qui = new Menu("Exit");
	MenuItem q1 = new MenuItem("Quit",new MenuShortcut( KeyEvent.VK_Q ));
			
	f.setTitle("Menu Test Window");	
	f.setSize(500,500);	
	f.setVisible(true);

	ad.add(c1);
	m.add(ad);

	
	pro.add(s1);
	pro.add(s2);
	pro.add(s3);
	m.add(pro);
		
	qui.add(q1);
	m.add(qui);
		
		c1.addActionListener(this);
		s1.addActionListener(this);
		s2.addActionListener(this);
		s3.addActionListener(this);
		q1.addActionListener(this);
		b.addActionListener(this);	

		
		loginp.add(t);
		loginp.add(t1);	
		loginp.add(b);
		p.add(loginp,"log");
		f.add(p);
		
		f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent evt) { System.exit(0); }
  					 }); 

	f.setMenuBar(m);
	}

	public void actionPerformed(ActionEvent a)
		{
		String s = a.getActionCommand(); System.out.println(s);
		if (s.equals("Login")) { cl.show(p, "log"); }
/*		if (s.equals("Total")) 
		if (s.equals("ADD")) 
		if (s.equals("Update"))  */

		}
	
}	