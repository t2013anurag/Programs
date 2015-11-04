import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;


public class menutest implements ActionListener,KeyListener
	{
	TextField t = new TextField(60);
	Frame f = new Frame();
	Dialog dl = new  Dialog(f,"Confirm",true);
	Button good = new Button("Ok");	

	public static void main(String args[])
	{
	menutest m = new menutest();
	}
	
	public menutest()
	{
	MenuBar m = new MenuBar();

	Menu colr = new Menu("Colour");
	MenuItem c1 = new MenuItem("Red");
	MenuItem c2 = new MenuItem("Orange",new MenuShortcut( KeyEvent.VK_O ));
	MenuItem c3 = new MenuItem("Blue");
	MenuItem c4 = new MenuItem("Cyan");
	
	Menu fon = new Menu("Font");
	MenuItem f1 = new MenuItem("Times Roman",new MenuShortcut( KeyEvent.VK_F1 ));
	MenuItem f2 = new MenuItem("Courier",new MenuShortcut( KeyEvent.VK_F2 ));
	MenuItem f3 = new MenuItem("Ariel");
	MenuItem f4 = new CheckboxMenuItem("Bold");
	
	Menu special = new Menu("Special Effects");
	MenuItem s1 = new MenuItem("Superscript");
	MenuItem s2 = new MenuItem("Subscript");
	MenuItem s3 = new MenuItem("Strike");
	
	Menu qui = new Menu("Exit");
	MenuItem q1 = new MenuItem("Quit",new MenuShortcut( KeyEvent.VK_Q ));
			
	f.setTitle("Menu Test Window");	
	f.setSize(500,500);	
	f.setVisible(true);

	colr.add(c1);
	colr.add(c2);
	colr.add(c3);
	colr.add(c4);
	m.add(colr);

	fon.add(f1);
	fon.add(f2);
	fon.add(f3);
	fon.add(f4);
	m.add(fon);

	special.add(s1);
	special.add(s2);
	special.add(s3);
	fon.add(special);
		
	qui.add(q1);
	m.add(qui);
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		
		f1.addActionListener(this);
//		f1.addKeyListener(this);		

		f2.addActionListener(this);
		f3.addActionListener(this);
		f3.addActionListener(this);
		q1.addActionListener(this);
	Panel p = new Panel();
	p.add(t);	
	f.add(p);

		dl.setSize(300,300);
		dl.add(new Label("Testing Dialog box"));
		dl.add(good);
		good.addActionListener(this);

		f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent evt) { System.exit(0); }
  					 }); 

	f.setMenuBar(m);
	}

	public void actionPerformed(ActionEvent a)
		{
		String s = a.getActionCommand(); System.out.println(s);
		if (s.equals("Red")) {  t.setBackground(Color.red);}
		if (s.equals("Orange")) t.setBackground(Color.orange);
		if (s.equals("Blue")) t.setBackground(Color.blue);
		if (s.equals("Cyan")) t.setBackground(Color.cyan);
		if (s.equals("Times Roman")) { Font newf = new Font ("TimesNewRoman",Font.PLAIN, 20);t.setFont(newf); }
		if (s.equals("Courier")) {Font newf = new Font ("Courier",Font.BOLD, 30);t.setFont(newf); }
		if (s.equals("Ariel")) {Font newf = new Font ("Ariel",Font.ITALIC, 40); t.setFont(newf);}//tx.setText("JAVA AWT 		MENU"+s);
		if (s.equals("Quit")) { dl.setVisible(true); }// f.setVisible(false); System.exit(0); } 
		if (s.equals("Ok"))	{dl.setVisible(false);
					f.dispose();
					System.exit(0);}
		t.setText("JAVA AWT MENU"); 
		}
	
	 public void keyPressed(KeyEvent evt) 
	    {
            if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_F1) 
		{
	          Font newf = new Font ("TimesNewRoman",Font.PLAIN, 20);
		  t.setFont(newf);      ;
	          } 
	    else if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_F2) {

                Font newf = new Font ("Ariel",Font.ITALIC, 40); t.setFont(newf);

            } 
	else if (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_O) 
		{

               t.setBackground(Color.orange);
            }
        }

	 public void keyTyped(KeyEvent evt) {};
	 public void keyReleased(KeyEvent evt) {};
}	