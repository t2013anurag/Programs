import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.*;


public class menutest1
	{
	
public static void main(String args[])
	{
	Frame f = new Frame();

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
		
	f.setMenuBar(m);
	}

}	