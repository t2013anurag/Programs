import java.awt.*;

import java.awt.event.*;

 class dlg extends Dialog implements ActionListener
	{
	dlg(Frame p , String title)
		{
		super(p,title,false);
		Button good = new Button("OK");
		Label l = new Label("Testing Dialog Box");
		setSize(200,250);
		setLayout(new BorderLayout());			 
		
		add(l, BorderLayout.CENTER);
		add(good,BorderLayout.SOUTH);
		good.addActionListener(this);
		
		}
	public void actionPerformed(ActionEvent a)
		{
		dispose();
		}
	
	}	

public class dlgtest extends WindowAdapter implements ActionListener
	{
	
	Frame f = new Frame();
	MenuBar m = new MenuBar();
	Menu colr = new Menu("Colour");
	MenuItem c1 = new MenuItem("Red");
	MenuItem c2 = new MenuItem("Orange");
	MenuItem c3 = new MenuItem("Blue");
	MenuItem c4 = new MenuItem("Cyan");
	Menu file = new Menu("File");
	MenuItem rd = new MenuItem("Load");
	MenuItem ld = new MenuItem("Save");

	Menu fon = new Menu("Font");
	MenuItem f1 = new MenuItem("Times Roman");
	MenuItem f2 = new MenuItem("Courier");
	MenuItem f3 = new MenuItem("Ariel");
	MenuItem f4 = new CheckboxMenuItem("Bold");
	Menu special = new Menu("Special Effects");
	MenuItem s1 = new MenuItem("Superscript");
	MenuItem s2 = new MenuItem("Subscript");
	MenuItem s3 = new MenuItem("Strike");
	Menu qui = new Menu("Exit");
	MenuItem q1 = new MenuItem("Quit");
	TextField tx = new TextField("AWT Menu is cool" );
	Font old = new Font ("TimesNewRoman",Font.PLAIN, 12);
	
	Panel p = new Panel();

Font newf= new Font("TimesNewRoman",Font.PLAIN, 12);
	
	public static void main(String args[])
	{
	dlgtest mt = new dlgtest(); }
		
		public dlgtest()
		{
	
		f.setTitle("Menu Test Window");	f.setSize(500,500);	
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
		special.add(s1);
		special.add(s2);
		special.add(s3);
		fon.add(special);
		m.add(fon);
		qui.add(q1);
		m.add(qui);
		file.add(rd);
		file.add(ld);
		m.add(file);		
		f.setMenuBar(m);
		
		p.add(tx);
		f.add(p);
		rd.addActionListener(this);
		ld.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		f3.addActionListener(this);
		q1.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent evt) { System.exit(0); } }); 
  		
		}
		
	
	public void actionPerformed(ActionEvent a)
		{
		

		String s = a.getActionCommand(); System.out.println(s);
		if (s.equals("Red")) { System.out.println("Inside Red"); f.setBackground(Color.red);}
		if (s.equals("Orange")) f.setBackground(Color.orange);
		if (s.equals("Blue")) f.setBackground(Color.blue);
		if (s.equals("Cyan")) f.setBackground(Color.cyan);
		if (s.equals("Times Roman")) { newf = new Font ("TimesNewRoman",Font.PLAIN, 20); }
		if (s.equals("Courier")) {newf = new Font ("Courier",Font.BOLD, 30); }
		if (s.equals("Ariel")) {newf = new Font ("Ariel",Font.ITALIC, 40); p.setFont(newf);}
		if (s.equals("Quit")) { dlg dl = new dlg (f, "Confirm dialog box"); dl.setVisible(true); }
		if (s.equals("Load")) { FileDialog fd = new FileDialog(f,"Open File", FileDialog.LOAD);
					fd.setVisible(true);
					System.out.println("Current File " + fd.getFile());}
		if (s.equals("Save")) { FileDialog fd1 = new FileDialog(f,"Save File",FileDialog.SAVE);
					fd1.setVisible(true);}
		p.setFont(newf);tx.setText("JAVA AWT MENU"+s); //p.setFont(old);
		}

 
	}