import java.awt.*;

import java.awt.event.*;
import java.sql.*;


public class jdbcawt implements ActionListener
	{
	
	Frame f = new Frame();
	MenuBar m = new MenuBar();
	Menu admin = new Menu("Admin");
	MenuItem c1 = new MenuItem("Login");
	MenuItem c2 = new MenuItem("Display");
	Label l = new Label("name");
	TextField t = new TextField(40);
	Label lp = new Label("Password");
	TextField tp = new TextField(40);
	Button b = new Button("Submit");
	Label l1 = new Label("Likes");
	TextField t1 = new TextField(40);
	Label l2 = new Label("DisLikes");
	TextField t2 = new TextField(40);
	
	Button b1 = new Button("Ok");
	Button b2 = new Button("Cancel");
	Panel p = new Panel();
	Panel p1 = new Panel();
	Panel mainp = new Panel();
	CardLayout cl = new CardLayout();

      
        Connection con ; 
        Statement s ;
        ResultSet rs ; 

	Panel em = new Panel();
	Label el = new Label("   ");
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
	jdbcawt mt = new jdbcawt(); }
		
		public jdbcawt()
		{
	
		tp.setEchoChar('*');;
		mainp.setLayout(cl);
		f.setTitle("Menu Test Window");	f.setSize(500,500);	
		f.setVisible(true);

		admin.add(c1);
		admin.add(c2);
		m.add(admin);
		f.setMenuBar(m);
		
		p.add(l);
		p.add(t);
		p.add(lp);
		p.add(tp);
		p.add(b);

		mainp.add("1",p);
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		p1.add(b1);
		p1.add(b2);

		mainp.add("2",p1);
		em.add(el);
		mainp.add("3",em);	

		f.add(mainp);
		c1.addActionListener(this);
		c2.addActionListener(this);
		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent evt) { System.exit(0); }
  					 }); 
		}
		
	
	public void actionPerformed(ActionEvent a) 
		{
		String s = a.getActionCommand(); 
		if (s.equals("Login")) { cl.show(mainp,"1");}
		if (s.equals("Display")) { cl.show(mainp,"2");}

		if (s.equals("Submit"))
		{if ( dbchk(t.getText(), tp.getText()) == false) f.dispose();
		 else cl.show(mainp,"3");}
		}

boolean dbchk(String s1, String s2) 
	{
        try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:login", "",""); 

        s = con.createStatement();

        s.execute("select * from log"); 
         rs = s.getResultSet(); 
        if (rs != null) 
        while ( rs.next() ) 
         {
	 String name = rs.getString(1);
         String pass = rs.getString(2);
         if (name.equals(s1) && pass.equals(s2))  return true;          
          }
        rs.close();s.close(); con.close(); 
	}
	catch(Exception e) { System.out.println(e);}
       return false;
      } 
  }